package loops;

import javax.swing.JOptionPane;

public class Ex34 {

	public static void main(String[] args) {

		Double pedroHeight, lucasHeight;

		int count = 0;

		pedroHeight = 1.50;

		lucasHeight = 1.10;

		do {

			pedroHeight += 0.02;

			lucasHeight += 0.03;

			count++;

		} while (pedroHeight > lucasHeight);

		JOptionPane.showMessageDialog(null, "It will take " + count + " years until Lucas is taller than Pedro.");

	}

}
