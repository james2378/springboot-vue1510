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


import com.dao.ShoulijifenleiDao;
import com.entity.ShoulijifenleiEntity;
import com.service.ShoulijifenleiService;
import com.entity.vo.ShoulijifenleiVO;
import com.entity.view.ShoulijifenleiView;

@Service("shoulijifenleiService")
public class ShoulijifenleiServiceImpl extends ServiceImpl<ShoulijifenleiDao, ShoulijifenleiEntity> implements ShoulijifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoulijifenleiEntity> page = this.selectPage(
                new Query<ShoulijifenleiEntity>(params).getPage(),
                new EntityWrapper<ShoulijifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoulijifenleiEntity> wrapper) {
		  Page<ShoulijifenleiView> page =new Query<ShoulijifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoulijifenleiVO> selectListVO(Wrapper<ShoulijifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoulijifenleiVO selectVO(Wrapper<ShoulijifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoulijifenleiView> selectListView(Wrapper<ShoulijifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoulijifenleiView selectView(Wrapper<ShoulijifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
