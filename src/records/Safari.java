package records;

import interfaces.Browser;

public record Safari() implements Browser {

	@Override
	public void displayPage(String url) {
		System.out.println("Carregando página!");
	}

	@Override
	public void openNewPage() {
		System.out.println("Nova aba aberta!");
	}

	@Override
	public void refreshPage() {
		System.out.println("Atualizando página!");
	}

}
