package commandsystem;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public abstract class Command {

    private String name;
    private String description;
    private String usage;

    public Command(String name, String description, String usage){
        this.name = name;
        this.description = description;
        this.usage = usage;
    }


    public abstract void action(String[] args, MessageReceivedEvent event);


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUsage(){
        return usage;
    }
}
