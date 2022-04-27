package bowshot.highpurity.cc.botshotindicator;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public final class BotshotIndicator extends JavaPlugin {

    @Override
    public void onEnable() {
       System.out.print(Color.GREEN + "BowshotIndicator is Initializing...");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.print(Color.RED + "BowshotIndicator is now Disabling...");

    }
}
