package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuliaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuliaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuliaoleixingView;


/**
 * 物料类型
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface WuliaoleixingService extends IService<WuliaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuliaoleixingVO> selectListVO(Wrapper<WuliaoleixingEntity> wrapper);
   	
   	WuliaoleixingVO selectVO(@Param("ew") Wrapper<WuliaoleixingEntity> wrapper);
   	
   	List<WuliaoleixingView> selectListView(Wrapper<WuliaoleixingEntity> wrapper);
   	
   	WuliaoleixingView selectView(@Param("ew") Wrapper<WuliaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuliaoleixingEntity> wrapper);
   	

}

