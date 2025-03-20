package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoulifanhuijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoulifanhuijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoulifanhuijiView;


/**
 * 受理返回机
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface ShoulifanhuijiService extends IService<ShoulifanhuijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoulifanhuijiVO> selectListVO(Wrapper<ShoulifanhuijiEntity> wrapper);
   	
   	ShoulifanhuijiVO selectVO(@Param("ew") Wrapper<ShoulifanhuijiEntity> wrapper);
   	
   	List<ShoulifanhuijiView> selectListView(Wrapper<ShoulifanhuijiEntity> wrapper);
   	
   	ShoulifanhuijiView selectView(@Param("ew") Wrapper<ShoulifanhuijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoulifanhuijiEntity> wrapper);
   	

}

