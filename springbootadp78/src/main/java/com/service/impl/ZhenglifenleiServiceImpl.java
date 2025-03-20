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


import com.dao.ZhenglifenleiDao;
import com.entity.ZhenglifenleiEntity;
import com.service.ZhenglifenleiService;
import com.entity.vo.ZhenglifenleiVO;
import com.entity.view.ZhenglifenleiView;

@Service("zhenglifenleiService")
public class ZhenglifenleiServiceImpl extends ServiceImpl<ZhenglifenleiDao, ZhenglifenleiEntity> implements ZhenglifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhenglifenleiEntity> page = this.selectPage(
                new Query<ZhenglifenleiEntity>(params).getPage(),
                new EntityWrapper<ZhenglifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhenglifenleiEntity> wrapper) {
		  Page<ZhenglifenleiView> page =new Query<ZhenglifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhenglifenleiVO> selectListVO(Wrapper<ZhenglifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhenglifenleiVO selectVO(Wrapper<ZhenglifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhenglifenleiView> selectListView(Wrapper<ZhenglifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhenglifenleiView selectView(Wrapper<ZhenglifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
