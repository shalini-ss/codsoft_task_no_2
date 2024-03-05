import java.util.Scanner;
public class studentgrade {
    public static void main(String[]args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in 5 subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int total =m1+m2+m3+m4+m5;
        float per=total/5;
        System.out.println("total :" +total);
        System.out.println("percentage: "+per);
        System.out.print("Grade = ");
        if(per>=90)
        System.out.println("Grade A");
        else if(per>=80)
        System.out.println("Grade B");
        else if (per>=70)
        System.out.println("Grade C");
        else if(per>=50)
        System.out.println("Grade D");
        else if(per>=30)
        System.out.println("Grade E");
        else
        System.out.println("grade F");
    }
}
