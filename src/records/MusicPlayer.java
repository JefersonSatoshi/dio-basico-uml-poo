package records;

import interfaces.MediaPlayer;

public record MusicPlayer() implements MediaPlayer {

	@Override
	public void selectMedia(String name) {
		System.out.println("A música " + name + " foi escolhida!");
	}

	@Override
	public void play() {
		System.out.println("A música começou a tocar!");
	}

	@Override
	public void pause() {
		System.out.println("A música foi pausada!");
	}

	@Override
	public void stop() {
		System.out.println("A música parou de tocar!");
	}

	@Override
	public void previousMedia() {
		System.out.println("A música anterior foi escolhida!");
	}

	@Override
	public void nextMedia() {
		System.out.println("A próxima música foi escolhida!");
	}
}
