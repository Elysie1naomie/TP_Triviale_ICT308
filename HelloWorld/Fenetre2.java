package Exo2_6;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Fenetre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame w = new Frame("Exemple de fenetre avec un FlowLayout");
		w.setLayout(new FlowLayout ());
		
		// ajout d'un nouveau button
		
		w.add(new Button ("Un Button"));
		
		// ajout d'un nouveau Label

		w.add(new Label ("Un Label"));
		
		// ajout d'un nouveau Textfield

		w.add(new TextField("Un Textfield"));
		w.show();
		w.pack();
	}

}
