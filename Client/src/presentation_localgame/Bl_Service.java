package presentation_localgame;

import java.util.ArrayList;

public interface Bl_Service {
	
	//ֱ��������Ϸ������������ĵط�
	public Game_info single_game(int[][]game_range);
	
	//����AB�ĵ���
	public Game_info prop_AB(int[][] game_layout,int x,int y);
	
	//����E�ĵ���
	public ArrayList<Position> prop_E(int[][] game_layout);
	
	//���ɳ���
	public int[][] GetNewPane();
	
	//������λ�ú���������Ϸ�����ѽ���
	public Game_info single_game(int[][]game_range, Position p1, Position p2);
}
