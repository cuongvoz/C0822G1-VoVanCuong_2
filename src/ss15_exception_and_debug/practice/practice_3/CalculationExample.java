package ss15_exception_and_debug.practice.practice_3;

public class CalculationExample {
    public static void main(String[] args) {
     CalculationExample calculationExample = new CalculationExample();
     calculationExample.caculate(0,1);

    }
    private void caculate(int x,int y) {
     try {
         int a = x + y;
         int b = x - y;
         int c = x / y;
         int d = x * y;
         System.out.println("Tổng của x + y: " + a );
         System.out.println("Hiệu của x - y: " + b);
         System.out.println("Tích của x * y: " + d);
         System.out.println("Thương của x / y: " + c);
     } catch (Exception e) {
         System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
     }

    }
}
