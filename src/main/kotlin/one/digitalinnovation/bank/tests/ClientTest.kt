package one.digitalinnovation.bank.tests

import one.digitalinnovation.bank.Client
import one.digitalinnovation.bank.ClientType

fun main() {
    val client = Client("Gabriel Silva", "111.111.111-23", ClientType.PF, "123456")
    println(client)

    AuthenticateTest().authenticate(client)
}