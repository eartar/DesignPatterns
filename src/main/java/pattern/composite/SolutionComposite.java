package pattern.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Item{
    void showPrice();
}


@Data
@AllArgsConstructor
class Book implements Item{

    private String name;

    @Override
    public void showPrice() {
        System.out.println(name);
    }
}

@Data
@AllArgsConstructor
class Shampoo implements Item{

    private String name;

    @Override
    public void showPrice() {
        System.out.println(name);
    }
}

@Data
@AllArgsConstructor
class ShampooBundle implements Item{

    List<Shampoo> items;

    @Override
    public void showPrice() {
        for (Item item : items)
            item.showPrice();
    }
}



public class SolutionComposite {
    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>();
        cart.add(new Book("book1"));
        cart.add(new ShampooBundle(Arrays.asList(new Shampoo("bundle-shampoo1"), new Shampoo("bundle-shampoo2"), new Shampoo("bundle-shampoo3"))));
        cart.add(new Shampoo("shampoo423"));

        cart.forEach(Item::showPrice);
    }
}
