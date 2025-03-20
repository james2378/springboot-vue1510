package com.dao;

import com.entity.WuliaochukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuliaochukuVO;
import com.entity.view.WuliaochukuView;


/**
 * 物料出库
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface WuliaochukuDao extends BaseMapper<WuliaochukuEntity> {
	
	List<WuliaochukuVO> selectListVO(@Param("ew") Wrapper<WuliaochukuEntity> wrapper);
	
	WuliaochukuVO selectVO(@Param("ew") Wrapper<WuliaochukuEntity> wrapper);
	
	List<WuliaochukuView> selectListView(@Param("ew") Wrapper<WuliaochukuEntity> wrapper);

	List<WuliaochukuView> selectListView(Pagination page,@Param("ew") Wrapper<WuliaochukuEntity> wrapper);
	
	WuliaochukuView selectView(@Param("ew") Wrapper<WuliaochukuEntity> wrapper);
	

}
