import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import fanhuijiyoujikehu from '@/views/modules/fanhuijiyoujikehu/list'
    import changshang from '@/views/modules/changshang/list'
    import tongzhikehu from '@/views/modules/tongzhikehu/list'
    import shoulirenyuan from '@/views/modules/shoulirenyuan/list'
    import shoulifanhuiji from '@/views/modules/shoulifanhuiji/list'
    import guzhangji from '@/views/modules/guzhangji/list'
    import kehu from '@/views/modules/kehu/list'
    import wuliaochuku from '@/views/modules/wuliaochuku/list'
    import fanhuijizhuangxiangfanhui from '@/views/modules/fanhuijizhuangxiangfanhui/list'
    import wuliaoruku from '@/views/modules/wuliaoruku/list'
    import shouliliushuidan from '@/views/modules/shouliliushuidan/list'
    import gongchengshifankui from '@/views/modules/gongchengshifankui/list'
    import kehuquhui from '@/views/modules/kehuquhui/list'
    import kehushouhuo from '@/views/modules/kehushouhuo/list'
    import chanpinxinxi from '@/views/modules/chanpinxinxi/list'
    import zhenglifenlei from '@/views/modules/zhenglifenlei/list'
    import diannaodan from '@/views/modules/diannaodan/list'
    import youjifanhuiji from '@/views/modules/youjifanhuiji/list'
    import wuliaoxinxi from '@/views/modules/wuliaoxinxi/list'
    import shoulijifenlei from '@/views/modules/shoulijifenlei/list'
    import dianhuagoutong from '@/views/modules/dianhuagoutong/list'
    import fanhuijizhuangxiangfanchang from '@/views/modules/fanhuijizhuangxiangfanchang/list'
    import fanhuijidiannaodan from '@/views/modules/fanhuijidiannaodan/list'
    import zhuangxiangfanchang from '@/views/modules/zhuangxiangfanchang/list'
    import wuliaoleixing from '@/views/modules/wuliaoleixing/list'
    import gongchengshi from '@/views/modules/gongchengshi/list'
    import chanpinfenlei from '@/views/modules/chanpinfenlei/list'
    import fanhuijizhenglifenlei from '@/views/modules/fanhuijizhenglifenlei/list'
    import goutongqueren from '@/views/modules/goutongqueren/list'
    import zhuangxiangfanhui from '@/views/modules/zhuangxiangfanhui/list'
    import shouliguzhangji from '@/views/modules/shouliguzhangji/list'
    import fanhuijiliushuidan from '@/views/modules/fanhuijiliushuidan/list'
    import fanhuijichanpinweixiu from '@/views/modules/fanhuijichanpinweixiu/list'
    import chanpinweixiu from '@/views/modules/chanpinweixiu/list'
    import fenpeigongchengshi from '@/views/modules/fenpeigongchengshi/list'
    import chanpinweihu from '@/views/modules/chanpinweihu/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/fanhuijiyoujikehu',
        name: '返回机邮寄客户',
        component: fanhuijiyoujikehu
      }
      ,{
	path: '/changshang',
        name: '厂商',
        component: changshang
      }
      ,{
	path: '/tongzhikehu',
        name: '通知客户',
        component: tongzhikehu
      }
      ,{
	path: '/shoulirenyuan',
        name: '受理人员',
        component: shoulirenyuan
      }
      ,{
	path: '/shoulifanhuiji',
        name: '受理返回机',
        component: shoulifanhuiji
      }
      ,{
	path: '/guzhangji',
        name: '故障机',
        component: guzhangji
      }
      ,{
	path: '/kehu',
        name: '客户',
        component: kehu
      }
      ,{
	path: '/wuliaochuku',
        name: '物料出库',
        component: wuliaochuku
      }
      ,{
	path: '/fanhuijizhuangxiangfanhui',
        name: '返回机装箱返回',
        component: fanhuijizhuangxiangfanhui
      }
      ,{
	path: '/wuliaoruku',
        name: '物料入库',
        component: wuliaoruku
      }
      ,{
	path: '/shouliliushuidan',
        name: '受理流水单',
        component: shouliliushuidan
      }
      ,{
	path: '/gongchengshifankui',
        name: '工程师反馈',
        component: gongchengshifankui
      }
      ,{
	path: '/kehuquhui',
        name: '客户取回',
        component: kehuquhui
      }
      ,{
	path: '/kehushouhuo',
        name: '客户收货',
        component: kehushouhuo
      }
      ,{
	path: '/chanpinxinxi',
        name: '产品信息',
        component: chanpinxinxi
      }
      ,{
	path: '/zhenglifenlei',
        name: '整理分类',
        component: zhenglifenlei
      }
      ,{
	path: '/diannaodan',
        name: '电脑单',
        component: diannaodan
      }
      ,{
	path: '/youjifanhuiji',
        name: '邮寄返回机',
        component: youjifanhuiji
      }
      ,{
	path: '/wuliaoxinxi',
        name: '物料信息',
        component: wuliaoxinxi
      }
      ,{
	path: '/shoulijifenlei',
        name: '受理机分类',
        component: shoulijifenlei
      }
      ,{
	path: '/dianhuagoutong',
        name: '电话沟通',
        component: dianhuagoutong
      }
      ,{
	path: '/fanhuijizhuangxiangfanchang',
        name: '返回机装箱返厂',
        component: fanhuijizhuangxiangfanchang
      }
      ,{
	path: '/fanhuijidiannaodan',
        name: '返回机电脑单',
        component: fanhuijidiannaodan
      }
      ,{
	path: '/zhuangxiangfanchang',
        name: '装箱返厂',
        component: zhuangxiangfanchang
      }
      ,{
	path: '/wuliaoleixing',
        name: '物料类型',
        component: wuliaoleixing
      }
      ,{
	path: '/gongchengshi',
        name: '工程师',
        component: gongchengshi
      }
      ,{
	path: '/chanpinfenlei',
        name: '产品分类',
        component: chanpinfenlei
      }
      ,{
	path: '/fanhuijizhenglifenlei',
        name: '返回机整理分类',
        component: fanhuijizhenglifenlei
      }
      ,{
	path: '/goutongqueren',
        name: '沟通确认',
        component: goutongqueren
      }
      ,{
	path: '/zhuangxiangfanhui',
        name: '装箱返回',
        component: zhuangxiangfanhui
      }
      ,{
	path: '/shouliguzhangji',
        name: '受理故障机',
        component: shouliguzhangji
      }
      ,{
	path: '/fanhuijiliushuidan',
        name: '返回机流水单',
        component: fanhuijiliushuidan
      }
      ,{
	path: '/fanhuijichanpinweixiu',
        name: '返回机产品维修',
        component: fanhuijichanpinweixiu
      }
      ,{
	path: '/chanpinweixiu',
        name: '产品维修',
        component: chanpinweixiu
      }
      ,{
	path: '/fenpeigongchengshi',
        name: '分配工程师',
        component: fenpeigongchengshi
      }
      ,{
	path: '/chanpinweihu',
        name: '产品维护',
        component: chanpinweihu
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
