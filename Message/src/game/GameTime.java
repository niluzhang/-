package game;

import java.util.TimerTask;

public class GameTime extends TimerTask{
	private GameState m;
	
	public GameTime(GameState m) {
		this.m = m;
	}
	
	public void run() {
		System.out.println("60s��ȥ�ˣ���Ϸ������!");
		System.out.println("����������� " + m.getMaxLianji());
		m.setFinished(true);
	}

}
