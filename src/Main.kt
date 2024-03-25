fun main (){
    remove("Branie bakes brown bagels and buns")

    numbers(12, 34,24)
//    var arrayNum=arrayOf(num1, num2, num3)
    var arrayNum = arrayOf(12,23,24)
    println(arrayNum.sum())
    println(arrayNum.count())
    println(arrayNum.average())


    volume(14)

    isPalindrome("noon")
}


fun remove(word: String){
    println(word)
}

fun numbers(num1: Int, num2: Int, num3: Int): Int{
    var arrayNum=arrayOf(num1, num2, num3)
    var sum = num1 + num2 + num3
//    println(arrayNum.sum())
//    println(arrayNum.count())
//    println(arrayNum.average())
    return sum

}

fun volume(fig: Int){
    var ans =4/3*3.14159*fig*fig*fig
    println(ans)
}

fun isPalindrome(word: String): Boolean{
    if(word==word)
        return true
    else{
        return false
    }
}