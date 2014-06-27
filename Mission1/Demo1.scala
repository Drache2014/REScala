import swing._
import swing.event._
import rescala.commons.time._
import scala.swing.Swing

object Demo1 extends SimpleSwingApplication{
  
  val timer = Timer(100)
  
  var current = ""
  
  def top = frame
    
    val frame = new MainFrame {
    title = "Current time"
    contents = new Panel{
    	override def paintComponent(g: Graphics2D) {
    	current = Time.current.ms.toString
	    g.drawString("The Time is " + current, 20, 20)
      }
    }
    size = new Dimension(300, 80)
  }
  
   override def main(args: Array[String]) {
    super.main(args)
    timer.tick += { _ => frame.repaint } 
    Timer.runAll
  }
}
