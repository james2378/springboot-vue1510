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


import com.dao.GoutongquerenDao;
import com.entity.GoutongquerenEntity;
import com.service.GoutongquerenService;
import com.entity.vo.GoutongquerenVO;
import com.entity.view.GoutongquerenView;

@Service("goutongquerenService")
public class GoutongquerenServiceImpl extends ServiceImpl<GoutongquerenDao, GoutongquerenEntity> implements GoutongquerenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoutongquerenEntity> page = this.selectPage(
                new Query<GoutongquerenEntity>(params).getPage(),
                new EntityWrapper<GoutongquerenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoutongquerenEntity> wrapper) {
		  Page<GoutongquerenView> page =new Query<GoutongquerenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoutongquerenVO> selectListVO(Wrapper<GoutongquerenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoutongquerenVO selectVO(Wrapper<GoutongquerenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoutongquerenView> selectListView(Wrapper<GoutongquerenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoutongquerenView selectView(Wrapper<GoutongquerenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
