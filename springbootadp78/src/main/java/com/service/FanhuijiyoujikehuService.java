package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanhuijiyoujikehuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanhuijiyoujikehuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanhuijiyoujikehuView;


/**
 * 返回机邮寄客户
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijiyoujikehuService extends IService<FanhuijiyoujikehuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanhuijiyoujikehuVO> selectListVO(Wrapper<FanhuijiyoujikehuEntity> wrapper);
   	
   	FanhuijiyoujikehuVO selectVO(@Param("ew") Wrapper<FanhuijiyoujikehuEntity> wrapper);
   	
   	List<FanhuijiyoujikehuView> selectListView(Wrapper<FanhuijiyoujikehuEntity> wrapper);
   	
   	FanhuijiyoujikehuView selectView(@Param("ew") Wrapper<FanhuijiyoujikehuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanhuijiyoujikehuEntity> wrapper);
   	

}

