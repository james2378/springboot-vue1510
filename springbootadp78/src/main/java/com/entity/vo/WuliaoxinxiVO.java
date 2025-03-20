package com.entity.vo;

import com.entity.WuliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物料信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public class WuliaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物料名称
	 */
	
	private String wuliaomingcheng;
		
	/**
	 * 物料类型
	 */
	
	private String wuliaoleixing;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 型号
	 */
	
	private String xinghao;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 物料详情
	 */
	
	private String wuliaoxiangqing;
				
	
	/**
	 * 设置：物料名称
	 */
	 
	public void setWuliaomingcheng(String wuliaomingcheng) {
		this.wuliaomingcheng = wuliaomingcheng;
	}
	
	/**
	 * 获取：物料名称
	 */
	public String getWuliaomingcheng() {
		return wuliaomingcheng;
	}
				
	
	/**
	 * 设置：物料类型
	 */
	 
	public void setWuliaoleixing(String wuliaoleixing) {
		this.wuliaoleixing = wuliaoleixing;
	}
	
	/**
	 * 获取：物料类型
	 */
	public String getWuliaoleixing() {
		return wuliaoleixing;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：型号
	 */
	 
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	
	/**
	 * 获取：型号
	 */
	public String getXinghao() {
		return xinghao;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：物料详情
	 */
	 
	public void setWuliaoxiangqing(String wuliaoxiangqing) {
		this.wuliaoxiangqing = wuliaoxiangqing;
	}
	
	/**
	 * 获取：物料详情
	 */
	public String getWuliaoxiangqing() {
		return wuliaoxiangqing;
	}
			
}
