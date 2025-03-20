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


import com.dao.FenpeigongchengshiDao;
import com.entity.FenpeigongchengshiEntity;
import com.service.FenpeigongchengshiService;
import com.entity.vo.FenpeigongchengshiVO;
import com.entity.view.FenpeigongchengshiView;

@Service("fenpeigongchengshiService")
public class FenpeigongchengshiServiceImpl extends ServiceImpl<FenpeigongchengshiDao, FenpeigongchengshiEntity> implements FenpeigongchengshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenpeigongchengshiEntity> page = this.selectPage(
                new Query<FenpeigongchengshiEntity>(params).getPage(),
                new EntityWrapper<FenpeigongchengshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenpeigongchengshiEntity> wrapper) {
		  Page<FenpeigongchengshiView> page =new Query<FenpeigongchengshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenpeigongchengshiVO> selectListVO(Wrapper<FenpeigongchengshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenpeigongchengshiVO selectVO(Wrapper<FenpeigongchengshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenpeigongchengshiView> selectListView(Wrapper<FenpeigongchengshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenpeigongchengshiView selectView(Wrapper<FenpeigongchengshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
