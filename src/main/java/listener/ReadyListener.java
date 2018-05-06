package listener;

import logging.Logger;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter{

    @Override
    public void onReady(ReadyEvent event) {
        Logger.positLog("Bot started at " + System.currentTimeMillis());
        Logger.informationLog("Working on following servers: " + event.getJDA().getGuilds());
    }
}
