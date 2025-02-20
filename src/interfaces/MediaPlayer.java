package interfaces;

public interface MediaPlayer {
	
	void selectMedia(String name);
    void play();
    void pause();
    void stop();
    void previousMedia();
    void nextMedia();
}
