package gamemessage;

import game.Position;
import message.Message;

public class SingleUseToolMessage extends Message {

	/**
	 * ��ָʹ�õ���A���ߵ���B
	 */
	private static final long serialVersionUID = 1L;
	
	public Position p;
	public String UserID;
	
	public SingleUseToolMessage(String UserID) {
		this.type = 107;
		this.UserID = UserID;
		p = new Position();
	}
	
	/*
	 * \//����UserID�ҵ�GameState gamestate;
	 * Game_info gg = new Game_info(gamestate);
	 * RemoveAndDrop rad = new RemoveAndDrop(gg);
	 * rad.UseToolToRemove(Position p);
	 * 
	 * Game_infoMessage mess = new Game_infoMessage();
	 * mess.gg = gg
	 * \//����mess
	 */
}
