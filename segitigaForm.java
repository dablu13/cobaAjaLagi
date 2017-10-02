public class segitigaForm(){
public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Masukin x   = ");
        x = input.nextInt();
        
        System.out.println("-----------------");
        System.out.println("Jika x =" + x);
        System.out.println("Maka Hasilnya  ");
        System.out.println("=====================");
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=====================");
    }
}
