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


import com.dao.DianhuagoutongDao;
import com.entity.DianhuagoutongEntity;
import com.service.DianhuagoutongService;
import com.entity.vo.DianhuagoutongVO;
import com.entity.view.DianhuagoutongView;

@Service("dianhuagoutongService")
public class DianhuagoutongServiceImpl extends ServiceImpl<DianhuagoutongDao, DianhuagoutongEntity> implements DianhuagoutongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianhuagoutongEntity> page = this.selectPage(
                new Query<DianhuagoutongEntity>(params).getPage(),
                new EntityWrapper<DianhuagoutongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianhuagoutongEntity> wrapper) {
		  Page<DianhuagoutongView> page =new Query<DianhuagoutongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianhuagoutongVO> selectListVO(Wrapper<DianhuagoutongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianhuagoutongVO selectVO(Wrapper<DianhuagoutongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianhuagoutongView> selectListView(Wrapper<DianhuagoutongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianhuagoutongView selectView(Wrapper<DianhuagoutongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
