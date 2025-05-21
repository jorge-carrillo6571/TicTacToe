
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 


public class Tic implements ActionListener{
	private JFrame frame;
	private JPanel panel; 


	public Tic (){
	
		frame = new JFrame ("TicTacToe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(420,550);
//		frame.setLayout(null); esto no es necesario y causa errror con gridlayout 
		
                panel = new JPanel(new GridLayout(3,3,10,10));
		for (int i =0; i <9; i++){
			JButton button = new JButton ("H"); 
			panel.add(button); 
		}
	 
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);	

	}	

	@Override
	public void actionPerformed(ActionEvent e){

	}

}
