package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouliliushuidanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouliliushuidanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouliliushuidanView;


/**
 * 受理流水单
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ShouliliushuidanService extends IService<ShouliliushuidanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouliliushuidanVO> selectListVO(Wrapper<ShouliliushuidanEntity> wrapper);
   	
   	ShouliliushuidanVO selectVO(@Param("ew") Wrapper<ShouliliushuidanEntity> wrapper);
   	
   	List<ShouliliushuidanView> selectListView(Wrapper<ShouliliushuidanEntity> wrapper);
   	
   	ShouliliushuidanView selectView(@Param("ew") Wrapper<ShouliliushuidanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouliliushuidanEntity> wrapper);
   	

}

