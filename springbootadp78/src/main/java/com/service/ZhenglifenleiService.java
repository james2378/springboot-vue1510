package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhenglifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhenglifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhenglifenleiView;


/**
 * 整理分类
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface ZhenglifenleiService extends IService<ZhenglifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhenglifenleiVO> selectListVO(Wrapper<ZhenglifenleiEntity> wrapper);
   	
   	ZhenglifenleiVO selectVO(@Param("ew") Wrapper<ZhenglifenleiEntity> wrapper);
   	
   	List<ZhenglifenleiView> selectListView(Wrapper<ZhenglifenleiEntity> wrapper);
   	
   	ZhenglifenleiView selectView(@Param("ew") Wrapper<ZhenglifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhenglifenleiEntity> wrapper);
   	

}

