package com.dao;

import com.entity.ZhenglifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhenglifenleiVO;
import com.entity.view.ZhenglifenleiView;


/**
 * 整理分类
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ZhenglifenleiDao extends BaseMapper<ZhenglifenleiEntity> {
	
	List<ZhenglifenleiVO> selectListVO(@Param("ew") Wrapper<ZhenglifenleiEntity> wrapper);
	
	ZhenglifenleiVO selectVO(@Param("ew") Wrapper<ZhenglifenleiEntity> wrapper);
	
	List<ZhenglifenleiView> selectListView(@Param("ew") Wrapper<ZhenglifenleiEntity> wrapper);

	List<ZhenglifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhenglifenleiEntity> wrapper);
	
	ZhenglifenleiView selectView(@Param("ew") Wrapper<ZhenglifenleiEntity> wrapper);
	

}
