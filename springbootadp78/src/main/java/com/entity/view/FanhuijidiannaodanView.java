package com.entity.view;

import com.entity.FanhuijidiannaodanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 返回机电脑单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@TableName("fanhuijidiannaodan")
public class FanhuijidiannaodanView  extends FanhuijidiannaodanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FanhuijidiannaodanView(){
	}
 
 	public FanhuijidiannaodanView(FanhuijidiannaodanEntity fanhuijidiannaodanEntity){
 	try {
			BeanUtils.copyProperties(this, fanhuijidiannaodanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
