package listener;

import logging.Logger;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.time.OffsetTime;

public class ReadyListener extends ListenerAdapter{

    @Override
    public void onReady(ReadyEvent event) {

        String Number1 = "", Number2 = "", Number3 = "";

       int Hour = OffsetTime.now().getHour();
       int Minute = OffsetTime.now().getMinute();
       int Second = OffsetTime.now().getSecond();

        if (Minute < 1) {
            Number1 = "0";
        }
        if (Hour < 1) {
            Number2 = "0";
        }
        if (Second < 1) {
            Number3 = "0";
        }

        Logger.positLog("Bot started working at " + Number2 + Hour + ":" + Number1 + Minute + ":" + Number3 + Second);
        Logger.informationLog("Working on following servers: " + event.getJDA().getGuilds() + "\n");
    }
}
