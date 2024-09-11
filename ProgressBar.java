import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ProgressBar extends JFrame implements ChangeListener{
	
	JProgressBar bar;
	ProgressBar(){
		
		bar= new JProgressBar();
		bar.setValue(50);
		bar.setBounds(10,100,400,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("Consolas",Font.BOLD,20));
		bar.setForeground(Color.RED);
		
		add(bar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		setSize(500,500);
		
		Fill();
		
	}

	public static void main(String[] args) {
	
		
		ProgressBar bar= new ProgressBar();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void Fill(){
		int counter=0;
		
		while(counter<=100) {

			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter +=1;
		}
	}

}
