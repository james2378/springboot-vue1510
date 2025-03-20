package com.dao;

import com.entity.GongchengshifankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongchengshifankuiVO;
import com.entity.view.GongchengshifankuiView;


/**
 * 工程师反馈
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface GongchengshifankuiDao extends BaseMapper<GongchengshifankuiEntity> {
	
	List<GongchengshifankuiVO> selectListVO(@Param("ew") Wrapper<GongchengshifankuiEntity> wrapper);
	
	GongchengshifankuiVO selectVO(@Param("ew") Wrapper<GongchengshifankuiEntity> wrapper);
	
	List<GongchengshifankuiView> selectListView(@Param("ew") Wrapper<GongchengshifankuiEntity> wrapper);

	List<GongchengshifankuiView> selectListView(Pagination page,@Param("ew") Wrapper<GongchengshifankuiEntity> wrapper);
	
	GongchengshifankuiView selectView(@Param("ew") Wrapper<GongchengshifankuiEntity> wrapper);
	

}
