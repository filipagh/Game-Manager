package Objects;

import Network.Client;
import Network.Server;

import java.io.IOException;

public class Main {


   private char[][] playBoard;
    public static void main(String[] args) throws IOException {


//  AK chces testovat check board odkomentuj toto a v game riadok 28. a zakomentuj vsetko ostatne dole co je tu

      //  new Game();


        //TODO lepsi sposob mozno nacitania a zapisu
        int set = InputFromKeyboard.readInt("1 server  0 client");
        if (set == 1) {
            //TODO PROTOKOL
            Server s = new Server(30000);
            s.start();
        }
        //TODO NACITAT IP A PROTOKOL
        Client c = new Client("127.0.0.1", 30000);
        c.run();
        System.out.print("koniec!");
    }


}
