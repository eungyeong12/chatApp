package jo.chatapp

data class Message(
    var message: String?,
    var sendId: String?
) {
    constructor():this("","")
}
