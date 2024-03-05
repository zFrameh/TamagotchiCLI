import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" /\\_/\\");
        System.out.println("/ o o \\");
        System.out.println("Benvenuto nel tamagotchi! Scegli il tuo animaletto da compagnia:");
        System.out.println("1. Cane");
        System.out.println("2. Gatto");
        System.out.println("3. Topo");
        System.out.println("4. Esci");

        String animalescelto = sc.nextLine();

        if (!isInteger(animalescelto)) {
            System.out.println("Devi inserire un numero valido.");
            return;
        }

        Animale animale = null;

        switch (Integer.parseInt(animalescelto)) {
            case 1:
                animale = new Animale(10, Type.CANE);
                break;
            case 2:
                animale = new Animale(7, Type.GATTO);
                break;
            case 3:
                animale = new Animale(12,  Type.TOPO);
                break;
            case 4:
                System.out.println("Uscendo...");
                System.exit(0);
                break;
            default:
                System.out.println("Animale non valido..");
        }

        if (animale == null) {
            System.out.println("Animale non valido..");
            return;
        }

        if (animale.getType() == Type.CANE) {
            System.out.println(" / \\_/ \\");
            System.out.println("(  o   o )");
            System.out.println("  (   >   )");
            System.out.println("  \"\"\"\"\"\"\"");
        }
        else if (animale.getType() == Type.GATTO) {
            System.out.println("  /\\_/\\");
            System.out.println(" ( o.o )");
            System.out.println("  > ^ <");
        }
        else if (animale.getType() == Type.TOPO) {
            System.out.println("       ____()()");
            System.out.println("      /      @@");
            System.out.println("`~~~~~\\_;m__m._>o");
        }

    boolean stato = true;

        do {

            if (animale.getPuntiVita() <= 0) {
                stato = false;
                System.out.println("Mi spiace, il tuo " + animale.getNome() + " è morto :(");
                System.exit(0);
            }

            System.out.println("Scegli cosa deve fare il tuo " + animale.getNome());
            System.out.println("1. Mangiare");
            System.out.println("2. Bere");
            System.out.println("3. Camminare");
            System.out.println("4. Dormire");
            System.out.println("5. Esci");
            System.out.println("(Hai " + animale.getPuntiVita() + " punti vita)");

            String azione = sc.nextLine();

            if (!isInteger(azione)) {
                System.out.println("Devi inserire un numero valido.");
                return;
            }

            switch (Integer.parseInt(azione)) {
                case 1:
                    animale.setPuntiVita(animale.getPuntiVita() + 5);
                    System.out.println("Il tuo " + animale.getNome() + " ha appena finito di mangiare :P");
                    break;
                case 2:
                    animale.setPuntiVita(animale.getPuntiVita() + 3);
                    System.out.println("Il tuo " + animale.getNome() + " si è dissetato.");
                    break;
                case 3:
                    animale.setPuntiVita(animale.getPuntiVita() - 7);
                    if (animale.getPuntiVita() > 0) System.out.println("Il tuo " + animale.getNome() + " è appena tornato da una camminata.");
                    break;
                case 4:
                    animale.setPuntiVita(animale.getPuntiVita() + 4);
                    System.out.println("Zzz, il tuo " + animale.getNome() + " sta dormendo..");
                    break;
                case 5:
                    System.out.println("Uscendo...");
                    System.exit(0);
                default:
                    System.out.println("Animale non valido..");
            }
        } while (stato);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
