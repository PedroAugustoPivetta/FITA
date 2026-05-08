package Model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EventoModel {
    private int Id_Evento;
    private int Lotacao_max;
    private int Duracao;
    private LocalDate Data;

    int[] Id_Evento_Column = new int[5];
    int Id_Evento_Column_Contador;

    int[] Lotacao_max_Column = new int[5];
    int Lotacao_max_Column_Contador;

    int[] Duracao_Column = new int[5];
    int Duracao_Column_Contador;

    LocalDate[] Data_Column = new LocalDate[5];
    int Data_Column_Contador;


    public EventoModel(String dados[]){
        this.Id_Evento =+ 1;
        Id_Evento_Column[0] = this.Id_Evento;
        Id_Evento_Column_Contador++;
        try{
            this.Lotacao_max = Integer.parseInt(dados[0]);
            Lotacao_max_Column[0] = this.Lotacao_max;
            Lotacao_max_Column_Contador++;
            this.Duracao = Integer.parseInt(dados[1]);
            Duracao_Column[0] = this.Duracao;
            Duracao_Column_Contador++;
        } catch (NumberFormatException e){
            System.out.println("O VALOR DIGITADO DEVE SER UM NÚMERO");
        }
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.Data = LocalDate.parse(dados[2], formatter);
            Data_Column[0] = this.Data;
            Data_Column_Contador++;
        }catch (DateTimeParseException e){
            System.out.println("AO INSERIR A DATA SIGUA O SEGUINTE PADRÃO DD/MM/AAAA");
        }

    }

}
