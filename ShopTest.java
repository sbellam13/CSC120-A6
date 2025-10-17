import static org.junit.Assert.*;

import org.junit.Test;

public class ShopTest {

    // Tests for Computer
    @Test 
    public void testComputerConstructor(){
        Computer test = new Computer("2019 MacBook Pro","Intel", 256, 15, 
        "High Sierra", 2019, 1000);
        assertEquals("2019 MacBook Pro", test.description);
        assertEquals("Intel", test.processorType);
        assertEquals(256, test.hardDriveCapacity);
        assertEquals(15, test.memory);
        assertEquals("High Sierra", test.operatingSystem);
        assertEquals(2019, test.yearMade);
        assertEquals(1000, test.price);
    }

    @Test
    public void testSetPrice(){
        Computer test = new Computer("2019 MacBook Pro","Intel", 256, 16, 
        "High Sierra", 2019, 1000);
        test.setPrice(300);
        assertEquals(300, test.price, 0.1);
    }

    @Test
    public void testSetOS(){
        Computer test = new Computer("2019 MacBook Pro","Intel", 256, 16, 
        "High Sierra", 2019, 1000);
        test.setOS("Sonoma");
        assertEquals("Sonoma", test.operatingSystem);
    }

    @Test
    public void testGetYear(){
        Computer test = new Computer("2019 MacBook Pro","Intel", 256, 16, 
        "High Sierra", 2019, 1000);
        assertEquals(2019, test.getYear());
    }

    //Tests for ResaleShop
    @Test
    public void testResaleShopConstructor(){
        ResaleShop test = new ResaleShop();
        assertEquals(test.inventory.size(), 0);
    }

    @Test
    public void testBuyComputerNotInStore(){
        ResaleShop test = new ResaleShop();
        Computer computerNotInStore = new Computer("2023 MacBook Pro","Apple", 512, 18, 
        "Sonoma", 2023, 2000);
        try{
            test.buy(computerNotInStore);
            assertTrue(test.inventory.contains(computerNotInStore));
        } catch(Exception e) {
            fail();
        }
    }

    @Test 
    public void testBuyComputerInStore(){
        ResaleShop test = new ResaleShop();
        Computer computerInStore = new Computer("2019 MacBook Pro","Intel", 256, 16, 
        "High Sierra", 2019, 1000);
        
        test.inventory.add(computerInStore);


        assertThrows(Exception.class, () -> {
            test.buy(computerInStore);;
        });
    }

    @Test
    public void testSellComputerInStore(){
        ResaleShop test = new ResaleShop();
        Computer computerInStore = new Computer("2019 MacBook Pro","Intel", 256, 16, 
        "High Sierra", 2019, 1000);
        test.inventory.add(computerInStore);

        try{
            test.sell(computerInStore);
            assertFalse(test.inventory.contains(computerInStore));
        } catch (Exception e){
            fail();
        }
    }

    @Test
    public void testSellComputerNotInStore(){
        ResaleShop test = new ResaleShop();
        Computer computerNotInStore = new Computer("2023 MacBook Pro","Apple", 512, 18, 
        "Sonoma", 2023, 2000);
        assertThrows(Exception.class, () -> {
            test.sell(computerNotInStore);;
        });
    }

    @Test
    public void testInventory(){
        ResaleShop test = new ResaleShop();
        test.printInventory();
    }

    @Test
    public void refurbishComputerNotInStore(){
        ResaleShop test = new ResaleShop();
        Computer computerNotInStore = new Computer("2023 MacBook Pro","Apple", 512, 18, 
        "Sonoma", 2023, 2000);
        assertThrows(Exception.class, () -> {
            test.refurbish(computerNotInStore, "High Sierra");
        });
    }

    @Test
    public void refurbishComputer1999(){
        ResaleShop test = new ResaleShop();
        Computer computer1999 = new Computer("1999 Macbook","Intel", 256, 16, 
        "High Sierra", 1999, 1000);
        Computer refurbishedComputer1999 = new Computer("1999 Macbook","Intel", 256, 16, 
        "Sonoma", 1999, 0);

        test.inventory.add(computer1999);
        int index = test.inventory.indexOf(computer1999);
        try{
            test.refurbish(computer1999, "Sonoma");
            assertEquals(refurbishedComputer1999, test.inventory.get(index));
        } catch (Exception e){
            fail();
        }
    }

    @Test
    public void refurbishComputer2010(){
        ResaleShop test = new ResaleShop();
        Computer computer2010 = new Computer("2010 Macbook","Intel", 256, 16, 
        "High Sierra", 2010, 1000);
        Computer refurbishedComputer2010 = new Computer("2010 Macbook","Intel", 256, 16, 
        "Sonoma", 2010, 250);

        
        test.inventory.add(computer2010);
        int index = test.inventory.indexOf(computer2010);
        try{
            test.refurbish(computer2010, "Sonoma");
            assertEquals(refurbishedComputer2010, test.inventory.get(index));
        } catch (Exception e){
            fail();
        }
    }

    @Test
    public void refurbishComputer2017(){
        ResaleShop test = new ResaleShop();
        Computer computer2017 = new Computer("2017 Macbook","Intel", 256, 16, 
        "High Sierra", 2017, 1000);
        Computer refurbishedComputer2017 = new Computer("2017 Macbook","Intel", 256, 16, 
        "Sonoma", 2017, 550);

        test.inventory.add(computer2017);
        int index = test.inventory.indexOf(computer2017);
        try{
            test.refurbish(computer2017, "Sonoma");
            assertEquals(refurbishedComputer2017, test.inventory.get(index));
        } catch (Exception e){
            fail();
        }
    }

    @Test
    public void refurbishComputer2023(){
        ResaleShop test = new ResaleShop();
        Computer computer2023 = new Computer("2023 Macbook","Intel", 256, 16, 
        "High Sierra", 2023, 1000);
        Computer refurbishedComputer2023 = new Computer("2023 Macbook","Intel", 256, 16, 
        "Sonoma", 2023, 1000);

        test.inventory.add(computer2023);
        int index = test.inventory.indexOf(computer2023);
        try{
            test.refurbish(computer2023, "Sonoma");
            assertEquals(refurbishedComputer2023, test.inventory.get(index));
        } catch (Exception e){
            fail();
        }
    }
    
}
