package com.entity.view;

import com.entity.ChanpinweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 产品维护
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("chanpinweihu")
public class ChanpinweihuView  extends ChanpinweihuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChanpinweihuView(){
	}
 
 	public ChanpinweihuView(ChanpinweihuEntity chanpinweihuEntity){
 	try {
			BeanUtils.copyProperties(this, chanpinweihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
