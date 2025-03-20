package com.dao;

import com.entity.ChanpinweihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinweihuVO;
import com.entity.view.ChanpinweihuView;


/**
 * 产品维护
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ChanpinweihuDao extends BaseMapper<ChanpinweihuEntity> {
	
	List<ChanpinweihuVO> selectListVO(@Param("ew") Wrapper<ChanpinweihuEntity> wrapper);
	
	ChanpinweihuVO selectVO(@Param("ew") Wrapper<ChanpinweihuEntity> wrapper);
	
	List<ChanpinweihuView> selectListView(@Param("ew") Wrapper<ChanpinweihuEntity> wrapper);

	List<ChanpinweihuView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinweihuEntity> wrapper);
	
	ChanpinweihuView selectView(@Param("ew") Wrapper<ChanpinweihuEntity> wrapper);
	

}
