package Ex2

class Semana {
    fun receberDia(num: Int): String{
        when(num){
            1-> return "Domingo"
            2-> return "Segunda-Feira"
            3-> return "Terça-Feira"
            4-> return "Quarta-Feira"
            5-> return "Quinta-Feira"
            6-> return "Sexta-Feira"
            7-> return "Sábado"
            else -> return "Opção inválida"
        }
    }
}