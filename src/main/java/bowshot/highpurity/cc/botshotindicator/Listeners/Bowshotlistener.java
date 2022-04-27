package bowshot.highpurity.cc.botshotindicator.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

public class Bowshotlistener implements Listener {
    @EventHandler
    public void onShootBow(EntityShootBowEvent e){

        Entity entity = e.getEntity();
        Player player = (Player) entity;


        if (e.getEntityType() == EntityType.PLAYER) {

            player.sendMessage("Test");

        }

    }
}
