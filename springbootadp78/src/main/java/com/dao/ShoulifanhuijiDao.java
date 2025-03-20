package com.dao;

import com.entity.ShoulifanhuijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoulifanhuijiVO;
import com.entity.view.ShoulifanhuijiView;


/**
 * 受理返回机
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface ShoulifanhuijiDao extends BaseMapper<ShoulifanhuijiEntity> {
	
	List<ShoulifanhuijiVO> selectListVO(@Param("ew") Wrapper<ShoulifanhuijiEntity> wrapper);
	
	ShoulifanhuijiVO selectVO(@Param("ew") Wrapper<ShoulifanhuijiEntity> wrapper);
	
	List<ShoulifanhuijiView> selectListView(@Param("ew") Wrapper<ShoulifanhuijiEntity> wrapper);

	List<ShoulifanhuijiView> selectListView(Pagination page,@Param("ew") Wrapper<ShoulifanhuijiEntity> wrapper);
	
	ShoulifanhuijiView selectView(@Param("ew") Wrapper<ShoulifanhuijiEntity> wrapper);
	

}
