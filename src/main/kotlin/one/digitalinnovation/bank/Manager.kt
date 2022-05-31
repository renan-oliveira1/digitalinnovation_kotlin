package one.digitalinnovation.bank

class Manager(name: String,
              cpf: String,
              salary: Double,
              val password: String
) : Employee(name, cpf, salary), LogIn {
    override fun calculateBenefit(): Double = salary*0.4

    override fun login(): Boolean = "pass123" == password
}