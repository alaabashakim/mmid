fun main (){
    school()
    you("alla abbas",21)
    call()
    statement()
}

//Assignment 3: strings

//1.Given a string “akirachix”. Write a function that prints out a string composed of
//the first, third and fourth characters of the string (2 points)
fun school(){
    var c= "Akirachix"
    println(c[0].toString()+c[2]+c[3])
}

//2.Write a function that takes in 2 parameters, name and age and returns a
//Stringed name and age respectively. (3 points)
//with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provid
fun you (name:String,age :Int ):String{

    var m = ("my name is $name i am $age years old")
    println(m)
    return m
}
//3.Write a function that takes in a String and returns its length (2 points)
fun  call(){
    var k ="watermellon"
    println(k.length)
}
//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is” (3
fun statement(){
    var name = "alla abbbas"
    var x = name
    if(name==x){
        println("thats me!")

    }
    else{
        println("i dont know who that is")
    }
}
