
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 


public class Tic implements ActionListener{
	private JFrame frame;


	public Tic (){
	
		frame = new JFrame ("TicTacToe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(420,550);
		frame.setLayout(null);
		frame.setVisible(true); 

	}	

	@Override
	public void actionPerformed(ActionEvent e){

	}

}
