package JavaPattern;

public class HalfPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int Row=1; Row<=n; Row++){
            for(int Column=1; Column<=Row; Column++){
                System.out.print(Column);
        }
        System.out.println();
    }
}
}
