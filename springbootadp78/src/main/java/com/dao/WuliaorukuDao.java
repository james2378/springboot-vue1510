package com.dao;

import com.entity.WuliaorukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuliaorukuVO;
import com.entity.view.WuliaorukuView;


/**
 * 物料入库
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface WuliaorukuDao extends BaseMapper<WuliaorukuEntity> {
	
	List<WuliaorukuVO> selectListVO(@Param("ew") Wrapper<WuliaorukuEntity> wrapper);
	
	WuliaorukuVO selectVO(@Param("ew") Wrapper<WuliaorukuEntity> wrapper);
	
	List<WuliaorukuView> selectListView(@Param("ew") Wrapper<WuliaorukuEntity> wrapper);

	List<WuliaorukuView> selectListView(Pagination page,@Param("ew") Wrapper<WuliaorukuEntity> wrapper);
	
	WuliaorukuView selectView(@Param("ew") Wrapper<WuliaorukuEntity> wrapper);
	

}
