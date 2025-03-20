package com.entity.view;

import com.entity.ZhenglifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 整理分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("zhenglifenlei")
public class ZhenglifenleiView  extends ZhenglifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhenglifenleiView(){
	}
 
 	public ZhenglifenleiView(ZhenglifenleiEntity zhenglifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, zhenglifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
