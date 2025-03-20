package com.entity.view;

import com.entity.TongzhikehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 通知客户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@TableName("tongzhikehu")
public class TongzhikehuView  extends TongzhikehuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongzhikehuView(){
	}
 
 	public TongzhikehuView(TongzhikehuEntity tongzhikehuEntity){
 	try {
			BeanUtils.copyProperties(this, tongzhikehuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
