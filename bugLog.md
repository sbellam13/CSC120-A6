## Bug 1
Brief description:  The setOS method does not properly update the OS. 
Failed unit test: testSetOS()

## Bug 2
Brief description:  The buy method does not add the right computer to the inventory. 
Failed unit test:  testBuyComputerNotInStore

## Bug 3
Brief description:  The buy method does not throw an exception when trying to buy a computer already in the inventory. 
Failed unit test: testBuyComputerInStore

## Bug 4
Brief description:  The sell method does not thrown an error when trying to sell a computer not in the inventory.  
Failed unit test: testSellComputerNotInStore

## Bug 5
Brief description:  The printInventory method throws an IndexOutOfBoundsError
Failed unit test: testInventory

## Bug 6
Brief description:  The refurbish method doesn't update the price properly for computer made between 2000 and 2011
Failed unit test: refutbishComputer2010

## Bug 7
Brief description:  Computer constructor sets memory to 16 regardless of parameter. 
Failed unit test: testComputerConstructor

## Bug 8
Brief description:  Computer constructor sets price to 0 regardless of parameter. 
Failed unit test: testComputerConstructor

## Bug 9
Brief description:  ResaleShop Constructor adds a new computer into the inventory, inventory should be an empty arraylist at this point.
Failed unit test: testResaleShopConstructor

## Bug 10
Brief description:  The rurbish method doesn't update the OS properly. 
Failed unit test:  refurbishComputer1999