import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.eduardo.dao.ContatoDAO;
import com.eduardo.models.Contato;

public class TestaLista {
    public static void main(String args[]){
        System.out.println("Buscando contatos...");

        // Formatando Data e Hora
        Date agora = new Date();

        // Formatador com padrão desejado
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

       
        // Foi criado um ContatoDAO
         ContatoDAO dao = new ContatoDAO();

         // Listando um contato com o DAO
         List<Contato> contatos = dao.getLista();

         // Iterando a lista para imprimir as info de contatos com enhanced for loop
         for(Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Endereço: " + contato.getEndereco());
            System.out.println("Data de nascimento: " + formato.format(contato.getDataNascimento().getTime()) + "\n");
         }

    }
}
