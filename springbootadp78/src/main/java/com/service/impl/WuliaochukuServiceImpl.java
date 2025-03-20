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


import com.dao.WuliaochukuDao;
import com.entity.WuliaochukuEntity;
import com.service.WuliaochukuService;
import com.entity.vo.WuliaochukuVO;
import com.entity.view.WuliaochukuView;

@Service("wuliaochukuService")
public class WuliaochukuServiceImpl extends ServiceImpl<WuliaochukuDao, WuliaochukuEntity> implements WuliaochukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuliaochukuEntity> page = this.selectPage(
                new Query<WuliaochukuEntity>(params).getPage(),
                new EntityWrapper<WuliaochukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuliaochukuEntity> wrapper) {
		  Page<WuliaochukuView> page =new Query<WuliaochukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuliaochukuVO> selectListVO(Wrapper<WuliaochukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuliaochukuVO selectVO(Wrapper<WuliaochukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuliaochukuView> selectListView(Wrapper<WuliaochukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuliaochukuView selectView(Wrapper<WuliaochukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
