package inversion

import inversion.methods.Notification3
import inversion.methods.NotificationOne
import inversion.methods.NotificationTwo

fun main(args: Array<String>) {


// contractor injection
     val notify= NotificationOne(Gmail())
    notify.send()

    //method injection
    val notify2=NotificationTwo()
    notify2.send(Hotmail())

    // properities injection
    val notify3=Notification3()
    notify3.mailType=Outlook()
    notify3.send()
}