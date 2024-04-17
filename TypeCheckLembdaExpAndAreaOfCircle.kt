//i. Write a program using Kotlin to describe type check.
fun main() {
    val obj1: Any = "Hello"
    val obj2: Any = 42
    val obj3: Any = arrayListOf(1, 2, 3)
    checkType(obj1)
    checkType(obj2)
    checkType(obj3)
}

fun checkType(obj: Any) {
    when (obj) {
        is String -> println("$obj is a String")
        is Int -> println("$obj is an Int")
        is List<*> -> println("$obj is a List")
        else -> println("$obj is of unknown type")
    }
}


//ii. Write a program to implement lambda expression in Kotlin.
data class Book(val title: String, val author: String, val year: Int)

fun main() {
    // Create a list of books
    val books = listOf(
        Book("1984", "George Orwell", 1949),
        Book("To Kill a Mockingbird", "Harper Lee", 1960),
        Book("The Catcher in the Rye", "J.D. Salinger", 1951),
        Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
        Book("Pride and Prejudice", "Jane Austen", 1813)
    )
    // Filter the books based on a condition using a lambda expression
    val modernBooks = books.filter { it.year > 1950 }
    // Print the titles of modern books
    println("Modern books:")
    modernBooks.forEach { println("${it.title} by ${it.author}") }

    // Sort the books based on the year of publication using a lambda expression
    val sortedBooks = books.sortedBy { it.year }
    // Print the titles of sorted books
    println("\nBooks sorted by year:")
    sortedBooks.forEach { println("${it.title} (${it.year})") }
}


//iii. Write a program using Kotlin to find area of circle using function.
import kotlin.math.PI

fun main() {
    val radius = 10.0
    if (radius > 0) {
        val area = calculateArea(radius)
        println("The area of the circle with radius $radius is $area")
    } else {
        println("Invalid input. Please enter a valid positive number for radius.")
    }
}

fun calculateArea(radius: Double): Double {
    return PI * radius * radius
}

//