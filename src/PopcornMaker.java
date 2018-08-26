import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("what is your popcorn of choice");
		String time = JOptionPane.showInputDialog("how long do you want to cook in minutes");
		int trutime = Integer.parseInt(time);
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(trutime);
		microwave.startMicrowave();
		popcorn.eat();
	}
}
