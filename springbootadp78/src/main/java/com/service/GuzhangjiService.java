package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuzhangjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuzhangjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuzhangjiView;


/**
 * 故障机
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface GuzhangjiService extends IService<GuzhangjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuzhangjiVO> selectListVO(Wrapper<GuzhangjiEntity> wrapper);
   	
   	GuzhangjiVO selectVO(@Param("ew") Wrapper<GuzhangjiEntity> wrapper);
   	
   	List<GuzhangjiView> selectListView(Wrapper<GuzhangjiEntity> wrapper);
   	
   	GuzhangjiView selectView(@Param("ew") Wrapper<GuzhangjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuzhangjiEntity> wrapper);
   	

}

