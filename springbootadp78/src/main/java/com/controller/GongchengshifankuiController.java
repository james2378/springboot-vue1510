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

import com.entity.GongchengshifankuiEntity;
import com.entity.view.GongchengshifankuiView;

import com.service.GongchengshifankuiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 工程师反馈
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@RestController
@RequestMapping("/gongchengshifankui")
public class GongchengshifankuiController {
    @Autowired
    private GongchengshifankuiService gongchengshifankuiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongchengshifankuiEntity gongchengshifankui,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shoulirenyuan")) {
			gongchengshifankui.setRenyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("kehu")) {
			gongchengshifankui.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("gongchengshi")) {
			gongchengshifankui.setGongchengshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GongchengshifankuiEntity> ew = new EntityWrapper<GongchengshifankuiEntity>();

		PageUtils page = gongchengshifankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongchengshifankui), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongchengshifankuiEntity gongchengshifankui, 
		HttpServletRequest request){
        EntityWrapper<GongchengshifankuiEntity> ew = new EntityWrapper<GongchengshifankuiEntity>();

		PageUtils page = gongchengshifankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongchengshifankui), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongchengshifankuiEntity gongchengshifankui){
       	EntityWrapper<GongchengshifankuiEntity> ew = new EntityWrapper<GongchengshifankuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongchengshifankui, "gongchengshifankui")); 
        return R.ok().put("data", gongchengshifankuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongchengshifankuiEntity gongchengshifankui){
        EntityWrapper< GongchengshifankuiEntity> ew = new EntityWrapper< GongchengshifankuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongchengshifankui, "gongchengshifankui")); 
		GongchengshifankuiView gongchengshifankuiView =  gongchengshifankuiService.selectView(ew);
		return R.ok("查询工程师反馈成功").put("data", gongchengshifankuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongchengshifankuiEntity gongchengshifankui = gongchengshifankuiService.selectById(id);
        return R.ok().put("data", gongchengshifankui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongchengshifankuiEntity gongchengshifankui = gongchengshifankuiService.selectById(id);
        return R.ok().put("data", gongchengshifankui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongchengshifankuiEntity gongchengshifankui, HttpServletRequest request){
    	gongchengshifankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongchengshifankui);
        gongchengshifankuiService.insert(gongchengshifankui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongchengshifankuiEntity gongchengshifankui, HttpServletRequest request){
    	gongchengshifankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongchengshifankui);
        gongchengshifankuiService.insert(gongchengshifankui);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GongchengshifankuiEntity gongchengshifankui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongchengshifankui);
        gongchengshifankuiService.updateById(gongchengshifankui);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongchengshifankuiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<GongchengshifankuiEntity> wrapper = new EntityWrapper<GongchengshifankuiEntity>();
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

		int count = gongchengshifankuiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
