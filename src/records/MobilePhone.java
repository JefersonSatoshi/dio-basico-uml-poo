package records;

import interfaces.Phone;

public record MobilePhone() implements Phone {

	@Override
	public void makeCall(String phoneNumber) {
		System.out.println("Ligando para " + phoneNumber);
	}

	@Override
	public void answerCall() {
		System.out.println("Chamada atendida!");
	}

	@Override
	public void hangUp() {
		System.out.println("Chamada finalizada!");
	}

	@Override
	public void startVoicemail() {
		System.out.println("Iniciando correio de voz...");
	}

	@Override
	public void selectContact(String contactName) {
		System.out.println("O contato " + contactName + " foi selecionado(a)!");
	}
}
