fun main(){
    val firstWord = "Hello " //Constant, cant be reassigned
    var secondWord = "Second Word"

    println(firstWord + secondWord)

    println("Enter any word: ")

    secondWord = readln() //Reads the input from user

    println(firstWord + secondWord)
}