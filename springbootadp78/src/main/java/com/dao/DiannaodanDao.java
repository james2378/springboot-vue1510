package com.dao;

import com.entity.DiannaodanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiannaodanVO;
import com.entity.view.DiannaodanView;


/**
 * 电脑单
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface DiannaodanDao extends BaseMapper<DiannaodanEntity> {
	
	List<DiannaodanVO> selectListVO(@Param("ew") Wrapper<DiannaodanEntity> wrapper);
	
	DiannaodanVO selectVO(@Param("ew") Wrapper<DiannaodanEntity> wrapper);
	
	List<DiannaodanView> selectListView(@Param("ew") Wrapper<DiannaodanEntity> wrapper);

	List<DiannaodanView> selectListView(Pagination page,@Param("ew") Wrapper<DiannaodanEntity> wrapper);
	
	DiannaodanView selectView(@Param("ew") Wrapper<DiannaodanEntity> wrapper);
	

}
