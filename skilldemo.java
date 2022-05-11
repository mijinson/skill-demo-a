public class skilldemo {
    public static boolean searchFor(int n) {
        Integer[] myArray = {1, 2, 3};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == n) {
                return true;
            }
        }
        return false;

    }
}
