fun main() {
oddNumbers()
    namesArray("Rahmah","Salma","Nuru","Yusuf","Mustanirah","Pik")

    serveDrinks(5)
    serveDrinks(17)
    serveDrinks(11)
    serveDrinks(20)

    fizz()
}

fun oddNumbers(){
    for(i in 1..100){
        if(i%2 !=0){
            println(i)
        }

    }
}
fun namesArray(name1:String,name2:String,name3:String,name4:String,name5:String,name6:String):Array<String>{
    var a= arrayOf(name1,name2,name3,name4,name5,name6)
    for(s in a)
    if (s.length>5){
        println(s)
    }
    return a



}

fun serveDrinks(age:Int){
        if(age<6){
            println("milk")
        }else if (age<15 && age>6){
            println("fanta orange")
        }else if(age>=6){
            println("fanta orange")
        }else{
            println("coca cola")
        }

}

fun fizz() {
    for (i in 1..100) {
        println(i)
    }
    for (i in 1..100) {
        if (i % 3 == 0) {
            println("Fizz")
        }
        for (i in 1..100) {
            if (i % 5 == 0) {
                println("Buzz")
            }
            if (i % 3 == 0 && i % 5 == 0) {
                println("FizzBuzz")
            }
        }
    }

}