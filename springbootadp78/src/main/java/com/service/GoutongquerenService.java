package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoutongquerenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoutongquerenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoutongquerenView;


/**
 * 沟通确认
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface GoutongquerenService extends IService<GoutongquerenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoutongquerenVO> selectListVO(Wrapper<GoutongquerenEntity> wrapper);
   	
   	GoutongquerenVO selectVO(@Param("ew") Wrapper<GoutongquerenEntity> wrapper);
   	
   	List<GoutongquerenView> selectListView(Wrapper<GoutongquerenEntity> wrapper);
   	
   	GoutongquerenView selectView(@Param("ew") Wrapper<GoutongquerenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoutongquerenEntity> wrapper);
   	

}

