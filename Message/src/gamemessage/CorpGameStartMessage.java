package gamemessage;

import java.util.ArrayList;

import message.Message;

//Э��ģʽ��Ϸ��ʼ��Ϣ
public class CorpGameStartMessage extends Message {
	
	private static final long serialVersionUID = 1L;
	
	public boolean UseTool_C;
	public boolean UseTool_D;
	public boolean UseTool_E;
	
	//public boolean DropFromTop;
	
	public ArrayList<String> UseID;
	
	public CorpGameStartMessage() {
		this.type = 112;
	}
	/*
	 * GameState gamestate = new GameState();
	 * \//����UserID��gamestate,�´���Ҫ�ܸ���UserID�ҵ�GameState��ת������һ����
	 * GameStateMessage mess = new GameStateMessage();
	 * mess.CurrentGameState = gamestate;
	 * \//��Э������ҷ���mess;
	 */
}
