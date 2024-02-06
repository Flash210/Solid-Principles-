package DIP.methods

import DIP.InterfaceMessage
class NotificationTwo: InterfaceMessage {


    fun send(message: InterfaceMessage) {
        message.send()

    }

    override fun send() {
        TODO("Not yet implemented")
    }


}