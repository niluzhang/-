package message;

//ע�ᣨ������Ϣ��
public class RegisterBackMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String register_back_info;
	
	public RegisterBackMessage(String back_info){
		this.register_back_info = back_info;
		type = 1;
	}
}
