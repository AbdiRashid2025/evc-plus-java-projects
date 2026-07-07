/*
 ==========================================
 NAME : ABDIRISHID XASAN YUSUF
 ID : C1240287
 CLASS : CA244

 Code kan dhan logikisa iyo syntax ka waa mid saxan code kayga meel ka mid ah wxan u adeegsadey  AI waana showDateAndTime(),
 kaso ku tusinayo "Date & Time".code intiisa badan wxan usameeya method si code aan ufahmo cilad haddi ay timaado ama wax ka badalis
 sido kle ay u fahmaan programmer's kale.
 ==========================================

 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    static double Haraaga = 300;

    /* ================================
       Main Entry Method - Barnaamijka halka uu ka bilaabanayo EVC Plus.
      ================================
     */
    public static void main(String[] args) {
        System.out.print("Hello Welcome to EVS-PLUS 😍 ");
        String next = input.nextLine();

        if (next.equalsIgnoreCase("Hi")){
            evs_plus();
        }else {
            System.out.println("Thanks you Good Bye!👋");
        }

    }


    static void evs_plus(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        String inputUser = input.nextLine();
        String shortCut = "*770#";
        if (inputUser.equalsIgnoreCase(shortCut)){
            chooseOption();
        }else {
            System.out.print("sorry,invalid message format.");
        }
    }

    /* ==========================================
       Date & Time Utility - Wuxuu soo celiyaa
       taariikhda iyo waqtiga hadda.
       ==========================================
     */
    static String showDateAndTime() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return now.format(format);
    }

    /* ==========================================
      Security Method - Wuxuu hubiyaa PIN-ka
      isticmaalaha (Maximum 3 attempts).
      ==========================================
     */
    static boolean PinCheck() {
        Scanner input = new Scanner(System.in);
        int password = 1212;
        int attempt = 3;

        for (int i = 1; i <= attempt; i++) {

            System.out.print("Enter your PIN: ");
            int inputPassword = input.nextInt();

            if (inputPassword == password) {
                return true;
            } else {
                if (i < attempt) {
                    System.out.println("PIN waa qalad!");
                } else {
                    System.out.println("Waa la xayiray number-kan 30 daqiiqo");
                }
            }
        }

        return false;
    }



    /* ==========================================
       Menu Method - Qeybtan waxay soo bandhigtaa
       adeegyada EVC Plus kadib marka PIN-ka la xaqiijiyo.
       ==========================================
 */
    static void  chooseOption(){
        if (!PinCheck()) {
            return;
        }
        System.out.print("EVC-PLUS  \n 1. Itus Haraaga \n 2. Kaarka Hadalka  \n 3. U Wareeji EVCPlus  \n 4. Maareynta \n 5. Salaam Bank \n 6. Warbixin Kooban \n 7. Bixi Biil \n 8. Ka Bax \n   ENTER: ");
        int dooro = input.nextInt();

        switch(dooro){
            case 1:
                itusHaraaga();
                break;
            case 2:
                kaarkaHadalka();
                break;
            case 3:
                uWareeji();
                break;
            case 4:
                maareynta();
                break;
            case 5:
                salaamBank();
                break;
            case 6:
                warbixinKooban();
                break;
            case 7:
                bixiBiil();
                break;
            case 8:
                System.out.println("Mahadsanid!");
            default:
                System.out.println("fadlan dooro number jira ama sax ah");

        }

    }

    /*
     ==========================================
     this method waa Haraga itus
     ==========================================
     */
    static void itusHaraaga(){
        System.out.print("Haragaagu waa $" + Haraaga);
    }

    /*
 ==========================================
 this method waa kaarka ku hadalka Data & ku ku hadal
 ==========================================

 */
    static void kaarkaHadalka(){

        System.out.print("Kaarka Hadalka  \n1. KU Shubo ku hadal \n 2. ku shubo Internet \n Enter:");
        int cardHadalka = input.nextInt();
        if (cardHadalka == 1) {
            System.out.print("1. Ku hadal gudaha ah \n 2. Ku hadal dibada ah \n Enter: ");
            int kuHadal = input.nextInt();
            if (kuHadal == 1) {
                System.out.print("Fadlan soo Gali lacagta: ");
                double lacagta = input.nextDouble();
                System.out.print("Ma hubtaa inaad ku shubaneysid $" + lacagta + " dolar \n 1. Haa 2. Maya \n ENTER: ");
                int check = input.nextInt();
                if (check == 1) {
                    if (!PinCheck()) {
                        return;
                    }
                    if (lacagta <= Haraaga) {
                        System.out.print("Waxa ku shubatey ku hadal ku hadaha ah $" + lacagta + " dolar, Tariikhda: "+ showDateAndTime()+ " Haraagaagu waa " + (Haraaga - lacagta));
                    } else {
                        System.out.print("Haraaga xisaabta kugu ma filna");
                    }
                } else {
                    System.out.println("Mahadsanid!");
                }
            } else if (kuHadal == 2) {
                System.out.print("Fadlan soo Gali lacagta ");
                double lacagta = input.nextDouble();
                System.out.print("Ma hubtaa inaad ku shubaneysid $" + lacagta + " dolar \n 1. Haa 2. Maya \n ENTER: ");
                int check = input.nextInt();
                if (check == 1) {
                    if (!PinCheck()) {
                        return;
                    }
                    if (lacagta <= Haraaga) {
                        System.out.println("Waxa ku shubatey ku hadal ku hadaha ah $" + lacagta + " dolar, Taarikhda: " +showDateAndTime()+" Haraagaagu waa " + (Haraaga - lacagta));
                    } else {
                        System.out.println("Haraaga xisaabta kugu ma filna");
                    }
                } else {
                    System.out.println("Mahadsanid!");
                }

            } else {
                System.out.println("fadlan dooro Number sax ah ");
            }
        } else if (cardHadalka == 2) {
            System.out.print("1. Ku shubo Bille \n 2. Ku shubo isbuucle \n Enter: ");
            int internet = input.nextInt();
            if (internet == 1) {
                System.out.print("Fadlan soo Gali lacagta ");
                double lacagta = input.nextDouble();
                System.out.print("Ma hubtaa inaad ku shubaneysid $" + lacagta + " dolar \n 1. Haa 2. Maya \n ENTER: ");
                int check = input.nextInt();
                if (check == 1) {
                    if (!PinCheck()) {
                        return;
                    }
                    if (lacagta == 30) {
                        System.out.println("Waxa ku shubatey internet bille ah $" + lacagta + " dolar" +showDateAndTime()+" wuxuu ka dhamana "+(showDateAndTime()+30)+ " Haraagaagu waa " + (Haraaga - lacagta));
                    } else {
                        System.out.println("waxa laga rabaa qidmo dhan $30 dolar!");
                    }
                } else {
                    System.out.println("Mahadsanid!");
                }
            } else if (internet == 2) {
                System.out.print("Fadlan soo Gali lacagta ");
                double lacagta = input.nextDouble();
                System.out.print("Ma hubtaa inaad ku shubaneysid $" + lacagta + " dolar \n 1. Haa 2. Maya \n ENTER: ");
                int check = input.nextInt();
                if (check == 1) {
                    if (!PinCheck()) {
                        return;
                    }
                    if (lacagta == 5) {
                        System.out.println("Waxa ku shubatey internet isbuucle ah  $" + lacagta + " dolar,Tariikhda: "+showDateAndTime()+" wuxuu ka dhamana "+(showDateAndTime()+7)+ " Haraagaagu waa " + (Haraaga - lacagta));
                    } else {
                        System.out.println("waxa laga rabaa qidmo dhan $5 dolar!");
                    }
                } else {
                    System.out.println("Mahadsanid!");
                }

            } else {
                System.out.println("fadlan dooro Number sax ah ");
            }
        }

    }

        /*
     ==========================================
     this method waa lacag diris inaa qof kale u wareejisid lacag
     ==========================================

     */

    static void uWareeji(){
        String phoneNumber = "612786733";
        System.out.print("fadlan soo gali number ka: ");
        String phoneInput = input.next();
        if (phoneNumber.equalsIgnoreCase(phoneInput)) {
            System.out.println("Diraha iyo loo Diraha isku mid ma noqon karaan");
        }else if (!phoneInput.matches("61\\d{7}")) {
            System.out.println("Number-ka ma aha mid jira");
        }else {
            System.out.print("fadlan soo gali lacagta: ");
            double lacagta = input.nextDouble();
            if (lacagta <= Haraaga) {
                System.out.print("Ma hubtaa inaad $" + lacagta + " u wareejineysid " + phoneInput + "? \n1. Haa 2. Maya  \n ENTER: ");
                int check = input.nextInt();
                if (check == 1) {
                    if (!PinCheck()) {
                        return;
                    }
                    Haraaga -= lacagta;
                    System.out.println("[-EVCPLUS-] $" + lacagta + " ayaad u wareejisay " + phoneInput +" Tariikhda: "+showDateAndTime()+ " Haraagaagu waa $" + Haraaga);
                }else {
                    System.out.println("Mahadsanid!");
                }
            }else {
                System.out.println("Haraaga kuma filna!");
            }
        }


    }

        /*
     ==========================================
     this method waxa qabana ina iska badashid luqada ama Pinka hore
     ==========================================

     */

    static void maareynta(){

        System.out.print("Maareynta \n 1. Badal pin ka \n 2. Badal luuqada \n Enter: ");

        int doorasho = input.nextInt();

        if (doorasho == 1){
            System.out.print("soo gali pin ka hore: ");
            String inputPin = input.next();

            System.out.print("soo gali pin ka cusub: ");
            String newPin = input.next();

            if (newPin.length() != 4 || inputPin.length() != 4) {
                System.out.println("Invalid input!");
            }
            else if (inputPin.equals(newPin)) {
                System.out.println("Invalid input!");
            }
            else {
                System.out.println("Waad ku guuleysate inaad badasho pin ka");
            }
        } else if (doorasho == 2) {
            System.out.print("1. English \n 2. Carabi \n 3. Somalia \n Enter : ");
            int luqad = input.nextInt();

            if (luqad == 1){
                System.out.println("You have successfully changed the language.");
            } else if (luqad == 2){
                System.out.println("لقد نجحت في تغيير اللغة.");
            } else if (luqad == 3) {
                System.out.println("waxa ku guuleysate inaad badasho luuqada");
            }else {
                System.out.println("fadlan dooro number jira ama sax ah");
            }
        }


    }

    /*
 ==========================================
 this method salaam bank
 ==========================================

 */
    static void salaamBank(){
        System.out.println("\nSalaam Bank");
        System.out.println("1. Itus Haraaga Bankiga");
        System.out.println("2. Lacag Dhigasho");
        System.out.println("3. Lacag Kala Bax");
        System.out.println("4. Ka Noqo");
        System.out.print("Enter: ");
        int bankChoice = input.nextInt();
        double bankBalance = 1000;

        if (bankChoice == 1) {
            System.out.println("Haraaga Bankiga waa $" + bankBalance+" dollar");
        }else if (bankChoice == 2) {
            System.out.print("Geli lacagta aad dhigeyso: ");
            double deposit = input.nextDouble();

            System.out.print("ma hubta inaad dhigeysid Salaam bank $" + deposit + " dolar \n 1. Haa 2. Maya \n ENTER: ");
            int check = input.nextInt();
            if (check ==1){
                if (!PinCheck()) {
                    return;
                }
                if (deposit <= bankBalance) {
                    System.out.println("Waxaad dhigatay Salaam bank lacag dhan $" + deposit + " dolar Tariikhda: "+ showDateAndTime());
                    Haraaga -= deposit;
                    bankBalance +=deposit;
                    System.out.println("Haraaga Bankiga waa $" + bankBalance);
                }else {
                    System.out.println("Xadiga lagu tala galay waad dhaaftey!");
                }
            } else if (check ==2 ) {
                System.out.println("Mahadsanid!");
            }else{
                System.out.println("fadlan dooro number jira ama sax ah");
            }
        }else if (bankChoice == 3) {
            System.out.print("Geli lacagta aad kala baxayso: ");
            double withdraw = input.nextDouble();
            System.out.print("ma hubtaa inaad Salaam bank  kala baxayso $" + withdraw +" dolar \n 1. Haa  2. Maya \n Enter: ");
            int check = input.nextInt();
            if (check == 1){
                if (!PinCheck()) {
                    return;
                }
                if (withdraw <= bankBalance) {
                    Haraaga += withdraw;
                    System.out.println("Waxaad kala baxday Salaam bank lacag dhan  $" + withdraw+ " dolar,Tariikhda: "+showDateAndTime());
                    bankBalance -= withdraw;
                    System.out.println("Haraaga Bankiga waa $" + bankBalance );
                }
                else {
                    System.out.println("Haraaga bankiga kuma filna!");
                }
            } else if (check==2) {
                System.out.println("Mahadsanid!");
            }else {
                System.out.println("fadlan dooro number jira ama sax ah");
            }
        }else if (bankChoice == 4) {
            System.out.println("Mahadsanid!.");
        }else {
            System.out.println("fadlan dooro number sax ah");
        }


    }

    /*
 ==========================================
 this method wxu qabana inaad artid last action aad sameyse lacagaha aad dirtay io ku lagu soo diray
 ==========================================

 */
    static void warbixinKooban(){
        int[] phones = {612786733,613445566,617233210};
        System.out.println("Warbixin Kooban");
        System.out.print("1.Last Action \n 2.Wareejintii u dambeysay \n 4.Last 3 Action  \n 4.Iibsashadii u dambeysay \n Enter: ");
        int dooro = input.nextInt();

        switch (dooro) {
            case 1:
                System.out.println("$20 ayaad u wareejisay "+phones[0]+", Tariikhda "+showDateAndTime());
                break;
            case 2:
                System.out.print("Statementiga :\n 1.U dirtay \n 2.Ka heshay \n  Enter: ");
                int state = input.nextInt();
                if (state==1) {
                    System.out.print("Fadlan soo gali number-ka:");
                    int numberKa = input.nextInt();

                    System.out.println("");

                    System.out.println("$20 ayaad u wareejisay "+numberKa+", Tariikhda "+showDateAndTime());
                }else if (state==2) {
                    System.out.print("Fadlan soo gali number-ka:");
                    int numberKa = input.nextInt();

                    System.out.println("");

                    System.out.println("$20 ayaad u wareejisay "+numberKa+", Tariikhda "+showDateAndTime());
                }else {
                    System.out.println("fadlan dooro number jira ama sax ah!");
                }
                break;
            case 3:
                System.out.println("$20 ayaad ka heshay "+phones[2]+", Tariikhda "+showDateAndTime());
                break;
        }
    }


    static void bixiBiil(){
        System.out.println("Bixi Biil");

        System.out.print("Geli magaca shirkadda: ");
        String company = input.next();

        System.out.print("Geli lacagta: $");
        double amount = input.nextDouble();

        if (amount > Haraaga) {
            System.out.println("Haraag kugu filan ma jiro!");
            return;
        }else {
            System.out.println("waxad bixisay biil ka  "+company+ " lacagta "+amount+" tariikh: "+showDateAndTime());
        }
    }
}
