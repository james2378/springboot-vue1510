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
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'" label="产品编号" prop="chanpinbianhao">
					<el-input v-model="ruleForm.chanpinbianhao" placeholder="产品编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-else-if="ruleForm.chanpinbianhao" label="产品编号" prop="chanpinbianhao">
					<el-input v-model="ruleForm.chanpinbianhao" placeholder="产品编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="产品名称" prop="chanpinmingcheng">
					<el-input v-model="ruleForm.chanpinmingcheng" placeholder="产品名称" clearable  :readonly="ro.chanpinmingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="产品名称" prop="chanpinmingcheng">
					<el-input v-model="ruleForm.chanpinmingcheng" placeholder="产品名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="select" v-if="type!='info'"  label="产品分类" prop="chanpinfenlei">
					<el-select :disabled="ro.chanpinfenlei" v-model="ruleForm.chanpinfenlei" placeholder="请选择产品分类" >
						<el-option
							v-for="(item,index) in chanpinfenleiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="产品分类" prop="chanpinfenlei">
					<el-input v-model="ruleForm.chanpinfenlei"
						placeholder="产品分类" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="select" v-if="type!='info'" label="物料名称" prop="wuliaomingcheng">
					<el-select :disabled="ro.wuliaomingcheng" @change="wuliaomingchengChange" v-model="ruleForm.wuliaomingcheng" placeholder="请选择物料名称">
						<el-option
							v-for="(item,index) in wuliaomingchengOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-else-if="ruleForm.wuliaomingcheng" label="物料名称" prop="wuliaomingcheng">
					<el-input v-model="ruleForm.wuliaomingcheng" placeholder="物料名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="物料类型" prop="wuliaoleixing">
					<el-input v-model="ruleForm.wuliaoleixing" placeholder="物料类型" clearable  :readonly="ro.wuliaoleixing"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="物料类型" prop="wuliaoleixing">
					<el-input v-model="ruleForm.wuliaoleixing" placeholder="物料类型" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="产品型号" prop="chanpinxinghao">
					<el-input v-model="ruleForm.chanpinxinghao" placeholder="产品型号" clearable  :readonly="ro.chanpinxinghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="产品型号" prop="chanpinxinghao">
					<el-input v-model="ruleForm.chanpinxinghao" placeholder="产品型号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="upload" v-if="type!='info' && !ro.tupian" label="图片" prop="tupian">
					<file-upload
						tip="点击上传图片"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.tupian?ruleForm.tupian:''"
						@change="tupianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' class="upload" v-else-if="ruleForm.tupian" label="图片" prop="tupian">
					<img v-if="ruleForm.tupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.tupian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tupian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
			</template>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-if="type!='info'"  label="产品详情" prop="chanpinxiangqing">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.chanpinxiangqing" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"width":"45%","margin":"0 0 20px 0","display":"inline-block"}' v-else-if="ruleForm.chanpinxiangqing" label="产品详情" prop="chanpinxiangqing">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"#333","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.chanpinxiangqing"></span>
                </el-form-item>
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
				chanpinbianhao : false,
				chanpinmingcheng : false,
				chanpinfenlei : false,
				wuliaomingcheng : false,
				wuliaoleixing : false,
				chanpinxinghao : false,
				tupian : false,
				chanpinxiangqing : false,
			},
			
			
			ruleForm: {
				chanpinbianhao: this.getUUID(),
				chanpinmingcheng: '',
				chanpinfenlei: '',
				wuliaomingcheng: '',
				wuliaoleixing: '',
				chanpinxinghao: '',
				tupian: '',
				chanpinxiangqing: '',
			},
		
			chanpinfenleiOptions: [],
			wuliaomingchengOptions: [],
			
			rules: {
				chanpinbianhao: [
				],
				chanpinmingcheng: [
				],
				chanpinfenlei: [
				],
				wuliaomingcheng: [
				],
				wuliaoleixing: [
				],
				chanpinxinghao: [
				],
				tupian: [
				],
				chanpinxiangqing: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
	created() {
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
						if(o=='chanpinbianhao'){
							this.ruleForm.chanpinbianhao = obj[o];
							this.ro.chanpinbianhao = true;
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
						if(o=='wuliaomingcheng'){
							this.ruleForm.wuliaomingcheng = obj[o];
							this.ro.wuliaomingcheng = true;
							continue;
						}
						if(o=='wuliaoleixing'){
							this.ruleForm.wuliaoleixing = obj[o];
							this.ro.wuliaoleixing = true;
							continue;
						}
						if(o=='chanpinxinghao'){
							this.ruleForm.chanpinxinghao = obj[o];
							this.ro.chanpinxinghao = true;
							continue;
						}
						if(o=='tupian'){
							this.ruleForm.tupian = obj[o];
							this.ro.tupian = true;
							continue;
						}
						if(o=='chanpinxiangqing'){
							this.ruleForm.chanpinxiangqing = obj[o];
							this.ro.chanpinxiangqing = true;
							continue;
						}
				}
				








			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
			
            this.$http({
				url: `option/chanpinfenlei/chanpinfenlei`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.chanpinfenleiOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
            this.$http({
				url: `option/wuliaoxinxi/wuliaomingcheng`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.wuliaomingchengOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
			
		},
			// 下二随
			wuliaomingchengChange () {
				this.$http({
					url: `follow/wuliaoxinxi/wuliaomingcheng?columnValue=`+ this.ruleForm.wuliaomingcheng,
					method: "get"
				}).then(({ data }) => {
					if (data && data.code === 0) {
						if(data.data.wuliaoleixing){
							this.ruleForm.wuliaoleixing = data.data.wuliaoleixing
						}
					} else {
						this.$message.error(data.msg);
					}
				});
			},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `chanpinxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        this.ruleForm.chanpinxiangqing = this.ruleForm.chanpinxiangqing.replace(reg,'../../../springbootadp78/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {














	if(this.ruleForm.tupian!=null) {
		this.ruleForm.tupian = this.ruleForm.tupian.replace(new RegExp(this.$base.url,"g"),"");
	}



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
				url: "chanpinxinxi/page", 
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
					   url: `chanpinxinxi/${!this.ruleForm.id ? "save" : "update"}`,
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
						 this.parent.chanpinxinxiCrossAddOrUpdateFlag = false;
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
			   url: `chanpinxinxi/${!this.ruleForm.id ? "save" : "update"}`,
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
				 this.parent.chanpinxinxiCrossAddOrUpdateFlag = false;
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
      this.parent.chanpinxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    tupianUploadChange(fileUrls) {
	    this.ruleForm.tupian = fileUrls;
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
