import java.text.DecimalFormat;

public class Villes {

    private static DecimalFormat df = new DecimalFormat("0.00");


    public static void afficherTab(int[][] tab2d){
        int nbLignes = tab2d.length;
        int nbColonnes = tab2d[0].length;
        for (int i = 0; i < nbLignes; i++){
            for (int j = 0; j < nbColonnes; j++){
                System.out.print(tab2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sommeUneLigne(int[][] tab2d, int indice){
        int somme = 0;
        for (int i = 0; i < tab2d[indice].length; i++){
            somme += tab2d[indice][i];
        }
        return somme;
    }

    public static String moyenneUneLigne(int[][] tab2d, int indice){
        double moyenne = 0;
        int somme = 0;
        for (int i = 0; i < tab2d[indice].length; i++){
            somme += tab2d[indice][i];
        }
        moyenne = somme*1.0/tab2d[indice].length;
        return df.format(moyenne);
    }

    public static double moyenneUneCol(int[][] tab2d, int indice){
        double moyenne = 0;
        int somme = 0;
        for (int i = 0; i < tab2d.length; i++){
            somme += tab2d[i][indice];
        }
        moyenne = somme*1.0/tab2d.length;
        return moyenne;
    }

    public static int maxLigne(int[][] tab2d, int indice){
        int max = tab2d[indice][0];
        for (int i = 0; i < tab2d[indice].length; i++){
            if (max < tab2d[indice][i]){
                max = tab2d[indice][i];
            }
        }
        return max;
    }

    public static int minLigne(int[][] tab2d, int indice){
        int min = tab2d[indice][0];
        for (int i = 0; i < tab2d[indice].length; i++){
            if (min > tab2d[indice][i]){
                min = tab2d[indice][i];
            }
        }
        return min;
    }

}
