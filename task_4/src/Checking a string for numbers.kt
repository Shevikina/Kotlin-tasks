fun main(args:Array<String>) {
    println("Введите строку")
    val line = readLine() as String
    var index=true
    index= line.matches("-?[0-9]+(/.[0-9]]+)?".toRegex())
    if (index)
        println("$line пролностью состоит из цифр")
    else
        println("$line содержит символы отличающиеся от цифр")
}
