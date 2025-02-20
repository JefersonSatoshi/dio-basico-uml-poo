package application;

import interfaces.Browser;
import interfaces.MediaPlayer;
import interfaces.Phone;
import records.MobilePhone;
import records.MusicPlayer;
import records.Safari;
import records.VideoPlayer;

public class Main {

	public static void main(String[] args) {

		playMusic("Quando a luz se apagar");

		playVideo("Interstellar");

		usePhone("99877-5036", "Maria Chiquinha");

		useBrowser("www.google.com");
	}

	public static void playMusic(String song) {
		System.out.println("***Reprodutor de Música***");
		MediaPlayer music = new MusicPlayer();
		music.selectMedia(song);
		music.play();
		music.pause();
		music.stop();
		music.previousMedia();
		music.nextMedia();
		System.out.println();
	}

	public static void playVideo(String video) {
		System.out.println("***Reprodutor de Vídeo***");
		MediaPlayer videoPlayer = new VideoPlayer();
		videoPlayer.selectMedia(video);
		videoPlayer.play();
		videoPlayer.pause();
		videoPlayer.stop();
		videoPlayer.previousMedia();
		videoPlayer.nextMedia();
		System.out.println();
	}

	public static void usePhone(String numberPhone, String contact) {
		System.out.println("***Aparelho Telefônico***");
		Phone phone = new MobilePhone();
		phone.makeCall(numberPhone);
		phone.answerCall();
		phone.hangUp();
		phone.startVoicemail();
		phone.selectContact(contact);
		System.out.println();
	}

	public static void useBrowser(String url) {
		System.out.println("***Navegador de Internet***");
		Browser safari = new Safari();
		safari.openNewPage();
		safari.displayPage(url);
		safari.refreshPage();
		System.out.println();
	}

}
