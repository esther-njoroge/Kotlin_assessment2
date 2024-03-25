fun main (){
    remove("Branie bakes brown bagels and buns")

    numbers(12, 34,24)


    volume(14)

    isPalindrome("")




}

fun remove(word: String){
    println(word)
}

fun numbers(num1: Int, num2: Int, num3: Int): Int {
    var arrayNum=arrayOf(num1, num2, num3)
    println(arrayNum.sum())
    println(arrayNum.count())
    println(arrayNum.average())
}

fun volume(fig: Int){
    var ans =4/3*3.14159*fig*fig*fig
    println(ans)
}

fun isPalindrome(word: String): Boolean{
    if(word==)
        return true
    else{
        return false
    }
}