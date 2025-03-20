package com.dao;

import com.entity.FanhuijizhuangxiangfanhuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanhuijizhuangxiangfanhuiVO;
import com.entity.view.FanhuijizhuangxiangfanhuiView;


/**
 * 返回机装箱返回
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijizhuangxiangfanhuiDao extends BaseMapper<FanhuijizhuangxiangfanhuiEntity> {
	
	List<FanhuijizhuangxiangfanhuiVO> selectListVO(@Param("ew") Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);
	
	FanhuijizhuangxiangfanhuiVO selectVO(@Param("ew") Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);
	
	List<FanhuijizhuangxiangfanhuiView> selectListView(@Param("ew") Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);

	List<FanhuijizhuangxiangfanhuiView> selectListView(Pagination page,@Param("ew") Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);
	
	FanhuijizhuangxiangfanhuiView selectView(@Param("ew") Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);
	

}
