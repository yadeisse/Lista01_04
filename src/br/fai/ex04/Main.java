package br.fai.ex04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start () {
		
		interarUsandoWhile();
		interarUsandoDoWhile();
		interarUsandoFor(); 
		
	}

	private void interarUsandoWhile() {
		int i = 0;

		while(i<20) {
			System.out.println("i: "+ i);
		}
			System.out.println("---------------");
	}
		

	private void interarUsandoDoWhile() {
		
		int k = 0;
		
		do {
			System.out.println("k: " + k);
			k += 1; 
		} while (k < 20); 
		
		System.out.println("------------");
		
	}

	private void interarUsandoFor() {

		for (int j = 0; j < 20; j++) {
			System.out.println("j: ");
		}
	}	
}