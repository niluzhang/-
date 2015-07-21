package dataservice;

import java.util.ArrayList;

import po.RecordPO;
import po.UserPO;

public interface DataService {
	
    //����ָ��id���û�����
	public UserPO queryUserByName(String name);
	
	//�����ݿ������һ���û�
	public boolean addUser(UserPO userPO);
	
	//����ָ��id�û�������
	public boolean updateUserByName(String name,UserPO userPO);
	
	//�����������ݿ����û����б�
	public ArrayList<UserPO> getAllUser();
	
	//���ذ���ָ��id�û�������Ϸ��¼������б�
	public ArrayList<RecordPO> getAllrecordByUserName(String userName);
	
	//�����ݿ������һ����Ϸ��¼
	public boolean addRecord(RecordPO recordPO);
	
}
