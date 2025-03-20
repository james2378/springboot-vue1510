<template>
	<div class="addEdit-block" style="width: 100%;">
		<el-form
			:style='{"border":"none","borderRadius":"200px","padding":"50px"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="80px"
		>
			<template >
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'" label="邮寄编号" prop="youjibianhao">
					<el-input v-model="ruleForm.youjibianhao" placeholder="邮寄编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-else-if="ruleForm.youjibianhao" label="邮寄编号" prop="youjibianhao">
					<el-input v-model="ruleForm.youjibianhao" placeholder="邮寄编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="产品名称" prop="chanpinmingcheng">
					<el-input v-model="ruleForm.chanpinmingcheng" placeholder="产品名称" clearable  :readonly="ro.chanpinmingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="产品名称" prop="chanpinmingcheng">
					<el-input v-model="ruleForm.chanpinmingcheng" placeholder="产品名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="产品分类" prop="chanpinfenlei">
					<el-input v-model="ruleForm.chanpinfenlei" placeholder="产品分类" clearable  :readonly="ro.chanpinfenlei"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="产品分类" prop="chanpinfenlei">
					<el-input v-model="ruleForm.chanpinfenlei" placeholder="产品分类" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="主板编号" prop="zhubanbianhao">
					<el-input v-model="ruleForm.zhubanbianhao" placeholder="主板编号" clearable  :readonly="ro.zhubanbianhao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="主板编号" prop="zhubanbianhao">
					<el-input v-model="ruleForm.zhubanbianhao" placeholder="主板编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="显示器编号" prop="xianshiqibianhao">
					<el-input v-model="ruleForm.xianshiqibianhao" placeholder="显示器编号" clearable  :readonly="ro.xianshiqibianhao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="显示器编号" prop="xianshiqibianhao">
					<el-input v-model="ruleForm.xianshiqibianhao" placeholder="显示器编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="无线模块编号" prop="wuxianmokuaibianhao">
					<el-input v-model="ruleForm.wuxianmokuaibianhao" placeholder="无线模块编号" clearable  :readonly="ro.wuxianmokuaibianhao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="无线模块编号" prop="wuxianmokuaibianhao">
					<el-input v-model="ruleForm.wuxianmokuaibianhao" placeholder="无线模块编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="受理机分类" prop="shoulijifenlei">
					<el-input v-model="ruleForm.shoulijifenlei" placeholder="受理机分类" clearable  :readonly="ro.shoulijifenlei"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="受理机分类" prop="shoulijifenlei">
					<el-input v-model="ruleForm.shoulijifenlei" placeholder="受理机分类" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="邮寄状态" prop="youjizhuangtai">
					<el-input v-model="ruleForm.youjizhuangtai" placeholder="邮寄状态" clearable  :readonly="ro.youjizhuangtai"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="邮寄状态" prop="youjizhuangtai">
					<el-input v-model="ruleForm.youjizhuangtai" placeholder="邮寄状态" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="date" v-if="type!='info'" label="收货时间" prop="shouhuoshijian">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.shouhuoshijian" 
						type="date"
						:readonly="ro.shouhuoshijian"
						placeholder="收货时间"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-else-if="ruleForm.shouhuoshijian" label="收货时间" prop="shouhuoshijian">
					<el-input v-model="ruleForm.shouhuoshijian" placeholder="收货时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="人员账号" prop="renyuanzhanghao">
					<el-input v-model="ruleForm.renyuanzhanghao" placeholder="人员账号" clearable  :readonly="ro.renyuanzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="人员账号" prop="renyuanzhanghao">
					<el-input v-model="ruleForm.renyuanzhanghao" placeholder="人员账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="人员姓名" prop="renyuanxingming">
					<el-input v-model="ruleForm.renyuanxingming" placeholder="人员姓名" clearable  :readonly="ro.renyuanxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="人员姓名" prop="renyuanxingming">
					<el-input v-model="ruleForm.renyuanxingming" placeholder="人员姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="客户账号" prop="kehuzhanghao">
					<el-input v-model="ruleForm.kehuzhanghao" placeholder="客户账号" clearable  :readonly="ro.kehuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="客户账号" prop="kehuzhanghao">
					<el-input v-model="ruleForm.kehuzhanghao" placeholder="客户账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="客户姓名" prop="kehuxingming">
					<el-input v-model="ruleForm.kehuxingming" placeholder="客户姓名" clearable  :readonly="ro.kehuxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="客户姓名" prop="kehuxingming">
					<el-input v-model="ruleForm.kehuxingming" placeholder="客户姓名" readonly></el-input>
				</el-form-item>
			</template>
			<el-form-item :style='{"width":"100%","margin":"20px","justifyContent":"center","display":"flex"}' class="btn">
				<el-button :style='{"border":"2px dashed #7b434e","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"50px","background":"#b7788d","width":"130px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"border":"2px dashed #7b434e","cursor":"pointer","padding":"0","margin":"0","color":"#666","outline":"none","borderRadius":"50px","background":"#e1dde0","width":"130px","lineHeight":"40px","fontSize":"14px","fontWeight":"bold","height":"40px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"border":"2px dashed #7b434e","cursor":"pointer","padding":"0","margin":"0","color":"#666","outline":"none","borderRadius":"50px","background":"#e1dde0","width":"130px","lineHeight":"40px","fontSize":"14px","fontWeight":"bold","height":"40px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				youjibianhao : false,
				chanpinmingcheng : false,
				chanpinfenlei : false,
				zhubanbianhao : false,
				xianshiqibianhao : false,
				wuxianmokuaibianhao : false,
				shoulijifenlei : false,
				youjizhuangtai : false,
				shouhuoshijian : false,
				renyuanzhanghao : false,
				renyuanxingming : false,
				kehuzhanghao : false,
				kehuxingming : false,
			},
			
			
			ruleForm: {
				youjibianhao: this.getUUID(),
				chanpinmingcheng: '',
				chanpinfenlei: '',
				zhubanbianhao: '',
				xianshiqibianhao: '',
				wuxianmokuaibianhao: '',
				shoulijifenlei: '',
				youjizhuangtai: '已收货',
				shouhuoshijian: '',
				renyuanzhanghao: '',
				renyuanxingming: '',
				kehuzhanghao: '',
				kehuxingming: '',
			},
		
			
			rules: {
				youjibianhao: [
				],
				chanpinmingcheng: [
				],
				chanpinfenlei: [
				],
				zhubanbianhao: [
				],
				xianshiqibianhao: [
				],
				wuxianmokuaibianhao: [
				],
				shoulijifenlei: [
				],
				youjizhuangtai: [
				],
				shouhuoshijian: [
				],
				renyuanzhanghao: [
				],
				renyuanxingming: [
				],
				kehuzhanghao: [
				],
				kehuxingming: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
	created() {
		this.ruleForm.shouhuoshijian = this.getCurDate()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='youjibianhao'){
							this.ruleForm.youjibianhao = obj[o];
							this.ro.youjibianhao = true;
							continue;
						}
						if(o=='chanpinmingcheng'){
							this.ruleForm.chanpinmingcheng = obj[o];
							this.ro.chanpinmingcheng = true;
							continue;
						}
						if(o=='chanpinfenlei'){
							this.ruleForm.chanpinfenlei = obj[o];
							this.ro.chanpinfenlei = true;
							continue;
						}
						if(o=='zhubanbianhao'){
							this.ruleForm.zhubanbianhao = obj[o];
							this.ro.zhubanbianhao = true;
							continue;
						}
						if(o=='xianshiqibianhao'){
							this.ruleForm.xianshiqibianhao = obj[o];
							this.ro.xianshiqibianhao = true;
							continue;
						}
						if(o=='wuxianmokuaibianhao'){
							this.ruleForm.wuxianmokuaibianhao = obj[o];
							this.ro.wuxianmokuaibianhao = true;
							continue;
						}
						if(o=='shoulijifenlei'){
							this.ruleForm.shoulijifenlei = obj[o];
							this.ro.shoulijifenlei = true;
							continue;
						}
						if(o=='youjizhuangtai'){
							this.ruleForm.youjizhuangtai = obj[o];
							this.ro.youjizhuangtai = true;
							continue;
						}
						if(o=='shouhuoshijian'){
							this.ruleForm.shouhuoshijian = obj[o];
							this.ro.shouhuoshijian = true;
							continue;
						}
						if(o=='renyuanzhanghao'){
							this.ruleForm.renyuanzhanghao = obj[o];
							this.ro.renyuanzhanghao = true;
							continue;
						}
						if(o=='renyuanxingming'){
							this.ruleForm.renyuanxingming = obj[o];
							this.ro.renyuanxingming = true;
							continue;
						}
						if(o=='kehuzhanghao'){
							this.ruleForm.kehuzhanghao = obj[o];
							this.ro.kehuzhanghao = true;
							continue;
						}
						if(o=='kehuxingming'){
							this.ruleForm.kehuxingming = obj[o];
							this.ro.kehuxingming = true;
							continue;
						}
				}
				








				this.ruleForm.youjizhuangtai='已收货'





			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
					if(json.kehuzhanghao!=''&&json.kehuzhanghao && this.$storage.get("role")!="管理员"){
						this.ruleForm.kehuzhanghao = json.kehuzhanghao
						this.ro.kehuzhanghao = true;
					}
					if(json.kehuxingming!=''&&json.kehuxingming && this.$storage.get("role")!="管理员"){
						this.ruleForm.kehuxingming = json.kehuxingming
						this.ro.kehuxingming = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `kehushouhuo/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {



























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "kehushouhuo/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `kehushouhuo/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.kehushouhuoCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `kehushouhuo/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.kehushouhuoCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.kehushouhuoCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #000;
	  	  font-weight: 500;
	  	  width: 80px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 2px dashed #7b434e;
	  	  border-radius: 50px;
	  	  padding: 0 12px;
	  	  outline: none;
	  	  color: #666;
	  	  background: none;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 2px dashed #7b434e;
	  	  border-radius: 50px;
	  	  padding: 0 10px;
	  	  outline: none;
	  	  color: #999;
	  	  background: none;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 2px dashed #7b434e;
	  	  border-radius: 50px;
	  	  padding: 0 10px 0 30px;
	  	  outline: none;
	  	  color: #999;
	  	  background: none;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 2px dashed #7b434e;
	  	  cursor: pointer;
	  	  border-radius: 50px;
	  	  color: #999;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 200px;
	  	  text-align: center;
	  	  height: 200px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 2px dashed #7b434e;
	  	  cursor: pointer;
	  	  border-radius: 50px;
	  	  color: #999;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 200px;
	  	  text-align: center;
	  	  height: 200px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 2px dashed #7b434e;
	  	  cursor: pointer;
	  	  border-radius: 50px;
	  	  color: #999;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 200px;
	  	  text-align: center;
	  	  height: 200px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 2px dashed #7b434e;
	  	  border-radius: 50px;
	  	  padding: 12px;
	  	  outline: none;
	  	  color: #999;
	  	  background: none;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 120px;
	  	}
</style>
