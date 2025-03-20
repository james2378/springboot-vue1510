package com.entity.vo;

import com.entity.ChanpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 产品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public class ChanpinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 产品名称
	 */
	
	private String chanpinmingcheng;
		
	/**
	 * 产品分类
	 */
	
	private String chanpinfenlei;
		
	/**
	 * 物料名称
	 */
	
	private String wuliaomingcheng;
		
	/**
	 * 物料类型
	 */
	
	private String wuliaoleixing;
		
	/**
	 * 产品型号
	 */
	
	private String chanpinxinghao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 产品详情
	 */
	
	private String chanpinxiangqing;
				
	
	/**
	 * 设置：产品名称
	 */
	 
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
				
	
	/**
	 * 设置：产品分类
	 */
	 
	public void setChanpinfenlei(String chanpinfenlei) {
		this.chanpinfenlei = chanpinfenlei;
	}
	
	/**
	 * 获取：产品分类
	 */
	public String getChanpinfenlei() {
		return chanpinfenlei;
	}
				
	
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
	 * 设置：产品型号
	 */
	 
	public void setChanpinxinghao(String chanpinxinghao) {
		this.chanpinxinghao = chanpinxinghao;
	}
	
	/**
	 * 获取：产品型号
	 */
	public String getChanpinxinghao() {
		return chanpinxinghao;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：产品详情
	 */
	 
	public void setChanpinxiangqing(String chanpinxiangqing) {
		this.chanpinxiangqing = chanpinxiangqing;
	}
	
	/**
	 * 获取：产品详情
	 */
	public String getChanpinxiangqing() {
		return chanpinxiangqing;
	}
			
}
