package querylanguage

object QueryLanguageHandlerTest {
    fun test(cases:List<String>): List<Map<String,String>> =
        cases.map{ QueryLanguageHandler.tryToHandleStatement(it) }
}