import java.util.*
/*
Method that takes a String sentence to check if the sentence is a Pangram or not
 */
fun isPangram(sentence: String): Boolean{
    val alphaMap= TreeMap<Char, Boolean>()

    for(c in 'a'..'z') {
        alphaMap[c]=false
    }

    for(c in sentence){
        alphaMap[c.toLowerCase()]=true
    }

    for(c in 'a'..'z'){
        if(alphaMap[c] == false){
            return false
        }
    }
    return true
}
/*
Method main to check the working of method isPangram() with a correct and an incorrect sentence
 */
fun main(args: Array<String>){
    val correctSentence="the quick brown fox jumps over a lazy dog"
    val incorrectSentence="the quik brown fox jumps over a lay dog"
    println(isPangram(correctSentence))
    println(isPangram(incorrectSentence))
}