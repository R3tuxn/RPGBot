package commandsystem;

import commandsystem.commands.AddCharacterCmd;
import commandsystem.commands.HelpCommand;
import commandsystem.commands.PingCommand;
import logging.Logger;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.ArrayList;

public class CommandManager {

    //Commandlist
    public static ArrayList<Command> commands = new ArrayList<>();

    //Hier fügt man Commands in die Commandlist hinzu
    public CommandManager(){
        commands.add(new PingCommand("", ""));
        commands.add(new HelpCommand("", ""));
        commands.add(new AddCharacterCmd("", "", ""));
    }

    //Hier geht der Bot alle Commands durch und überprüft ob ein Command aufgerufen wurde
    public void callCommmands(String[] args, MessageReceivedEvent e){
        for(Command c : commands){
            if(args[0].equalsIgnoreCase(c.getName())){
                c.action(args, e);
                return;
            }
        }
    }
}
