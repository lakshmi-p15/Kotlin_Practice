
fun main(){
    val sentence = "Learning Kotlin is Zwesomz!"
    val key = 1
    val encryptedMsg = StringBuffer()

    sentence.forEach { char ->
        if (Character.isUpperCase(char))
           encryptedMsg.append(((char.code +
                    key - 65) % 26 + 65).toChar())
        else if (Character.isLowerCase(char))
            encryptedMsg.append (((char.code +
                    key - 97) % 26 + 97).toChar())
        else
            encryptedMsg.append(char)
    }
    println(encryptedMsg)
}