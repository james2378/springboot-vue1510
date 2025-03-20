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


import com.dao.ZhuangxiangfanchangDao;
import com.entity.ZhuangxiangfanchangEntity;
import com.service.ZhuangxiangfanchangService;
import com.entity.vo.ZhuangxiangfanchangVO;
import com.entity.view.ZhuangxiangfanchangView;

@Service("zhuangxiangfanchangService")
public class ZhuangxiangfanchangServiceImpl extends ServiceImpl<ZhuangxiangfanchangDao, ZhuangxiangfanchangEntity> implements ZhuangxiangfanchangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangxiangfanchangEntity> page = this.selectPage(
                new Query<ZhuangxiangfanchangEntity>(params).getPage(),
                new EntityWrapper<ZhuangxiangfanchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangxiangfanchangEntity> wrapper) {
		  Page<ZhuangxiangfanchangView> page =new Query<ZhuangxiangfanchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuangxiangfanchangVO> selectListVO(Wrapper<ZhuangxiangfanchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangxiangfanchangVO selectVO(Wrapper<ZhuangxiangfanchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangxiangfanchangView> selectListView(Wrapper<ZhuangxiangfanchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangxiangfanchangView selectView(Wrapper<ZhuangxiangfanchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
