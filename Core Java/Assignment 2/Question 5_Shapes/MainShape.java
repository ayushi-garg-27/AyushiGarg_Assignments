package assignment.second.java.fifth_Question.shapes;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Line l = new Line();{
			JFrame f = new JFrame("Twilight Zone");
			
			   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			   //f.getContentPane().add(new Line());
			   f.getContentPane().add(l);
			   f.setSize(290, 325);
			   f.setLocation(550, 25);
			   f.setVisible(true);
			
			
			//System.out.println(line.draw());
			}

	}*/
		Rectangle rectangle=new Rectangle();
		Line line=new Line();
		Cube cube=new Cube();
		
		rectangle.draw();
		line.draw();
		cube.draw();

}
}
