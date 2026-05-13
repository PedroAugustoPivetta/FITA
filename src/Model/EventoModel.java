package Model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EventoModel {
    private int contador;
    private int Id_Evento;
    private int Lotacao_max;
    private int Duracao;
    private LocalDate Data;


    public EventoModel(String dados[]){
        try{
            this.Lotacao_max = Integer.parseInt(dados[0]);
            this.Duracao = Integer.parseInt(dados[1]);
        }
        catch (NumberFormatException e){
            System.out.println("O VALOR DIGITADO DEVE SER UM NÚMERO");
        }
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.Data = LocalDate.parse(dados[2], formatter);
        }
        catch (DateTimeParseException e){
            System.out.println("AO INSERIR A DATA SIGUA O SEGUINTE PADRÃO DD/MM/AAAA");
        }

    }

}
