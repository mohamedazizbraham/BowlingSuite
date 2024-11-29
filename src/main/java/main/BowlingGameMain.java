package main;

import bowling.IPartieMultiJoueurs;
import bowling.Partie;

import java.util.Random;

public class BowlingGameMain {
	public static void main(String[] args) {
		IPartieMultiJoueurs partie = new Partie();
		partie.demarreNouvellePartie(new String[]{"Pierre", "Paul"});
		Random rand = new Random();
		int nbQuillesTombeesL1;
		int nbQuillesTombeesL2;
		float proba;

		for (int i = 1; i < 10; i++) {
			System.out.println("Tour n°" + i);
			// Tour de Mario
			proba = rand.nextFloat();
			if (proba > 0.8) partie.enregistreLancer(10);
			else if (proba > 0.3) {
				nbQuillesTombeesL1 = rand.nextInt(0, 10);
				nbQuillesTombeesL2 = 10-nbQuillesTombeesL1;
				partie.enregistreLancer(nbQuillesTombeesL1);
				partie.enregistreLancer(nbQuillesTombeesL2);
			}
			else {
				nbQuillesTombeesL1 = rand.nextInt(0, 10);
				nbQuillesTombeesL2 = rand.nextInt(0, 10-nbQuillesTombeesL1);
				partie.enregistreLancer(nbQuillesTombeesL1);
				partie.enregistreLancer(nbQuillesTombeesL2);
			}
			System.out.println("Score de Pierre: " + partie.scorePour("Pierre"));

			// Tour de Peach
			proba = rand.nextFloat();
			if (proba > 0.95) partie.enregistreLancer(10);
			else if (proba > 0.7) {
				nbQuillesTombeesL1 = rand.nextInt(0, 10);
				nbQuillesTombeesL2 = 10-nbQuillesTombeesL1;
				partie.enregistreLancer(nbQuillesTombeesL1);
				partie.enregistreLancer(nbQuillesTombeesL2);
			}
			else {
				nbQuillesTombeesL1 = rand.nextInt(0, 10);
				nbQuillesTombeesL2 = rand.nextInt(0, 10-nbQuillesTombeesL1);
				partie.enregistreLancer(nbQuillesTombeesL1);
				partie.enregistreLancer(nbQuillesTombeesL2);
			}
			System.out.println("Score de Paul: "+ partie.scorePour("Paul"));

			
		}

		// Dernier tour de Mario
		proba = rand.nextFloat();
		if (proba > 0.95) {
			partie.enregistreLancer(10);
			partie.enregistreLancer(10);
		}
		else if (proba > 0.85) {
			partie.enregistreLancer(10);
			partie.enregistreLancer(rand.nextInt(0, 10));
		}
		else if (proba > 0.3) {
			nbQuillesTombeesL1 = rand.nextInt(0, 10);
			nbQuillesTombeesL2 = 10-nbQuillesTombeesL1;
			partie.enregistreLancer(nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL2);
			partie.enregistreLancer(rand.nextInt(0, 10));
		}
		else {
			nbQuillesTombeesL1 = rand.nextInt(0, 10);
			nbQuillesTombeesL2 = rand.nextInt(0, 10 - nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL2);
		}

		// Dernier tour de Peach
		proba = rand.nextFloat();
		if (proba > 0.99) {
			partie.enregistreLancer(10);
			partie.enregistreLancer(10);
		}
		else if (proba > 0.93) {
			partie.enregistreLancer(10);
			partie.enregistreLancer(rand.nextInt(0, 10));
		}
		else if (proba > 0.7) {
			nbQuillesTombeesL1 = rand.nextInt(0, 10);
			nbQuillesTombeesL2 = 10-nbQuillesTombeesL1;
			partie.enregistreLancer(nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL2);
			partie.enregistreLancer(rand.nextInt(0, 10));
		}
		else {
			nbQuillesTombeesL1 = rand.nextInt(0, 10);
			nbQuillesTombeesL2 = rand.nextInt(0, 10 - nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL2);
		}

		// Dernier tour de Luigi
		proba = rand.nextFloat();
		if (proba > 0.1) {
			partie.enregistreLancer(10);
			partie.enregistreLancer(10);
		}
		else if (proba > 0.05) {
			partie.enregistreLancer(10);
			partie.enregistreLancer(rand.nextInt(0, 10));
		}
		else if (proba > 0.01) {
			nbQuillesTombeesL1 = rand.nextInt(0, 10);
			nbQuillesTombeesL2 = 10-nbQuillesTombeesL1;
			partie.enregistreLancer(nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL2);
			partie.enregistreLancer(rand.nextInt(0, 10));
		}
		else {
			nbQuillesTombeesL1 = rand.nextInt(0, 10);
			nbQuillesTombeesL2 = rand.nextInt(0, 10 - nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL2);
		}

		// Dernier tour de Toad
		proba = rand.nextFloat();
		if (proba > 0.99) {
			partie.enregistreLancer(10);
			partie.enregistreLancer(10);
		}
		else if (proba > 0.98) {
			partie.enregistreLancer(10);
			partie.enregistreLancer(rand.nextInt(0, 10));
		}
		else if (proba > 0.9) {
			nbQuillesTombeesL1 = rand.nextInt(0, 10);
			nbQuillesTombeesL2 = 10-nbQuillesTombeesL1;
			partie.enregistreLancer(nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL2);
			partie.enregistreLancer(rand.nextInt(0, 10));
		}
		else {
			nbQuillesTombeesL1 = rand.nextInt(0, 10);
			nbQuillesTombeesL2 = rand.nextInt(0, 10 - nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL1);
			partie.enregistreLancer(nbQuillesTombeesL2);
		}

		System.out.println("Les scores finals sont: -----");
		System.out.println("----------------------------------");
		System.out.println("Score de Pierre: "+partie.scorePour("Pierre"));
		System.out.println("Score de Paul: "+partie.scorePour("Paul"));
		
	}
}