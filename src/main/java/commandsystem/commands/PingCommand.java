package commandsystem.commands;

import commandsystem.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class PingCommand extends Command{

    public PingCommand(String name, String description) {
        super("ping", "Checks if the bot is alive");
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getChannel().sendMessage("Pong you little Faggo").queue();
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
