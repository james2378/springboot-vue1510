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


import com.dao.ShouliguzhangjiDao;
import com.entity.ShouliguzhangjiEntity;
import com.service.ShouliguzhangjiService;
import com.entity.vo.ShouliguzhangjiVO;
import com.entity.view.ShouliguzhangjiView;

@Service("shouliguzhangjiService")
public class ShouliguzhangjiServiceImpl extends ServiceImpl<ShouliguzhangjiDao, ShouliguzhangjiEntity> implements ShouliguzhangjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouliguzhangjiEntity> page = this.selectPage(
                new Query<ShouliguzhangjiEntity>(params).getPage(),
                new EntityWrapper<ShouliguzhangjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouliguzhangjiEntity> wrapper) {
		  Page<ShouliguzhangjiView> page =new Query<ShouliguzhangjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouliguzhangjiVO> selectListVO(Wrapper<ShouliguzhangjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouliguzhangjiVO selectVO(Wrapper<ShouliguzhangjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouliguzhangjiView> selectListView(Wrapper<ShouliguzhangjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouliguzhangjiView selectView(Wrapper<ShouliguzhangjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
