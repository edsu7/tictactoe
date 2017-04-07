import javax.swing.JFrame;


public class TicTacToe {
	public static void main(String[] args){
		JFrame TicTacToe = new TicTacToeFrame();
		TicTacToe.setTitle("TicTacToe game!");
		TicTacToe.setSize(600, 600);
		TicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TicTacToe.setLocationRelativeTo(null);
		TicTacToe.setVisible(true);
	}

}
