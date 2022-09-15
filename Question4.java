public class Question4 {
    public static void main(String args[]){
        int a = 70;
        int b = 90;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapping using temp variable: a="+ a+", b="+b);
        int c=10;
        int d=80;
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("Swapping without using temp variable: c="+ c+", d="+d);
    }
}
