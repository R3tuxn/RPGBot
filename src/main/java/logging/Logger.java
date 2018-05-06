package logging;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

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

    public static void commandLog(String command, String user, String userid)
    {
        System.out.println("--------------------------------------");
        Logger.informationLog("Message received by " + user + "#" + userid);
        Logger.informationLog("[COMMAND] " + command);
        System.out.println("---------------------------------------\n");
    }
    public static void argslength(String command, MessageReceivedEvent event) {

        event.getTextChannel().sendMessage(new EmbedBuilder().setDescription("Please use `" + command + "`!").setColor(Color.red).build()).queue();

    }
}
