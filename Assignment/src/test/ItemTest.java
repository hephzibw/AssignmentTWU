package test;

import main.Item;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {


    @Test
    public void testingTheConstructor() {
        //Arrange
        Item item = new Item("Box of Chocolates", 10.0, true);

        //Act
        String name = item.getName();
        double shelfPrice = item.getShelfPrice();
        boolean imported = item.getImported();
        
        //Assert
        assertThat("Box of Chocolates", is(name));
        assertThat(10.0, is(shelfPrice));
        assertThat(true, is(imported));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsTrueForBook() {
        //Arrange
        Item item = new Item("book", 12.45, false);
        
        //Act
        boolean value = item.checkWhetherItemIsBasicSalesTaxExemptableOrNot();
        
        //Assert
        assertThat(true, is(value));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsFalseForMusicCD() {
        //Arrange
        Item item = new Item("music CD", 12.0, false);
        
        //Act
        boolean value = item.checkWhetherItemIsBasicSalesTaxExemptableOrNot();
        
        //Assert
        assertThat(false, is(value));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsFalseForBottleOfPerfume() {
        //Arrange
        Item item = new Item("bottle of perfume", 12.45, false);
        
        //Act
        boolean value = item.checkWhetherItemIsBasicSalesTaxExemptableOrNot();
        
        //Assert
        assertThat(false, is(value));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsTrueForImportedBoxOfChocolates() {
        //Arrange
        Item item = new Item("imported box of chocolates", 60.56, true);
        
        //Act
        boolean value = item.checkWhetherItemIsBasicSalesTaxExemptableOrNot();
        
        //Assert
        assertThat(true, is(value));
    }

    @Test
    public void shouldCalculateCostOfImportedBottleOfPerfumeCosting27Point99As32Point19(){
        //Arrange
        Item item=new Item("imported bottle of perfume",27.99,true);
        
        //Act
        double cost = item.getCostOfItem();
        
        //Assert
        assertThat(32.19, is(cost));

    }

}

