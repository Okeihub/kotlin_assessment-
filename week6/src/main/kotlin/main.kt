fun main(){
    println(loveCheck(22,17))
    loveCheck(22,17)
}

fun loveCheck(Timmy:Int, Sarah:Int):Boolean {
    return Timmy % 2 !== Sarah % 2;
}