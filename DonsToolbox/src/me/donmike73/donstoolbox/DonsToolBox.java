package me.donmike73.donstoolbox;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class DonsToolBox extends JavaPlugin {
	
	public void onEnable(){
		this.getLogger().info("Your plugin has been enabled!");
	}
 
	public void onDisable(){
		this.getLogger().info("Your plugin has been disabled.");
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	if(cmd.getName().equalsIgnoreCase("fly")){

    		if (sender instanceof Player) {
    			if ( ((Player) sender).getAllowFlight() ) {
        			this.getLogger().info( "Disabled fly mode for user " + sender.getName() );
        			sender.sendMessage("Flugmodus wurde deaktiviert!" );
    				((Player) sender).setAllowFlight(false);
    			}
    			else {
    				this.getLogger().info( "Enabled fly mode for user " + sender.getName() );
        			sender.sendMessage("Flugmodus wurde aktiviert!" );
    				((Player) sender).setAllowFlight(true);;
    			}
    		}
    		else {
    			sender.sendMessage("Du musst ein Spieler sein!" );
    		}
    		
    		return true;
    	}
    	return false; 
    }


}
