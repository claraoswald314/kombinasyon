import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman sayısı : ");
        int n = scan.nextInt();
        System.out.print("Grup sayısı : ");
        int r = scan.nextInt();

        int total = 1;
        int total1 = 1;
        int total2 = 1;
        int sonuc =1;

        for(int i = 1; i<=n; i++){
            total = total*i;
        }
        for(int i = 1; i<=r; i++){
            total1 = total1*i;
        }
        for(int i = 1; i<=(n-r); i++){
            total2 = total2*i;
        }
        sonuc = (total)/(total1*(total2));


        System.out.println(n+" sayısının " +r+" sayılı kombinasyonu : "+sonuc);

    }
}
