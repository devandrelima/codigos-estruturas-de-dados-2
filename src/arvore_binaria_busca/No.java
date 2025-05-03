package arvore_binaria_busca;

public class No {
    private int chave;
    private No dir, esq;
    private String valor;

    public No(){}

    public No(int chave, String valor){
        this.chave = chave;
        this.valor = valor;
        this.esq = null;
        this.dir = null;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}