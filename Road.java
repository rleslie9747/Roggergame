import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Road extends JPanel {
	
	protected int x;

	public Road() {
		setMinimumSize(new Dimension(750,450));
		setMaximumSize(new Dimension(1000,800));
		setPreferredSize(new Dimension(850,600));
		setBackground(Color.BLACK);
		drawLaneLines();
		Timer t = new Timer(100,
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						x+=1;
						repaint();
						
					}});
		t.start();		
	}
	
	private void drawLaneLines(){
		repaint();
	}
	
	private void drawVehicles(Graphics g){
		int y=30;
		String carImageFileName = "./src/Froger Pics/red-car.png";
		ImageIcon theIcon = new ImageIcon(carImageFileName);
		Image image1= theIcon.getImage();
		g.drawImage(image1, x,y,null);
		Image image2= (new ImageIcon("./src/Froger Pics/red-car.png")).getImage();
		g.drawImage(image2, x,y+110,null);
		Image image3= (new ImageIcon("./src/Froger Pics/school-bus.png")).getImage();
		g.drawImage(image3, x,y+220,null);
		Image image4= (new ImageIcon("./src/Froger Pics/orange sports cars.png")).getImage();
		g.drawImage(image4, x,y+330,null);
		
		g.drawImage(theIcon.getImage(), x, y, null);
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		setForeground(Color.WHITE);
		int numberOfLanes = 5;
		int laneWidth = getHeight()/numberOfLanes;
		for (int pos = laneWidth; pos < getHeight(); pos += laneWidth);{
		}
		g.drawLine(30, x, laneWidth, numberOfLanes );
		//repaint();
	}
}
