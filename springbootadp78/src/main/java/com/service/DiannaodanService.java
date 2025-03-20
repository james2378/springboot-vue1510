package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiannaodanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiannaodanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiannaodanView;


/**
 * 电脑单
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface DiannaodanService extends IService<DiannaodanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiannaodanVO> selectListVO(Wrapper<DiannaodanEntity> wrapper);
   	
   	DiannaodanVO selectVO(@Param("ew") Wrapper<DiannaodanEntity> wrapper);
   	
   	List<DiannaodanView> selectListView(Wrapper<DiannaodanEntity> wrapper);
   	
   	DiannaodanView selectView(@Param("ew") Wrapper<DiannaodanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiannaodanEntity> wrapper);
   	

}

