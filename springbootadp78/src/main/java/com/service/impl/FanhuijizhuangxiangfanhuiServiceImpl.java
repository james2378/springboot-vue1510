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


import com.dao.FanhuijizhuangxiangfanhuiDao;
import com.entity.FanhuijizhuangxiangfanhuiEntity;
import com.service.FanhuijizhuangxiangfanhuiService;
import com.entity.vo.FanhuijizhuangxiangfanhuiVO;
import com.entity.view.FanhuijizhuangxiangfanhuiView;

@Service("fanhuijizhuangxiangfanhuiService")
public class FanhuijizhuangxiangfanhuiServiceImpl extends ServiceImpl<FanhuijizhuangxiangfanhuiDao, FanhuijizhuangxiangfanhuiEntity> implements FanhuijizhuangxiangfanhuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanhuijizhuangxiangfanhuiEntity> page = this.selectPage(
                new Query<FanhuijizhuangxiangfanhuiEntity>(params).getPage(),
                new EntityWrapper<FanhuijizhuangxiangfanhuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper) {
		  Page<FanhuijizhuangxiangfanhuiView> page =new Query<FanhuijizhuangxiangfanhuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanhuijizhuangxiangfanhuiVO> selectListVO(Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanhuijizhuangxiangfanhuiVO selectVO(Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanhuijizhuangxiangfanhuiView> selectListView(Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanhuijizhuangxiangfanhuiView selectView(Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
