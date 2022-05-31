package one.digitalinnovation.bank

class Client(name: String,
             cpf: String,
             val clientType: ClientType,
             val password: String
) : People(name, cpf), LogIn {
    override fun login(): Boolean = "123456" == password
}