import java.util.Calendar;

import com.eduardo.dao.ContatoDAO;
import com.eduardo.models.Contato;

public class TestaInsere {
    public static void main(String args[]) {

        // Pronto para gravar
        Contato contato = new Contato();
        contato.setNome("Carol Maria");
        contato.setEmail("carol.maria@gmail.com");
        contato.setEndereco("R Amarela  580 AP9");
        contato.setDataNascimento(Calendar.getInstance());

        // Grave nesta instancia
        ContatoDAO dao = new ContatoDAO();

        // Metodo elegante
        dao.adicionaContato(contato);
        System.out.println("Gravado!");
        System.out.println("Contato inserido com sucesso!");

    }
}
