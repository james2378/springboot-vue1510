package com.entity.view;

import com.entity.ShoulifanhuijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 受理返回机
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@TableName("shoulifanhuiji")
public class ShoulifanhuijiView  extends ShoulifanhuijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShoulifanhuijiView(){
	}
 
 	public ShoulifanhuijiView(ShoulifanhuijiEntity shoulifanhuijiEntity){
 	try {
			BeanUtils.copyProperties(this, shoulifanhuijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
