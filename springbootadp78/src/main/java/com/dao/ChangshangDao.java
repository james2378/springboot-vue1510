package com.dao;

import com.entity.ChangshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangshangVO;
import com.entity.view.ChangshangView;


/**
 * 厂商
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ChangshangDao extends BaseMapper<ChangshangEntity> {
	
	List<ChangshangVO> selectListVO(@Param("ew") Wrapper<ChangshangEntity> wrapper);
	
	ChangshangVO selectVO(@Param("ew") Wrapper<ChangshangEntity> wrapper);
	
	List<ChangshangView> selectListView(@Param("ew") Wrapper<ChangshangEntity> wrapper);

	List<ChangshangView> selectListView(Pagination page,@Param("ew") Wrapper<ChangshangEntity> wrapper);
	
	ChangshangView selectView(@Param("ew") Wrapper<ChangshangEntity> wrapper);
	

}
