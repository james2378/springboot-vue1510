package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanhuijizhenglifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanhuijizhenglifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanhuijizhenglifenleiView;


/**
 * 返回机整理分类
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface FanhuijizhenglifenleiService extends IService<FanhuijizhenglifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanhuijizhenglifenleiVO> selectListVO(Wrapper<FanhuijizhenglifenleiEntity> wrapper);
   	
   	FanhuijizhenglifenleiVO selectVO(@Param("ew") Wrapper<FanhuijizhenglifenleiEntity> wrapper);
   	
   	List<FanhuijizhenglifenleiView> selectListView(Wrapper<FanhuijizhenglifenleiEntity> wrapper);
   	
   	FanhuijizhenglifenleiView selectView(@Param("ew") Wrapper<FanhuijizhenglifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanhuijizhenglifenleiEntity> wrapper);
   	

}

