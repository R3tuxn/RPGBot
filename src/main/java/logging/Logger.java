package logging;

public class Logger {

    public Logger(){

    }

    //Das ist die Methode für positive Sachen
    public static void positLog(String s){
        System.out.println("[+] - " + s);
    }

    public static void negatLog(String s){
        System.out.println("[-] - " + s);
    }

    public static void warningLog(String s){
        System.out.println("[!] - " + s);
    }

    public static void fatalErrorLog(String s){
        System.out.println("[X] - " + s);
    }

    public static void informationLog(String s){
        System.out.println("[i] - " + s);
    }
}
