import fibonacci.fibonacci
import fibonacci.main
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertAll as assertAll

internal class MainKtTest {

    @Test
    fun `Number -1`() {
        val result = 1
        assertEquals(1,fibonacci(-1))
    }

    @Test
    fun `Zero element`(){
        val result = 0
        assertEquals(result, fibonacci(0))
    }

    @Test
    fun `First`(){
        val result = 1
        assertEquals(result, fibonacci(1))
    }

    @Test
    fun `Second`(){
        val result = 1
        assertEquals(result, fibonacci(2))
    }

    @Test
    fun `Unpositive numbers`(){
        val firstResult = -1
        val secondResult = 2
        val thirdResult = -3
        val forthResult = 5
        val fifthResult = -8
        assertAll(
            {assertEquals(firstResult, fibonacci(-2))},
            {assertEquals(secondResult, fibonacci(-3))},
            {assertEquals(thirdResult, fibonacci(-4))},
            {assertEquals(forthResult, fibonacci(-5))},
            {assertEquals(fifthResult, fibonacci(-6))}
        )
    }

}