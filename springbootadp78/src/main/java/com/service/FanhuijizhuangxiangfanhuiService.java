package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanhuijizhuangxiangfanhuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanhuijizhuangxiangfanhuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanhuijizhuangxiangfanhuiView;


/**
 * 返回机装箱返回
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijizhuangxiangfanhuiService extends IService<FanhuijizhuangxiangfanhuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanhuijizhuangxiangfanhuiVO> selectListVO(Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);
   	
   	FanhuijizhuangxiangfanhuiVO selectVO(@Param("ew") Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);
   	
   	List<FanhuijizhuangxiangfanhuiView> selectListView(Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);
   	
   	FanhuijizhuangxiangfanhuiView selectView(@Param("ew") Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanhuijizhuangxiangfanhuiEntity> wrapper);
   	

}

