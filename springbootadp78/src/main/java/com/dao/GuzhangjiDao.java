package com.dao;

import com.entity.GuzhangjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuzhangjiVO;
import com.entity.view.GuzhangjiView;


/**
 * 故障机
 * 
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface GuzhangjiDao extends BaseMapper<GuzhangjiEntity> {
	
	List<GuzhangjiVO> selectListVO(@Param("ew") Wrapper<GuzhangjiEntity> wrapper);
	
	GuzhangjiVO selectVO(@Param("ew") Wrapper<GuzhangjiEntity> wrapper);
	
	List<GuzhangjiView> selectListView(@Param("ew") Wrapper<GuzhangjiEntity> wrapper);

	List<GuzhangjiView> selectListView(Pagination page,@Param("ew") Wrapper<GuzhangjiEntity> wrapper);
	
	GuzhangjiView selectView(@Param("ew") Wrapper<GuzhangjiEntity> wrapper);
	

}
