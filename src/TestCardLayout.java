import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class TestCardLayout {
	public static void main(String args[]){
		final Frame f = new Frame("Card Layout");
		final CardLayout c1 = new CardLayout();
		
		Button [] buttons = new Button[8];
		for (int i=0;i<buttons.length;i++){
			buttons[i] = new Button("button"+(i+1));
			buttons[i].addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseClicked(MouseEvent e){
					if(e.getModifiers()==InputEvent.BUTTON1_MASK)
						c1.next(f);
					else
						c1.previous(f);
					
				}
			});
		}
		
		f.setLayout(c1);
		for(int j=0; j<buttons.length;j++)
			f.add(""+(j+1),buttons[j]);
		
		f.setSize(200,200);
		f.setVisible(true);

	}

}
