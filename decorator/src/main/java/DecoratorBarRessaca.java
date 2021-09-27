import Adocante.Adocante;

public class DecoratorBarRessaca {
    public static void main(String[] args) {

        Drink pedido1 = new Vodca();
        pedido1 = new Gelo(pedido1);
        pedido1 = new Limao(pedido1);
        pedido1 = new Morango(pedido1);
        pedido1 = new Adocante(pedido1);
}
