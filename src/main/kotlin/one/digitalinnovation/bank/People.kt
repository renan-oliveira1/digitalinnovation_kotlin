package one.digitalinnovation.bank

class People {
    var name: String = "Jether"

    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun peopleInfo() = "$name e $cpf"
}
