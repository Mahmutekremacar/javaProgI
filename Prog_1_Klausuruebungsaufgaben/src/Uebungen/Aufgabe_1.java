package Uebungen;

import java.lang.reflect.Array;

public class Aufgabe_1 {

    /*
     a) Schreiben Sie eine Methode ersetze, die Punkte in einem Dateinamen durch einen Unterstrich
    ersetzt, aber nicht den Punkt vor der Datei-Erweiterung. Die Datei-Erweiterung sind die letzten
    drei Zeichen des Dateinamens. Der Dateinamen wird der Methode als char-Array übergeben.
    Der Rückgabewert der Methode ist die Anzahl der umgewandelten Zeichen.
    b) Schreiben Sie eine main-Methode, in der Sie mit Hilfe der Methode ersetze im String
    „Graphik.Init.Datei.ini“ die Punkte ersetzen. Geben Sie den veränderten Dateinamen auf der
    Standardausgabe aus.
        Hinweis: Aus der Klasse String dürfen Sie nur die Methode toCharArray() benutzen.
     */
    /*
    a) Write a replace method that replaces periods in a file
    name with an underscore, but not the period before the file extension.
    The file extensions are the last
    three characters of the file name.
    The file name is passed to the method as a char array. The return value of
    the method is the number of characters converted.

    b) Write a main method in which you use the replace method to replace the
    points in the string “Graphic.Init.File.ini”. Output the changed file name to
     standard output.*/


    static int ersetze(String name)
    {
        char ch = '_';
        int total = 0;
        char punkt = '.';
        char[] input = name.toCharArray();
        for(int i = 0; i < name.length() ; i++)
        {
            if(input[i] == punkt)
            {
                total +=1;
                //input[i] = ch;
            }
        }
        for(int i = 0; i < name.length(); i++)
        {
            if (input[i] == punkt)
            {
                if(total > 1)
                {
                    input[i] = ch;
                    total -= 1;
                }
            }

        }
        String name_neu = String.valueOf(input);
        System.out.println(name_neu);
        return total;
    }
    public static void main(String[] args)
    {
    ersetze("Datei.bruh.bruh");
    ersetze("Graphik.Init.Datei.ini");
    }

}
