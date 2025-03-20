package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FenpeigongchengshiEntity;
import com.entity.view.FenpeigongchengshiView;

import com.service.FenpeigongchengshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 分配工程师
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@RestController
@RequestMapping("/fenpeigongchengshi")
public class FenpeigongchengshiController {
    @Autowired
    private FenpeigongchengshiService fenpeigongchengshiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FenpeigongchengshiEntity fenpeigongchengshi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shoulirenyuan")) {
			fenpeigongchengshi.setRenyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("kehu")) {
			fenpeigongchengshi.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("gongchengshi")) {
			fenpeigongchengshi.setGongchengshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FenpeigongchengshiEntity> ew = new EntityWrapper<FenpeigongchengshiEntity>();

		PageUtils page = fenpeigongchengshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fenpeigongchengshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FenpeigongchengshiEntity fenpeigongchengshi, 
		HttpServletRequest request){
        EntityWrapper<FenpeigongchengshiEntity> ew = new EntityWrapper<FenpeigongchengshiEntity>();

		PageUtils page = fenpeigongchengshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fenpeigongchengshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FenpeigongchengshiEntity fenpeigongchengshi){
       	EntityWrapper<FenpeigongchengshiEntity> ew = new EntityWrapper<FenpeigongchengshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fenpeigongchengshi, "fenpeigongchengshi")); 
        return R.ok().put("data", fenpeigongchengshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FenpeigongchengshiEntity fenpeigongchengshi){
        EntityWrapper< FenpeigongchengshiEntity> ew = new EntityWrapper< FenpeigongchengshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fenpeigongchengshi, "fenpeigongchengshi")); 
		FenpeigongchengshiView fenpeigongchengshiView =  fenpeigongchengshiService.selectView(ew);
		return R.ok("查询分配工程师成功").put("data", fenpeigongchengshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FenpeigongchengshiEntity fenpeigongchengshi = fenpeigongchengshiService.selectById(id);
        return R.ok().put("data", fenpeigongchengshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FenpeigongchengshiEntity fenpeigongchengshi = fenpeigongchengshiService.selectById(id);
        return R.ok().put("data", fenpeigongchengshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FenpeigongchengshiEntity fenpeigongchengshi, HttpServletRequest request){
    	fenpeigongchengshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fenpeigongchengshi);
        fenpeigongchengshiService.insert(fenpeigongchengshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FenpeigongchengshiEntity fenpeigongchengshi, HttpServletRequest request){
    	fenpeigongchengshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fenpeigongchengshi);
        fenpeigongchengshiService.insert(fenpeigongchengshi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FenpeigongchengshiEntity fenpeigongchengshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fenpeigongchengshi);
        fenpeigongchengshiService.updateById(fenpeigongchengshi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fenpeigongchengshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FenpeigongchengshiEntity> wrapper = new EntityWrapper<FenpeigongchengshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shoulirenyuan")) {
			wrapper.eq("renyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("kehu")) {
			wrapper.eq("kehuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("gongchengshi")) {
			wrapper.eq("gongchengshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = fenpeigongchengshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
