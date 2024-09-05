import java.awt.*;
import java.applet.*;
public class apprev extends Applet{
	TextField t1;
	public void init(){
		t1= new TextField(8);
		add (t1);
		t1.setText("0");
	}
	public void paint (Graphics g){
		int a,n,s=0;
		String s1,s2;
		g.drawString("enter a number: ",10,50);
		s1= t1.getText();
		n=Integer.parseInt(s1);
		while(n>0){
			a=n%10;
			n=n/10;
			s=s*10+a;
		}
		s2=String.valueOf(s);
		g.drawString("reverse is ", 10,75);
		g.drawString(s2,120,75);
	}
	public Boolean Action(Event e, Object o){
		repaint();
		return true;
	}
}