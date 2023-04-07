package com.dal.array;
import java.awt.*;
import java.awt.event.*;

class FrameExample 
{
 	private Frame f;
 	public FrameExample() 	{
     		f = new Frame("Hello .....!");
 	}
 	public void launchFrame() 
	{
 		f.setSize(170,170);
	 	f.setBackground(Color.green);
	 	f.setVisible(true);	
	// Add a window listener
	
	 f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent evt)
	{
		System.exit(0);
	}
	});   //Anonymous Inner Classes 

	 }



 	public static void main(String args[]) 
	{
		FrameExample f = new FrameExample();
		f.launchFrame();
	}
}

