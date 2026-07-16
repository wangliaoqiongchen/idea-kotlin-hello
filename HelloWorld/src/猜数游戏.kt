import kotlin.math.E
import kotlin.random.Random

fun main() {
    println("欢迎来到猜数字游戏")
    val a = (1..100).random()
    var q = 1
    var e = 100
    println(a)

    for (i in 1..100) {
        println("请输入数字范围$q - $e")
        var b = readLine()!!.toInt()
        if (a == b) {
            println("恭喜猜对")
            break
        }
        if (b > a){
            println("猜大了")
            if (b < e)
                e = b
        }
        if (b < a){
            println("猜小了")
            if (b > q)
                q = b
        }
        else
            println("请输入正确格式")
    }
}