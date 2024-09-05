import java.awt.*;
import java.applet.*;
public class appfibo extends Applet{
	TextField t;	
	public void init(){
		t=new TextField (4);
		add(t);
		t.setText("0");
	}
	public void paint(Graphics g){
		int a=0,b=1,c,n,i;
		String s;
		g.drawString("enter nth term: ",10,10);
		s=t.getText();
		n=Integer.parseInt(s);
		if(n>0)
			g.drawString("0 1 ",10,100);
		for(i=3;i<=n;i++){
			c=a+b;	
			a=b;
			b=c;
			s=String.valueOf(c);
			g.drawString(s,i*10,100);
		}
		g.drawString("fibonacci series =  ",10,80);
	}
	public Boolean Action (Event e, Object o){
		repaint();
		return true;
	}
}