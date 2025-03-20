package com.entity.view;

import com.entity.FanhuijiliushuidanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 返回机流水单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@TableName("fanhuijiliushuidan")
public class FanhuijiliushuidanView  extends FanhuijiliushuidanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FanhuijiliushuidanView(){
	}
 
 	public FanhuijiliushuidanView(FanhuijiliushuidanEntity fanhuijiliushuidanEntity){
 	try {
			BeanUtils.copyProperties(this, fanhuijiliushuidanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
