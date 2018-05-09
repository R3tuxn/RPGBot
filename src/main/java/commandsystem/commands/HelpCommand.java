package commandsystem.commands;

import commandsystem.Command;
import commandsystem.CommandManager;
import logging.Logger;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;
import java.time.Instant;

public class HelpCommand extends Command{

    public HelpCommand(String name, String description) {
        super("help", "Shows you a command list", ",help | ,help usage <Command>");
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length > 1) {
            Logger.argslength(",help", event);
            return;
        }


        EmbedBuilder em1 = new EmbedBuilder();

            String Ping = "`,ping` *Shows the bot ping!*";
            String Help = "`,help` *Open this message!*";

            em1.setTitle("Help")
            .setColor(Color.orange)
            .addField("", Ping, false)
            .addField("", Help, false)
            .setFooter(event.getAuthor().getName(), event.getAuthor().getEffectiveAvatarUrl())
            .setTimestamp(Instant.now());

            event.getTextChannel().sendMessage(em1.build()).queue();

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

    @Override
    public String getUsage() {
        return super.getUsage();
    }
}
