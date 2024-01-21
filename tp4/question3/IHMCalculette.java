package question3;

import question3.tp3.*;

import java.awt.*;
import javax.swing.*;
import java.util.Observer;
import java.util.Observable;

/**
 * 1.Chaque partie a son travail : Dans notre programme, il y a trois grandes parties :
 * le mod�le (qui garde les donn�es), la vue (qui montre les choses � l'utilisateur),
 * et le contr�leur (qui fait le lien entre le mod�le et la vue). Vue2 est juste une
 * nouvelle partie qui montre les informations. Elle ne change pas le travail des autres
 * parties.
 * 2.Observer : Vue2 regarde le mod�le. Quand le mod�le change (par exemple, si nous
 * ajoutons ou enlevons un nombre), il informe Vue2. Ainsi, Vue2 sait qu'il doit mettre
 * � jour ce qu'il montre. Cela se fait automatiquement et n'a pas besoin de changer le
 * mod�le.
 * 3.Vues s�par�es : Vue2 est ind�pendant. Cela signifie que son ajout ne d�range pas
 * les autres vues. Chaque vue s'occupe de ses propres affaires.
 * 4.Petits changements : Pour ajouter Vue2, nous modifions seulement la classe 
 * IHMCalculette. C'est comme ajouter un nouveau tableau dans une pi�ce sans changer
 * les autres meubles.
*/

public class IHMCalculette extends JFrame {
    public IHMCalculette() {
        super("IHM Calculette");
        PileModele<Integer> modele = new PileModele<Integer>(new Pile2<Integer>(5));
        Controleur controle = new Controleur(modele);
        Vue vue = new Vue(modele);
        Vue2 vue2 = new Vue2(modele);

        setLayout(new GridLayout(2, 1));
        add(vue);
        add(vue2);
        add(controle);
        pack();
        setLocation(200,200);
        setVisible(true);

    }

    public static void main(String[] args){
        new IHMCalculette();
    }
}


