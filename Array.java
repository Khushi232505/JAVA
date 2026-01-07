public class ArrayPractice{
    public static void main(String[] args) {
        int arr1[] = new int[5];
        arr1[0] = 3;
        arr1[1] = 5;
        arr1[2] = 10;
        arr1[3] = 8;
        arr1[4] = 1;

        int sum = 0;

        for (int i = 0; i<arr1.length; i++){
            sum += arr1[i];
        }
        System.out.println("The sum of array elements is: " + sum);
        
    }
}
