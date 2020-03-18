package ba.unsa.etf.rs.tut2zad3;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextArea ispisRecenice;
    public TextField unosRecenice;

    public void malaUVelika(ActionEvent actionEvent) {
        String recenica = new String();
        recenica = unosRecenice.getText();
        String najduza = new String();
        for (String rijec: recenica.split(" ")) {
            if (rijec.length() > najduza.length())
                najduza = rijec;
        }
        recenica = recenica.replace(najduza, najduza.toUpperCase());
        System.out.println(recenica);
        ispisRecenice.setText(recenica);
    }
}
