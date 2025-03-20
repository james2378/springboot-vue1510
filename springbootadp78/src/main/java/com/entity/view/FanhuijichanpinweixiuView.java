package com.entity.view;

import com.entity.FanhuijichanpinweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 返回机产品维修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@TableName("fanhuijichanpinweixiu")
public class FanhuijichanpinweixiuView  extends FanhuijichanpinweixiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FanhuijichanpinweixiuView(){
	}
 
 	public FanhuijichanpinweixiuView(FanhuijichanpinweixiuEntity fanhuijichanpinweixiuEntity){
 	try {
			BeanUtils.copyProperties(this, fanhuijichanpinweixiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
