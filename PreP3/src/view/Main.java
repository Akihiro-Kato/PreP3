package view;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import controller.JSONOps;

public class Main {

    public static void main(String[] args) {

        JSONOps contJay = new JSONOps();
        try {
            contJay.lerJSON(JOptionPane.showInputDialog("Insira o nome do Symbol"));
        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}