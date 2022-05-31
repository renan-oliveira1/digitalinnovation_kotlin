package one.digitalinnovation.bank

import java.math.BigDecimal

abstract class Employee(
    name: String,
    cpf: String,
    val salary: Double) : People(name, cpf){
        protected abstract fun calculateBenefit(): Double
    }