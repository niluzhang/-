package gamemessage;

import game.Position;
import message.Message;

public class PkUseToolMessage extends Message {

	/**
	 * ��ָʹ�õ���A���ߵ���B
	 */
	private static final long serialVersionUID = 1L;
	
	public Position p = new Position();
	public String UserID;
	
	public PkUseToolMessage(String UserID) {
		this.type = 104;
		this.UserID = UserID;
	}

	/*
	 * \//����UserID�ҵ�GameState gamestate;
	 * Game_info gg = new Game_info(gamestate);
	 * RemoveAndDrop rad = new RemoveAndDrop(gg);
	 * rad.UseToolToRemove(Position p);
	 * 
	 * Game_infoMessage mess1 = new Game_infoMessage();
	 * mess1.gg = gg
	 * \//���͸��������mess1
	 * 
	 * PkGame_infoMessage mess2 = new PkGame_infoMessage();
	 * mess2.gg = gg
	 * \//���͸�Pk���mess2
	 */
}
