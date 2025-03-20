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

import com.entity.ShouliguzhangjiEntity;
import com.entity.view.ShouliguzhangjiView;

import com.service.ShouliguzhangjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 受理故障机
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@RestController
@RequestMapping("/shouliguzhangji")
public class ShouliguzhangjiController {
    @Autowired
    private ShouliguzhangjiService shouliguzhangjiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShouliguzhangjiEntity shouliguzhangji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shoulirenyuan")) {
			shouliguzhangji.setRenyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("kehu")) {
			shouliguzhangji.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShouliguzhangjiEntity> ew = new EntityWrapper<ShouliguzhangjiEntity>();

		PageUtils page = shouliguzhangjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shouliguzhangji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShouliguzhangjiEntity shouliguzhangji, 
		HttpServletRequest request){
        EntityWrapper<ShouliguzhangjiEntity> ew = new EntityWrapper<ShouliguzhangjiEntity>();

		PageUtils page = shouliguzhangjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shouliguzhangji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShouliguzhangjiEntity shouliguzhangji){
       	EntityWrapper<ShouliguzhangjiEntity> ew = new EntityWrapper<ShouliguzhangjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shouliguzhangji, "shouliguzhangji")); 
        return R.ok().put("data", shouliguzhangjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShouliguzhangjiEntity shouliguzhangji){
        EntityWrapper< ShouliguzhangjiEntity> ew = new EntityWrapper< ShouliguzhangjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shouliguzhangji, "shouliguzhangji")); 
		ShouliguzhangjiView shouliguzhangjiView =  shouliguzhangjiService.selectView(ew);
		return R.ok("查询受理故障机成功").put("data", shouliguzhangjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShouliguzhangjiEntity shouliguzhangji = shouliguzhangjiService.selectById(id);
        return R.ok().put("data", shouliguzhangji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShouliguzhangjiEntity shouliguzhangji = shouliguzhangjiService.selectById(id);
        return R.ok().put("data", shouliguzhangji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShouliguzhangjiEntity shouliguzhangji, HttpServletRequest request){
    	shouliguzhangji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shouliguzhangji);
        shouliguzhangjiService.insert(shouliguzhangji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShouliguzhangjiEntity shouliguzhangji, HttpServletRequest request){
    	shouliguzhangji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shouliguzhangji);
        shouliguzhangjiService.insert(shouliguzhangji);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShouliguzhangjiEntity shouliguzhangji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shouliguzhangji);
        shouliguzhangjiService.updateById(shouliguzhangji);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shouliguzhangjiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShouliguzhangjiEntity> wrapper = new EntityWrapper<ShouliguzhangjiEntity>();
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

		int count = shouliguzhangjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
