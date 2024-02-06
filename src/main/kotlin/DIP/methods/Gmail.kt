package DIP.methods

import DIP.InterfaceMessage

class Gmail : InterfaceMessage {



    override fun send() {
        println("Sending Gmail")
    }
}