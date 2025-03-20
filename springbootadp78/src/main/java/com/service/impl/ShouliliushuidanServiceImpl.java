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


import com.dao.ShouliliushuidanDao;
import com.entity.ShouliliushuidanEntity;
import com.service.ShouliliushuidanService;
import com.entity.vo.ShouliliushuidanVO;
import com.entity.view.ShouliliushuidanView;

@Service("shouliliushuidanService")
public class ShouliliushuidanServiceImpl extends ServiceImpl<ShouliliushuidanDao, ShouliliushuidanEntity> implements ShouliliushuidanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouliliushuidanEntity> page = this.selectPage(
                new Query<ShouliliushuidanEntity>(params).getPage(),
                new EntityWrapper<ShouliliushuidanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouliliushuidanEntity> wrapper) {
		  Page<ShouliliushuidanView> page =new Query<ShouliliushuidanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouliliushuidanVO> selectListVO(Wrapper<ShouliliushuidanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouliliushuidanVO selectVO(Wrapper<ShouliliushuidanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouliliushuidanView> selectListView(Wrapper<ShouliliushuidanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouliliushuidanView selectView(Wrapper<ShouliliushuidanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
