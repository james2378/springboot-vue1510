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


import com.dao.WuliaoleixingDao;
import com.entity.WuliaoleixingEntity;
import com.service.WuliaoleixingService;
import com.entity.vo.WuliaoleixingVO;
import com.entity.view.WuliaoleixingView;

@Service("wuliaoleixingService")
public class WuliaoleixingServiceImpl extends ServiceImpl<WuliaoleixingDao, WuliaoleixingEntity> implements WuliaoleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuliaoleixingEntity> page = this.selectPage(
                new Query<WuliaoleixingEntity>(params).getPage(),
                new EntityWrapper<WuliaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuliaoleixingEntity> wrapper) {
		  Page<WuliaoleixingView> page =new Query<WuliaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuliaoleixingVO> selectListVO(Wrapper<WuliaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuliaoleixingVO selectVO(Wrapper<WuliaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuliaoleixingView> selectListView(Wrapper<WuliaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuliaoleixingView selectView(Wrapper<WuliaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
