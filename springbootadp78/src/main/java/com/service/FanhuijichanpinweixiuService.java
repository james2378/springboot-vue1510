package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanhuijichanpinweixiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanhuijichanpinweixiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanhuijichanpinweixiuView;


/**
 * 返回机产品维修
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijichanpinweixiuService extends IService<FanhuijichanpinweixiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanhuijichanpinweixiuVO> selectListVO(Wrapper<FanhuijichanpinweixiuEntity> wrapper);
   	
   	FanhuijichanpinweixiuVO selectVO(@Param("ew") Wrapper<FanhuijichanpinweixiuEntity> wrapper);
   	
   	List<FanhuijichanpinweixiuView> selectListView(Wrapper<FanhuijichanpinweixiuEntity> wrapper);
   	
   	FanhuijichanpinweixiuView selectView(@Param("ew") Wrapper<FanhuijichanpinweixiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanhuijichanpinweixiuEntity> wrapper);
   	

}

