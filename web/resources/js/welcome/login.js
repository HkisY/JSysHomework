function login() {
    var username = $("#username").val();
    var password = $("#password").val();
    $.ajax({
        type:"get",
        url:"/welcome/login?username="+username+"&password="+password,
        success:function (data) {
            if (data.status == 1){
                window.location.href="/welcome/firstPage"
            } else{
                alert("Please enter the correct username or password");
            }
        }
    })
}

function logon() {
    window.location.href='';
}