package tommaso;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        int[] a = new int[]{12, 13, 2};
        int[] b = new int[]{144, 169, 3};
        if (ControlloArray(a, b))
            System.out.println("Corretto!");
        else
            System.out.println("Sbagliato");


    }

    public static boolean ControlloArray(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (b[i] != (a[i] * a[i])) {

                    return false;
                }
            }//controllo se rispettato i criteri
        } else {//controllo se i 2 array hanno lunghezza uguale

            return false;
        }
        return true;
    }
}
