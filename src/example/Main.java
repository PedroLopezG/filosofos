package example;


import java.util.logging.Logger;

public class Main {

    static Logger LoggerFactory;
    private static Logger logger = LoggerFactory.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) throws Exception {
        //logger.info("Setuping dinner...");
        System.out.println("Abriendo gasolineria...");
        Table table = new Table(4);
        Thread dinner = new Thread(table);

        //logger.info("Starting dinner...");
        System.out.println("Empezando servicio...");
        dinner.start();
        dinner.join();
    }
}