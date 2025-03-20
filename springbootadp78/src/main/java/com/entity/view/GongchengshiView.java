package com.entity.view;

import com.entity.GongchengshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工程师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("gongchengshi")
public class GongchengshiView  extends GongchengshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongchengshiView(){
	}
 
 	public GongchengshiView(GongchengshiEntity gongchengshiEntity){
 	try {
			BeanUtils.copyProperties(this, gongchengshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
