package presentation_localgame;

import javax.swing.JOptionPane;

public class singleGameGUI_updateThread extends Thread {
	singleGameGUI game;
	public singleGameGUI_updateThread(singleGameGUI game){
		this.game=game;
	}
@Override
public void run(){
	while(true){
	
		singleGameGUI.frame.repaint();
		singleGameGUI.frame.validate();
		//System.out.println("QQQQQ");
		game.time = game.timerObject.getTime() / 20;
		int times = game.timerObject.getTime();
		game.timejpb.setValue(times);
	     game.timelabel3.setText(""+game.time);
	     game.gradelabel.setText("   "+game.grade);
		// timejpb.setToolTipText(""+time);
		//timepanel.repaint();
		if (times <= 0) {
			
			JOptionPane.showMessageDialog(game.frame, "游戏结束");
			game.frame.dispose();
			
			game.getMove.stop();
	    
		
			game.remindthread.stop();
			resultGUI   resultgui=new resultGUI(game.grade," 游客  ","头像");
			resultGUI.showtime(game.grade);	
			game.updatethread.stop();
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
