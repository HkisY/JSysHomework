function cancel() {
    window.location.href="/welcome/loginpage"
}

function register() {
    var User={};
        User.username = $("#username").val();
        User.password = $("#password").val();
        User.nickname = $("#nickname").val();
    $.ajax({
        type:"post",
        url:"/welcome/register",
        data:User,
        success:function (data) {
            if (data.status == 1){
                window.location.href="/welcome/firstPage"
            } else{
                alert("Please enter the correct username or password");
            }
        }
    })
}