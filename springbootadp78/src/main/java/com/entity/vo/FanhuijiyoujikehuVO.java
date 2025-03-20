package com.entity.vo;

import com.entity.FanhuijiyoujikehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 返回机邮寄客户
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
public class FanhuijiyoujikehuVO  implements Serializable {
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
	 * 主板编号
	 */
	
	private String zhubanbianhao;
		
	/**
	 * 显示器编号
	 */
	
	private String xianshiqibianhao;
		
	/**
	 * 无线模块编号
	 */
	
	private String wuxianmokuaibianhao;
		
	/**
	 * 受理机分类
	 */
	
	private String shoulijifenlei;
		
	/**
	 * 维修状态
	 */
	
	private String weixiuzhuangtai;
		
	/**
	 * 邮寄时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date youjishijian;
		
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
	 * 设置：主板编号
	 */
	 
	public void setZhubanbianhao(String zhubanbianhao) {
		this.zhubanbianhao = zhubanbianhao;
	}
	
	/**
	 * 获取：主板编号
	 */
	public String getZhubanbianhao() {
		return zhubanbianhao;
	}
				
	
	/**
	 * 设置：显示器编号
	 */
	 
	public void setXianshiqibianhao(String xianshiqibianhao) {
		this.xianshiqibianhao = xianshiqibianhao;
	}
	
	/**
	 * 获取：显示器编号
	 */
	public String getXianshiqibianhao() {
		return xianshiqibianhao;
	}
				
	
	/**
	 * 设置：无线模块编号
	 */
	 
	public void setWuxianmokuaibianhao(String wuxianmokuaibianhao) {
		this.wuxianmokuaibianhao = wuxianmokuaibianhao;
	}
	
	/**
	 * 获取：无线模块编号
	 */
	public String getWuxianmokuaibianhao() {
		return wuxianmokuaibianhao;
	}
				
	
	/**
	 * 设置：受理机分类
	 */
	 
	public void setShoulijifenlei(String shoulijifenlei) {
		this.shoulijifenlei = shoulijifenlei;
	}
	
	/**
	 * 获取：受理机分类
	 */
	public String getShoulijifenlei() {
		return shoulijifenlei;
	}
				
	
	/**
	 * 设置：维修状态
	 */
	 
	public void setWeixiuzhuangtai(String weixiuzhuangtai) {
		this.weixiuzhuangtai = weixiuzhuangtai;
	}
	
	/**
	 * 获取：维修状态
	 */
	public String getWeixiuzhuangtai() {
		return weixiuzhuangtai;
	}
				
	
	/**
	 * 设置：邮寄时间
	 */
	 
	public void setYoujishijian(Date youjishijian) {
		this.youjishijian = youjishijian;
	}
	
	/**
	 * 获取：邮寄时间
	 */
	public Date getYoujishijian() {
		return youjishijian;
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
			
}
