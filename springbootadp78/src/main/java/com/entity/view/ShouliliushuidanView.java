package com.entity.view;

import com.entity.ShouliliushuidanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 受理流水单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("shouliliushuidan")
public class ShouliliushuidanView  extends ShouliliushuidanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouliliushuidanView(){
	}
 
 	public ShouliliushuidanView(ShouliliushuidanEntity shouliliushuidanEntity){
 	try {
			BeanUtils.copyProperties(this, shouliliushuidanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
