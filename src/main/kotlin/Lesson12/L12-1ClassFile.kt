
class weather(){

    var dayweather = 17
    var nightweather = 3
    var fallout = "yes"



    fun printMe (): String {
        var margin = """
            
        Дневная     : ${dayweather}
        Ночная      : ${nightweather}  
        Осадки      : ${fallout}
       
        
    """.trimIndent()
        return margin
    }
}