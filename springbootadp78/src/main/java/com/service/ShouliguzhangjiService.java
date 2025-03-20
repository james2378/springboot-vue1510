package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouliguzhangjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouliguzhangjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouliguzhangjiView;


/**
 * 受理故障机
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ShouliguzhangjiService extends IService<ShouliguzhangjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouliguzhangjiVO> selectListVO(Wrapper<ShouliguzhangjiEntity> wrapper);
   	
   	ShouliguzhangjiVO selectVO(@Param("ew") Wrapper<ShouliguzhangjiEntity> wrapper);
   	
   	List<ShouliguzhangjiView> selectListView(Wrapper<ShouliguzhangjiEntity> wrapper);
   	
   	ShouliguzhangjiView selectView(@Param("ew") Wrapper<ShouliguzhangjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouliguzhangjiEntity> wrapper);
   	

}

