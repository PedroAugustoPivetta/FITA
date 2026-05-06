package Controller;

import View.EventoView;
import Model.EventoModel;


public class EventoController {
    public void Executar(){
        EventoView eventoView = new EventoView();
        switch (eventoView.Menu()){
            case "1":
                EventoModel eventoModel = new EventoModel(eventoView.Evento());
        }
    }
}
