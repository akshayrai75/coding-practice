import easy.SearchInsertPos;

public class Main {
    public static void main(String[] args) {
        System.out.println(SearchInsertPos.searchInsert(new int[] {1,3,5,6}, 5));
        System.out.println(SearchInsertPos.searchInsert(new int[] {1,3,5,6}, 2));
        System.out.println(SearchInsertPos.searchInsert(new int[] {1,3,5,6}, 3));
        System.out.println(SearchInsertPos.searchInsert(new int[] {1,3,5,6}, 7));
        System.out.println(SearchInsertPos.searchInsert(new int[] {1,2,3,4,5,10}, 2));
        System.out.println(SearchInsertPos.searchInsert(new int[] {3,6,7,8,10}, 5));
    }
}