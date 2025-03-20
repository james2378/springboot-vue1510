package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinweihuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinweihuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinweihuView;


/**
 * 产品维护
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ChanpinweihuService extends IService<ChanpinweihuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinweihuVO> selectListVO(Wrapper<ChanpinweihuEntity> wrapper);
   	
   	ChanpinweihuVO selectVO(@Param("ew") Wrapper<ChanpinweihuEntity> wrapper);
   	
   	List<ChanpinweihuView> selectListView(Wrapper<ChanpinweihuEntity> wrapper);
   	
   	ChanpinweihuView selectView(@Param("ew") Wrapper<ChanpinweihuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinweihuEntity> wrapper);
   	

}

