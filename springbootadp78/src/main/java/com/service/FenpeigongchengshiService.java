package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenpeigongchengshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenpeigongchengshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenpeigongchengshiView;


/**
 * 分配工程师
 *
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public interface FenpeigongchengshiService extends IService<FenpeigongchengshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenpeigongchengshiVO> selectListVO(Wrapper<FenpeigongchengshiEntity> wrapper);
   	
   	FenpeigongchengshiVO selectVO(@Param("ew") Wrapper<FenpeigongchengshiEntity> wrapper);
   	
   	List<FenpeigongchengshiView> selectListView(Wrapper<FenpeigongchengshiEntity> wrapper);
   	
   	FenpeigongchengshiView selectView(@Param("ew") Wrapper<FenpeigongchengshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenpeigongchengshiEntity> wrapper);
   	

}

