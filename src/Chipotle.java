import java.util.ArrayList;
import java.util.Random;

public class Chipotle {
    public static void main(String[] args) {

      chipotleBuilder();

    }



    public static void chipotleBuilder(){


        int totalPrice = 0;
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

        ArrayList<String> chipotles1 = new ArrayList<String>();
        for(int i = 1; i < 26; i++) {
            ArrayList<String> chipotles = new ArrayList<String>();

            double price = 3.00;

            riceRand = rand.nextInt(4);
            chipotles.add(rice[riceRand]);
            chipotles1.add(rice[riceRand]);
            if (rice[riceRand].equals("all rice")) {
                price += 1.5;
            } else if (!rice[riceRand].equals("no rice")) {
                price += 0.50;
            }


            meatRand = rand.nextInt(8);
            chipotles.add(meat[meatRand]);
            chipotles1.add(meat[meatRand]);
            if (meat[meatRand].equals("all meats")) {
                price += 3.00;
            } else if (!meat[meatRand].equals("no meat")) {
                price += 0.50;
            }


            beansRand = rand.nextInt(4);
            chipotles.add(beans[beansRand]);
            chipotles1.add(beans[beansRand]);
            if (beans[beansRand].equals("all beans")) {
                price += 1.5;
            } else if (!beans[beansRand].equals("no beans")) {
                price += 0.50;
            }


            salsaRand = rand.nextInt(5);
            chipotles.add(salsa[salsaRand]);
            chipotles1.add(salsa[salsaRand]);
            if (salsa[salsaRand].equals("all salsa")) {
                price += 1.5;
            } else if (!salsa[salsaRand].equals("no salsa")) {
                price += 0.50;
            }


            veggiesRand = rand.nextInt(4);
            chipotles.add(veggies[veggiesRand]);
            chipotles1.add(veggies[veggiesRand]);
            if (veggies[veggiesRand].equals("all veggies")) {
                price += 1.00;
            } else if (!veggies[veggiesRand].equals("no veggies")) {
                price += 0.50;
            }


            cheeseRand = rand.nextInt(2);
            if (cheese[cheeseRand].equals("cheese")) {
                chipotles.add(cheese[cheeseRand]);
                chipotles1.add(cheese[cheeseRand]);
                price += 0.50;
            }

            quesoRand = rand.nextInt(2);
            if (queso[quesoRand].equals("queso")) {
                chipotles.add(queso[quesoRand]);
                chipotles1.add(queso[quesoRand]);
                price += 0.50;
            }

            guacRand = rand.nextInt(2);
            if (guac[guacRand].equals("guac")) {
                chipotles.add(guac[guacRand]);
                chipotles1.add(guac[guacRand]);
                price += 0.50;
            }

            sourCreamRand = rand.nextInt(2);
            if (sourCream[sourCreamRand].equals("sour cream")) {
                chipotles.add(sourCream[sourCreamRand]);
                chipotles1.add(sourCream[sourCreamRand]);
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
            totalPrice += price;

        }


        int whiteRice = 0, brownRice = 0, chicken = 0,steak = 0, carnidas = 0, chorizo = 0, sofritas = 0, veggiMeat = 0,pinto = 0, black = 0,mild = 0, medium = 0, hot = 0,lettuce = 0, fajitaveggies = 0,cheeseC = 0,guacC = 0,quesoC = 0, sourCreamC = 0;
        for(String s: chipotles1){

            switch (s) {
                case "white rice":
                    whiteRice++;
                    break;
                case "brown rice":
                    brownRice++;
                    break;
                case "chicken":
                    chicken++;
                    break;
                case "steak":
                    chicken++;
                    break;
                case "carnidas":
                    carnidas++;
                    break;
                case "chorizo":
                    chorizo++;
                    break;
                case "sofritas":
                    sofritas++;
                    break;
                case "veggies meat":
                    veggiMeat++;
                    break;
                case "pinto beans":
                    pinto++;
                    break;
                case "black beans":
                    black++;
                    break;
                case "mild salsa":
                    mild++;
                    break;
                case "medium salsa":
                    medium++;
                    break;
                case "hot salsa":
                    hot++;
                    break;
                case "lettuce":
                    lettuce++;
                    break;
                case "fajita veggies":
                    fajitaveggies++;
                    break;
                case "cheese":
                    cheeseC++;
                    break;
                case "queso":
                    quesoC++;
                    break;
                case "guac":
                    guacC++;
                    break;
                case "sour cream":
                    sourCreamC++;
                    break;
                case "all rice":
                    whiteRice++;
                    brownRice++;
                    break;
                case "all meats":
                    chicken++;
                    steak++;
                    carnidas++;
                    chorizo++;
                    sofritas++;
                    veggiMeat++;
                    break;
                case "all beans":
                    pinto++;
                    black++;
                    break;
                case "all salsa":
                    mild++;
                    medium++;
                    hot++;
                    break;
                case "all veggies":
                    lettuce++;
                    fajitaveggies++;
                    break;
            }

        }
        //
        System.out.printf("This order has %d white rice, %d brown rice, %d chicken,\n" +
                        "%d steak, %d carnitas, %d chorizo, %d sofritas,\n" +
                        "%d veggies(as meat option), %d black beans, %d pinto beans,\n" +
                        "%d mild salsa, %d med salsa, %d hot salsa, %d fajitas, \n" +
                        "%d lettuce, %d cheese, %d queso, %d guac, %d sour cream, and the sum is $%d",
                whiteRice, brownRice, chicken, steak , carnidas, chorizo , sofritas , veggiMeat, black,pinto, mild , medium , hot , fajitaveggies, lettuce , cheeseC, quesoC, guacC , sourCreamC, totalPrice
        );


    }
}
