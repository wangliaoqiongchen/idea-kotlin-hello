var use = "admin"
var pas = "123456"
var y = "0000"

fun main(){
    caidan()
}


fun caidan(){
    println("——哈基米——\n***欢迎使用哈基米***\n1.注册账号\n2.登录账号\n3.找回密码")
    var t = readLine()
    when(t){
        "1" -> zhuce()
        "2" -> denglu()
        "3" -> zhaohui()
        else -> caidan()
    }
}

fun zhuce(){
    println("====注册系统====")
    println("请输入用户名")
    use = readLine().toString()
    println("请输入密码")
    pas = readLine().toString()
    println("请输入用于找回验证的手机号")
    y = readLine().toString()
    println("注册成功，即将前往主菜单")
    caidan()
}



fun denglu() {
    println("=====登录系统====")
    var c = 0
    for (i in 1..10) {
        println("请输入用户名")
        var a = readLine()
        println("请输入密码")
        var b = readLine()
        if (a == use && b == pas) {
            println("登录成功")
            for (i in 1..10) {
                println("哈基米南北绿豆")
            }
            println("更多功能敬请期待！\n即将返回哈基米主菜单")
            Thread.sleep(3000)
            caidan()
        }
        else
            c += 1
        var e = 3 - c
        println("账户或密码错误")
        println("你还剩余$e 次机会!")
        if (e == 0) {
            println("账号已被锁定，请稍后重试！")
            for (i in 1..10) {
                println("哈！基！米！去找回密码去！")
            }
            println("三秒后返回主菜单！")
            Thread.sleep(3000)
            caidan()

        }

    }

}

fun zhaohui() {
    println("——找回密码——")
    println("请输入账号")
    var i = readLine()
    if (i == use) {
        println("找到此账号，我们希望是你本人在找回密码\n请验证身份\n请输入手机号")
        var e = readLine()
        if (e == y) {
            println("验证成功，请输入新密码")
            pas = readLine().toString()
            println("新密码已生效，前往哈基米喽！\n即将返回主菜单")
            Thread.sleep(3000)
            caidan()

        }
        else
            println("错误，即将返回主菜单")
        Thread.sleep(3000)
        caidan()

    }
    else
        println("错误，即将返回主菜单")
    Thread.sleep(3000)
    caidan()

}