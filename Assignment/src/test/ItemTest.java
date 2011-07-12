package test;

import main.Item;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void shouldGetTheSameNameAsSet() {
        Item item = new Item();
        item.setName("Box of Chocolates");
        assertThat("Box of Chocolates", is(item.getName()));
    }

    @Test
    public void shouldGetTheSameCostAsSet() {
        Item item = new Item();
        item.setCost(10.0);
        assertThat(10.0, is(item.getCost()));
    }

    @Test
    public void shouldGetTheSameValueForImportedAsSet() {
        Item item = new Item();
        item.setImported(true);
        assertThat(true, is(item.getImported()));
    }

    @Test
    public void testingTheConstructor() {
        Item item = new Item("Box of Chocolates", 10.0, true);
        assertThat("Box of Chocolates", is(item.getName()));
        assertThat(10.0, is(item.getCost()));
        assertThat(true, is(item.getImported()));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsTrueForBook() {
        Item item = new Item("book", 12.45, false);
        assertThat(true, is(item.checkWhetherItemIsExempted()));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsFalseForMusicCD() {
        Item item = new Item("music CD", 12.0, false);
        assertThat(false, is(item.checkWhetherItemIsExempted()));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsFalseForBottleOfPerfume() {
        Item item = new Item("bottle of perfume", 12.45, false);
        assertThat(false, is(item.checkWhetherItemIsExempted()));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsTrueForImportedBoxOfChocolates() {
        Item item = new Item("imported box of chocolates", 60.56, true);
        assertThat(true, is(item.checkWhetherItemIsExempted()));
    }
}
