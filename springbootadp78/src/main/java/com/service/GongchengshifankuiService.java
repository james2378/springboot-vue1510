package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongchengshifankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongchengshifankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongchengshifankuiView;


/**
 * 工程师反馈
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface GongchengshifankuiService extends IService<GongchengshifankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongchengshifankuiVO> selectListVO(Wrapper<GongchengshifankuiEntity> wrapper);
   	
   	GongchengshifankuiVO selectVO(@Param("ew") Wrapper<GongchengshifankuiEntity> wrapper);
   	
   	List<GongchengshifankuiView> selectListView(Wrapper<GongchengshifankuiEntity> wrapper);
   	
   	GongchengshifankuiView selectView(@Param("ew") Wrapper<GongchengshifankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongchengshifankuiEntity> wrapper);
   	

}

