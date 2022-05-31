package one.digitalinnovation.bank

class Manager(name: String,
              cpf: String,
              salary: Double)
    : Employee(name, cpf, salary) {
    override fun calculateBenefit(): Double = salary*0.4
}