package com.entity.model;

import com.entity.ChanpinweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 产品维护
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public class ChanpinweihuModel  implements Serializable {
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
	 * 维护时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date weihushijian;
				
	
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
	 * 设置：维护时间
	 */
	 
	public void setWeihushijian(Date weihushijian) {
		this.weihushijian = weihushijian;
	}
	
	/**
	 * 获取：维护时间
	 */
	public Date getWeihushijian() {
		return weihushijian;
	}
			
}
