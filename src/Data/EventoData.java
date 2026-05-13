package Data;
import java.time.LocalDate;

public class EventoData {
    private int contador;
    private int[] Id_Evento = new int[1];
    private int[] Lotacao_max = new int[1];
    private int[] Duracao = new int[1];
    private LocalDate[] Data = new LocalDate[1];

    public void ArrayExtender(){
        for (int i = 0; i < 4; i++) {
            if (contador == Id_Evento.length) {
                this.Id_Evento = new int[this.Id_Evento.length + 1];
                this.Id_Evento[contador + 1] = contador + 5;
                contador++;
            }
            System.out.println(Id_Evento[contador]);
        }
    }
}
