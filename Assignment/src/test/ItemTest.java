package test;

import main.Item;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void shouldGetTheSameNameAsSet(){
        Item item = new Item();
        item.setName("Box of Chocolates");
        assertThat("Box of Chocolates", is(item.getName()));
    }
}
