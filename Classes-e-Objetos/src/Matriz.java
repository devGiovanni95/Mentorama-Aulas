package src;
public class Matriz {
    public static void main(String[] args) {
//        int[]  semana = new int[7];
        int[] []  calendario = new int[5] [7];
        int dia = 0;

        for (int i = 0; i < 5; i++) {

            for (int x = 0; x < 7; x++) {
                dia++;
                calendario[i] [x] = dia;
//                System.out.println(dia);
            }
        }

    for (int i = 0; i < calendario.length; i++) {
        for (int x = 0; x < calendario[i].length; x ++) {
            System.out.print(calendario[i][x] + " ");
        }
        System.out.println(" ");
    }

    }
}
