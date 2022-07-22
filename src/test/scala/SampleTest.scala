import org.scalatest.funsuite.AnyFunSuite

class SampleTest extends AnyFunSuite
{
    test("test´s if firstNumber == secondNumber"){

        val firstNumber: Int = 1
        val secondNumber: Int = 1

        assert(firstNumber == secondNumber)
    }
}