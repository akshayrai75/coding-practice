import easy.ClaculateSqrt;

public class Main {
    public static void main(String[] args) {
        System.out.println(ClaculateSqrt.mySqrtSimple(0) + " : " + ClaculateSqrt.mySqrtBinarySearch(0));
        System.out.println(ClaculateSqrt.mySqrtSimple(1) + " : " + ClaculateSqrt.mySqrtBinarySearch(1));
        System.out.println(ClaculateSqrt.mySqrtSimple(2) + " : " + ClaculateSqrt.mySqrtBinarySearch(2));
        System.out.println(ClaculateSqrt.mySqrtSimple(3) + " : " + ClaculateSqrt.mySqrtBinarySearch(3));
        System.out.println(ClaculateSqrt.mySqrtSimple(4) + " : " + ClaculateSqrt.mySqrtBinarySearch(4));
        System.out.println(ClaculateSqrt.mySqrtSimple(8) + " : " + ClaculateSqrt.mySqrtBinarySearch(8));
        System.out.println(ClaculateSqrt.mySqrtSimple(9) + " : " + ClaculateSqrt.mySqrtBinarySearch(9));
        System.out.println(ClaculateSqrt.mySqrtSimple(13) + " : " + ClaculateSqrt.mySqrtBinarySearch(13));
        System.out.println(ClaculateSqrt.mySqrtSimple(16) + " : " + ClaculateSqrt.mySqrtBinarySearch(16));
        System.out.println(ClaculateSqrt.mySqrtSimple(25) + " : " + ClaculateSqrt.mySqrtBinarySearch(25));
        System.out.println(ClaculateSqrt.mySqrtSimple(625) + " : " + ClaculateSqrt.mySqrtBinarySearch(625));
        System.out.println(ClaculateSqrt.mySqrtSimple(225) + " : " + ClaculateSqrt.mySqrtBinarySearch(225));
        System.out.println(ClaculateSqrt.mySqrtSimple(400) + " : " + ClaculateSqrt.mySqrtBinarySearch(400));
        System.out.println(ClaculateSqrt.mySqrtSimple(2147395600) + " : " + ClaculateSqrt.mySqrtBinarySearch(2147395600));
    }
}