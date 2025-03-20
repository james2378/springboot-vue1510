package com.entity.view;

import com.entity.GongchengshifankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工程师反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("gongchengshifankui")
public class GongchengshifankuiView  extends GongchengshifankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongchengshifankuiView(){
	}
 
 	public GongchengshifankuiView(GongchengshifankuiEntity gongchengshifankuiEntity){
 	try {
			BeanUtils.copyProperties(this, gongchengshifankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
