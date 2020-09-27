package fibonacci

// F_0 = 0
// F_1 = 1
// F_n = F_n-1 + F_n-2 (n >= 2)
fun fibonacci(n : Int): Int{
    var answer = 0
    if(n == 0) return 0
    if (n == 1) return 1
    if (n < 0)
    {
        answer += fibonacci(n+2) - fibonacci(n + 1)
    }
    if (n > 1)
    {
        answer += fibonacci(n-1) + fibonacci(n - 2)
    }
    return answer
}
fun main(args: Array<String>)
{
    var input = args[0].toString()
    val re = Regex("[A-Za-z]")
    input = re.replace(input,"")
    if (input.isNullOrEmpty() || input.isNullOrBlank())
    {
        println("Your input is not an Integer number!")
    }
    else if(!input.contains(',') && !input.contains('.'))
    {
        println("The ${input.toInt()}'st number in Fibonacci sequence is: ${fibonacci(input.toInt())}")
    }
    else println("Your input is not an Integer number!")
}