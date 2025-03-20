package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongzhikehuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongzhikehuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongzhikehuView;


/**
 * 通知客户
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface TongzhikehuService extends IService<TongzhikehuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhikehuVO> selectListVO(Wrapper<TongzhikehuEntity> wrapper);
   	
   	TongzhikehuVO selectVO(@Param("ew") Wrapper<TongzhikehuEntity> wrapper);
   	
   	List<TongzhikehuView> selectListView(Wrapper<TongzhikehuEntity> wrapper);
   	
   	TongzhikehuView selectView(@Param("ew") Wrapper<TongzhikehuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhikehuEntity> wrapper);
   	

}

