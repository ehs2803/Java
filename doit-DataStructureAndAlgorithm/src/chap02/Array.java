package chap02;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int []b = a.clone();
        int [] c= new int[]{10,11,12,13};

        for(int i=0;i<a.length;i++) System.out.println(b[i]);
        System.out.println(maxOf(c));

        /////////////////////////////////////////////////////////

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90); // 0~n-1 난수
            System.out.println("height[" + i + "]：" + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }

    static int maxOf(int[] a){
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max) max=a[i];
        }
        return max;
    }
}
