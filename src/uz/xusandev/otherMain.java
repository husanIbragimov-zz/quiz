package uz.xusandev;

public class otherMain {
    public static void main(String[] args) {

//        butun son -----> %d
//        haqiqiy son ---> %f
//        satr ----------> %s
        String result = String.format("%02d:%02d:%02d",1,2,3);
        System.out.println(result);
        System.out.printf("%02d:%02d:%02d",1,2,3); // ===> formatlab chiqarish
    }
}
