package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanhuijizhuangxiangfanchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanhuijizhuangxiangfanchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanhuijizhuangxiangfanchangView;


/**
 * 返回机装箱返厂
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijizhuangxiangfanchangService extends IService<FanhuijizhuangxiangfanchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanhuijizhuangxiangfanchangVO> selectListVO(Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);
   	
   	FanhuijizhuangxiangfanchangVO selectVO(@Param("ew") Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);
   	
   	List<FanhuijizhuangxiangfanchangView> selectListView(Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);
   	
   	FanhuijizhuangxiangfanchangView selectView(@Param("ew") Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanhuijizhuangxiangfanchangEntity> wrapper);
   	

}

