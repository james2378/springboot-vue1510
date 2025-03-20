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


import com.dao.FanhuijiliushuidanDao;
import com.entity.FanhuijiliushuidanEntity;
import com.service.FanhuijiliushuidanService;
import com.entity.vo.FanhuijiliushuidanVO;
import com.entity.view.FanhuijiliushuidanView;

@Service("fanhuijiliushuidanService")
public class FanhuijiliushuidanServiceImpl extends ServiceImpl<FanhuijiliushuidanDao, FanhuijiliushuidanEntity> implements FanhuijiliushuidanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanhuijiliushuidanEntity> page = this.selectPage(
                new Query<FanhuijiliushuidanEntity>(params).getPage(),
                new EntityWrapper<FanhuijiliushuidanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanhuijiliushuidanEntity> wrapper) {
		  Page<FanhuijiliushuidanView> page =new Query<FanhuijiliushuidanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanhuijiliushuidanVO> selectListVO(Wrapper<FanhuijiliushuidanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanhuijiliushuidanVO selectVO(Wrapper<FanhuijiliushuidanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanhuijiliushuidanView> selectListView(Wrapper<FanhuijiliushuidanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanhuijiliushuidanView selectView(Wrapper<FanhuijiliushuidanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
