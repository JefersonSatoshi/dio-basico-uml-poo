package records;

import interfaces.MediaPlayer;

public record VideoPlayer() implements MediaPlayer {

	@Override
	public void selectMedia(String name) {
		System.out.println("O vídeo " + name + " foi escolhido!");
	}

	@Override
	public void play() {
		System.out.println("O vídeo começou a reproduzir!");
	}

	@Override
	public void pause() {
		System.out.println("O vídeo foi pausado!");
	}

	@Override
	public void stop() {
		System.out.println("O vídeo parou de reproduzir!");
	}

	@Override
	public void previousMedia() {
		System.out.println("O vídeo anterior foi escolhido!");
	}

	@Override
	public void nextMedia() {
		System.out.println("O próximo vídeo foi escolhido!");
	}
}
