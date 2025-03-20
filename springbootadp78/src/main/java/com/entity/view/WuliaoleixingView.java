package com.entity.view;

import com.entity.WuliaoleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物料类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("wuliaoleixing")
public class WuliaoleixingView  extends WuliaoleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuliaoleixingView(){
	}
 
 	public WuliaoleixingView(WuliaoleixingEntity wuliaoleixingEntity){
 	try {
			BeanUtils.copyProperties(this, wuliaoleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
