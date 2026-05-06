package View;
import java.util.Scanner;
public class EventoView {

    Scanner scanner = new Scanner(System.in);

    public String Menu() {
        System.out.println("SEJA BEM VINDO AO SISTEMA FITA");
        System.out.println("SELECIONE UMA DAS SEGUINTES OPÇÕES PARA CONTINUAR");
        System.out.println("1 - CADASTRAR UM NOVO EVENTO");

        String escolha = scanner.nextLine();
        return escolha;
    }

    public String[] Evento() {
        System.out.println("QUAL A LOTAÇÃO MÁXIMA DO EVENTO?");
        String lotacao = scanner.nextLine();

        System.out.println("QUANTO ESTE EVENTO DEVERÁ DURAR?");
        String duracao = scanner.next();

        System.out.println("EM QUAL DATA ESTE EVENTO DEVERÁ OCORRER?");
        String Data = scanner.next();

        return new String[]{lotacao, duracao, Data};
    }
}
