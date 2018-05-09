package logging;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import util.Static;

import java.awt.*;
import java.time.OffsetTime;

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

        String Number1 = "", Number2 = "", Number3 = "";

        int Hour = OffsetTime.now().getHour();
        int Minute = OffsetTime.now().getMinute();
        int Second = OffsetTime.now().getSecond();

        if (Minute < 1) {
            Number1 = "0";
        }
        if (Hour < 1) {
            Number2 = "0";
        }
        if (Second < 1) {
            Number3 = "0";
        }

        System.out.println("--------------------------------------");
        Logger.informationLog("Message received by " + user + "#" + userid);
        Logger.informationLog("[COMMAND] " + command);
        Logger.informationLog(Number2 + Hour + ":" + Number1 + Minute + ":" + Number3 + Second);
        System.out.println("---------------------------------------\n");
    }
    public static void argslength(String command, MessageReceivedEvent event) {

        event.getTextChannel().sendMessage(new EmbedBuilder().setDescription("Please use `" + command + "`!").setColor(Color.red).build()).queue();

    }

}
