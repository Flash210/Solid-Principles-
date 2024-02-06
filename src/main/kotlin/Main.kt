import OCP.GoodPractice.`interface`.Sedan
import OCP.GoodPractice.`interface`.Suv

fun main(args: Array<String>) {


    val carColor=OCP.BadPractice.CarColor()
    val car=OCP.BadPractice.Car("Sedan")
    println(carColor.getCarColor(car))


// abstract class  method for open close principle
val sedan1=OCP.GoodPractice.absraction.Sedan()
    println(sedan1.getCarColor())
    val suv1=OCP.GoodPractice.absraction.SUV()
    println(suv1.getCarColor())
    //********************************************************************************************************************
// interface method for open close principle
    val sedan= Sedan()
    println( sedan.getCarColor())
    val suv= Suv()
    println( suv.getCarColor())


}