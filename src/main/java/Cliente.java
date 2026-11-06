public class Cliente {
    private int id;
    private String nome;
    private int desconto;
    private String genero;

    // Construtor com 4 parâmetros (usado nos teus testes)
    public Cliente(int id, String nome, int desconto, String genero) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.genero = genero;
    }

    // Sobrecarga com os tipos invertidos (caso o teste chame id, nome, genero, desconto)
    public Cliente(int id, String nome, String genero, int desconto) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.desconto = desconto;
    }

    // Construtor com 3 parâmetros do diagrama
    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.genero = "nd";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return nome + " (" + id + ") (" + desconto + "%)";
    }
}