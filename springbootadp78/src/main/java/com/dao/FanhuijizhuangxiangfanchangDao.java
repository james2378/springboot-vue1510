package com.dao;

import com.entity.FanhuijizhuangxiangfanchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanhuijizhuangxiangfanchangVO;
import com.entity.view.FanhuijizhuangxiangfanchangView;


/**
 * 返回机装箱返厂
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijizhuangxiangfanchangDao extends BaseMapper<FanhuijizhuangxiangfanchangEntity> {
	
	List<FanhuijizhuangxiangfanchangVO> selectListVO(@Param("ew") Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);
	
	FanhuijizhuangxiangfanchangVO selectVO(@Param("ew") Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);
	
	List<FanhuijizhuangxiangfanchangView> selectListView(@Param("ew") Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);

	List<FanhuijizhuangxiangfanchangView> selectListView(Pagination page,@Param("ew") Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);
	
	FanhuijizhuangxiangfanchangView selectView(@Param("ew") Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);
	

}
