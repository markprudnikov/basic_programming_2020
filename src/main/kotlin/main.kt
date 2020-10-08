package homework.third

// 1. Реализовать quicksort в функциональном стиле
fun quicksort(list: List<Int>):List<Int>{
    if (list.size <= 1) return list
    val pivot = list[list.size / 2 ]
    return quicksort(list.filter {it < pivot}) + list.filter{it == pivot} + quicksort(list.filter { it > pivot })
}

// 2. Определите функцию reverse, которая разворачивает список, используя foldr
fun <T> reverse(list: List<T>) : List<T>{
    return list.foldRight(listOf()) { next, result -> result + next }
}

// 3.1 Определите filter с помощью fold.
fun <T> filterFold(list: List<T>, n: T) : List<T>{
    return list.fold(mutableListOf()) { result, next -> if (next!=n) result.add(next)
        result}
}

// 3.2 Определите filter с помощью foldRight
fun <T> filterFoldR(list: List<T>, n: T) : List<T>{
    return list.foldRight(mutableListOf()) { next, result -> if (next != n) result.add(0,next)
    result}
}

// 4. Определите ф-ию lengths, принимающую список строк и возвращающую список длин этих строк.
fun lengths (list: List<String>): List<Int>{
    return list.map{it.length }.toList()
}

// 5. Определите ф-ию sumsq, принимающую число n как аргумент,
// и возвращающую сумму квадратов первых n целых чисел, с помощью map.
fun sumsq(n: Int): List<Int>{
    return generateSequence(1, {it + 1}).map{it*it}.take(n).toList()
}

// 6. Напишите расширение для списков, реализующее функцию mapAccumL
fun  List<Int>.mapAccumLAddition(n: Int): Pair<Int,List<Int>> {
    return this.fold(n){ result, next -> result + next} to this.map{it + n}
}
fun List<Int>.mapAccumLMultiplication(n:Int): Pair<Int,List<Int>>{
    return this.fold(n){result, next -> result * next} to this.map{it*n}
}

fun main(){
    println("\nTask 1: ")
    println("Result of quicksort: ${quicksort(listOf(2,4,1,5,3))}")

    println("\nTask 2: ")
    println("Result of reverse function: ${reverse(listOf(1,2,3,4,5))}")

    println("\nTask 3:")
    println("Result of filter function via Fold: ${filterFold(listOf(1,2,3,4,5),4)}")
    println("Result of filter function via FoldR: ${filterFoldR(listOf(1,2,3,4,5),4)}")

    println("\nTask 4:")
    println("Result of lengths function:  ${lengths(listOf("Danya I Love You","Bragilevskiy is god","I love Kotlin"))}")

    println("\nTask 5:")
    println("Result of sumsq function: ${sumsq(10)}")

    println("\nTask 6:")
    println("Result of mapAccumL for addition: ${listOf(1,2,3,4,5).mapAccumLAddition(5)}")
    println("Result of mapAccumL for multiplication: ${listOf(1,2,3,4,5).mapAccumLMultiplication(5)}")
}
