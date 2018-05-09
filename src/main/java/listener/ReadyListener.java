package listener;

import logging.Logger;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.requests.restaction.MessageAction;
import org.apache.http.util.Args;

import java.time.OffsetTime;

public class ReadyListener extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent event) {

            int Hour = OffsetTime.now().getHour();
            int Minute = OffsetTime.now().getMinute();
            int Second = OffsetTime.now().getSecond();


            Logger.positLog("Bot started working at "+ Hour + ":" + Minute + ":" + Second);
            Logger.informationLog("Working on following servers: " + event.getJDA().getGuilds() + "\n");
        }
        }


