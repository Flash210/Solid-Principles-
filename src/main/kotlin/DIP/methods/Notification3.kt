package DIP.methods

import DIP.InterfaceMessage
class Notification3: InterfaceMessage {
    override fun send() {
        mailType.send()
    }

    lateinit var mailType: InterfaceMessage


}