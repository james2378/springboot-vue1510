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


import com.dao.FanhuijidiannaodanDao;
import com.entity.FanhuijidiannaodanEntity;
import com.service.FanhuijidiannaodanService;
import com.entity.vo.FanhuijidiannaodanVO;
import com.entity.view.FanhuijidiannaodanView;

@Service("fanhuijidiannaodanService")
public class FanhuijidiannaodanServiceImpl extends ServiceImpl<FanhuijidiannaodanDao, FanhuijidiannaodanEntity> implements FanhuijidiannaodanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanhuijidiannaodanEntity> page = this.selectPage(
                new Query<FanhuijidiannaodanEntity>(params).getPage(),
                new EntityWrapper<FanhuijidiannaodanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanhuijidiannaodanEntity> wrapper) {
		  Page<FanhuijidiannaodanView> page =new Query<FanhuijidiannaodanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanhuijidiannaodanVO> selectListVO(Wrapper<FanhuijidiannaodanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanhuijidiannaodanVO selectVO(Wrapper<FanhuijidiannaodanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanhuijidiannaodanView> selectListView(Wrapper<FanhuijidiannaodanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanhuijidiannaodanView selectView(Wrapper<FanhuijidiannaodanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
