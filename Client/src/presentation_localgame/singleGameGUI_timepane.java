package presentation_localgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.plaf.ProgressBarUI;






public class singleGameGUI_timepane extends singleGameGUI {
	public void initlizeTimepane() {
		// timepanel�ĳ�ʼ��
		final TimePanel timepanel = new TimePanel();
		timepanel.setBounds(530, 90, 70, 445);
		timepanel.setOpaque(true);
		// timepanel.setBackground(Color.orange);
		pane.add(timepanel);
		timejpb = new JProgressBar();
		timejpb.setStringPainted(true);
		timejpb.setBackground(Color.yellow);
		timejpb.setForeground(Color.pink);
		timejpb.setPreferredSize(new Dimension(20, 370));
		timejpb.setOrientation(JProgressBar.VERTICAL);
		
		//timejpb.paint(g);
		final JLabel timelabel1 = new JLabel("   " );
		timelabel1.setPreferredSize(new Dimension(50, 40));
		timepanel.add(timelabel1);
		 timelabel3 = new JLabel("   "+time );
		timelabel3.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		timelabel3.setPreferredSize(new Dimension(50, 15));
		timepanel.add(timelabel3);
		timepanel.add(timejpb);

		timejpb.setMaximum(time * 20);
		timerObject = new gameTimer(time * 20);
		timerObject.start(); // ��ʱ������������ȴ�ͨ�ŵĽ�����ɣ�����ʹ˫����ʱ�䱣��һ��
		doublehitCount = 0; // ͬʱ������Ŀ��ʼ��
		lastDoubleHitTime = timerObject.getTime(); // �ϴ�����ʱ���ʼ��
		lastTwoHitTime = -1;// ���ǵڶ�������ʱ���ʼ��
	//	timeCaulater = new Timer(true);
		doublehitState = false;
		// System.out.println("DDD");
	
	}

	class TimePanel extends JPanel {
		private static final long serialVersionUID = 1L;

		@Override
		public void paintComponent(Graphics g) {
			// super.paint(g);
			// g.drawString("ʱ����", 0, 10);
			java.net.URL imgurl = singleGameGUI.class
					.getResource("/bin/timePane.png");
			Image image = new ImageIcon(imgurl).getImage();
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);

		}
	}
	
}
