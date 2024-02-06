package inversion.methods

import inversion.InterfaceMessage
class Notification3: InterfaceMessage {
    override fun send() {
        mailType.send()
    }

    lateinit var mailType: InterfaceMessage


}