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


import com.dao.FanhuijichanpinweixiuDao;
import com.entity.FanhuijichanpinweixiuEntity;
import com.service.FanhuijichanpinweixiuService;
import com.entity.vo.FanhuijichanpinweixiuVO;
import com.entity.view.FanhuijichanpinweixiuView;

@Service("fanhuijichanpinweixiuService")
public class FanhuijichanpinweixiuServiceImpl extends ServiceImpl<FanhuijichanpinweixiuDao, FanhuijichanpinweixiuEntity> implements FanhuijichanpinweixiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanhuijichanpinweixiuEntity> page = this.selectPage(
                new Query<FanhuijichanpinweixiuEntity>(params).getPage(),
                new EntityWrapper<FanhuijichanpinweixiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanhuijichanpinweixiuEntity> wrapper) {
		  Page<FanhuijichanpinweixiuView> page =new Query<FanhuijichanpinweixiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanhuijichanpinweixiuVO> selectListVO(Wrapper<FanhuijichanpinweixiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanhuijichanpinweixiuVO selectVO(Wrapper<FanhuijichanpinweixiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanhuijichanpinweixiuView> selectListView(Wrapper<FanhuijichanpinweixiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanhuijichanpinweixiuView selectView(Wrapper<FanhuijichanpinweixiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
