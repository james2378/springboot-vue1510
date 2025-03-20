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


import com.dao.ShoulifanhuijiDao;
import com.entity.ShoulifanhuijiEntity;
import com.service.ShoulifanhuijiService;
import com.entity.vo.ShoulifanhuijiVO;
import com.entity.view.ShoulifanhuijiView;

@Service("shoulifanhuijiService")
public class ShoulifanhuijiServiceImpl extends ServiceImpl<ShoulifanhuijiDao, ShoulifanhuijiEntity> implements ShoulifanhuijiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoulifanhuijiEntity> page = this.selectPage(
                new Query<ShoulifanhuijiEntity>(params).getPage(),
                new EntityWrapper<ShoulifanhuijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoulifanhuijiEntity> wrapper) {
		  Page<ShoulifanhuijiView> page =new Query<ShoulifanhuijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoulifanhuijiVO> selectListVO(Wrapper<ShoulifanhuijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoulifanhuijiVO selectVO(Wrapper<ShoulifanhuijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoulifanhuijiView> selectListView(Wrapper<ShoulifanhuijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoulifanhuijiView selectView(Wrapper<ShoulifanhuijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
