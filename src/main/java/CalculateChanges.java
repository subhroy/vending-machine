public class CalculateChanges {

    private static int[] coinRange = { 25,10,5,1 };  // valid coin range

    private static String finalOutput = null;

    public static int[] calculateRemainingChanges(int remainingAmount) {

        findChanges(remainingAmount, 0, "");
        return getChangeArray(finalOutput.substring(1));
    }

    private static void findChanges(int remainingAmount, int i, String str) {
        if (remainingAmount == 0) {
            finalOutput = str;
        }
        if (remainingAmount < 0) {
            return;
        }

        for (int j = i; j < coinRange.length; j++) {
            if (finalOutput == null)
                findChanges(remainingAmount - coinRange[j], j, str + "," + coinRange[j]);
        }
    }

    public static int[] getChangeArray(String changes){
        String[] splitArray = changes.split(",");
        int[] coinArray = new int[splitArray.length];
        for(int i=0;i<splitArray.length;i++)
        {
            try {
                coinArray[i] = Integer.parseInt(splitArray[i]);
            } catch (NumberFormatException e) {
                coinArray[i]=-1;
            }
        }
        return coinArray;
    }
}
