package my.practice1;

public class Part3 {
    public static void main(String[] args) {
        int indexOfFinalElement = args.length-1;
        for (int i=0; i<indexOfFinalElement; i++){
            System.out.print(args[i]+" ");
        }
        System.out.print(args[indexOfFinalElement]);
    }
}
