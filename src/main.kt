fun main(){
    var human = Human("Mollen", 21, 49)
    human.eat(10)
    println(human.weight)
    human.speak("I love coding")
    human.birthday()

   var info= User("Molly","Wambui","mollenwambui@gmail.com",7245668,"mwy2001")
    println(info.lastname)
    println(info.email)

}
class  Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")
        weight+=foodweight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
    ++age
    }
}
 data class  User(var firstname:String,var lastname:String,var email:String,var phonenumber:Int,var password:String){

}