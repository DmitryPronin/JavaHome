import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = {0,0,0,0,8,1,1,1,1};
        for (int i : array){
            System.out.print(i);

        }

        for (int i = 0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        System.out.println();
        for (int i : array){
            System.out.print(i);
        }
    }
}
