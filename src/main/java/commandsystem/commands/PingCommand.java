package commandsystem.commands;

import commandsystem.Command;
import logging.Logger;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class PingCommand extends Command{

    public PingCommand(String name, String description) {
        super("ping", "Checks if the bot is alive");
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length > 1) {
            Logger.argslength(",ping", event);
            return;
        }

        event.getChannel().sendMessage("Pong you little Faggo").queue();

        Logger.commandLog(getName(), event.getAuthor().getName(), event.getAuthor().getDiscriminator());
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
