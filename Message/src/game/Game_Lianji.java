package game;

import java.util.TimerTask;

public class Game_Lianji extends TimerTask{
	private GameState m;
	
	public Game_Lianji(GameState m) {
		this.m = m;
	}
	
	public void run() {
		System.out.println("In Game_Lianji�� ����ʱ����: "+ m.Getlianji_time() + "s��!");
		m.setPass_LianjiTime(true);
		m.setLianji(0);
	}
}
