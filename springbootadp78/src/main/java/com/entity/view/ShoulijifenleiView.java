package com.entity.view;

import com.entity.ShoulijifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 受理机分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("shoulijifenlei")
public class ShoulijifenleiView  extends ShoulijifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShoulijifenleiView(){
	}
 
 	public ShoulijifenleiView(ShoulijifenleiEntity shoulijifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shoulijifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
