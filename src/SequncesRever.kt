fun main(args: Array<String>){
    println("Hello Kotlin")

    var sequence:ArrayList<Int> = arrayListOf()

    println("Размер массива:")
    val sizeArray = readLine()
    println(sizeArray)
    val sizeArrayInt: Int = sizeArray!!.toInt()


    var indNum = 0
    while(indNum < sizeArrayInt){
        println("Ввод элемента")
        val num = readLine()
        val numInt: Int = num!!.toInt()
        sequence.add(numInt)
        ++indNum
    }

    println(sequence.joinToString())

    var number = 0
    var bufNumber: Int
    while(number < sequence.size / 2){
        var sequenceBuf: ArrayList<Int> = arrayListOf()
        sequenceBuf.addAll(sequence)
        bufNumber = sequenceBuf[number]
        sequenceBuf[number] = sequenceBuf[sequence.size - bufNumber]
        sequenceBuf[sequence.size - bufNumber] = bufNumber
        println(sequenceBuf.joinToString())
        ++number
    }
}