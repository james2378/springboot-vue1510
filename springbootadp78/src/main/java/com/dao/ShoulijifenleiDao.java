package com.dao;

import com.entity.ShoulijifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoulijifenleiVO;
import com.entity.view.ShoulijifenleiView;


/**
 * 受理机分类
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ShoulijifenleiDao extends BaseMapper<ShoulijifenleiEntity> {
	
	List<ShoulijifenleiVO> selectListVO(@Param("ew") Wrapper<ShoulijifenleiEntity> wrapper);
	
	ShoulijifenleiVO selectVO(@Param("ew") Wrapper<ShoulijifenleiEntity> wrapper);
	
	List<ShoulijifenleiView> selectListView(@Param("ew") Wrapper<ShoulijifenleiEntity> wrapper);

	List<ShoulijifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShoulijifenleiEntity> wrapper);
	
	ShoulijifenleiView selectView(@Param("ew") Wrapper<ShoulijifenleiEntity> wrapper);
	

}
