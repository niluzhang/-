package presentation_localgame;



import java.util.Scanner;


/*�÷�����ʵ�ֹ��ܣ�
 * 1��ÿ�����ƶ�����ʱ��gameRange�����仯ʱ��lastDoubleHitTime��lastTwoHitTimeˢ��
 * */
public class singleGameGUI_getMoveThread extends Thread {
	private singleGameGUI game;
	public singleGameGUI_getMoveThread(singleGameGUI game){
		this.game=game;
	}
	@Override
	public void run(){

			//����ƶ� ��Դ�������淽�����غͶ���Զ�̻��
		while(true){
			//���ܶ����ƶ�����Ϣ
			
			
				if(game.gamepanel.getIsmovestate()==2&&game.state==1){
					Bl_Server blserver=new Bl_Server();
					Game_info gameinfo=blserver.single_game(game.gameRange.gameRange);
					if(gameinfo.getGrade()!=0){
					game.grade+=gameinfo.getGrade();
					game.lastTwoHitTime=game.lastDoubleHitTime;
					game.lastDoubleHitTime=game.timerObject.getTime();
					game.doublehitState=false;
					System.out.println("ssssss");
					}
					game.gameRange.gameRange=gameinfo.getAfterdeleteRange();
					game.rebuildGameRange=gameinfo.getNewAddRange();
					game.gameRange.guiUpdateCount=0;
	            
				}
				
			try {
				sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
			
		
	}

}
