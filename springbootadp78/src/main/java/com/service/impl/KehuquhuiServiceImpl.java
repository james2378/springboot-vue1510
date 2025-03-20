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


import com.dao.KehuquhuiDao;
import com.entity.KehuquhuiEntity;
import com.service.KehuquhuiService;
import com.entity.vo.KehuquhuiVO;
import com.entity.view.KehuquhuiView;

@Service("kehuquhuiService")
public class KehuquhuiServiceImpl extends ServiceImpl<KehuquhuiDao, KehuquhuiEntity> implements KehuquhuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KehuquhuiEntity> page = this.selectPage(
                new Query<KehuquhuiEntity>(params).getPage(),
                new EntityWrapper<KehuquhuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KehuquhuiEntity> wrapper) {
		  Page<KehuquhuiView> page =new Query<KehuquhuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KehuquhuiVO> selectListVO(Wrapper<KehuquhuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KehuquhuiVO selectVO(Wrapper<KehuquhuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KehuquhuiView> selectListView(Wrapper<KehuquhuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KehuquhuiView selectView(Wrapper<KehuquhuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
