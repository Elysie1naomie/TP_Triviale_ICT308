package Exo2_6;

/*
 * @auteur: Minkoua Naomie
 
 * */
 
import java.awt.*;
public class EssaiFenetre1
{
	public static void main(String[] args)
	{
		Frame f =new Frame("Ma première fenêtre");
		Button b= new Button("coucou");
		f.add(b);
		f.pack();
		f.show();
	}
}
