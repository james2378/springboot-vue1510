package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanhuijidiannaodanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanhuijidiannaodanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanhuijidiannaodanView;


/**
 * 返回机电脑单
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijidiannaodanService extends IService<FanhuijidiannaodanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanhuijidiannaodanVO> selectListVO(Wrapper<FanhuijidiannaodanEntity> wrapper);
   	
   	FanhuijidiannaodanVO selectVO(@Param("ew") Wrapper<FanhuijidiannaodanEntity> wrapper);
   	
   	List<FanhuijidiannaodanView> selectListView(Wrapper<FanhuijidiannaodanEntity> wrapper);
   	
   	FanhuijidiannaodanView selectView(@Param("ew") Wrapper<FanhuijidiannaodanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanhuijidiannaodanEntity> wrapper);
   	

}

