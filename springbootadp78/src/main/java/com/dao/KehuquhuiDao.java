package com.dao;

import com.entity.KehuquhuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KehuquhuiVO;
import com.entity.view.KehuquhuiView;


/**
 * 客户取回
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface KehuquhuiDao extends BaseMapper<KehuquhuiEntity> {
	
	List<KehuquhuiVO> selectListVO(@Param("ew") Wrapper<KehuquhuiEntity> wrapper);
	
	KehuquhuiVO selectVO(@Param("ew") Wrapper<KehuquhuiEntity> wrapper);
	
	List<KehuquhuiView> selectListView(@Param("ew") Wrapper<KehuquhuiEntity> wrapper);

	List<KehuquhuiView> selectListView(Pagination page,@Param("ew") Wrapper<KehuquhuiEntity> wrapper);
	
	KehuquhuiView selectView(@Param("ew") Wrapper<KehuquhuiEntity> wrapper);
	

}
