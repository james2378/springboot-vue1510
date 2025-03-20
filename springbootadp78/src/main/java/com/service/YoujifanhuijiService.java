package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YoujifanhuijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YoujifanhuijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YoujifanhuijiView;


/**
 * 邮寄返回机
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface YoujifanhuijiService extends IService<YoujifanhuijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YoujifanhuijiVO> selectListVO(Wrapper<YoujifanhuijiEntity> wrapper);
   	
   	YoujifanhuijiVO selectVO(@Param("ew") Wrapper<YoujifanhuijiEntity> wrapper);
   	
   	List<YoujifanhuijiView> selectListView(Wrapper<YoujifanhuijiEntity> wrapper);
   	
   	YoujifanhuijiView selectView(@Param("ew") Wrapper<YoujifanhuijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YoujifanhuijiEntity> wrapper);
   	

}

