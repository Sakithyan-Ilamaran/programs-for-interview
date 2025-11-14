package Zohocodinground.arrays.twopointers;

public class ClosesOfTwo {
    public static void main(String[] args) {
        System.out.println(findClosest(2,7,4));

    }

    public static int findClosest(int x, int y, int z) {
        int p1 = Math.abs(x - z);
        int p2 = Math.abs(y - z);
        if (p1 == p2) return 0;
        if (p1 < p2 ) return 1;
        return 2;
    }
}
