package com.entity.view;

import com.entity.FanhuijizhuangxiangfanchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 返回机装箱返厂
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@TableName("fanhuijizhuangxiangfanchang")
public class FanhuijizhuangxiangfanchangView  extends FanhuijizhuangxiangfanchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FanhuijizhuangxiangfanchangView(){
	}
 
 	public FanhuijizhuangxiangfanchangView(FanhuijizhuangxiangfanchangEntity fanhuijizhuangxiangfanchangEntity){
 	try {
			BeanUtils.copyProperties(this, fanhuijizhuangxiangfanchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
