package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongchengshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongchengshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongchengshiView;


/**
 * 工程师
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface GongchengshiService extends IService<GongchengshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongchengshiVO> selectListVO(Wrapper<GongchengshiEntity> wrapper);
   	
   	GongchengshiVO selectVO(@Param("ew") Wrapper<GongchengshiEntity> wrapper);
   	
   	List<GongchengshiView> selectListView(Wrapper<GongchengshiEntity> wrapper);
   	
   	GongchengshiView selectView(@Param("ew") Wrapper<GongchengshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongchengshiEntity> wrapper);
   	

}

