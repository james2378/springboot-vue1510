package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FanhuijiyoujikehuDao;
import com.entity.FanhuijiyoujikehuEntity;
import com.service.FanhuijiyoujikehuService;
import com.entity.vo.FanhuijiyoujikehuVO;
import com.entity.view.FanhuijiyoujikehuView;

@Service("fanhuijiyoujikehuService")
public class FanhuijiyoujikehuServiceImpl extends ServiceImpl<FanhuijiyoujikehuDao, FanhuijiyoujikehuEntity> implements FanhuijiyoujikehuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanhuijiyoujikehuEntity> page = this.selectPage(
                new Query<FanhuijiyoujikehuEntity>(params).getPage(),
                new EntityWrapper<FanhuijiyoujikehuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanhuijiyoujikehuEntity> wrapper) {
		  Page<FanhuijiyoujikehuView> page =new Query<FanhuijiyoujikehuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanhuijiyoujikehuVO> selectListVO(Wrapper<FanhuijiyoujikehuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanhuijiyoujikehuVO selectVO(Wrapper<FanhuijiyoujikehuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanhuijiyoujikehuView> selectListView(Wrapper<FanhuijiyoujikehuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanhuijiyoujikehuView selectView(Wrapper<FanhuijiyoujikehuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
