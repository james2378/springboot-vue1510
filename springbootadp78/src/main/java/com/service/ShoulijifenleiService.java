package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoulijifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoulijifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoulijifenleiView;


/**
 * 受理机分类
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ShoulijifenleiService extends IService<ShoulijifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoulijifenleiVO> selectListVO(Wrapper<ShoulijifenleiEntity> wrapper);
   	
   	ShoulijifenleiVO selectVO(@Param("ew") Wrapper<ShoulijifenleiEntity> wrapper);
   	
   	List<ShoulijifenleiView> selectListView(Wrapper<ShoulijifenleiEntity> wrapper);
   	
   	ShoulijifenleiView selectView(@Param("ew") Wrapper<ShoulijifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoulijifenleiEntity> wrapper);
   	

}

