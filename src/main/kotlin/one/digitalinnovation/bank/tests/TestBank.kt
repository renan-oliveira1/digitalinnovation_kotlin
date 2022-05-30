package one.digitalinnovation.bank.tests

import one.digitalinnovation.bank.Bank

fun main() {
    val bank = Bank(name ="DigitalInnovationOne",  number=12)

    println(bank)

    val number2 = bank.copy(name="Banco2")

    println(bank)
}