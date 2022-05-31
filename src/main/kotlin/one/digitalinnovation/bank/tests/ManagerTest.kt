package one.digitalinnovation.bank.tests

import one.digitalinnovation.bank.Manager

fun main() {
    val manager = Manager("Paulo", "111.111.111-42", 5000.0)
    PrintReportEmployee.report(manager)
}

