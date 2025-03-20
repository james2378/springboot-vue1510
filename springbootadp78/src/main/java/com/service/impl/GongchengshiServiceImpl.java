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


import com.dao.GongchengshiDao;
import com.entity.GongchengshiEntity;
import com.service.GongchengshiService;
import com.entity.vo.GongchengshiVO;
import com.entity.view.GongchengshiView;

@Service("gongchengshiService")
public class GongchengshiServiceImpl extends ServiceImpl<GongchengshiDao, GongchengshiEntity> implements GongchengshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongchengshiEntity> page = this.selectPage(
                new Query<GongchengshiEntity>(params).getPage(),
                new EntityWrapper<GongchengshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongchengshiEntity> wrapper) {
		  Page<GongchengshiView> page =new Query<GongchengshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongchengshiVO> selectListVO(Wrapper<GongchengshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongchengshiVO selectVO(Wrapper<GongchengshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongchengshiView> selectListView(Wrapper<GongchengshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongchengshiView selectView(Wrapper<GongchengshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
