package com.dao;

import com.entity.GongchengshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongchengshiVO;
import com.entity.view.GongchengshiView;


/**
 * 工程师
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface GongchengshiDao extends BaseMapper<GongchengshiEntity> {
	
	List<GongchengshiVO> selectListVO(@Param("ew") Wrapper<GongchengshiEntity> wrapper);
	
	GongchengshiVO selectVO(@Param("ew") Wrapper<GongchengshiEntity> wrapper);
	
	List<GongchengshiView> selectListView(@Param("ew") Wrapper<GongchengshiEntity> wrapper);

	List<GongchengshiView> selectListView(Pagination page,@Param("ew") Wrapper<GongchengshiEntity> wrapper);
	
	GongchengshiView selectView(@Param("ew") Wrapper<GongchengshiEntity> wrapper);
	

}
