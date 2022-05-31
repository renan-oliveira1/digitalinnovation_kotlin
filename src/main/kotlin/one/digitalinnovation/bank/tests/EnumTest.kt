package one.digitalinnovation.bank.tests

import one.digitalinnovation.bank.ClientType

fun main() {
    ClientType.values().forEach { value ->
        println("${value.name} - $value")
    }
}