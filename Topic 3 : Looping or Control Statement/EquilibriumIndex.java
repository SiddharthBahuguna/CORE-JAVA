public class EquilibriumIndex {
    public static void printEquilibriumIndices(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        boolean found = false;

        System.out.print("Equilibrium Indices: ");
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                System.out.print(i + " ");
                found = true;
            }

            leftSum += arr[i];
        }

        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        printEquilibriumIndices(arr);
    }
}