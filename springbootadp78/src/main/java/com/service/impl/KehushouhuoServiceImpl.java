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


import com.dao.KehushouhuoDao;
import com.entity.KehushouhuoEntity;
import com.service.KehushouhuoService;
import com.entity.vo.KehushouhuoVO;
import com.entity.view.KehushouhuoView;

@Service("kehushouhuoService")
public class KehushouhuoServiceImpl extends ServiceImpl<KehushouhuoDao, KehushouhuoEntity> implements KehushouhuoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KehushouhuoEntity> page = this.selectPage(
                new Query<KehushouhuoEntity>(params).getPage(),
                new EntityWrapper<KehushouhuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KehushouhuoEntity> wrapper) {
		  Page<KehushouhuoView> page =new Query<KehushouhuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KehushouhuoVO> selectListVO(Wrapper<KehushouhuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KehushouhuoVO selectVO(Wrapper<KehushouhuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KehushouhuoView> selectListView(Wrapper<KehushouhuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KehushouhuoView selectView(Wrapper<KehushouhuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
