package querylanguage

object QueryLanguageHandlerCases {
    fun test1(){
        val validCases = listOf(
            "key1:name1",
            "key1:name1&key2:name2",
            "key1:name1&key2:name2&key3:name3",
        )

        val results = QueryLanguageHandlerTest.test(validCases)
        results.forEach(::println)
    }

    fun test2(){
        val validCases = listOf(
            "key1name1",
            "key1:name1 &key2:name2",
            "key1:name1&key2:n:ame2&key3:name3",
        )

        val results = QueryLanguageHandlerTest.test(validCases)
        results.forEach(::println)
    }
}