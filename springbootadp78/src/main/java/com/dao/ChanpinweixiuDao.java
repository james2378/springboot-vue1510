package com.dao;

import com.entity.ChanpinweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinweixiuVO;
import com.entity.view.ChanpinweixiuView;


/**
 * 产品维修
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface ChanpinweixiuDao extends BaseMapper<ChanpinweixiuEntity> {
	
	List<ChanpinweixiuVO> selectListVO(@Param("ew") Wrapper<ChanpinweixiuEntity> wrapper);
	
	ChanpinweixiuVO selectVO(@Param("ew") Wrapper<ChanpinweixiuEntity> wrapper);
	
	List<ChanpinweixiuView> selectListView(@Param("ew") Wrapper<ChanpinweixiuEntity> wrapper);

	List<ChanpinweixiuView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinweixiuEntity> wrapper);
	
	ChanpinweixiuView selectView(@Param("ew") Wrapper<ChanpinweixiuEntity> wrapper);
	

}
