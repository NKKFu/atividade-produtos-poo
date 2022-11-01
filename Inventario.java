public abstract class Inventario {
    public static void main(String[] args) {
        DVD dvds = new DVD("A02");
        dvds.Adicionar(10);
        dvds.Adicionar(20);
        dvds.Retirar(20);
        System.out.printf("%s [%s]: %s", dvds.getClass().getName(), dvds.getIdentificador(), dvds.getEstoqueAtual());
    }
}
