fun main() {
   // var word = "Sai"
    //val capital = "lower"
    var (word, capital) = readLine()!!.split(' ')

    if (capital.equals("upper",true))
        word = word.uppercase()
    else if (capital.equals("lower",true))
        word =  word.lowercase()

    println(word)
}