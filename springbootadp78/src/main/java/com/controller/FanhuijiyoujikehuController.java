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

import com.entity.FanhuijiyoujikehuEntity;
import com.entity.view.FanhuijiyoujikehuView;

import com.service.FanhuijiyoujikehuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 返回机邮寄客户
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@RestController
@RequestMapping("/fanhuijiyoujikehu")
public class FanhuijiyoujikehuController {
    @Autowired
    private FanhuijiyoujikehuService fanhuijiyoujikehuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FanhuijiyoujikehuEntity fanhuijiyoujikehu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shoulirenyuan")) {
			fanhuijiyoujikehu.setRenyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("kehu")) {
			fanhuijiyoujikehu.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FanhuijiyoujikehuEntity> ew = new EntityWrapper<FanhuijiyoujikehuEntity>();

		PageUtils page = fanhuijiyoujikehuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanhuijiyoujikehu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FanhuijiyoujikehuEntity fanhuijiyoujikehu, 
		HttpServletRequest request){
        EntityWrapper<FanhuijiyoujikehuEntity> ew = new EntityWrapper<FanhuijiyoujikehuEntity>();

		PageUtils page = fanhuijiyoujikehuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanhuijiyoujikehu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FanhuijiyoujikehuEntity fanhuijiyoujikehu){
       	EntityWrapper<FanhuijiyoujikehuEntity> ew = new EntityWrapper<FanhuijiyoujikehuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fanhuijiyoujikehu, "fanhuijiyoujikehu")); 
        return R.ok().put("data", fanhuijiyoujikehuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FanhuijiyoujikehuEntity fanhuijiyoujikehu){
        EntityWrapper< FanhuijiyoujikehuEntity> ew = new EntityWrapper< FanhuijiyoujikehuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fanhuijiyoujikehu, "fanhuijiyoujikehu")); 
		FanhuijiyoujikehuView fanhuijiyoujikehuView =  fanhuijiyoujikehuService.selectView(ew);
		return R.ok("查询返回机邮寄客户成功").put("data", fanhuijiyoujikehuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FanhuijiyoujikehuEntity fanhuijiyoujikehu = fanhuijiyoujikehuService.selectById(id);
        return R.ok().put("data", fanhuijiyoujikehu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FanhuijiyoujikehuEntity fanhuijiyoujikehu = fanhuijiyoujikehuService.selectById(id);
        return R.ok().put("data", fanhuijiyoujikehu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FanhuijiyoujikehuEntity fanhuijiyoujikehu, HttpServletRequest request){
    	fanhuijiyoujikehu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanhuijiyoujikehu);
        fanhuijiyoujikehuService.insert(fanhuijiyoujikehu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FanhuijiyoujikehuEntity fanhuijiyoujikehu, HttpServletRequest request){
    	fanhuijiyoujikehu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanhuijiyoujikehu);
        fanhuijiyoujikehuService.insert(fanhuijiyoujikehu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FanhuijiyoujikehuEntity fanhuijiyoujikehu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fanhuijiyoujikehu);
        fanhuijiyoujikehuService.updateById(fanhuijiyoujikehu);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fanhuijiyoujikehuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<FanhuijiyoujikehuEntity> wrapper = new EntityWrapper<FanhuijiyoujikehuEntity>();
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

		int count = fanhuijiyoujikehuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
