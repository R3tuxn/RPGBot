package commandsystem.commands;

import commandsystem.Command;
import commandsystem.CommandManager;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class HelpCommand extends Command{

    public HelpCommand(String name, String description) {
        super("help", "Shows you a command list");
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
            if(args[1] != null){
                EmbedBuilder builder = new EmbedBuilder();
                builder.setTitle("Commandlist");
                builder.setColor(Color.ORANGE);
                builder.setFooter("Requested by " + event.getAuthor().getName(), event.getAuthor().getAvatarUrl());
                for(Command c : CommandManager.commands){
                    if(args[1].equalsIgnoreCase(c.getName())){
                        builder.setDescription(c.getName() + " " + c.getDescription());
                    }
                }
                event.getTextChannel().sendMessage(builder.build()).queue();
            }else{
                EmbedBuilder builder = new EmbedBuilder();
                builder.setTitle("Commandlist");
                builder.setColor(Color.ORANGE);
                builder.setFooter("Requested by " + event.getAuthor().getName(), event.getAuthor().getAvatarUrl());
                builder.setDescription(
                        CommandManager.commands.get(0).getName() + " " + CommandManager.commands.get(0).getDescription() + "\n" +
                                CommandManager.commands.get(1).getName() + " " + CommandManager.commands.get(1).getDescription()
                );
                event.getTextChannel().sendMessage(builder.build()).queue();
            }
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
