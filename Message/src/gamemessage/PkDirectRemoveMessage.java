package gamemessage;

import message.Message;

public class PkDirectRemoveMessage extends Message{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String UserID;
	
	public PkDirectRemoveMessage(String UserID) {
		this.type = 102;
		this.UserID = UserID;
	}
	
	/*
	 * \//����UserID�ҵ�GameState gamestate;
	 * Game_info gg = new Game_info(gamestate);
	 * RemoveAndDrop rad = new RemoveAndDrop(gg);
	 * rad.DirectRemove();
	 * 
	 * if(gg.getGrade() != 0) {
	 * 		Game_infoMessage mess1 = new Game_infoMessage();
	 * 		mess1.gg = gg
	 * \//���͸����������Ϣmess1
	 * 
	 * 		PkGame_infoMessage mess2 = new PkGame_infoMessage();
	 * 		mess2.gg = gg
	 * } 
	 */
}
