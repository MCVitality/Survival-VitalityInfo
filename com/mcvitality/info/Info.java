/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcvitality.info;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Harry.Williams
 */
public class Info extends JavaPlugin {
    
    public void onEnable() {
        System.out.println("[MCVitalityInfo] Plugin enabled");
        
    }
    public void onDisable() {
                System.out.println("[MCVitalityInfo] Plugin disabled");
    }
    //Command
    public boolean onCommand(CommandSender s, Command c, String l, String [] args) {
        if(l.equalsIgnoreCase("donate")) {
       s.sendMessage(ChatColor.GOLD + "===================" + ChatColor.BLUE +"[" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.DARK_RED + ChatColor.BOLD + "MCVitality" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.BLUE + "]"+ ChatColor.GOLD + "===================" );
	s.sendMessage(ChatColor.WHITE + "Donate for awesome perks at " + ChatColor.GOLD + "http://donate.mcvitality.com/");
            
        }
                                      if(l.equalsIgnoreCase("twitter")) {
           s.sendMessage(ChatColor.GOLD + "===================" + ChatColor.BLUE +"[" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.DARK_RED + ChatColor.BOLD + "MCVitality" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.BLUE + "]"+ ChatColor.GOLD + "===================" );                              
            s.sendMessage(ChatColor.WHITE + "Follow us on Twitter " + ChatColor.GOLD + "http://twitter.com/MCVitality_Dev");
            
        }
                        if(l.equalsIgnoreCase("facebook")) {
           s.sendMessage(ChatColor.GOLD + "===================" + ChatColor.BLUE +"[" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.DARK_RED + ChatColor.BOLD + "MCVitality" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.BLUE + "]"+ ChatColor.GOLD + "===================" );
            s.sendMessage(ChatColor.WHITE + "Like us on Facebook " + ChatColor.GOLD + "http://facebook.com/MCVitality");
            
        }
                                        if(l.equalsIgnoreCase("website")) {
                       s.sendMessage(ChatColor.GOLD + "===================" + ChatColor.BLUE +"[" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.DARK_RED + ChatColor.BOLD + "MCVitality" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.BLUE + "]"+ ChatColor.GOLD + "===================" );
            s.sendMessage(ChatColor.WHITE + "Check out the NEW website " + ChatColor.GOLD + "http://mcvitality.com/");
            
        }
                
                                                                                if(l.equalsIgnoreCase("vote")) {
            s.sendMessage(ChatColor.GOLD + "===================" + ChatColor.BLUE +"[" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.DARK_RED + ChatColor.BOLD + "MCVitality" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.BLUE + "]"+ ChatColor.GOLD + "===================" );
            s.sendMessage(ChatColor.DARK_RED +"[1] " + ChatColor.BLUE +"Click the link: http://vote.mcvitality.com");
            s.sendMessage(ChatColor.DARK_RED +"[2] " + ChatColor.BLUE +"Click on all of the links and add your name");
            s.sendMessage(ChatColor.DARK_RED +"[3] " + ChatColor.BLUE +"Add the Captcha on all sites");
            s.sendMessage(ChatColor.DARK_RED +"[4] " + ChatColor.BLUE +"Once done, click on " + ChatColor.GREEN + "'Vote'");
            s.sendMessage(ChatColor.RED + "You can vote every 24 hours");
        }
                                                                                
                                                                                
                                                                             if(l.equalsIgnoreCase("trusted")) {
            s.sendMessage(ChatColor.GOLD + "===================" + ChatColor.BLUE +"[" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.DARK_RED + ChatColor.BOLD + "MCVitality" + ChatColor.GOLD + ChatColor.MAGIC + "fd" + ChatColor.BLUE + "]"+ ChatColor.GOLD + "===================" );
            s.sendMessage(ChatColor.DARK_RED +"[1] " + ChatColor.BLUE +"Click the link: http://mcvitality.com");
            s.sendMessage(ChatColor.DARK_RED +"[2] " + ChatColor.BLUE +"Signup by clicking " + ChatColor.GREEN + "'Sign up'" );
            s.sendMessage(ChatColor.DARK_RED +"[3] " + ChatColor.BLUE +"Click the link and like the facebook page: http://facebook.com/mcvitality");
            s.sendMessage(ChatColor.DARK_RED +"[4] " + ChatColor.BLUE +"Click the link and follow us on twitter: http://twitter.com/mcvitality_dev");
            s.sendMessage(ChatColor.DARK_RED +"[5] " + ChatColor.BLUE +"Check on the website to make sure you have 25 Posts");
            s.sendMessage(ChatColor.DARK_RED +"[6] " + ChatColor.BLUE +"Post a promotion request on the promotion section of the forums.");
            s.sendMessage(ChatColor.RED + "Requests can take upto 24 hours to be approved");
        }

                    return true;
    }
}