package com.entity.view;

import com.entity.ChanpinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 产品分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("chanpinfenlei")
public class ChanpinfenleiView  extends ChanpinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChanpinfenleiView(){
	}
 
 	public ChanpinfenleiView(ChanpinfenleiEntity chanpinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, chanpinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
