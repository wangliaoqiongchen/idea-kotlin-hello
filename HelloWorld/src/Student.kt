class Student(var name: String , var age: Int) {

    fun hello(name: String){
        println("hi,my name is ${this.name} and age is $age")
    }          //出现奇异时可以加this来指定一下，否则按就近原则
}