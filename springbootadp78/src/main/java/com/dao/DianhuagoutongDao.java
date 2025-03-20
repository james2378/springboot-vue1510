package com.dao;

import com.entity.DianhuagoutongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianhuagoutongVO;
import com.entity.view.DianhuagoutongView;


/**
 * 电话沟通
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface DianhuagoutongDao extends BaseMapper<DianhuagoutongEntity> {
	
	List<DianhuagoutongVO> selectListVO(@Param("ew") Wrapper<DianhuagoutongEntity> wrapper);
	
	DianhuagoutongVO selectVO(@Param("ew") Wrapper<DianhuagoutongEntity> wrapper);
	
	List<DianhuagoutongView> selectListView(@Param("ew") Wrapper<DianhuagoutongEntity> wrapper);

	List<DianhuagoutongView> selectListView(Pagination page,@Param("ew") Wrapper<DianhuagoutongEntity> wrapper);
	
	DianhuagoutongView selectView(@Param("ew") Wrapper<DianhuagoutongEntity> wrapper);
	

}
