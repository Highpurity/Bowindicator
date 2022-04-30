package bowshot.highpurity.cc.botshotindicator.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class Bowshotlistener implements Listener {
    @EventHandler
    public void onProjectileHit(ProjectileHitEvent e) {
        if (!(e.getEntity() instanceof Arrow arrow)) {
            return;
        }

        if (!(arrow.getShooter() instanceof Player shooter)) {
            return;
        }

        if (e.getHitEntity() instanceof Player hitPlayer){
            shooter.sendMessage(ChatColor.RED + hitPlayer.getName() + " is on " + hitPlayer.getHealth() + " HP! ");
        }
    }
}
