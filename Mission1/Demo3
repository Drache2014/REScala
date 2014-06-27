import swing._
import swing.event._
import rescala.commons.time._
import scala.swing.Swing

object Demo3 extends SimpleSwingApplication{
  
  val timer = Timer(100)
  var elements = "0"
  var s = 0
    
  def top = frame
    
    val frame = new MainFrame {
    title = "Current time"
    contents = new Panel{
    	override def paintComponent(g: Graphics2D) {
    	val current = Time.current.ms
    	val seconds = Time.current.s.toInt
    	val secsMod10 = (Time.current.s % 10).toInt
    	if((Time.current.s % 10).toInt == 0)
    		elements = "0"
    		  
    	if(s != (Time.current.s % 10).toInt)
    		elements = elements+ "," + (Time.current.s % 10).toInt.toString 
    	s = (Time.current.s % 10).toInt
    	
	    g.drawString("The Time is " + current, 20, 20)
	    g.drawString("The Time in seconds is " + seconds, 20, 40)
	    g.drawString("The Time modulo 10 is " + secsMod10, 20, 60)
	    g.drawString("The list of time modulo 10 element is [" + elements + "]", 20, 80)
      }
    }
    size = new Dimension(400, 135)
  }
  
   override def main(args: Array[String]) {
    super.main(args)
    timer.tick += { _ => frame.repaint } 
    Timer.runAll
  }
}
