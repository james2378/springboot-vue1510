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


import com.dao.ChanpinweihuDao;
import com.entity.ChanpinweihuEntity;
import com.service.ChanpinweihuService;
import com.entity.vo.ChanpinweihuVO;
import com.entity.view.ChanpinweihuView;

@Service("chanpinweihuService")
public class ChanpinweihuServiceImpl extends ServiceImpl<ChanpinweihuDao, ChanpinweihuEntity> implements ChanpinweihuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinweihuEntity> page = this.selectPage(
                new Query<ChanpinweihuEntity>(params).getPage(),
                new EntityWrapper<ChanpinweihuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinweihuEntity> wrapper) {
		  Page<ChanpinweihuView> page =new Query<ChanpinweihuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpinweihuVO> selectListVO(Wrapper<ChanpinweihuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinweihuVO selectVO(Wrapper<ChanpinweihuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinweihuView> selectListView(Wrapper<ChanpinweihuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinweihuView selectView(Wrapper<ChanpinweihuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
