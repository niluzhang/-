package presentation_localgame;

//��Ϸʱ��ļ�ʱ��������ʱ����
public class gameTimer extends Thread {
	private int currenttime;

	// private int maxtime;
	public gameTimer(int time) {
		currenttime = time;

	}

	public int getTime() {
		return currenttime;
	}

	@Override
	public void run() {
		while (currenttime > 0) {
			try {
				sleep(50);// ����˯0.s
				currenttime--;
				// System.out.println("ʱ��Ϊ��"+currenttime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//
		}
	}
}