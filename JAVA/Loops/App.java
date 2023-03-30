
import java.applet.Applet;
import java.awt.*;
public class App extends Applet {
	
public void paint(Graphics g){
	g.drawOval(0, 20, 100, 200);
	g.fillOval(120, 20, 100, 200);
	g.drawRect(240, 20, 100, 200);
	g.fillRect(360, 20, 100, 200);
	g.drawOval(480, 20, 200, 200);
	g.fillOval(700, 20, 200, 200);
	g.drawLine(920, 40, 100, 200);
	g.drawArc(900, 20, 200, 200, -90, 120);
	g.drawString("Applet Program", 600, 400);
}
}
