package com.dao;

import com.entity.ShouliguzhangjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouliguzhangjiVO;
import com.entity.view.ShouliguzhangjiView;


/**
 * 受理故障机
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ShouliguzhangjiDao extends BaseMapper<ShouliguzhangjiEntity> {
	
	List<ShouliguzhangjiVO> selectListVO(@Param("ew") Wrapper<ShouliguzhangjiEntity> wrapper);
	
	ShouliguzhangjiVO selectVO(@Param("ew") Wrapper<ShouliguzhangjiEntity> wrapper);
	
	List<ShouliguzhangjiView> selectListView(@Param("ew") Wrapper<ShouliguzhangjiEntity> wrapper);

	List<ShouliguzhangjiView> selectListView(Pagination page,@Param("ew") Wrapper<ShouliguzhangjiEntity> wrapper);
	
	ShouliguzhangjiView selectView(@Param("ew") Wrapper<ShouliguzhangjiEntity> wrapper);
	

}
