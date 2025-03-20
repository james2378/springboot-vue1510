package com.dao;

import com.entity.ShoulirenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoulirenyuanVO;
import com.entity.view.ShoulirenyuanView;


/**
 * 受理人员
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ShoulirenyuanDao extends BaseMapper<ShoulirenyuanEntity> {
	
	List<ShoulirenyuanVO> selectListVO(@Param("ew") Wrapper<ShoulirenyuanEntity> wrapper);
	
	ShoulirenyuanVO selectVO(@Param("ew") Wrapper<ShoulirenyuanEntity> wrapper);
	
	List<ShoulirenyuanView> selectListView(@Param("ew") Wrapper<ShoulirenyuanEntity> wrapper);

	List<ShoulirenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShoulirenyuanEntity> wrapper);
	
	ShoulirenyuanView selectView(@Param("ew") Wrapper<ShoulirenyuanEntity> wrapper);
	

}
