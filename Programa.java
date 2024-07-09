
import java.awt.Toolkit;


class Programa {

    public static void main(String[] args) throws InterruptedException {
        // toca o som de beep 
        Toolkit.getDefaultToolkit().beep();
        // exibe mensagem na tela 
        System.out.println("Atencao!! Esta na hora de beber agua! ");
        // aguarda 3 segundos antes de finalizar o programa 
        Thread.sleep(30000); 

    }

}