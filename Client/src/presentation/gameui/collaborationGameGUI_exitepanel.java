package presentation.gameui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;






public class collaborationGameGUI_exitepanel extends collaborationGameGUI {
	public void initlizeExitepanel(){
		ClosePanel exitpanel = new ClosePanel();
		exitpanel.setBounds(0, 0, 1160, 31);
		exitpanel.setBackground(Color.blue);
		exitpanel.setOpaque(false);
		exitpanel.setLayout(null);
		pane.add(exitpanel);
	// exitpanel ���
	
			final MyLabel mylabel1 = new MyLabel("\u00D7");
			mylabel1.setBounds(1130, 0, 30, 30);
			mylabel1.setFont(new Font("΢���ź�", Font.PLAIN, 24));
			mylabel1.setForeground(new Color(220, 227, 29));
			mylabel1.setToolTipText("�˳�");
			exitpanel.add(mylabel1);
			mylabel1.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					// �����е�ʱ�Ӻ��߳�ȫ��ͣ����
					
					//gradetimer.cancel();
					//timeCaulater.cancel();
					remindthread.stop();
				
					updatethread.stop();
					up.stop();
					frame.dispose();
					System.exit(0);
					// ������һ�����棬�����棬����ȷ���˳���ʾȷ��
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					mylabel1.setForeground(Color.RED);
					mylabel1.setFont(new Font("΢���ź�", Font.PLAIN, 24));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					mylabel1.setForeground(new Color(220, 227, 29));
					mylabel1.setFont(new Font("΢���ź�", Font.PLAIN, 24));
				}

			});
			final MyLabel mylabel2 = new MyLabel("-");
			mylabel2.setBounds(1080, 0, 30, 30);
			mylabel2.setFont(new Font("΢���ź�", Font.PLAIN, 24));
			mylabel2.setForeground(new Color(220, 227, 29));
			mylabel2.setToolTipText("����");
			exitpanel.add(mylabel2);
			mylabel2.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					frame.setExtendedState(JFrame.ICONIFIED);
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					mylabel2.setForeground(Color.RED);
					mylabel2.setFont(new Font("΢���ź�", Font.PLAIN, 24));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					mylabel2.setForeground(new Color(220, 227, 29));
					mylabel2.setFont(new Font("΢���ź�", Font.PLAIN, 24));
				}

			});
			
}
	class ClosePanel extends JPanel {
		private static final long serialVersionUID = 1L;

		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.BLACK);
			g.setFont(new Font("΢���ź�", Font.PLAIN, 16));
			g.fillRoundRect(0, 0, this.getWidth(), this.getHeight(),5,5);
		}
	}
}
