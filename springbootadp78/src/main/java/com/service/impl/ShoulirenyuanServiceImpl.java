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


import com.dao.ShoulirenyuanDao;
import com.entity.ShoulirenyuanEntity;
import com.service.ShoulirenyuanService;
import com.entity.vo.ShoulirenyuanVO;
import com.entity.view.ShoulirenyuanView;

@Service("shoulirenyuanService")
public class ShoulirenyuanServiceImpl extends ServiceImpl<ShoulirenyuanDao, ShoulirenyuanEntity> implements ShoulirenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoulirenyuanEntity> page = this.selectPage(
                new Query<ShoulirenyuanEntity>(params).getPage(),
                new EntityWrapper<ShoulirenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoulirenyuanEntity> wrapper) {
		  Page<ShoulirenyuanView> page =new Query<ShoulirenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoulirenyuanVO> selectListVO(Wrapper<ShoulirenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoulirenyuanVO selectVO(Wrapper<ShoulirenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoulirenyuanView> selectListView(Wrapper<ShoulirenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoulirenyuanView selectView(Wrapper<ShoulirenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
