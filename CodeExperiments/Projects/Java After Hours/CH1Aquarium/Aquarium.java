package CH1Aquarium;

//import java.awt*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;
public class Aquarium extends Frame implements Runnable{
	//local fields
	Image aquariumImage, memoryImage;
	Graphics memoryGraphics;
	Image[] fishImages = new Image[2]; //there are two fish one forward and one backward
	MediaTracker Mtracker;
	Thread thread;
	//vector and tracker for fishes
	int numberFish = 12;
	Vector<Fish> fishes = new Vector<Fish>();
	//Speed of fish
	int sleepTime = 110;
	
	//Thread
	Aquarium()
	{
		setTitle("The Aquarium");
		//Image Arrays
		//Media Tracker to check if files can be called up ie images
		Mtracker = new MediaTracker(this);

		fishImages[0] = Toolkit.getDefaultToolkit().getImage("fish1.gif");
		Mtracker.addImage(fishImages[0], 0);

		fishImages[1] = Toolkit.getDefaultToolkit().getImage("fish2.gif");
		Mtracker.addImage(fishImages[1], 0);

		aquariumImage = Toolkit.getDefaultToolkit().getImage("bubbles.gif");
		Mtracker.addImage(aquariumImage, 0);

		try{
			Mtracker.waitForID(0);

		}catch (Exception ex){
			System.err.println(ex.getMessage());
		}

		setSize(aquariumImage.getWidth(this), aquariumImage.getHeight(this));
		setResizable(false);
		setVisible(true);

		//double buffering
		memoryImage = createImage(getSize().width, getSize().height);
		memoryGraphics = memoryImage.getGraphics();

		//thread running this class since it is runnable
		thread = new Thread(this);
		thread.start();

		//Window Close	
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		});
	}

	public static void main (String[] args)
	{
		new Aquarium();
	}

	public void run()
	{
		Rectangle edges = new Rectangle (0+getInsets().left, 0 
				+ getInsets().top, getSize().width - (getInsets().left 
						+ getInsets().right), getSize().height - (getInsets().top 
								+ getInsets().bottom));
		for (int loopIndex =0; loopIndex < numberFish; loopIndex++)
		{
			fishes.add(new Fish(fishImages[0], fishImages[1], edges, this));
			try
			{
				thread.sleep(20);
			}
			catch (Exception e)
			{
				System.err.println(e.getMessage());
			}
		}
		
		Fish fish;
		
		while (runOK)
		{
			for (int loopIndex = 0; loopIndex <numberFish; loopIndex++)
			{
				fish = (Fish)fishes.elementAt(loopIndex);
				fish.swim();
			}
			try
			{
				Thread.sleep(sleepTime);
			}
			catch (Exception e)
			{
				System.err.println(e.getMessage());
			}
			repaint();
		}

	}



}
