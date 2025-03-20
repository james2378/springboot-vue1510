<template>
	<div>
		<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20221011/1a24c174ab214d489dd490fe814ab39a.jpg)","display":"flex","width":"100%","backgroundPosition":"center","justifyContent":"center"}'>
			<el-form v-if="pageFlag=='register'" :style='{"padding":"40px 20px 20px","margin":"0","borderRadius":"0","background":"url(http://codegen.caihongy.cn/20221012/582900690e23471d9f11b3e6fca90a12.png)","width":"1000px","backgroundSize":"100% 100%","height":"1000px"}' ref="rgsForm" class="rgs-form" :model="rgsForm">
				<div v-if="true" :style='{"margin":"140px 0 0 0","color":"#b97a8f","textAlign":"center","width":"100%","lineHeight":"40px","fontSize":"28px","textShadow":"4px 4px 2px rgba(219, 123, 151, .8)"}' class="title">nuct产品售后管理系统注册</div>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='kehu'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">客户账号</div>
					<el-input  v-model="ruleForm.kehuzhanghao"  autocomplete="off" placeholder="客户账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='kehu'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">客户姓名</div>
					<el-input  v-model="ruleForm.kehuxingming"  autocomplete="off" placeholder="客户姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='kehu'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='kehu'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='kehu'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in kehuxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='kehu'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">头像</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="kehutouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='kehu'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">电话号码</div>
					<el-input  v-model="ruleForm.dianhuahaoma"  autocomplete="off" placeholder="电话号码"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='shoulirenyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">人员账号</div>
					<el-input  v-model="ruleForm.renyuanzhanghao"  autocomplete="off" placeholder="人员账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='shoulirenyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">人员姓名</div>
					<el-input  v-model="ruleForm.renyuanxingming"  autocomplete="off" placeholder="人员姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='shoulirenyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='shoulirenyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='shoulirenyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in shoulirenyuanxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='shoulirenyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">头像</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="shoulirenyuantouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='shoulirenyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">电话号码</div>
					<el-input  v-model="ruleForm.dianhuahaoma"  autocomplete="off" placeholder="电话号码"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='gongchengshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">工程师账号</div>
					<el-input  v-model="ruleForm.gongchengshizhanghao"  autocomplete="off" placeholder="工程师账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='gongchengshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">工程师姓名</div>
					<el-input  v-model="ruleForm.gongchengshixingming"  autocomplete="off" placeholder="工程师姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='gongchengshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='gongchengshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='gongchengshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in gongchengshixingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='gongchengshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">头像</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="gongchengshitouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='gongchengshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">电话号码</div>
					<el-input  v-model="ruleForm.dianhuahaoma"  autocomplete="off" placeholder="电话号码"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='changshang'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">厂商账号</div>
					<el-input  v-model="ruleForm.changshangzhanghao"  autocomplete="off" placeholder="厂商账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='changshang'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">厂商名称</div>
					<el-input  v-model="ruleForm.changshangmingcheng"  autocomplete="off" placeholder="厂商名称"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='changshang'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='changshang'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='changshang'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in changshangxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='changshang'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">电话号码</div>
					<el-input  v-model="ruleForm.dianhuahaoma"  autocomplete="off" placeholder="电话号码"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"22px 0 0 280px"}' class="list-item" v-if="tableName=='changshang'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">详细地址</div>
					<el-input  v-model="ruleForm.xiangxidizhi"  autocomplete="off" placeholder="详细地址"  type="text"  />
				</el-form-item>
				<button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"20px 35%","color":"#fff","display":"block","outline":"none","borderRadius":"50px","background":"#b6788d","width":"30%","fontSize":"18px","fontWeight":"bold","height":"44px"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0 10%","margin":"0 0 0 500px","color":"#b6788d","display":"inline-block","lineHeight":"1","fontSize":"12px","textDecoration":"underline"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>
			
		</div>
	</div>
</template>

<script>

export default {
	data() {
		return {
			ruleForm: {
                xingbie: '',
                xingbie: '',
                xingbie: '',
                xingbie: '',
			},

            pageFlag : '',
			tableName:"",
			rules: {},
            kehuxingbieOptions: [],
            shoulirenyuanxingbieOptions: [],
            gongchengshixingbieOptions: [],
            changshangxingbieOptions: [],
		};
	},
	mounted(){
        this.pageFlag = this.$storage.get("pageFlag");
		let table = this.$storage.get("loginTable");
		this.tableName = table;
        this.kehuxingbieOptions = "男,女".split(',')
        this.shoulirenyuanxingbieOptions = "男,女".split(',')
        this.gongchengshixingbieOptions = "男,女".split(',')
        this.changshangxingbieOptions = "男,女".split(',')
	},
	created() {
    
	},
	destroyed() {
		  	},
	methods: {
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        kehutouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },
        shoulirenyuantouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },
        gongchengshitouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
					if((!this.ruleForm.kehuzhanghao) && `kehu` == this.tableName){
						this.$message.error(`客户账号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.kehuxingming) && `kehu` == this.tableName){
						this.$message.error(`客户姓名不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `kehu` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `kehu` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					
					
					
					
					
					
					
					
					
					
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`kehu` == this.tableName && this.ruleForm.dianhuahaoma&&(!this.$validate.isMobile(this.ruleForm.dianhuahaoma))){
						this.$message.error(`电话号码应输入手机格式`);
						return
					}
					
					
					
					
				
					if((!this.ruleForm.renyuanzhanghao) && `shoulirenyuan` == this.tableName){
						this.$message.error(`人员账号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.renyuanxingming) && `shoulirenyuan` == this.tableName){
						this.$message.error(`人员姓名不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `shoulirenyuan` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `shoulirenyuan` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					
					
					
					
					
					
					
					
					
					
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`shoulirenyuan` == this.tableName && this.ruleForm.dianhuahaoma&&(!this.$validate.isMobile(this.ruleForm.dianhuahaoma))){
						this.$message.error(`电话号码应输入手机格式`);
						return
					}
					
					
					
					
				
					if((!this.ruleForm.gongchengshizhanghao) && `gongchengshi` == this.tableName){
						this.$message.error(`工程师账号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.gongchengshixingming) && `gongchengshi` == this.tableName){
						this.$message.error(`工程师姓名不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `gongchengshi` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `gongchengshi` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					
					
					
					
					
					
					
					
					
					
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`gongchengshi` == this.tableName && this.ruleForm.dianhuahaoma&&(!this.$validate.isMobile(this.ruleForm.dianhuahaoma))){
						this.$message.error(`电话号码应输入手机格式`);
						return
					}
					
					
					
					
				
					if((!this.ruleForm.changshangzhanghao) && `changshang` == this.tableName){
						this.$message.error(`厂商账号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.changshangmingcheng) && `changshang` == this.tableName){
						this.$message.error(`厂商名称不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `changshang` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `changshang` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`changshang` == this.tableName && this.ruleForm.dianhuahaoma&&(!this.$validate.isMobile(this.ruleForm.dianhuahaoma))){
						this.$message.error(`电话号码应输入手机格式`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				
			
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
						}
					});
				} else {
					this.$message.error(data.msg);
				}
			});
		}
	}
};
</script>

<style lang="scss" scoped>
	.container {
	  position: relative;
	  background: url(http://codegen.caihongy.cn/20221011/1a24c174ab214d489dd490fe814ab39a.jpg);

		.el-date-editor.el-input {
		  width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 1px solid #d87b96;
						padding: 0 10px;
						box-shadow: 0 0 6px rgba(192, 112, 146, .3);
						outline: 1px dashed #d87b96;
						color: #666;
						width: 80%;
						font-size: 14px;
						outline-offset: 4px;
						height: 35px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 1px solid #d87b96;
						padding: 0 10px;
						box-shadow: 0 0 6px rgba(192, 112, 146, .3);
						outline: 1px dashed #d87b96;
						color: #666;
						width: 280px;
						font-size: 14px;
						outline-offset: 4px;
						height: 38px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #d87b96;
						padding: 0 10px 0 30px;
						box-shadow: 0 0 6px rgba(192, 112, 146, .3);
						outline: 1px dashed #d87b96;
						color: #666;
						width: 280px;
						font-size: 14px;
						outline-offset: 4px;
						height: 38px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #d87b96;
						padding: 0 10px 0 30px;
						box-shadow: 0 0 6px rgba(192, 112, 146, .3);
						outline: 1px dashed #d87b96;
						color: #666;
						width: 280px;
						font-size: 14px;
						outline-offset: 4px;
						height: 38px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 2px dashed rgba(185, 122, 143, 0.5);
		  		  cursor: pointer;
		  		  border-radius: 2px;
		  		  box-shadow: 0 0 6px rgba(192, 112, 146, 0.6);
		  		  color: #666;
		  		  bottom: 40px;
		  		  width: 120px;
		  		  font-size: 32px;
		  		  line-height: 120px;
		  		  position: absolute;
		  		  right: 20px;
		  		  height: 120px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 2px dashed rgba(185, 122, 143, 0.5);
		  		  cursor: pointer;
		  		  border-radius: 2px;
		  		  box-shadow: 0 0 6px rgba(192, 112, 146, 0.6);
		  		  color: #666;
		  		  bottom: 40px;
		  		  width: 120px;
		  		  font-size: 32px;
		  		  line-height: 120px;
		  		  position: absolute;
		  		  right: 20px;
		  		  height: 120px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 2px dashed rgba(185, 122, 143, 0.5);
		  		  cursor: pointer;
		  		  border-radius: 2px;
		  		  box-shadow: 0 0 6px rgba(192, 112, 146, 0.6);
		  		  color: #666;
		  		  bottom: 40px;
		  		  width: 120px;
		  		  font-size: 32px;
		  		  line-height: 120px;
		  		  position: absolute;
		  		  right: 20px;
		  		  height: 120px;
		  		}
	}
</style>
