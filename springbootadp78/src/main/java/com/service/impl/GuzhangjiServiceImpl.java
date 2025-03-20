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


import com.dao.GuzhangjiDao;
import com.entity.GuzhangjiEntity;
import com.service.GuzhangjiService;
import com.entity.vo.GuzhangjiVO;
import com.entity.view.GuzhangjiView;

@Service("guzhangjiService")
public class GuzhangjiServiceImpl extends ServiceImpl<GuzhangjiDao, GuzhangjiEntity> implements GuzhangjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuzhangjiEntity> page = this.selectPage(
                new Query<GuzhangjiEntity>(params).getPage(),
                new EntityWrapper<GuzhangjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuzhangjiEntity> wrapper) {
		  Page<GuzhangjiView> page =new Query<GuzhangjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuzhangjiVO> selectListVO(Wrapper<GuzhangjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuzhangjiVO selectVO(Wrapper<GuzhangjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuzhangjiView> selectListView(Wrapper<GuzhangjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuzhangjiView selectView(Wrapper<GuzhangjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
