import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class VendingMachine {

    private static int validCoinRange[] = {1, 5, 10, 25};

    public static boolean validateUserInputSparkCoins(int usrCoinsInputArr[]) {
        boolean isValid = false;
        for(int i=0;i<usrCoinsInputArr.length;i++) {
            ArrayList<Integer> coinsList = Arrays.stream(validCoinRange).boxed().collect(Collectors.toCollection(ArrayList::new));
            if(coinsList.contains(usrCoinsInputArr[i])) {
                isValid = true;
            }else {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public String getSparkFoodProduct(int usrCoinsInputs[], SparklingProducts spObj){
        boolean allCoinsValid =  VendingMachine.validateUserInputSparkCoins(usrCoinsInputs);
        String usrMsg = "";
        int remainingAmt = 0;
        if(allCoinsValid){
            int totalUserCoinAmt = 0;
            for(int i=0;i<usrCoinsInputs.length;i++) {
                totalUserCoinAmt = totalUserCoinAmt+usrCoinsInputs[i];
            }
            System.out.println("User total amount : "+totalUserCoinAmt);
            if(getVendingProduct(spObj)>0) {
                if (spObj == SparklingProducts.Sparksoda) {
                    remainingAmt = totalUserCoinAmt % 45;
                    usrMsg = "Sparksoda";
                } else if (spObj == SparklingProducts.SparkPasta) {
                    remainingAmt = totalUserCoinAmt % 35;
                    usrMsg = "SparkPasta";
                }
                if (spObj == SparklingProducts.SparklingWater) {
                    remainingAmt = totalUserCoinAmt % 25;
                    usrMsg = "SparklingWater";
                }

                System.out.println("Product is : "+spObj);
                if(remainingAmt>0){
                    System.out.println("User changes ::: "+Arrays.toString(CalculateChanges.calculateRemainingChanges(remainingAmt)));
                }
            }else{
                usrMsg = "Product Not Available";
            }

        }else{
            usrMsg ="User input coins are not valid....";
        }
        return usrMsg;
    }


    public static int getVendingProduct(SparklingProducts spObj){
        int productCount = 0;
        if (spObj == SparklingProducts.Sparksoda) {
            productCount = 1;
        } else if (spObj == SparklingProducts.SparkPasta) {
            productCount = 1;
        }
        if (spObj == SparklingProducts.SparklingWater) {
            productCount = 0;
        }
        return productCount;
    }


}
