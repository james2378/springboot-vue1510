package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangxiangfanhuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangxiangfanhuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangxiangfanhuiView;


/**
 * 装箱返回
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public interface ZhuangxiangfanhuiService extends IService<ZhuangxiangfanhuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangxiangfanhuiVO> selectListVO(Wrapper<ZhuangxiangfanhuiEntity> wrapper);
   	
   	ZhuangxiangfanhuiVO selectVO(@Param("ew") Wrapper<ZhuangxiangfanhuiEntity> wrapper);
   	
   	List<ZhuangxiangfanhuiView> selectListView(Wrapper<ZhuangxiangfanhuiEntity> wrapper);
   	
   	ZhuangxiangfanhuiView selectView(@Param("ew") Wrapper<ZhuangxiangfanhuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangxiangfanhuiEntity> wrapper);
   	

}

