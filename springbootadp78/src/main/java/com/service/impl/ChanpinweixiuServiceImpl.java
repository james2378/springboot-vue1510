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


import com.dao.ChanpinweixiuDao;
import com.entity.ChanpinweixiuEntity;
import com.service.ChanpinweixiuService;
import com.entity.vo.ChanpinweixiuVO;
import com.entity.view.ChanpinweixiuView;

@Service("chanpinweixiuService")
public class ChanpinweixiuServiceImpl extends ServiceImpl<ChanpinweixiuDao, ChanpinweixiuEntity> implements ChanpinweixiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinweixiuEntity> page = this.selectPage(
                new Query<ChanpinweixiuEntity>(params).getPage(),
                new EntityWrapper<ChanpinweixiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinweixiuEntity> wrapper) {
		  Page<ChanpinweixiuView> page =new Query<ChanpinweixiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpinweixiuVO> selectListVO(Wrapper<ChanpinweixiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinweixiuVO selectVO(Wrapper<ChanpinweixiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinweixiuView> selectListView(Wrapper<ChanpinweixiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinweixiuView selectView(Wrapper<ChanpinweixiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
