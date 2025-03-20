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


import com.dao.FanhuijizhuangxiangfanchangDao;
import com.entity.FanhuijizhuangxiangfanchangEntity;
import com.service.FanhuijizhuangxiangfanchangService;
import com.entity.vo.FanhuijizhuangxiangfanchangVO;
import com.entity.view.FanhuijizhuangxiangfanchangView;

@Service("fanhuijizhuangxiangfanchangService")
public class FanhuijizhuangxiangfanchangServiceImpl extends ServiceImpl<FanhuijizhuangxiangfanchangDao, FanhuijizhuangxiangfanchangEntity> implements FanhuijizhuangxiangfanchangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanhuijizhuangxiangfanchangEntity> page = this.selectPage(
                new Query<FanhuijizhuangxiangfanchangEntity>(params).getPage(),
                new EntityWrapper<FanhuijizhuangxiangfanchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper) {
		  Page<FanhuijizhuangxiangfanchangView> page =new Query<FanhuijizhuangxiangfanchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanhuijizhuangxiangfanchangVO> selectListVO(Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanhuijizhuangxiangfanchangVO selectVO(Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanhuijizhuangxiangfanchangView> selectListView(Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanhuijizhuangxiangfanchangView selectView(Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
