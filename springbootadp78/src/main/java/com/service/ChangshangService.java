package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangshangView;


/**
 * 厂商
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ChangshangService extends IService<ChangshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangshangVO> selectListVO(Wrapper<ChangshangEntity> wrapper);
   	
   	ChangshangVO selectVO(@Param("ew") Wrapper<ChangshangEntity> wrapper);
   	
   	List<ChangshangView> selectListView(Wrapper<ChangshangEntity> wrapper);
   	
   	ChangshangView selectView(@Param("ew") Wrapper<ChangshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangshangEntity> wrapper);
   	

}

