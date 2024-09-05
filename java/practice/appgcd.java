import java.awt.*;
import java.applet.*;
public class appgcd extends Applet{
	TextField t1,t2;
	public void init(){
		t1= new TextField(6);
		t2= new TextField(6);
		add(t1);
		add(t2);
		t1.setText("0");	
		t2.setText("0");
	}
	public void paint(Graphics g){
		int x=0,y=0;
		String s,s1,s2;
		g.drawString("Enter two number: ",10,10);
		s1= t1.getText();	
		x = Integer.parseInt(s1);
		s2= t2.getText();	
		y= Integer.parseInt(s2);	
		while(x!=y){
			if(x>y)
				x=x-y;
			else
				y=y-x;
		}
		s= String.valueOf(x);
		g.drawString("gcd = ",10,50);
		g.drawString(s,50,50);
	}
	public Boolean Action(Event e, Object o){
		repaint();
		return true;
	}
}
		