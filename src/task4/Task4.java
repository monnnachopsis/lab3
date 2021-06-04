package task4;
import java.util.Scanner;

class Number {
    int value,index;
    Number next;

    public Number(int value, Number next, int index) {
        this.value = value;
        this.next = next;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Number{" +
                "value=" + value +
                ", next=" + next +
                ", index=" + index +
                '}';
    }
}

public class Task4{
    static Scanner sc;
    public static Number createHead(int n){
        Number head = null;
        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            head = new Number(value, head, i);
        }
        return head;
    }
    public static double fSum(Number head) {
        double sum = 0;
        Number ref = head;
        while (ref.next != null) {
            if (ref.value % 2 != 0) {
                sum = sum + ref.value;
            }
            ref = ref.next;
        }
        if (ref.value % 2 != 0) {
            sum = sum + ref.value;
        }
        return sum;
    }

    public static double fCount(Number head) {
        double count = 0;
        Number ref = head;
        while (ref.next != null) {
            if (ref.value % 2 != 0) {
                count++;
            }
            ref = ref.next;
        }
        if (ref.value % 2 == 0) {
            count++;
        }
        return count;
    }

    public static int[] fMax(Number head, int n){
        Number ref = head;
        int indexmax = ref.index;
        int max = ref.value;
        while (ref != null){
            if(ref.value % 2 != 0 && ref.value < 0){
                if(ref.value > max) {
                    max = ref.value;
                    indexmax = ref.index;
                }
            }
            ref = ref.next;
        }
        return new int[]{indexmax,max};
    }


    public static int[] fMin(Number head, int n){
        Number ref = head;
        int indexmin = ref.index;
        int min = ref.value;
        while (ref != null){
            if(ref.value % 2 != 0 && ref.value < 0){
                if(ref.value < min) {
                    min = ref.value;
                    indexmin = ref.index;
                }
            }
            ref = ref.next;
        }
        return new int[]{indexmin,min};
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number head = createHead(n);

        System.out.println(head);
        double sum = fSum(head);
        System.out.println("сумма:" + sum);
        double count = fCount(head);
        System.out.println("количество:" + count);
        System.out.println("среднее значение:" + (double)sum/count);

        int max = fMax(head,n)[1];
        int indexmax = fMax(head,n)[0];

        int min = fMin(head,n)[1];
        int indexmin = fMin(head,n)[0];
    }

}