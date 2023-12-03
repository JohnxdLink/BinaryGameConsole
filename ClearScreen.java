package game;

public class ClearScreen {
	public void clrScreen() {
		try {	
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}