package JavaPattern;

public class InvertedPattern {
    public static void main(String[] args) {
        int n=5;
        for(int Row=1; Row<=n; Row++){
            for(int Column=1; Column<=n-Row+1; Column++){
                System.out.print(" *");

            }
            System.out.println();
        }
    }
}
