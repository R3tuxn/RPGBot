package core;

import listener.ReadyListener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import util.Secrets;
import util.Static;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args){

        JDABuilder builder = new JDABuilder(AccountType.BOT);

        builder.setToken(Secrets.TOKEN);
        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setGame(Game.playing(Static.GAME));


        builder.addEventListener(new ReadyListener());

        try {
            JDA jda = builder.buildBlocking();
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void addCommand() throws LoginException, InterruptedException {


    }
}

