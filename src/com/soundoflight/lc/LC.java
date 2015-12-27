package com.soundoflight.lc;

import org.jibble.pircbot.PircBot;

/**
 * Created by Soundoflight on 12/27/2015.
 */
public class LC extends PircBot {

    public LC() {
        this.setName("LucyBot");
    }

    public void onMessage(String channel, String sender,
                          String login, String hostname, String message) {
        if (message.equalsIgnoreCase("time")) {
            String time = new java.util.Date().toString();
            sendMessage(channel, sender + ": The time is now " + time);
        }
        if (message.equalsIgnoreCase("Hallo")) {
            sendMessage(channel, "Hey :)" + sender);
        }
    }
}
