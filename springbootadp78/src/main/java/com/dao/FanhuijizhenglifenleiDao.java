package com.dao;

import com.entity.FanhuijizhenglifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanhuijizhenglifenleiVO;
import com.entity.view.FanhuijizhenglifenleiView;


/**
 * 返回机整理分类
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijizhenglifenleiDao extends BaseMapper<FanhuijizhenglifenleiEntity> {
	
	List<FanhuijizhenglifenleiVO> selectListVO(@Param("ew") Wrapper<FanhuijizhenglifenleiEntity> wrapper);
	
	FanhuijizhenglifenleiVO selectVO(@Param("ew") Wrapper<FanhuijizhenglifenleiEntity> wrapper);
	
	List<FanhuijizhenglifenleiView> selectListView(@Param("ew") Wrapper<FanhuijizhenglifenleiEntity> wrapper);

	List<FanhuijizhenglifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<FanhuijizhenglifenleiEntity> wrapper);
	
	FanhuijizhenglifenleiView selectView(@Param("ew") Wrapper<FanhuijizhenglifenleiEntity> wrapper);
	

}
