package presentation.gameui;

import java.io.IOException;

public class startnext {
	public void state1(){
		String playerID1="��";
		String playerID2="��¡¡";
	    collaborationGameGUI start=new collaborationGameGUI();
	  
	   
	    collaborationGameGUI start1=new collaborationGameGUI();
	    
	    try {
			start1.colgamemain(playerID2,"��Ա",false,false,false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   // start.colgamemain(playerID1,"����",false,false,false);
	    
	}
}
