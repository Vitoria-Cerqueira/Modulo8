package Ex1

class CalculoMatematico {

    fun divisao(num1: Int, num2: Int): Int {


        return try {
            num1 / num2

        } catch (expetion: ArithmeticException) {
            expetion.printStackTrace()
            println("A operação não pode ser realizada ${expetion.message}")
            println("Causa: ${expetion.cause}")

            0

        }


    }

}