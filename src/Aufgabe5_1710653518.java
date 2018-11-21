public class Aufgabe5_1710653518 {

    public static void main (String[]args){

        int zahl1 = 1;
        int zahl2 = 10;

        System.out.println((zahl1++)+", "+(zahl2++));
        System.out.println((++zahl1)+", "+(++zahl2));

        /* bei zahl++ wird zuerst der Code ausgeführt und danach die zahl um eins erhöht, wobei
         * bei ++zahl die zahl zuerst ehöht wird und erst danach wird der Code ausgeführt*/
    }
}
