fun main(arg:Array<String>){
    println("Что вы хотите инвертировать-буквы в слове или слова и буквы в предложении?")
    var choice = readLine()
    when(choice?.toLowerCase()){
        "буквы в слове"->{
            println("Введите слово, которое хотите инфертировать")
            var inversionLetter:String=readLine() as String
            println("Инвертированное слово: ${inversionLetter.reversed()}")
        }
        "слова и буквы в предложении"->{
            println("Введите предложение, которое хотите инфертировать")
            var inversionWord:String=readLine() as String
            println("Интервтированное предложение: ${inversionWord.reversed()}")
        }
        else -> println("Неизвестная команда. Досвидания!")
    }

}