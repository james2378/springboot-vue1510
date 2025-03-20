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

import com.entity.GongchengshiEntity;
import com.entity.view.GongchengshiView;

import com.service.GongchengshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 工程师
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@RestController
@RequestMapping("/gongchengshi")
public class GongchengshiController {
    @Autowired
    private GongchengshiService gongchengshiService;


    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		GongchengshiEntity u = gongchengshiService.selectOne(new EntityWrapper<GongchengshiEntity>().eq("gongchengshizhanghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"gongchengshi",  "工程师" );
		return R.ok().put("token", token);
	}

	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody GongchengshiEntity gongchengshi){
    	//ValidatorUtils.validateEntity(gongchengshi);
    	GongchengshiEntity u = gongchengshiService.selectOne(new EntityWrapper<GongchengshiEntity>().eq("gongchengshizhanghao", gongchengshi.getGongchengshizhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		gongchengshi.setId(uId);
        gongchengshiService.insert(gongchengshi);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        GongchengshiEntity u = gongchengshiService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	GongchengshiEntity u = gongchengshiService.selectOne(new EntityWrapper<GongchengshiEntity>().eq("gongchengshizhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        gongchengshiService.updateById(u);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongchengshiEntity gongchengshi,
		HttpServletRequest request){
        EntityWrapper<GongchengshiEntity> ew = new EntityWrapper<GongchengshiEntity>();

		PageUtils page = gongchengshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongchengshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongchengshiEntity gongchengshi, 
		HttpServletRequest request){
        EntityWrapper<GongchengshiEntity> ew = new EntityWrapper<GongchengshiEntity>();

		PageUtils page = gongchengshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongchengshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongchengshiEntity gongchengshi){
       	EntityWrapper<GongchengshiEntity> ew = new EntityWrapper<GongchengshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongchengshi, "gongchengshi")); 
        return R.ok().put("data", gongchengshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongchengshiEntity gongchengshi){
        EntityWrapper< GongchengshiEntity> ew = new EntityWrapper< GongchengshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongchengshi, "gongchengshi")); 
		GongchengshiView gongchengshiView =  gongchengshiService.selectView(ew);
		return R.ok("查询工程师成功").put("data", gongchengshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongchengshiEntity gongchengshi = gongchengshiService.selectById(id);
        return R.ok().put("data", gongchengshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongchengshiEntity gongchengshi = gongchengshiService.selectById(id);
        return R.ok().put("data", gongchengshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongchengshiEntity gongchengshi, HttpServletRequest request){
    	gongchengshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongchengshi);
    	GongchengshiEntity u = gongchengshiService.selectOne(new EntityWrapper<GongchengshiEntity>().eq("gongchengshizhanghao", gongchengshi.getGongchengshizhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		gongchengshi.setId(new Date().getTime());
        gongchengshiService.insert(gongchengshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongchengshiEntity gongchengshi, HttpServletRequest request){
    	gongchengshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongchengshi);
    	GongchengshiEntity u = gongchengshiService.selectOne(new EntityWrapper<GongchengshiEntity>().eq("gongchengshizhanghao", gongchengshi.getGongchengshizhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		gongchengshi.setId(new Date().getTime());
        gongchengshiService.insert(gongchengshi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GongchengshiEntity gongchengshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongchengshi);
        gongchengshiService.updateById(gongchengshi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongchengshiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<GongchengshiEntity> wrapper = new EntityWrapper<GongchengshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = gongchengshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
