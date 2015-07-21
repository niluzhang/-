package presentation_localgame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Startup;

public class singleGameGUI_methon extends singleGameGUI{
	public void initlizeGameValue(){
		state = 0;
        dropdirection=1;
       
		last_x = -1;// Ϊ-1ʱ��ʾ��ʼʱ
		last_y = -1;//
		// ����ĵ�ǰλ��
		now_x = -1;// -1��ʾ��ʼλ��
		now_y = -1;
		// ��ʾ���ߵĳ�ʼ��
		remindx1 = -1;
		remindx2 = -1;
		remindy1 = -1;
		remindy2 = -1;
		// ������ʼ��
		doublehitCount = 0;
		//�����ĳ�ʼ��
		grade=0;
		// ���������ĵ���
		perfectState = false;
		perfectStateStartTime = -1;
		blserver=new Bl_Server();
		gameRange.setGameRange(blserver.GetNewPane());
		gameRange.guiUpdateCount=0;
		// changeGameGUI();//���ڻ�ȡ�����㷨����Ľ���
	}
	public void initlizeGameFrame(){
		// frame���ĳ�ʼ��
				frame = new gameFrame();
				frame.setSize(1160, 630);
				frame.getContentPane().setLayout(null);
				frame.setUndecorated(true);
				ImageIcon titlepicture = new ImageIcon("src/bin/title.jpg");
				frame.setIconImage(titlepicture.getImage());
				frame.setBackground(new Color(0,0,0,0));
				frame.setLocationRelativeTo(null);
				frame.setFont(new Font("΢���ź�", Font.PLAIN, 18));
				frame.setVisible(true);
				frame.setDragable();
	}
	
	public int[][] getinitlizeGame(){
		//System.out.println("��ʼ��");
		int[][] result=new int[9][9];
		for (int i=0;i<9;i++){
			//System.out.println("");
			for(int j=0;j<9;j++){
				
				result[i][j]=(int) (Math.random()*7+1);
				//System.out.print("    "+result[i][j]);
			}
		}
		return result;
	}
	public void print(int[][] game,int length){
		System.out.println("AAA");
		for(int i=0;i<length;i++){
			System.out.println("");
			for(int j=0;j<length;j++){
				System.out.print(game[i][j]+"  ");
			}
		}
		
	}
	public int[][] getRebuildGame(){
		int[][] result=new int[9][9];
		for (int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				result[i][j]=0;
			}
		}
		return result;
	}
	class gameFrame extends JFrame{
		Point loc = null;
        Point tmp = null;
        boolean isDragged = false;
        public void setDragable() {
        frame.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseReleased(java.awt.event.MouseEvent e) {
        		isDragged = false;
        		frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        		}
        	public void mousePressed(java.awt.event.MouseEvent e) {
        		tmp = new Point(e.getX(), e.getY());
        		isDragged = true;
        		frame.setCursor(new Cursor(Cursor.MOVE_CURSOR));
        		}
        	});
        frame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
        	public void mouseDragged(java.awt.event.MouseEvent e) {
        		if(isDragged) {
        			loc = new Point(frame.getLocation().x + e.getX() - tmp.x,
        					frame.getLocation().y + e.getY() - tmp.y);
        			frame.setLocation(loc);
        			}
        		}
        	});
        }
        }
}
