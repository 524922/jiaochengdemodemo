console.log("levant")
$("#sub").click(function () {

    //取值
    var userName=$("#exampleInputEmail1").val();
    var password=$("#exampleInputPassword1").val();
    var rePassword=$("#exampleInputPassword2").val();

    //校验用户名和密码是否为空
    if(userName.length==0){
        alert("please input the username");
        return;//防止程序继续执行
    }

    if(password.length==0){
        alert("please input the password");
        return;
    }

    if(password!=rePassword){
        alert("please input the same password");
        return;
    }

    //封装数据，并提交给后端接口
    var user={
        "username":userName,
        "password":password
    }

    //将实体类转换为json
    var userJson=JSON.stringify(user)

    //提交给后端接口
    $.poat({
        url:'/save',
        data:userJson,
        success:function (data) {
            alert(data)
        }
    });

});

