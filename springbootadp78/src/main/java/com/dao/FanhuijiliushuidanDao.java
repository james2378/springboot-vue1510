package com.dao;

import com.entity.FanhuijiliushuidanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanhuijiliushuidanVO;
import com.entity.view.FanhuijiliushuidanView;


/**
 * 返回机流水单
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijiliushuidanDao extends BaseMapper<FanhuijiliushuidanEntity> {
	
	List<FanhuijiliushuidanVO> selectListVO(@Param("ew") Wrapper<FanhuijiliushuidanEntity> wrapper);
	
	FanhuijiliushuidanVO selectVO(@Param("ew") Wrapper<FanhuijiliushuidanEntity> wrapper);
	
	List<FanhuijiliushuidanView> selectListView(@Param("ew") Wrapper<FanhuijiliushuidanEntity> wrapper);

	List<FanhuijiliushuidanView> selectListView(Pagination page,@Param("ew") Wrapper<FanhuijiliushuidanEntity> wrapper);
	
	FanhuijiliushuidanView selectView(@Param("ew") Wrapper<FanhuijiliushuidanEntity> wrapper);
	

}
