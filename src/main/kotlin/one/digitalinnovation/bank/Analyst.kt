package one.digitalinnovation.bank

import java.math.BigDecimal

class Analyst(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name, cpf, salary) {

    override fun calculateBenefit(): Double = salary*0.1

}