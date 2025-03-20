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


import com.dao.FanhuijizhenglifenleiDao;
import com.entity.FanhuijizhenglifenleiEntity;
import com.service.FanhuijizhenglifenleiService;
import com.entity.vo.FanhuijizhenglifenleiVO;
import com.entity.view.FanhuijizhenglifenleiView;

@Service("fanhuijizhenglifenleiService")
public class FanhuijizhenglifenleiServiceImpl extends ServiceImpl<FanhuijizhenglifenleiDao, FanhuijizhenglifenleiEntity> implements FanhuijizhenglifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanhuijizhenglifenleiEntity> page = this.selectPage(
                new Query<FanhuijizhenglifenleiEntity>(params).getPage(),
                new EntityWrapper<FanhuijizhenglifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanhuijizhenglifenleiEntity> wrapper) {
		  Page<FanhuijizhenglifenleiView> page =new Query<FanhuijizhenglifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanhuijizhenglifenleiVO> selectListVO(Wrapper<FanhuijizhenglifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanhuijizhenglifenleiVO selectVO(Wrapper<FanhuijizhenglifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanhuijizhenglifenleiView> selectListView(Wrapper<FanhuijizhenglifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanhuijizhenglifenleiView selectView(Wrapper<FanhuijizhenglifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
