package com.dao;

import com.entity.FenpeigongchengshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenpeigongchengshiVO;
import com.entity.view.FenpeigongchengshiView;


/**
 * 分配工程师
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface FenpeigongchengshiDao extends BaseMapper<FenpeigongchengshiEntity> {
	
	List<FenpeigongchengshiVO> selectListVO(@Param("ew") Wrapper<FenpeigongchengshiEntity> wrapper);
	
	FenpeigongchengshiVO selectVO(@Param("ew") Wrapper<FenpeigongchengshiEntity> wrapper);
	
	List<FenpeigongchengshiView> selectListView(@Param("ew") Wrapper<FenpeigongchengshiEntity> wrapper);

	List<FenpeigongchengshiView> selectListView(Pagination page,@Param("ew") Wrapper<FenpeigongchengshiEntity> wrapper);
	
	FenpeigongchengshiView selectView(@Param("ew") Wrapper<FenpeigongchengshiEntity> wrapper);
	

}
