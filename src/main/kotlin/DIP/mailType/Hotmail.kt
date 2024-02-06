package DIP.mailType

import DIP.InterfaceMessage

class Hotmail: InterfaceMessage {



    override fun send() {
        println("Sending Hotmail")
    }
}