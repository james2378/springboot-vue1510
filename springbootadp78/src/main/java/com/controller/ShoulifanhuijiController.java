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

import com.entity.ShoulifanhuijiEntity;
import com.entity.view.ShoulifanhuijiView;

import com.service.ShoulifanhuijiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 受理返回机
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@RestController
@RequestMapping("/shoulifanhuiji")
public class ShoulifanhuijiController {
    @Autowired
    private ShoulifanhuijiService shoulifanhuijiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShoulifanhuijiEntity shoulifanhuiji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shoulirenyuan")) {
			shoulifanhuiji.setRenyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("kehu")) {
			shoulifanhuiji.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShoulifanhuijiEntity> ew = new EntityWrapper<ShoulifanhuijiEntity>();

		PageUtils page = shoulifanhuijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoulifanhuiji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShoulifanhuijiEntity shoulifanhuiji, 
		HttpServletRequest request){
        EntityWrapper<ShoulifanhuijiEntity> ew = new EntityWrapper<ShoulifanhuijiEntity>();

		PageUtils page = shoulifanhuijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoulifanhuiji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShoulifanhuijiEntity shoulifanhuiji){
       	EntityWrapper<ShoulifanhuijiEntity> ew = new EntityWrapper<ShoulifanhuijiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shoulifanhuiji, "shoulifanhuiji")); 
        return R.ok().put("data", shoulifanhuijiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShoulifanhuijiEntity shoulifanhuiji){
        EntityWrapper< ShoulifanhuijiEntity> ew = new EntityWrapper< ShoulifanhuijiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shoulifanhuiji, "shoulifanhuiji")); 
		ShoulifanhuijiView shoulifanhuijiView =  shoulifanhuijiService.selectView(ew);
		return R.ok("查询受理返回机成功").put("data", shoulifanhuijiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShoulifanhuijiEntity shoulifanhuiji = shoulifanhuijiService.selectById(id);
        return R.ok().put("data", shoulifanhuiji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShoulifanhuijiEntity shoulifanhuiji = shoulifanhuijiService.selectById(id);
        return R.ok().put("data", shoulifanhuiji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShoulifanhuijiEntity shoulifanhuiji, HttpServletRequest request){
    	shoulifanhuiji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shoulifanhuiji);
        shoulifanhuijiService.insert(shoulifanhuiji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShoulifanhuijiEntity shoulifanhuiji, HttpServletRequest request){
    	shoulifanhuiji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shoulifanhuiji);
        shoulifanhuijiService.insert(shoulifanhuiji);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShoulifanhuijiEntity shoulifanhuiji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shoulifanhuiji);
        shoulifanhuijiService.updateById(shoulifanhuiji);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shoulifanhuijiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShoulifanhuijiEntity> wrapper = new EntityWrapper<ShoulifanhuijiEntity>();
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

		int count = shoulifanhuijiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
