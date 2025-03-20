package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuliaochukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuliaochukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuliaochukuView;


/**
 * 物料出库
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface WuliaochukuService extends IService<WuliaochukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuliaochukuVO> selectListVO(Wrapper<WuliaochukuEntity> wrapper);
   	
   	WuliaochukuVO selectVO(@Param("ew") Wrapper<WuliaochukuEntity> wrapper);
   	
   	List<WuliaochukuView> selectListView(Wrapper<WuliaochukuEntity> wrapper);
   	
   	WuliaochukuView selectView(@Param("ew") Wrapper<WuliaochukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuliaochukuEntity> wrapper);
   	

}

