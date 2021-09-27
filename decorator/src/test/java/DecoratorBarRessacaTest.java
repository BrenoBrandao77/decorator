import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorBarRessacaTest {
    @Test
    void deveConferirKing() {
        Drink king = new Drink();
        Object morango;
        Drink app = new Drink(morango);
        Drink drink;
        assertEquals("Conferir drink morango", drink.getTipo());

}