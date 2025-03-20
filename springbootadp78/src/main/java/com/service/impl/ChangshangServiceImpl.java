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


import com.dao.ChangshangDao;
import com.entity.ChangshangEntity;
import com.service.ChangshangService;
import com.entity.vo.ChangshangVO;
import com.entity.view.ChangshangView;

@Service("changshangService")
public class ChangshangServiceImpl extends ServiceImpl<ChangshangDao, ChangshangEntity> implements ChangshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangshangEntity> page = this.selectPage(
                new Query<ChangshangEntity>(params).getPage(),
                new EntityWrapper<ChangshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangshangEntity> wrapper) {
		  Page<ChangshangView> page =new Query<ChangshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangshangVO> selectListVO(Wrapper<ChangshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangshangVO selectVO(Wrapper<ChangshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangshangView> selectListView(Wrapper<ChangshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangshangView selectView(Wrapper<ChangshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
