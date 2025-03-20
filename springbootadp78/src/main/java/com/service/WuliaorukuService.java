package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuliaorukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuliaorukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuliaorukuView;


/**
 * 物料入库
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface WuliaorukuService extends IService<WuliaorukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuliaorukuVO> selectListVO(Wrapper<WuliaorukuEntity> wrapper);
   	
   	WuliaorukuVO selectVO(@Param("ew") Wrapper<WuliaorukuEntity> wrapper);
   	
   	List<WuliaorukuView> selectListView(Wrapper<WuliaorukuEntity> wrapper);
   	
   	WuliaorukuView selectView(@Param("ew") Wrapper<WuliaorukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuliaorukuEntity> wrapper);
   	

}

