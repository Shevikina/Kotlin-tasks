fun main(args:Array<String>) {
    println("Введите строку")
    val line = readLine() as String
    var repit=0
    for(simb1 in line){
        var index=0
        for(simb2 in line){
            if(simb2==simb1) index++
        }
        if (index>1) repit++
    }
    println("${repit/2} повторяющихся букв")
}