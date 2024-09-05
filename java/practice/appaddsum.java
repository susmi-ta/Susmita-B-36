//addition of two number using applet
import java.awt.*;
import java.applet.*;
public class appaddsum extends Applet{
	TextField t1,t2;
	public void init(){
		t1= new TextField(8);
		t2= new TextField(8);
		add (t1);
		add (t2);
		t1.setText("0");
		t2.setText("0");
	}
	public void paint (Graphics g){
		int x=0,y=0,z=0;
		String s1,s2,s;
		g.drawString("enter two number: ",10,50);
		s1= t1.getText();
		x=Integer.parseInt(s1);
		s2= t2.getText();
		y= Integer.parseInt(s2);
		z=x+y;
		s=String.valueOf(z);
		g.drawString("sum = ", 10,75);
		g.drawString(s,100,75);
	}
	public Boolean Action(Event e, Object o){
		repaint();
		return true;
	}
}