class PersonalFinanceCalculator {
    val transactionList = mutableListOf<Transaction>()

    fun printGreeting(){
        println("Greetings! I am your personal finance calculator.")
    }

    fun saveTransaction(transaction: Transaction){
        transactionList.add(transaction)
    }

    fun printAllTransactions(){
        transactionList.forEach(){
            println("${it.name} $${it.getValue()}")
        }
    }
}

fun main(){
    val pfcInstance = PersonalFinanceCalculator()
    pfcInstance.printGreeting()

    println("\nEnter your name: ")
    val name = readln()
    println("\nEnter the sum of your current savings: ")
    val savings = readln()

    val person = Person(name = name, savings=savings.toDouble())

    var exit = "no"

    while(exit != "yes"){
        println("\n\nHi ${person.name} your current savings is $${person.savings.plus(pfcInstance.transactionList.sumOf { 
            it.getValue()
        })}")

        println("Describe your next transaction (text): ")
        val transactionDescription = readln()
        println("What is the value of your next transaction (0.00): ")
        val transactionValue = readln().toDouble()

        println("Is this an income or expense('i' for income, 'e' for expenses): ")
        when(readln()){
            "i" -> pfcInstance.saveTransaction(Income(transactionDescription, transactionValue))
            "e" -> pfcInstance.saveTransaction(Expense(transactionDescription, transactionValue))
            else -> println("Incorrect entry")
        }

        println("\nDo you wish to see a list of all your transactions? ('y' or 'n'): ")
        when(readln()){
            "y","yes" ->{
                pfcInstance.printAllTransactions()
                println("\n\nHi ${person.name} your current savings is $${person.savings.plus(pfcInstance.transactionList.sumOf {
                    it.getValue()
                })}")
            }
            "n", "no" ->{}
            else -> println("Incorrect entry")
        }

        println("\nDo you want to exit(yes to exit): ")
        exit = readln()
    }
}