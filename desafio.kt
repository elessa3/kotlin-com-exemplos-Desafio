// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { 
    BASICO, INTERMEDIARIO, AVANCADO 
}

class Usuario (val nome: String, val nivel: Nivel)

data class ConteudoEducacional(val nome: String, val duracao: String, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    private val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {

      //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")

      inscritos.add(usuario)
    }
    fun mostrarInscritos() {
        println("Inscritos na formação $nome: ")
        inscritos.forEach {
        println("-${it.nome} - nível: ${it.nivel}")
        }
    }
}

fun main() {
   // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")

    val conteudos = listOf(
        ConteudoEducacional("Kotlin Basico", "30 Horas", Nivel.BASICO),
        ConteudoEducacional("Kotlin Intermediário", "60 Horas", Nivel.INTERMEDIARIO),
        ConteudoEducacional("Kotlin Avançado", "90 Horas", Nivel.AVANCADO)   
    )

   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val usuario1 = Usuario("Felipe", Nivel.AVANCADO)
    val usuario2 = Usuario("Heitor", Nivel.INTERMEDIARIO)
    val usuario3 = Usuario("Samuel", Nivel.BASICO)
    val usuario4 = Usuario("Lorenzo", Nivel.BASICO)

    val formacao = Formacao("Kotlin", conteudos)
        formacao.matricular(usuario1)
        formacao.matricular(usuario2)
        formacao.matricular(usuario3)
        formacao.matricular(usuario4)

        formacao.mostrarInscritos()

}
