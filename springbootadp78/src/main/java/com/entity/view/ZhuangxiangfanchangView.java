package com.entity.view;

import com.entity.ZhuangxiangfanchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 装箱返厂
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("zhuangxiangfanchang")
public class ZhuangxiangfanchangView  extends ZhuangxiangfanchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuangxiangfanchangView(){
	}
 
 	public ZhuangxiangfanchangView(ZhuangxiangfanchangEntity zhuangxiangfanchangEntity){
 	try {
			BeanUtils.copyProperties(this, zhuangxiangfanchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
