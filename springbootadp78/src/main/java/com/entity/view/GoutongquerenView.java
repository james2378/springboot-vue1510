package com.entity.view;

import com.entity.GoutongquerenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 沟通确认
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("goutongqueren")
public class GoutongquerenView  extends GoutongquerenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoutongquerenView(){
	}
 
 	public GoutongquerenView(GoutongquerenEntity goutongquerenEntity){
 	try {
			BeanUtils.copyProperties(this, goutongquerenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
