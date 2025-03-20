package com.dao;

import com.entity.KehushouhuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KehushouhuoVO;
import com.entity.view.KehushouhuoView;


/**
 * 客户收货
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface KehushouhuoDao extends BaseMapper<KehushouhuoEntity> {
	
	List<KehushouhuoVO> selectListVO(@Param("ew") Wrapper<KehushouhuoEntity> wrapper);
	
	KehushouhuoVO selectVO(@Param("ew") Wrapper<KehushouhuoEntity> wrapper);
	
	List<KehushouhuoView> selectListView(@Param("ew") Wrapper<KehushouhuoEntity> wrapper);

	List<KehushouhuoView> selectListView(Pagination page,@Param("ew") Wrapper<KehushouhuoEntity> wrapper);
	
	KehushouhuoView selectView(@Param("ew") Wrapper<KehushouhuoEntity> wrapper);
	

}
