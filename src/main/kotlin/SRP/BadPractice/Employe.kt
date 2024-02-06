package SRP.BadPractice

class Employe {
    var name: String = ""
    var id: Int = 0
    var department: String = ""

    fun calculateSalary(hoursWorked: Int, hourlyRate: Double): Double {
        return hoursWorked * hourlyRate
    }

    fun saveEmployeeToDatabase() {
        // Code to save employee to database
    }

    fun sendEmailNotification() {
        // Code to send email notification
    }
}
