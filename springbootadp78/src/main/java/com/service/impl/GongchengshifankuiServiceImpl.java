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


import com.dao.GongchengshifankuiDao;
import com.entity.GongchengshifankuiEntity;
import com.service.GongchengshifankuiService;
import com.entity.vo.GongchengshifankuiVO;
import com.entity.view.GongchengshifankuiView;

@Service("gongchengshifankuiService")
public class GongchengshifankuiServiceImpl extends ServiceImpl<GongchengshifankuiDao, GongchengshifankuiEntity> implements GongchengshifankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongchengshifankuiEntity> page = this.selectPage(
                new Query<GongchengshifankuiEntity>(params).getPage(),
                new EntityWrapper<GongchengshifankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongchengshifankuiEntity> wrapper) {
		  Page<GongchengshifankuiView> page =new Query<GongchengshifankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongchengshifankuiVO> selectListVO(Wrapper<GongchengshifankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongchengshifankuiVO selectVO(Wrapper<GongchengshifankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongchengshifankuiView> selectListView(Wrapper<GongchengshifankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongchengshifankuiView selectView(Wrapper<GongchengshifankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
