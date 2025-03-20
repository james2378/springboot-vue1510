package com.dao;

import com.entity.FanhuijiyoujikehuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanhuijiyoujikehuVO;
import com.entity.view.FanhuijiyoujikehuView;


/**
 * 返回机邮寄客户
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijiyoujikehuDao extends BaseMapper<FanhuijiyoujikehuEntity> {
	
	List<FanhuijiyoujikehuVO> selectListVO(@Param("ew") Wrapper<FanhuijiyoujikehuEntity> wrapper);
	
	FanhuijiyoujikehuVO selectVO(@Param("ew") Wrapper<FanhuijiyoujikehuEntity> wrapper);
	
	List<FanhuijiyoujikehuView> selectListView(@Param("ew") Wrapper<FanhuijiyoujikehuEntity> wrapper);

	List<FanhuijiyoujikehuView> selectListView(Pagination page,@Param("ew") Wrapper<FanhuijiyoujikehuEntity> wrapper);
	
	FanhuijiyoujikehuView selectView(@Param("ew") Wrapper<FanhuijiyoujikehuEntity> wrapper);
	

}
