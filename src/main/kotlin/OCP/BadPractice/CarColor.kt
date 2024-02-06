package OCP.BadPractice

class CarColor {

    fun getCarColor(car: Car): String {
        return when (car.type) {
            "Sedan" -> "Red From bad practice"
            "SUV" -> "Blue From bad practice"
            "Truck" -> "Green   From bad practice"
            else -> "Unknown From bad practice"
        }
    }
}