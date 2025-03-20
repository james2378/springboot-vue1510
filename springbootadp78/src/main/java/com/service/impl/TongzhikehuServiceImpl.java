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


import com.dao.TongzhikehuDao;
import com.entity.TongzhikehuEntity;
import com.service.TongzhikehuService;
import com.entity.vo.TongzhikehuVO;
import com.entity.view.TongzhikehuView;

@Service("tongzhikehuService")
public class TongzhikehuServiceImpl extends ServiceImpl<TongzhikehuDao, TongzhikehuEntity> implements TongzhikehuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhikehuEntity> page = this.selectPage(
                new Query<TongzhikehuEntity>(params).getPage(),
                new EntityWrapper<TongzhikehuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhikehuEntity> wrapper) {
		  Page<TongzhikehuView> page =new Query<TongzhikehuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongzhikehuVO> selectListVO(Wrapper<TongzhikehuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongzhikehuVO selectVO(Wrapper<TongzhikehuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongzhikehuView> selectListView(Wrapper<TongzhikehuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhikehuView selectView(Wrapper<TongzhikehuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
