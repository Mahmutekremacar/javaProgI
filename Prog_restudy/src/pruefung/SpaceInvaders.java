package pruefung;

import java.util.Arrays;
//nicht erl
public class SpaceInvaders {
    char[][] Spielfeld;
//    public SpaceInvaders(char[][] tets)
    public char[][] erstelleSpielField(int anzahlSpalte)
    {
        Spielfeld = new char[anzahlSpalte][];

        for(int i = 0; i < anzahlSpalte; i ++)
        {
            Spielfeld[i] = new char[i];
            for(int j = 0 ; j < Spielfeld[i].length; j++)
            {
                Spielfeld[i][j] = 'o';
            }
        }
        return Spielfeld;
    }
    public static void main(String[] args)
    {
        SpaceInvaders test = new SpaceInvaders();
        char[][] neu = test.erstelleSpielField(6);
        System.out.println(Arrays.deepToString(neu));
    }

}
