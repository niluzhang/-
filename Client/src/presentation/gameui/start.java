package presentation.gameui;

import java.io.IOException;

public class start {
public void state2() {
	String playerID1="��";
	String playerID2="��¡¡";
    collaborationGameGUI start=new collaborationGameGUI();
  
   
    collaborationGameGUI start1=new collaborationGameGUI();
    
   // start1.colgamemain(playerID2,"��Ա",false,false,false);
    try {
		start.colgamemain(playerID1,"����",false,false,false);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}
}
