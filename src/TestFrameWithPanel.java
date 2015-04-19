import java.awt.*;

public class TestFrameWithPanel {
	public static void main(String args[]){
		Frame f = new Frame("MyTest Frame");
		f.setSize(300,200);
		f.setLocation(500, 400);
		f.setBackground(Color.blue);
		
		Panel pan = new Panel();
		pan.setSize(150, 100);
		pan.setLocation(50, 50);
		pan.setBackground(Color.green);
		
		Button b = new Button("ok");
		b.setSize(80,20);
		b.setLocation(50,50);
		b.setBackground(Color.red);
		
		f.setLayout(null);
		pan.setLayout(null);
		pan.add(b);
		f.add(pan);
		
		
		
		f.setVisible(true);
	}

}
