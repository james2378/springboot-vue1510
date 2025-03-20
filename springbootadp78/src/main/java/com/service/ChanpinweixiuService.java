package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinweixiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinweixiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinweixiuView;


/**
 * 产品维修
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface ChanpinweixiuService extends IService<ChanpinweixiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinweixiuVO> selectListVO(Wrapper<ChanpinweixiuEntity> wrapper);
   	
   	ChanpinweixiuVO selectVO(@Param("ew") Wrapper<ChanpinweixiuEntity> wrapper);
   	
   	List<ChanpinweixiuView> selectListView(Wrapper<ChanpinweixiuEntity> wrapper);
   	
   	ChanpinweixiuView selectView(@Param("ew") Wrapper<ChanpinweixiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinweixiuEntity> wrapper);
   	

}

