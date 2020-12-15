import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {

    @Test
    public void checkUserInput(){
        int coins[] = {1,5};
        Assert.assertEquals(true, VendingMachine.validateUserInputSparkCoins(coins));
    }


    @Test
    public void getSparkFoodProductTest(){
        VendingMachine vendingMc = new VendingMachine();
        System.out.println("Running for SparkPasta......");
        int usrCoinsArrForPasta[] = {1, 5, 10, 25};
        Assert.assertEquals("SparkPasta",vendingMc.getSparkFoodProduct(usrCoinsArrForPasta, SparklingProducts.SparkPasta));


        System.out.println("\n\nRunning for SparklingWater....");
        int usrCoinsArrForWater[] = {5, 10, 25};
        Assert.assertEquals( "Product Not Available",vendingMc.getSparkFoodProduct(usrCoinsArrForWater, SparklingProducts.SparklingWater));


    }

    @Test
    public void calculateRemainingChangesTest(){
        int remainChanges[] = {5,1};
        Assert.assertArrayEquals(remainChanges,CalculateChanges.calculateRemainingChanges(6));
    }

    @Test
    public void getVendingProductTest(){
        Assert.assertEquals(1, VendingMachine.getVendingProduct(SparklingProducts.SparkPasta)); //Product available
        Assert.assertEquals(0, VendingMachine.getVendingProduct(SparklingProducts.SparklingWater)); //There is no product in vending machine
    }

}
