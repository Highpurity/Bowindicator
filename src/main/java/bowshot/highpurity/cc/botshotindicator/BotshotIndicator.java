package bowshot.highpurity.cc.botshotindicator;

import bowshot.highpurity.cc.botshotindicator.Listeners.Bowshotlistener;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public final class BotshotIndicator extends JavaPlugin {

    @Override
    public void onEnable() {
       System.out.print(Color.GREEN + "BowshotIndicator is Initializing...");

        getServer().getPluginManager().registerEvents(new Bowshotlistener(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.print(Color.RED + "BowshotIndicator is now Disabling...");

    }
}
