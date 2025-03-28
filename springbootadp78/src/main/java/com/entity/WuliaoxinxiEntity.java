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
 * 物料信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-21 21:54:55
 */
@TableName("wuliaoxinxi")
public class WuliaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuliaoxinxiEntity() {
		
	}
	
	public WuliaoxinxiEntity(T t) {
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
	 * 物料编号
	 */
					
	private String wuliaobianhao;
	
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
	 * 设置：物料编号
	 */
	public void setWuliaobianhao(String wuliaobianhao) {
		this.wuliaobianhao = wuliaobianhao;
	}
	/**
	 * 获取：物料编号
	 */
	public String getWuliaobianhao() {
		return wuliaobianhao;
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
