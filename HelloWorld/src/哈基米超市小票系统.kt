fun main() {
    for (i in 1..100) {
        println("待机中...输入回车继续")
        readLine()
        xitong()
    }
}

fun xitong() {
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    var e = 0
    var f = 0
    println("——————哈基米结算系统——————\n0.打票 1.水(1) 2.可乐(3) 3.冰红茶(4) 4.功能饮料(6) 5.奶茶(7) 6.气泡酒(9)")
    for (i in 1..100) {
        var u = readLine()
        if (u == "1") {
            println("输入数量")
            var y1: Int? = readLine()?.toInt()
            y1?.let { a += it }
            println("$a next")
        }
        if (u == "2") {
            println("输入数量")
            var y2: Int? = readLine()?.toInt()
            y2?.let { b += y2 * 3 }
            println("$b next")
        }
        if (u == "3") {
            println("输入数量")
            var y3: Int? = readLine()?.toInt()
            y3?.let { c += y3 * 4 }
            println("$c next")
        }
        if (u == "4") {
            println("输入数量")
            var y4: Int? = readLine()?.toInt()
            y4?.let { d += y4 * 6 }
            println("$d next")
        }
        if (u == "5") {
            println("输入数量")
            var y5: Int? = readLine()?.toInt()
            y5?.let { e += y5 * 7 }
            println("$e next")
        }
        if (u == "6") {
            println("输入数量")
            var y6: Int? = readLine()?.toInt()
            y6?.let { f += y6 * 9 }
            println("$f next")
        }

        if (u == "0") {
            println("开始打票\n\n")
            println("——————————哈基米超市——————————\n" +
                    " 商品   单价  个数  总价  ")
            if (a != 0){
                println("  水    1￥   $a    $a 元")
            }
            if (b != 0){
                println(" 可乐   3￥   ${b / 3}    $b 元 ")
            }
            if (c != 0){
                println(" 冰红茶  4￥   ${c / 4}    $c 元 ")
            }
            if (d != 0){
                println("功能饮料 6￥   ${d / 6}    $d 元 ")
            }
            if (e != 0){
                println(" 奶茶    7￥   ${e / 7}    $e 元 ")
            }
            if (f != 0){
                println(" 气泡酒  9￥   ${f / 9}    $f 元 ")
            }
            println("**************************\n——————————————总计 ${ a + b + c + d + e + f }元\n欢迎下次光临")
            break

        }
    }
}