package one.digitalinnovation.bank.tests

import one.digitalinnovation.bank.Analyst
import one.digitalinnovation.bank.Employee
import java.math.BigDecimal

fun main() {
    val analyst = Analyst("Renan", "111.1111.111-11", 2000.00)
    PrintReportEmployee.report(analyst)


}
