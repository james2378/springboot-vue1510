package com.dao;

import com.entity.FanhuijichanpinweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanhuijichanpinweixiuVO;
import com.entity.view.FanhuijichanpinweixiuView;


/**
 * 返回机产品维修
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijichanpinweixiuDao extends BaseMapper<FanhuijichanpinweixiuEntity> {
	
	List<FanhuijichanpinweixiuVO> selectListVO(@Param("ew") Wrapper<FanhuijichanpinweixiuEntity> wrapper);
	
	FanhuijichanpinweixiuVO selectVO(@Param("ew") Wrapper<FanhuijichanpinweixiuEntity> wrapper);
	
	List<FanhuijichanpinweixiuView> selectListView(@Param("ew") Wrapper<FanhuijichanpinweixiuEntity> wrapper);

	List<FanhuijichanpinweixiuView> selectListView(Pagination page,@Param("ew") Wrapper<FanhuijichanpinweixiuEntity> wrapper);
	
	FanhuijichanpinweixiuView selectView(@Param("ew") Wrapper<FanhuijichanpinweixiuEntity> wrapper);
	

}
