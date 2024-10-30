import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
//	public void paint(Graphics g) {
		
//		Graphics2D g2 = (Graphics2D) g;
//        g2.setStroke(new BasicStroke(1));
        
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
//		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
//		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
//		g2.drawLine(765/2, 10, 765/2,550 );
		
		
		//4) small rectangles on top-left
		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		//Draw Random Lines
//		int lines = 0;
//		while(lines <= 100) {
//			lines ++;
//			int linex = (int)(Math.random()*(765/2 - 10 + 1)) + 10;
//			int linex2 = (int)(Math.random()*(765/2 - 10 + 1)) + 10;
//			int liney = (int)(Math.random()*(270 - 10 + 1))+ 10;
//			int liney2 = (int)(Math.random()*(270 - 10 + 1))+ 10;
//			g2.drawLine(linex, liney, linex2, liney2);
//			g2.setColor(new Color ((int)(Math.random()*225),
//					(int)(Math.random()*225),
//					(int)(Math.random()*225)
//					));
//		}
		
		//Draw Random Squares
//		int squares = 0;
//		while(squares <= 100) {
//			squares ++;
//			int squarex = (int)(Math.random()*(715 - 750/2 + 1)) + 765/2;
//			int squarey = (int)(Math.random()*(220- 10 + 1))+ 10;
//			g2.fillRect(squarex, squarey, 50, 50);
//			g2.setColor(new Color ((int)(Math.random()*225),
//					(int)(Math.random()*225),
//					(int)(Math.random()*225)
//					));
//		}
		
		//Draw Random Circles
//		int circles = 0;
//		while(circles <= 100) {
//			circles ++;
//			int circlex = (int)(Math.random()*(190 - 5 + 1)) + 5;
//			int circley = (int)(Math.random()*(350 - 270 + 1))+ 270;
//			int dia = (int)(Math.random()*(200 - 0 + 1)) + 0;
//			g2.drawOval(circlex, circley, dia, dia);
//			g2.setColor(new Color ((int)(Math.random()*225),
//					(int)(Math.random()*225),
//					(int)(Math.random()*225)
//					));
//		}
		
		//Draw 3-D Box (Extra Credit)
//		g2.setColor(Color.yellow);
//		g.fillRect(500, 350, 100, 100);
//		g2.setColor(Color.blue);
//		int [] xpoint = {600, 650, 600};
//		int [] ypoint = {350, 400, 400};
//		int npoint = 3;
//		g2.fillPolygon(xpoint, ypoint, npoint);
//		g2.setColor(Color.green);
//		int [] xpoints = {500, 500, 550, 550};
//		int [] ypoints = {350, 450, 500, 400};
//		int nPoints = 4;
//		g2.fillPolygon(xpoints, ypoints, nPoints);
//		g2.setColor(Color.red);
//		g.fillRect(550, 400, 100, 100);
		
//	}
	
	
	
	
	
	
	
	
	
//	public static void main(String[] arg) {
//		Runner m = new Runner();
//	}
	
//	public Runner() {
//		JFrame f = new JFrame("Method Use");
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setSize(800,600);
//		f.add(this);
//		f.setVisible(true);
//		
//	}
//}


		
		// Practice using Loops, random #s and 
		// methods
		public void paint(Graphics g) {
			
			Graphics2D g2 = (Graphics2D) g;
	        g2.setStroke(new BasicStroke(1));
			
			
			/* 
			 * int var = 0; 						<---- control variable
			 * while(var < 10){ 					<---- condition to run the loop
			 *   
			 *   //any repeating code
			 *   
			 *   var++;								<---- update control variable
			 *   
			 * }
			 */
			

	        //top left corner
	        int count1 = 0;
	        int x1 = 0;
	        int y2 = 650;
	        while(count1 <= 150) {
	        	g.drawLine(x1, 0, 0, y2);
	        	x1 += 25;
	        	y2 -= 25;
	        	count1 ++;
	        }
	        
	        //top right corner
	        int count2 = 0;
	        int x11 = 1000;
	        int y22 = 650;
	        while(count2 <= 150) {
	        	g.drawLine(x11, 0, 1000, y22);
	        	x11 -= 25;
	        	y22 -= 25;
	        	count2 ++;
	        }
	        
	        //bottom left corner
	        int x222 = 0;
	        int y111 = 0;
	        for(int count3 = 0; count3 <= 150; count3++) {
	        	g.drawLine(0, y111, x222, 650);
	        	x222 += 25;
	        	y111 += 25;
	        }

	        //bottom right corner
	        int x2222 = 1000;
	        int y1111 = 0;
	        for(int count4 = 0; count4 <= 150; count4 ++) {
	        	g.drawLine(1000, y1111, x2222, 650);
	        	y1111 += 25;
	        	x2222 -= 25;
	        }
		
		}
		
		
		
		
		
		
		public static void main(String[] arg) {
			Runner m = new Runner();
		}
		
		public Runner() {
			JFrame f = new JFrame("Method Use");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(1000,675);
			f.add(this);
			f.setVisible(true);
			
		}
}