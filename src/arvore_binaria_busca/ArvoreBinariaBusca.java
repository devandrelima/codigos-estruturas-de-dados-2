package arvore_binaria_busca;

public class ArvoreBinariaBusca{
    
    private No raiz;

    // Construtores
    public ArvoreBinariaBusca() {
        setRaiz(null);
    }

    public ArvoreBinariaBusca(No no){
        setRaiz(no);
    }

    // Get and Set 
    public void setRaiz(No no){
        this.raiz = no;
    }

    public No getRaiz(){
        return this.raiz;
    }

    // Métodos para percorrer
    public void preOrdem(){
        preOrdem(raiz);
    }

    private void preOrdem(No arv){
        if(arv != null){
            System.out.println(arv.getChave() + " - " + arv.getValor());
            preOrdem(arv.getEsq());
            preOrdem(arv.getDir());
        }
    }

    public void inOrdem(){
        inOrdem(raiz);
    }

    private void inOrdem(No arv){
        if(arv != null){
            inOrdem(arv.getEsq());
            System.out.println(arv.getChave() + " - " + arv.getValor());
            inOrdem(arv.getDir());
        }
    }

    public void posOrdem(){
        posOrdem(raiz);
    }

    private void posOrdem(No arv){
        if(arv != null){
            posOrdem(arv.getEsq());
            posOrdem(arv.getDir());
            System.out.println(arv.getChave() + " - " + arv.getValor());
        }
    }

    // método inserir
    public void inserir(int chave, String valor){
        raiz = inserir(this.getRaiz(), chave, valor);
    }

    private No inserir(No arv, int chave, String valor){
        if(arv == null) {
            arv = new No(chave, valor);

        } else if (chave < arv.getChave()){
            arv.setEsq(inserir(arv.getEsq(), chave, valor));
        
        } else if (chave > arv.getChave()){
            arv.setDir(inserir(arv.getDir(), chave, valor));
        
        } 

        return arv;
    }

    // método buscar
    public No buscar(int chave){
        return buscar(raiz, chave);
    }
    
    private No buscar(No arv, int chave){
        if(arv == null){
            return null;

        } else {
            if(chave < arv.getChave()){
                return buscar(arv.getEsq(), chave);

            } else if (chave > arv.getChave()) {
                return buscar(arv.getDir(), chave);

            }
            return arv; // Caso seja igual
        }
    }

    // Calcular Altura
    public int calcularAltura(No no){
        if(no == null) return -1;

        int a = calcularAltura(no.getEsq());
        int b = calcularAltura(no.getDir());

        if(a > b) { return a + 1; }
        else { return b + 1; }
    }

    // Método remover
}
