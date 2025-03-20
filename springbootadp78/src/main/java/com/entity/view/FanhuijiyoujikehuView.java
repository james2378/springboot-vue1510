package com.entity.view;

import com.entity.FanhuijiyoujikehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 返回机邮寄客户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@TableName("fanhuijiyoujikehu")
public class FanhuijiyoujikehuView  extends FanhuijiyoujikehuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FanhuijiyoujikehuView(){
	}
 
 	public FanhuijiyoujikehuView(FanhuijiyoujikehuEntity fanhuijiyoujikehuEntity){
 	try {
			BeanUtils.copyProperties(this, fanhuijiyoujikehuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
