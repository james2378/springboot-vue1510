package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianhuagoutongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianhuagoutongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianhuagoutongView;


/**
 * 电话沟通
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface DianhuagoutongService extends IService<DianhuagoutongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianhuagoutongVO> selectListVO(Wrapper<DianhuagoutongEntity> wrapper);
   	
   	DianhuagoutongVO selectVO(@Param("ew") Wrapper<DianhuagoutongEntity> wrapper);
   	
   	List<DianhuagoutongView> selectListView(Wrapper<DianhuagoutongEntity> wrapper);
   	
   	DianhuagoutongView selectView(@Param("ew") Wrapper<DianhuagoutongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianhuagoutongEntity> wrapper);
   	

}

