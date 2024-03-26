//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    var human =Human("Faith",20,67)
    var eat = Human("Faith",20,67)
    human.eat(40)
    human.speak("Ilove joking qwith other")
    human.weight
    println(human.weight)

    var adta = user("faith","yiamat","kkckki","bxsab","mbc")
    println(adta.fname)
    println(adta.lname)


}
class Human(var name:String,var age:Int,var weight:Int){

    fun eat(foodWeight:Int){
        println("I take $foodWeight every day")

        weight+=foodWeight
    }

    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+1
    }
}

data class user(
    var fname:String,
    var lname:String,
    var email:String,
    var phoneNumber:String,
    var password:String
)
fun instance(){
    val fname = "Faith"
    val lname = "Yiamat"
    val email = "olosehjh@gmail.com"
    val phoneNumber = "079918-u2"
    val password = "mdsbc,hs"



}

