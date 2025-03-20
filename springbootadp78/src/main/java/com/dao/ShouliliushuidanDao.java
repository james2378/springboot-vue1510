package com.dao;

import com.entity.ShouliliushuidanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouliliushuidanVO;
import com.entity.view.ShouliliushuidanView;


/**
 * 受理流水单
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ShouliliushuidanDao extends BaseMapper<ShouliliushuidanEntity> {
	
	List<ShouliliushuidanVO> selectListVO(@Param("ew") Wrapper<ShouliliushuidanEntity> wrapper);
	
	ShouliliushuidanVO selectVO(@Param("ew") Wrapper<ShouliliushuidanEntity> wrapper);
	
	List<ShouliliushuidanView> selectListView(@Param("ew") Wrapper<ShouliliushuidanEntity> wrapper);

	List<ShouliliushuidanView> selectListView(Pagination page,@Param("ew") Wrapper<ShouliliushuidanEntity> wrapper);
	
	ShouliliushuidanView selectView(@Param("ew") Wrapper<ShouliliushuidanEntity> wrapper);
	

}
