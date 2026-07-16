fun main() {
    var money = 20
    val x = 3
    val k = 4
    val n = 8
    while (money > 0) {
        print("菜单\n1.雪糕（3元）\n2.可乐（4元）\n3.奶茶（8元）\n0.退出\n")
        val q = readLine()
        when (q) {
            "1" -> {
                money -= x
                println("剩余$money")
                if(money < 3){
                    print("余额不足，即将退出")
                    break
                }
            }
            "2" -> {
                money -= k
                println("剩余$money")
                if(money < 4){
                    print("余额不足，即将退出")
                    break
                }
            }
            "3" -> {
                money -= n
                println("剩余$money")
                if(money < 8){
                    print("余额不足，即将退出")
                    break
                }
            }
            "0" -> {
                println("退出")
                break
            }
            else -> {
                print("错误\n")
            }
        }
    }
}