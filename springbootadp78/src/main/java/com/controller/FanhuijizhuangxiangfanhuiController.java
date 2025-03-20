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

import com.entity.FanhuijizhuangxiangfanhuiEntity;
import com.entity.view.FanhuijizhuangxiangfanhuiView;

import com.service.FanhuijizhuangxiangfanhuiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 返回机装箱返回
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@RestController
@RequestMapping("/fanhuijizhuangxiangfanhui")
public class FanhuijizhuangxiangfanhuiController {
    @Autowired
    private FanhuijizhuangxiangfanhuiService fanhuijizhuangxiangfanhuiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FanhuijizhuangxiangfanhuiEntity fanhuijizhuangxiangfanhui,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shoulirenyuan")) {
			fanhuijizhuangxiangfanhui.setRenyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("kehu")) {
			fanhuijizhuangxiangfanhui.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("changshang")) {
			fanhuijizhuangxiangfanhui.setChangshangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FanhuijizhuangxiangfanhuiEntity> ew = new EntityWrapper<FanhuijizhuangxiangfanhuiEntity>();

		PageUtils page = fanhuijizhuangxiangfanhuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanhuijizhuangxiangfanhui), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FanhuijizhuangxiangfanhuiEntity fanhuijizhuangxiangfanhui, 
		HttpServletRequest request){
        EntityWrapper<FanhuijizhuangxiangfanhuiEntity> ew = new EntityWrapper<FanhuijizhuangxiangfanhuiEntity>();

		PageUtils page = fanhuijizhuangxiangfanhuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanhuijizhuangxiangfanhui), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FanhuijizhuangxiangfanhuiEntity fanhuijizhuangxiangfanhui){
       	EntityWrapper<FanhuijizhuangxiangfanhuiEntity> ew = new EntityWrapper<FanhuijizhuangxiangfanhuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fanhuijizhuangxiangfanhui, "fanhuijizhuangxiangfanhui")); 
        return R.ok().put("data", fanhuijizhuangxiangfanhuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FanhuijizhuangxiangfanhuiEntity fanhuijizhuangxiangfanhui){
        EntityWrapper< FanhuijizhuangxiangfanhuiEntity> ew = new EntityWrapper< FanhuijizhuangxiangfanhuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fanhuijizhuangxiangfanhui, "fanhuijizhuangxiangfanhui")); 
		FanhuijizhuangxiangfanhuiView fanhuijizhuangxiangfanhuiView =  fanhuijizhuangxiangfanhuiService.selectView(ew);
		return R.ok("查询返回机装箱返回成功").put("data", fanhuijizhuangxiangfanhuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FanhuijizhuangxiangfanhuiEntity fanhuijizhuangxiangfanhui = fanhuijizhuangxiangfanhuiService.selectById(id);
        return R.ok().put("data", fanhuijizhuangxiangfanhui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FanhuijizhuangxiangfanhuiEntity fanhuijizhuangxiangfanhui = fanhuijizhuangxiangfanhuiService.selectById(id);
        return R.ok().put("data", fanhuijizhuangxiangfanhui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FanhuijizhuangxiangfanhuiEntity fanhuijizhuangxiangfanhui, HttpServletRequest request){
    	fanhuijizhuangxiangfanhui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanhuijizhuangxiangfanhui);
        fanhuijizhuangxiangfanhuiService.insert(fanhuijizhuangxiangfanhui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FanhuijizhuangxiangfanhuiEntity fanhuijizhuangxiangfanhui, HttpServletRequest request){
    	fanhuijizhuangxiangfanhui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanhuijizhuangxiangfanhui);
        fanhuijizhuangxiangfanhuiService.insert(fanhuijizhuangxiangfanhui);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FanhuijizhuangxiangfanhuiEntity fanhuijizhuangxiangfanhui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fanhuijizhuangxiangfanhui);
        fanhuijizhuangxiangfanhuiService.updateById(fanhuijizhuangxiangfanhui);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fanhuijizhuangxiangfanhuiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper = new EntityWrapper<FanhuijizhuangxiangfanhuiEntity>();
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
		if(tableName.equals("changshang")) {
			wrapper.eq("changshangzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = fanhuijizhuangxiangfanhuiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
