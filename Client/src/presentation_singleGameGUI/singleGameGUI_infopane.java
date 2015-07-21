package presentation_singleGameGUI;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import presentation.mainui.MainFrame;

import main.Startup;



public class singleGameGUI_infopane extends singleGameGUI {
public void initlizeInfopane(){
	final InfoPanel infopanel = new InfoPanel();
	infopanel.setBounds(140, 25, 450, 70);
	infopanel.setOpaque(false);
	infopanel.setBackground(Color.CYAN);
	pane.add(infopanel);
	// infopanel�ĳ�ʼ��
	        infopanel.setLayout(null);
	      //  JOptionPane.showMessageDialog(frame, "src/bin/playerImg"+(Startup.window.uif.photo+1)+".png");
			ImageIcon fi=new ImageIcon(MainFrame.class.getResource("/img/"+Startup.window.mainframe.photo_id+".jpg"));
			final JLabel figurePhotoLabel=new JLabel(fi);
			figurePhotoLabel.setBounds(120, 20, 40, 40);
			infopanel.add(figurePhotoLabel);
	   gradelabel=new JLabel("     "+grade);
			gradelabel.setFont(new Font("΢���ź�", Font.PLAIN, 18));
			gradelabel.setBounds(330, 25, 100, 40);
			infopanel.add(gradelabel);
		 
		}


class InfoPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		java.net.URL imgurl = singleGameGUI.class.getResource("/bin/info.png");
		Image image = new ImageIcon(imgurl).getImage();
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
}

