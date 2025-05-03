package arvore_binaria;
public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria(10);
        arvoreBinaria.add(5);
        arvoreBinaria.add(3);
        arvoreBinaria.add(7);
        arvoreBinaria.add(15);
        arvoreBinaria.add(12);
        arvoreBinaria.add(20);

        System.out.println("Pré-Ordem:");
        arvoreBinaria.preOrdem();

        System.out.println("\nEm Ordem:");
        arvoreBinaria.inOrdem();

        System.out.println("\nPós-Ordem:");
        arvoreBinaria.posOrdem();
        
        System.out.println("\nPor Nível:");
        arvoreBinaria.percursoPorNivel();
    }
}
