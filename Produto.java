import java.util.LinkedList;

public abstract class Produto {
    private String identificador;
    private int estoqueAtual;

    private LinkedList<Integer> entradas = new LinkedList<Integer>();
    private LinkedList<Integer> saidas = new LinkedList<Integer>();

    Produto(String identificador) {
        this.identificador = identificador;
    }

    public int Retirar(int valor) {
        if (valor <= 0) {
            // Não é pode gerar essa movimentação
            return estoqueAtual;
        }

        if (estoqueAtual - valor < 0) {
            // Não é possível retirar mais elementos
            return estoqueAtual;
        }

        saidas.add(valor);
        estoqueAtual = estoqueAtual - valor;
        return estoqueAtual;
    }

    public int Adicionar(int valor) {
        if (valor <= 0) {
            // Não é pode gerar essa movimentação
            return estoqueAtual;
        }

        entradas.add(valor);
        estoqueAtual = estoqueAtual + valor;
        return estoqueAtual;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }
}
