//i. Write a program using Kotlin to implement control structures and loops.
//A. if Expression
fun main(args: Array<String>) {
    val number = -10
    if (number > 0) {
        println("Positive number")
    } else {
        println("Negative number")
    }
}

//B. if..else..if Ladder
fun main(args: Array<String>) {
    val number = 0
    val result = if (number > 0)
        "positive number"
    else if (number < 0)
        "negative number"
    else
        "zero"
    println("number is $result")
}

//C. Nested if Expression
fun main(args: Array<String>) {
    val n1 = 3
    val n2 = 5
    val n3 = -2
    val max = if (n1 > n2) {
        if (n1 > n3)
            n1
        else
            n3
    } else {
        if (n2 > n3)
            n2
        else
            n3
    }
    println("max = $max")
}


//D. Kotlin for Loop
fun main(args: Array<String>) {
    var text = "Kotlin"
    for (letter in text) {
        println(letter)
    }
}

//E. Kotlin while Loop
fun main(args: Array<String>) {
    var sum = 0
    var i = 100
    while (i != 0) {
        sum += i // sum = sum + i;
        --i
    }
    println("sum = $sum")
}


//F. Kotlin do...while Loop
fun main() {
var count = 1
do {
println("Count is: $count")
count++ // Increment the counter
} while (count <= 5) // Loop condition
}


//ii. Write a program to implement object-oriented concepts in Kotlin.
Kotlin Class and Object
class Account {
    var acc_no: Int = 0
    var name: String = ""
    var amount: Float = 0.toFloat()
    fun insert(ac: Int, n: String, am: Float) {
        acc_no = ac
        name = n
        amount = am
        println("Account no: $acc_no holder: $name amount: $amount")
    }
    fun deposit() {
        // deposit code
    }
    fun withdraw() {
        // withdraw code
    }
    fun checkBalance() {
        // balance check code
    }
}

fun main(args: Array<String>) {
    var acc = Account()
    acc.insert(832345, "Ankit", 1000f) // accessing member function
    println("${acc.name}") // accessing class property
}
