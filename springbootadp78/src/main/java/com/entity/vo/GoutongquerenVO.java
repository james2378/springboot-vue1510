package com.entity.vo;

import com.entity.GoutongquerenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 沟通确认
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
public class GoutongquerenVO  implements Serializable {
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
	 * 故障标贴
	 */
	
	private String guzhangbiaotie;
		
	/**
	 * 是否存在人为
	 */
	
	private String shifoucunzairenwei;
		
	/**
	 * 沟通内容
	 */
	
	private String goutongneirong;
		
	/**
	 * 沟通时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goutongshijian;
		
	/**
	 * 人员账号
	 */
	
	private String renyuanzhanghao;
		
	/**
	 * 人员姓名
	 */
	
	private String renyuanxingming;
		
	/**
	 * 客户账号
	 */
	
	private String kehuzhanghao;
		
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 回复内容
	 */
	
	private String shhf;
				
	
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
	 * 设置：故障标贴
	 */
	 
	public void setGuzhangbiaotie(String guzhangbiaotie) {
		this.guzhangbiaotie = guzhangbiaotie;
	}
	
	/**
	 * 获取：故障标贴
	 */
	public String getGuzhangbiaotie() {
		return guzhangbiaotie;
	}
				
	
	/**
	 * 设置：是否存在人为
	 */
	 
	public void setShifoucunzairenwei(String shifoucunzairenwei) {
		this.shifoucunzairenwei = shifoucunzairenwei;
	}
	
	/**
	 * 获取：是否存在人为
	 */
	public String getShifoucunzairenwei() {
		return shifoucunzairenwei;
	}
				
	
	/**
	 * 设置：沟通内容
	 */
	 
	public void setGoutongneirong(String goutongneirong) {
		this.goutongneirong = goutongneirong;
	}
	
	/**
	 * 获取：沟通内容
	 */
	public String getGoutongneirong() {
		return goutongneirong;
	}
				
	
	/**
	 * 设置：沟通时间
	 */
	 
	public void setGoutongshijian(Date goutongshijian) {
		this.goutongshijian = goutongshijian;
	}
	
	/**
	 * 获取：沟通时间
	 */
	public Date getGoutongshijian() {
		return goutongshijian;
	}
				
	
	/**
	 * 设置：人员账号
	 */
	 
	public void setRenyuanzhanghao(String renyuanzhanghao) {
		this.renyuanzhanghao = renyuanzhanghao;
	}
	
	/**
	 * 获取：人员账号
	 */
	public String getRenyuanzhanghao() {
		return renyuanzhanghao;
	}
				
	
	/**
	 * 设置：人员姓名
	 */
	 
	public void setRenyuanxingming(String renyuanxingming) {
		this.renyuanxingming = renyuanxingming;
	}
	
	/**
	 * 获取：人员姓名
	 */
	public String getRenyuanxingming() {
		return renyuanxingming;
	}
				
	
	/**
	 * 设置：客户账号
	 */
	 
	public void setKehuzhanghao(String kehuzhanghao) {
		this.kehuzhanghao = kehuzhanghao;
	}
	
	/**
	 * 获取：客户账号
	 */
	public String getKehuzhanghao() {
		return kehuzhanghao;
	}
				
	
	/**
	 * 设置：客户姓名
	 */
	 
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
				
	
	/**
	 * 设置：回复内容
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}
			
}
