import kotlin.collections.HashSet
/*
Method that takes a String sentence to check if the sentence is a Pangram or not
 */
fun isPangram(sentence: String): Boolean{
    val alphaSet= HashSet<Char>()
    for(c in sentence){
        if(c != ' '){
            alphaSet.add(c.toLowerCase())
        }
    }

    if(alphaSet.size == 26)
        return true
    else
        return false
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