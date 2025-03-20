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


import com.dao.YoujifanhuijiDao;
import com.entity.YoujifanhuijiEntity;
import com.service.YoujifanhuijiService;
import com.entity.vo.YoujifanhuijiVO;
import com.entity.view.YoujifanhuijiView;

@Service("youjifanhuijiService")
public class YoujifanhuijiServiceImpl extends ServiceImpl<YoujifanhuijiDao, YoujifanhuijiEntity> implements YoujifanhuijiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YoujifanhuijiEntity> page = this.selectPage(
                new Query<YoujifanhuijiEntity>(params).getPage(),
                new EntityWrapper<YoujifanhuijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YoujifanhuijiEntity> wrapper) {
		  Page<YoujifanhuijiView> page =new Query<YoujifanhuijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YoujifanhuijiVO> selectListVO(Wrapper<YoujifanhuijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YoujifanhuijiVO selectVO(Wrapper<YoujifanhuijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YoujifanhuijiView> selectListView(Wrapper<YoujifanhuijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YoujifanhuijiView selectView(Wrapper<YoujifanhuijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
