package Composite.Ex2;

public class CompositeDemo {
    public static void main(String[] args){
        Product product1 = new Product("Laptop", 1500.0);
        Product product2 = new Product("Smartphone", 800.0);

        // Criando caixas e adicionando produtos
        Box box1 = new Box();
        box1.add(product1);
        box1.add(product2);

        Box box2 = new Box();
        box2.add(new Product("Livro", 30.0));
        box2.add(new Product("Fones de Ouvido", 50.0));

        // Criando uma caixa composta que contém outras caixas e produtos
        Box pricipalBox = new Box();
        pricipalBox.add(box1);
        pricipalBox.add(box2);
        pricipalBox.add(new Product("Tablet", 500.0));

        // Calculando o valor total da caixa composta
        double valorTotal = pricipalBox.calcValue();

        // Exibindo o conteúdo e o valor total
        System.out.println("Conteúdo da Caixa Principal:");
        System.out.println("\nValor Total: $" + valorTotal);
    }
}
