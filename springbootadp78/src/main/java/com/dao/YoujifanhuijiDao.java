package com.dao;

import com.entity.YoujifanhuijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YoujifanhuijiVO;
import com.entity.view.YoujifanhuijiView;


/**
 * 邮寄返回机
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface YoujifanhuijiDao extends BaseMapper<YoujifanhuijiEntity> {
	
	List<YoujifanhuijiVO> selectListVO(@Param("ew") Wrapper<YoujifanhuijiEntity> wrapper);
	
	YoujifanhuijiVO selectVO(@Param("ew") Wrapper<YoujifanhuijiEntity> wrapper);
	
	List<YoujifanhuijiView> selectListView(@Param("ew") Wrapper<YoujifanhuijiEntity> wrapper);

	List<YoujifanhuijiView> selectListView(Pagination page,@Param("ew") Wrapper<YoujifanhuijiEntity> wrapper);
	
	YoujifanhuijiView selectView(@Param("ew") Wrapper<YoujifanhuijiEntity> wrapper);
	

}
