package listener;

import commandsystem.CommandManager;
import logging.Logger;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter{

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(event.getMessage().getContentRaw().startsWith(","))
        {
            if(!event.getAuthor().isBot() && event.getAuthor().getId() != event.getJDA().getSelfUser().getId()){
                event.getMessage().getContentRaw().replace(",", "");
                String arg = event.getMessage().getContentRaw().replaceFirst(",", "");
                String[] args = arg.split(" ");

                CommandManager commandManager = new CommandManager();
                commandManager.callCommmands(args, event);
            }
        }
    }
}
