import java.util.LinkedList;
import java.util.Queue;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria(int conteudo){
        raiz = new No(conteudo, null, null);
    }

    public No getRaiz(){
        return raiz;
    }

    public void preOrdem(){
        preOrdem(raiz);
    }

    private void preOrdem(No no){
        if(no != null){
            System.out.println(no.conteudo);
            preOrdem(no.esq);
            preOrdem(no.dir);
        }
    }

    public void inOrdem(){
        inOrdem(raiz);
    }

    private void inOrdem(No no){
        if(no != null){
            inOrdem(no.esq);
            System.out.println(no.conteudo);
            inOrdem(no.dir);
        }
    }

    public void posOrdem(){
        posOrdem(raiz);
    }

    private void posOrdem(No no){
        if(no != null){
            posOrdem(no.esq);
            posOrdem(no.dir);
            System.out.println(no.conteudo);
        }
    }

    public void add(int valor){
        raiz = add(raiz, valor);
    }

    private No add(No no, int valor){
        if(no == null){
            return new No(valor, null, null);
        }

        if(valor < no.conteudo){
            no.esq = add(no.esq, valor);
        } else {
            no.dir = add(no.dir, valor);
        }

        return no;
    }

    void percursoPorNivel(){
        if(raiz == null) return;

        No atual;
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while(!fila.isEmpty()){
            atual = fila.remove();
            System.out.println(atual.conteudo);

            if(atual.esq != null) fila.add(atual.esq);
            if(atual.dir != null) fila.add(atual.dir);
        }
    }
}