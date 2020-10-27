package com.markprudnikov

fun main() {
    val expression =
        Addition(
                Multiplication(
                    Literal(3),
                    Literal(2)
                ),
                Addition(
                    Literal(4),
                    Literal(5)
                )
        )


    print("Результат: ${expression.accept(CalculateVisitor())}")

    print("\nВыражение: ")
    expression.accept(PrintVisitor())

    print("\nРаскрытие скобок: ")
    expression.accept(OpenBrackets()).toString()

}