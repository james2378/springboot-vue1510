package com.dao;

import com.entity.ZhuangxiangfanhuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangxiangfanhuiVO;
import com.entity.view.ZhuangxiangfanhuiView;


/**
 * 装箱返回
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface ZhuangxiangfanhuiDao extends BaseMapper<ZhuangxiangfanhuiEntity> {
	
	List<ZhuangxiangfanhuiVO> selectListVO(@Param("ew") Wrapper<ZhuangxiangfanhuiEntity> wrapper);
	
	ZhuangxiangfanhuiVO selectVO(@Param("ew") Wrapper<ZhuangxiangfanhuiEntity> wrapper);
	
	List<ZhuangxiangfanhuiView> selectListView(@Param("ew") Wrapper<ZhuangxiangfanhuiEntity> wrapper);

	List<ZhuangxiangfanhuiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangxiangfanhuiEntity> wrapper);
	
	ZhuangxiangfanhuiView selectView(@Param("ew") Wrapper<ZhuangxiangfanhuiEntity> wrapper);
	

}
