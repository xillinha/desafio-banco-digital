import java.util.ArrayList;
import java.util.List;

public class Banco {

    public Banco(String nome) {
        this.nome = nome;
        this.setClientes(new ArrayList<Cliente>());
    }

    private String nome;
    private List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void listarClientes() {

        for (Cliente c : this.clientes) {
            System.out.println(String.format("Cliente: %s", c.getNome()));
        }
    }
}
