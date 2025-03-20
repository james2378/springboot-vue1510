package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehushouhuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KehushouhuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KehushouhuoView;


/**
 * 客户收货
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface KehushouhuoService extends IService<KehushouhuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehushouhuoVO> selectListVO(Wrapper<KehushouhuoEntity> wrapper);
   	
   	KehushouhuoVO selectVO(@Param("ew") Wrapper<KehushouhuoEntity> wrapper);
   	
   	List<KehushouhuoView> selectListView(Wrapper<KehushouhuoEntity> wrapper);
   	
   	KehushouhuoView selectView(@Param("ew") Wrapper<KehushouhuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehushouhuoEntity> wrapper);
   	

}

