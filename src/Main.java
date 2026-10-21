public class Main {
    public static void main(String[] args) {
        System.out.println("Teste-lanchonete");

        Item item1 = new Item("Pera", 7.99, 1);
        Item item2 = new Item("Guarana", 10.00, 2);
        Item item3 = new Item("Café", 67.90, 3);
        Item item4 = new Item("Carne de porco", 45.60, 4);

        Carrinho c = new Carrinho();

        c.adicionarItem(item3);
        c.adicionarItem(item1);
        c.adicionarItem(item2);

        c.calcularPreco();
    }
}
