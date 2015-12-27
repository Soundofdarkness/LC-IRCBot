package com.soundoflight.lc;

/**
 * Created by Soundoflight on 12/27/2015.
 */
public class LCMain {

    public static void main(String[] args) throws Exception
    {
        LC bot = new LC();

        //Enable Debugging
        bot.setVerbose(true);

        //Serverconnection
        bot.connect("irc.freenode.net");

        //Join the #? channel
        bot.joinChannel("#pircbot");
    }
}
