package interfaces;

public interface Phone {
	
	void makeCall(String phoneNumber);
    void answerCall();
    void hangUp(); 
    void startVoicemail();
    void selectContact(String contactName);
}
