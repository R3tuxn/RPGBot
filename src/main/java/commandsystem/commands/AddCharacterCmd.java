package commandsystem.commands;

import commandsystem.Command;
import game.Character;
import game.GameManager;
import logging.Logger;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class AddCharacterCmd extends Command{

    public AddCharacterCmd(String name, String description, String usage) {
        super("addchar", "You can create a character in the game", ",addchar");
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if(args.length > 8){
            Logger.argslength(",addchar", event);
            return;
        }

        GameManager.characters.add(new Character(args[1], args[2], Integer.parseInt(args[3]), Boolean.parseBoolean(args[4]), args[5], Boolean.parseBoolean(args[6]), Boolean.parseBoolean(args[7])));
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("SUCCESSFULLY CREATED A CHARACTER");
        builder.setColor(Color.ORANGE);
        builder.setDescription("`NAME:` " + GameManager.characters.get(0).getName() + "\n" +
                "`LASTNAME:` " + GameManager.characters.get(0).getLastname() + "\n" +
                "`AGE:` " + GameManager.characters.get(0).getAge());

        event.getTextChannel().sendMessage(builder.build()).queue();



    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String getUsage() {
        return super.getUsage();
    }
}
