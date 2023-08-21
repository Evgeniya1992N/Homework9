public class Main {
    public static void main(String[] args) {
        int[] weights = {90, 91, 93, 92};
        int[] weightsCopy = {900, 91, 93, 92};

        boolean arraysAreEqual = true;
        arraysAreEqual = weightsCopy.length == weights.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
              }
            }
        if (arraysAreEqual) {
            System.out.println("identical");
        } else {
            System.out.println("different");
        }
    }
}