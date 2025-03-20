package com.dao;

import com.entity.FanhuijidiannaodanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanhuijidiannaodanVO;
import com.entity.view.FanhuijidiannaodanView;


/**
 * 返回机电脑单
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijidiannaodanDao extends BaseMapper<FanhuijidiannaodanEntity> {
	
	List<FanhuijidiannaodanVO> selectListVO(@Param("ew") Wrapper<FanhuijidiannaodanEntity> wrapper);
	
	FanhuijidiannaodanVO selectVO(@Param("ew") Wrapper<FanhuijidiannaodanEntity> wrapper);
	
	List<FanhuijidiannaodanView> selectListView(@Param("ew") Wrapper<FanhuijidiannaodanEntity> wrapper);

	List<FanhuijidiannaodanView> selectListView(Pagination page,@Param("ew") Wrapper<FanhuijidiannaodanEntity> wrapper);
	
	FanhuijidiannaodanView selectView(@Param("ew") Wrapper<FanhuijidiannaodanEntity> wrapper);
	

}
