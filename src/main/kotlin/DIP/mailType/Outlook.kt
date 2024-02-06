package DIP.mailType

import DIP.InterfaceMessage

class Outlook: InterfaceMessage {


    override fun send() {
        println("Sending Outlook")
    }


}