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


import com.dao.WuliaorukuDao;
import com.entity.WuliaorukuEntity;
import com.service.WuliaorukuService;
import com.entity.vo.WuliaorukuVO;
import com.entity.view.WuliaorukuView;

@Service("wuliaorukuService")
public class WuliaorukuServiceImpl extends ServiceImpl<WuliaorukuDao, WuliaorukuEntity> implements WuliaorukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuliaorukuEntity> page = this.selectPage(
                new Query<WuliaorukuEntity>(params).getPage(),
                new EntityWrapper<WuliaorukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuliaorukuEntity> wrapper) {
		  Page<WuliaorukuView> page =new Query<WuliaorukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuliaorukuVO> selectListVO(Wrapper<WuliaorukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuliaorukuVO selectVO(Wrapper<WuliaorukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuliaorukuView> selectListView(Wrapper<WuliaorukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuliaorukuView selectView(Wrapper<WuliaorukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
