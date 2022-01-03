fun main(args:Array<String>) {
    println("Введите строку")
    val line = readLine() as String
    var noRepit:Char=' '
    for(simb1 in line){
        var index=0
        for(simb2 in line){
            if(simb2==simb1) index++
        }
        if (index==1){
            noRepit=simb1
            break
        }
    }
    if(noRepit!=' ')
        println("Первая не повторяющаяся буква $noRepit")
    else
        println("Все символы в строке повторяются")
}