import java.util.ArrayList;
import java.util.Random;

public class Chipotle {
    public static void main(String[] args) {

      chipotleBuilder();

    }

    public static void chipotleBuilder(){
        Random rand = new Random();
        int riceRand, meatRand,beansRand,veggiesRand,cheeseRand,quesoRand,sourCreamRand,salsaRand,guacRand;

        String[] rice = {"white rice","brown rice","no rice","all rice"};
        String[] meat = {"chicken","steak","carnidas","chorizo","sofritas","veggies meat","no meat","all meats"};
        String[] beans = {"pinto beans","black beans","no beans","all beans"};
        String[] salsa = {"mild salsa","medium salsa","hot salsa","no salsa","all salsa"};
        String[] veggies ={"lettuce","fajita veggies","no veggies","all veggies"};
        String[] cheese = {"cheese","no"};
        String[] guac = {"guac","no"};
        String[] queso = {"queso","no"};
        String[] sourCream = {"sour cream", "no"};


        for(int i = 1; i < 26; i++) {
            ArrayList<String> chipotles = new ArrayList<String>();

            double price = 3.00;

            riceRand = rand.nextInt(4);
            chipotles.add(rice[riceRand]);
            if (rice[riceRand].equals("all rice")) {
                price += 1.5;
            } else if (!rice[riceRand].equals("no rice")) {
                price += 0.50;
            }


            meatRand = rand.nextInt(8);
            chipotles.add(meat[meatRand]);
            if (meat[meatRand].equals("all meats")) {
                price += 3.00;
            } else if (!meat[meatRand].equals("no meat")) {
                price += 0.50;
            }


            beansRand = rand.nextInt(4);
            chipotles.add(beans[beansRand]);
            if (beans[beansRand].equals("all beans")) {
                price += 1.5;
            } else if (!beans[beansRand].equals("no beans")) {
                price += 0.50;
            }


            salsaRand = rand.nextInt(5);
            chipotles.add(salsa[salsaRand]);
            if (salsa[salsaRand].equals("all salsa")) {
                price += 1.5;
            } else if (!salsa[salsaRand].equals("no salsa")) {
                price += 0.50;
            }


            veggiesRand = rand.nextInt(4);
            chipotles.add(veggies[veggiesRand]);
            if (veggies[veggiesRand].equals("all veggies")) {
                price += 1.00;
            } else if (!veggies[veggiesRand].equals("no veggies")) {
                price += 0.50;
            }


            cheeseRand = rand.nextInt(2);
            if (cheese[cheeseRand].equals("cheese")) {
                chipotles.add(cheese[cheeseRand]);
                price += 0.50;
            }

            quesoRand = rand.nextInt(2);
            if (queso[quesoRand].equals("queso")) {
                chipotles.add(queso[quesoRand]);
                price += 0.50;
            }

            guacRand = rand.nextInt(2);
            if (guac[guacRand].equals("guac")) {
                chipotles.add(guac[guacRand]);
                price += 0.50;
            }

            sourCreamRand = rand.nextInt(2);
            if (sourCream[sourCreamRand].equals("sour cream")) {
                chipotles.add(sourCream[sourCreamRand]);
                price += 0.50;
            }

            StringBuilder finalChipotle = new StringBuilder();


           String prefix = "";
           for (String s : chipotles) {
            finalChipotle.append(prefix);
            prefix = ", ";
            finalChipotle.append(s);
            //finalChipotle.append(", ");
           }


            System.out.println("Burrito " + i + ": " +  finalChipotle + "     "+ "$"+ price);
            System.out.println();

        }

    }
}
