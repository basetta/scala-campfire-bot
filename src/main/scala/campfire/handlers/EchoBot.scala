package campfire.handlers

import scala.util.matching.Regex
import campfire._

class EchoBot extends Handler {
  val command:String = "pribot echo"
  val description:String = "Echo back exactly what I say ex. pribot echo Repeat after me"
  def handleMessage(m:Message):Unit = {
    if (m.body.startsWith("pribot echo")) {
      var room = new Room(m.room_id.toInt)
      room speak "I am echo bot, you said: "+m.body
    }
  }
}