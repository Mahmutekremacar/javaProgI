package pruefung;

import java.util.Arrays;
//nicht erl
public class SpaceInvaders {

char [] [] Spielfeld;

    public void setSpielfeld() {
        this.Spielfeld = new char[5] [8];
    }
    public SpaceInvaders(){
        setSpielfeld();
        for(int i = 0; i < 8 ; i++){
            Spielfeld[0][i]= 'o';
        }
        for(int j = 1 ; j <4  ; j++){
            for(int k= 0 ; k < 8; k++){
                Spielfeld[j][k ] = ' ';
            }
        }
        Spielfeld[4][(int )(Math.random() * 7)] = 'V';
    }
    public static void Grafik(SpaceInvaders spaceinv)
    {
        System.out.println(spaceinv.Spielfeld[0]);
        System.out.println(spaceinv.Spielfeld[1]);
        System.out.println(spaceinv.Spielfeld[2]);
        System.out.println(spaceinv.Spielfeld[3]);
        System.out.println(spaceinv.Spielfeld[4]);
    }

    public static void main(String[] args)
    {
        SpaceInvaders test = new SpaceInvaders();
        //System.out.println(Arrays.deepToString(test.Spielfeld));
        Grafik(test);
    }
}