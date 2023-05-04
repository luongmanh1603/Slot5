package btslot5;
import java.util.Scanner;
public class Product
{
    int id;
    String productName;
    int qty ;
    float price;

    //nhap so luong
    public void nhapSL() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng hàng: ");
        qty = sc.nextInt();
    }

   public void ktraSL() {
       if(qty > 0){
           System.out.println("Còn hàng!!");
       } else {
           System.out.println("Hết hàng!!");
       }
   }
}
