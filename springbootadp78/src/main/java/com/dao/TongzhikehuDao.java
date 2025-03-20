package com.dao;

import com.entity.TongzhikehuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongzhikehuVO;
import com.entity.view.TongzhikehuView;


/**
 * 通知客户
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface TongzhikehuDao extends BaseMapper<TongzhikehuEntity> {
	
	List<TongzhikehuVO> selectListVO(@Param("ew") Wrapper<TongzhikehuEntity> wrapper);
	
	TongzhikehuVO selectVO(@Param("ew") Wrapper<TongzhikehuEntity> wrapper);
	
	List<TongzhikehuView> selectListView(@Param("ew") Wrapper<TongzhikehuEntity> wrapper);

	List<TongzhikehuView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhikehuEntity> wrapper);
	
	TongzhikehuView selectView(@Param("ew") Wrapper<TongzhikehuEntity> wrapper);
	

}
