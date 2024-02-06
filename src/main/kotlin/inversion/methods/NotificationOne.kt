package inversion.methods

import inversion.InterfaceMessage

class NotificationOne(private val message: InterfaceMessage) : InterfaceMessage {

    // dependency injection using constructor

    override fun send() {

message.send()
    }


}