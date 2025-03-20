package com.dao;

import com.entity.ZhuangxiangfanchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangxiangfanchangVO;
import com.entity.view.ZhuangxiangfanchangView;


/**
 * 装箱返厂
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ZhuangxiangfanchangDao extends BaseMapper<ZhuangxiangfanchangEntity> {
	
	List<ZhuangxiangfanchangVO> selectListVO(@Param("ew") Wrapper<ZhuangxiangfanchangEntity> wrapper);
	
	ZhuangxiangfanchangVO selectVO(@Param("ew") Wrapper<ZhuangxiangfanchangEntity> wrapper);
	
	List<ZhuangxiangfanchangView> selectListView(@Param("ew") Wrapper<ZhuangxiangfanchangEntity> wrapper);

	List<ZhuangxiangfanchangView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangxiangfanchangEntity> wrapper);
	
	ZhuangxiangfanchangView selectView(@Param("ew") Wrapper<ZhuangxiangfanchangEntity> wrapper);
	

}
