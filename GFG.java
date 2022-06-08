import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
public class GFG {
	public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 100;
        int aray[] = new int[10];
        for(int i = 0; i<10; i++){
            aray[i] = r.nextInt(high-low) + low;
        }
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any index no to find its element: ");
        int index = obj.nextInt();
        try {
            System.out.println("Value at index "+index+" is "+ aray[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}