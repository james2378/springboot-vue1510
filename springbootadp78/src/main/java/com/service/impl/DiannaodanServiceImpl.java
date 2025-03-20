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


import com.dao.DiannaodanDao;
import com.entity.DiannaodanEntity;
import com.service.DiannaodanService;
import com.entity.vo.DiannaodanVO;
import com.entity.view.DiannaodanView;

@Service("diannaodanService")
public class DiannaodanServiceImpl extends ServiceImpl<DiannaodanDao, DiannaodanEntity> implements DiannaodanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiannaodanEntity> page = this.selectPage(
                new Query<DiannaodanEntity>(params).getPage(),
                new EntityWrapper<DiannaodanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiannaodanEntity> wrapper) {
		  Page<DiannaodanView> page =new Query<DiannaodanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiannaodanVO> selectListVO(Wrapper<DiannaodanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiannaodanVO selectVO(Wrapper<DiannaodanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiannaodanView> selectListView(Wrapper<DiannaodanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiannaodanView selectView(Wrapper<DiannaodanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
