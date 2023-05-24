import java.util.Arrays;

public class PracticeArrays {

    public static Integer findSecondSmallestItem(Integer[] arr) {
        if (arr.length <= 1)
            return null;


        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return arr[i + 1];
            }

        }
return arr[1];
    }
    public static void main(String[] args) {

Integer[] arr1 = {45,5,32,58,6};
System.out.println(findSecondSmallestItem(arr1));

        Integer[] arr2 = {4,5,5,5,3};
        System.out.println(findSecondSmallestItem(arr2));
    }
}

