import swing._
import swing.event._
import rescala.commons.time._
import scala.swing.Swing

object Demo2 extends SimpleSwingApplication{
  
  val timer = Timer(100)
  
  def top = frame
    
    val frame = new MainFrame {
    title = "Current time"
    contents = new Panel{
    	override def paintComponent(g: Graphics2D) {
    	val current = Time.current.ms
    	val seconds = Time.current.s.toInt
    	val secsMod10 = (Time.current.s % 10).toInt
	    g.drawString("The Time is " + current, 20, 20)
	    g.drawString("The Time in seconds is " + seconds, 20, 40)
	    g.drawString("The Time modulo 10 is " + secsMod10, 20, 60)
      }
    }
    size = new Dimension(300, 120)
  }
  
   override def main(args: Array[String]) {
    super.main(args)
    timer.tick += { _ => frame.repaint } 
    Timer.runAll
  }
} 
