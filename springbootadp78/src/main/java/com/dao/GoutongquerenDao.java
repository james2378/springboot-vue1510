package com.dao;

import com.entity.GoutongquerenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoutongquerenVO;
import com.entity.view.GoutongquerenView;


/**
 * 沟通确认
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface GoutongquerenDao extends BaseMapper<GoutongquerenEntity> {
	
	List<GoutongquerenVO> selectListVO(@Param("ew") Wrapper<GoutongquerenEntity> wrapper);
	
	GoutongquerenVO selectVO(@Param("ew") Wrapper<GoutongquerenEntity> wrapper);
	
	List<GoutongquerenView> selectListView(@Param("ew") Wrapper<GoutongquerenEntity> wrapper);

	List<GoutongquerenView> selectListView(Pagination page,@Param("ew") Wrapper<GoutongquerenEntity> wrapper);
	
	GoutongquerenView selectView(@Param("ew") Wrapper<GoutongquerenEntity> wrapper);
	

}
