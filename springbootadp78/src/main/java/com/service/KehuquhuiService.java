package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehuquhuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KehuquhuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KehuquhuiView;


/**
 * 客户取回
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface KehuquhuiService extends IService<KehuquhuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehuquhuiVO> selectListVO(Wrapper<KehuquhuiEntity> wrapper);
   	
   	KehuquhuiVO selectVO(@Param("ew") Wrapper<KehuquhuiEntity> wrapper);
   	
   	List<KehuquhuiView> selectListView(Wrapper<KehuquhuiEntity> wrapper);
   	
   	KehuquhuiView selectView(@Param("ew") Wrapper<KehuquhuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehuquhuiEntity> wrapper);
   	

}

