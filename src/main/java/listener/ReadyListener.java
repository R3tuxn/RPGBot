package listener;

import logging.Logger;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.sql.Time;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetTime;
import java.time.ZoneId;

public class ReadyListener extends ListenerAdapter{

    @Override
    public void onReady(ReadyEvent event) {

        Logger.positLog("Bot started working at " + OffsetTime.now().getHour() + ":0" + OffsetTime.now().getMinute() + ":" + OffsetTime.now().getSecond());
        Logger.informationLog("Working on following servers: " + event.getJDA().getGuilds() + "\n");
    }
}
