const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootadp78/",
            name: "springbootadp78",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "nuct产品售后管理系统"
        } 
    }
}
export default base
