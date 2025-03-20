package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoulirenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoulirenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoulirenyuanView;


/**
 * 受理人员
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ShoulirenyuanService extends IService<ShoulirenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoulirenyuanVO> selectListVO(Wrapper<ShoulirenyuanEntity> wrapper);
   	
   	ShoulirenyuanVO selectVO(@Param("ew") Wrapper<ShoulirenyuanEntity> wrapper);
   	
   	List<ShoulirenyuanView> selectListView(Wrapper<ShoulirenyuanEntity> wrapper);
   	
   	ShoulirenyuanView selectView(@Param("ew") Wrapper<ShoulirenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoulirenyuanEntity> wrapper);
   	

}

