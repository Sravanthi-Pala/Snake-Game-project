package play;
 import javax.swing.JFrame;
 import java.awt.Dimension;
 import play.GameFrame;
 import play.SnakePanel;
public class GameFrame extends JFrame{

	
	public static void Frame() {
		GameFrame gm = new GameFrame();
		SnakePanel gp = new SnakePanel();

		gm.setTitle("Snake Game");
		gm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gm.setResizable(false);

		gm.add(gp); 

		gp.setPreferredSize(new Dimension(SnakePanel.panelwidth, SnakePanel.panelheight));

		gm.pack();
		gm.setVisible(true);
		gm.setLocationRelativeTo(null); 
	}
}
