package Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        // Uso do Proxy para carregar e exibir a imagem
        Image image = new ProxyImage("sample.jpg");

        // A imagem é carregada apenas quando necessário (lazy loading)
        image.display();

        // A imagem já está carregada, então o Proxy simplesmente a exibe
        image.display();
    }
}
