package com.dao;

import com.entity.WuliaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuliaoleixingVO;
import com.entity.view.WuliaoleixingView;


/**
 * 物料类型
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface WuliaoleixingDao extends BaseMapper<WuliaoleixingEntity> {
	
	List<WuliaoleixingVO> selectListVO(@Param("ew") Wrapper<WuliaoleixingEntity> wrapper);
	
	WuliaoleixingVO selectVO(@Param("ew") Wrapper<WuliaoleixingEntity> wrapper);
	
	List<WuliaoleixingView> selectListView(@Param("ew") Wrapper<WuliaoleixingEntity> wrapper);

	List<WuliaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<WuliaoleixingEntity> wrapper);
	
	WuliaoleixingView selectView(@Param("ew") Wrapper<WuliaoleixingEntity> wrapper);
	

}
