package commandsystem;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public abstract class Command {

    private String name;
    private String description;

    public Command(String name, String description){
        this.name = name;
        this.description = description;
    }


    public abstract void action(String[] args, MessageReceivedEvent event);


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
