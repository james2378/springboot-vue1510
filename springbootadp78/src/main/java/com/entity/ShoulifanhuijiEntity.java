package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 受理返回机
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:56
 */
@TableName("shoulifanhuiji")
public class ShoulifanhuijiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShoulifanhuijiEntity() {
		
	}
	
	public ShoulifanhuijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 受理编号
	 */
					
	private String shoulibianhao;
	
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
	 * 包装是否破损
	 */
					
	private String baozhuangshifouposun;
	
	/**
	 * 配件是否齐全
	 */
					
	private String peijianshifouqiquan;
	
	/**
	 * 检测时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jianceshijian;
	
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
	 * 电话号码
	 */
					
	private String dianhuahaoma;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：受理编号
	 */
	public void setShoulibianhao(String shoulibianhao) {
		this.shoulibianhao = shoulibianhao;
	}
	/**
	 * 获取：受理编号
	 */
	public String getShoulibianhao() {
		return shoulibianhao;
	}
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
	 * 设置：包装是否破损
	 */
	public void setBaozhuangshifouposun(String baozhuangshifouposun) {
		this.baozhuangshifouposun = baozhuangshifouposun;
	}
	/**
	 * 获取：包装是否破损
	 */
	public String getBaozhuangshifouposun() {
		return baozhuangshifouposun;
	}
	/**
	 * 设置：配件是否齐全
	 */
	public void setPeijianshifouqiquan(String peijianshifouqiquan) {
		this.peijianshifouqiquan = peijianshifouqiquan;
	}
	/**
	 * 获取：配件是否齐全
	 */
	public String getPeijianshifouqiquan() {
		return peijianshifouqiquan;
	}
	/**
	 * 设置：检测时间
	 */
	public void setJianceshijian(Date jianceshijian) {
		this.jianceshijian = jianceshijian;
	}
	/**
	 * 获取：检测时间
	 */
	public Date getJianceshijian() {
		return jianceshijian;
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
	 * 设置：电话号码
	 */
	public void setDianhuahaoma(String dianhuahaoma) {
		this.dianhuahaoma = dianhuahaoma;
	}
	/**
	 * 获取：电话号码
	 */
	public String getDianhuahaoma() {
		return dianhuahaoma;
	}

}
