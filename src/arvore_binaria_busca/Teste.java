package arvore_binaria_busca;

public class Teste {
    public static void main(String[] args) {
    
        ArvoreBinariaBusca arvoreBinariaBusca = new ArvoreBinariaBusca();
        
        arvoreBinariaBusca.inserir(10,"sla");
        arvoreBinariaBusca.inserir(5, "ola");
        arvoreBinariaBusca.inserir(15, "opa");
        arvoreBinariaBusca.inserir(12,"sla");

        System.out.println("Pré-Ordem:");
        arvoreBinariaBusca.preOrdem();

        System.out.println("\nEm Ordem:");
        arvoreBinariaBusca.inOrdem();

        System.out.println("\nPós-Ordem:");
        arvoreBinariaBusca.posOrdem();
        
        System.out.println("\nAltura:");
        System.out.println(arvoreBinariaBusca.calcularAltura(arvoreBinariaBusca.getRaiz()));

        // Testando busca
        try {
            No buscado = new No();

            System.out.println("\nBuscando um 12:");
            buscado = arvoreBinariaBusca.buscar(12);
            System.out.println(buscado.getChave() + " - " + buscado.getValor());
    
            System.out.println("\nBuscando um 73:");
            buscado = arvoreBinariaBusca.buscar(73);
            System.out.println(buscado.getChave() + " - " + buscado.getValor());
        
        } catch (NullPointerException e){
            System.out.println("null");
        }
    }
}
