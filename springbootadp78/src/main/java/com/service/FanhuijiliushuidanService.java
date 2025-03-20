package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanhuijiliushuidanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanhuijiliushuidanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanhuijiliushuidanView;


/**
 * 返回机流水单
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijiliushuidanService extends IService<FanhuijiliushuidanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanhuijiliushuidanVO> selectListVO(Wrapper<FanhuijiliushuidanEntity> wrapper);
   	
   	FanhuijiliushuidanVO selectVO(@Param("ew") Wrapper<FanhuijiliushuidanEntity> wrapper);
   	
   	List<FanhuijiliushuidanView> selectListView(Wrapper<FanhuijiliushuidanEntity> wrapper);
   	
   	FanhuijiliushuidanView selectView(@Param("ew") Wrapper<FanhuijiliushuidanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanhuijiliushuidanEntity> wrapper);
   	

}

