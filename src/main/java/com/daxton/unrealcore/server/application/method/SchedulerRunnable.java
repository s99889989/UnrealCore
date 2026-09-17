package com.daxton.unrealcore.server.application.method;


//import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class SchedulerRunnable implements Runnable{

    private final boolean isFolia = Bukkit.getVersion().contains("Folia");
    private Object foliaTask;
    private BukkitTask bukkitTask;

    //======================================JAVA17=========================================//

//    public synchronized int getTaskId() throws IllegalStateException {
//        if(isFolia){
//            if(foliaTask != null){
//                if (foliaTask instanceof ScheduledTask) {
//                    return ((ScheduledTask) foliaTask).getExecutionState().ordinal();
//                }
//            }
//        }else {
//            if(bukkitTask != null){
//                return bukkitTask.getTaskId();
//            }
//
//        }
//
//        return -1;
//    }
//
//    //判斷是否還在執行
//    public synchronized boolean isCancelled() throws IllegalStateException {
//        if(isFolia){
//            if(foliaTask != null){
//                if (foliaTask instanceof ScheduledTask) {
//                    return ((ScheduledTask) foliaTask).isCancelled();
//                }
//            }
//        }else {
//            if(bukkitTask != null){
//                return bukkitTask.isCancelled();
//            }
//        }
//        return true;
//    }
//
//    //取消執行
//    public synchronized void cancel(){
//        if(isFolia){
//            if(foliaTask != null){
//                if (foliaTask instanceof ScheduledTask) {
//                    ((ScheduledTask) foliaTask).cancel();
//                }
//            }
//        }else {
//            if(bukkitTask != null){
//                bukkitTask.cancel();
//            }
//        }
//    }
//
//    //直接執行
//    public synchronized void runTask(Plugin plugin){
//        if(isFolia){
//            foliaTask = Bukkit.getGlobalRegionScheduler().run(plugin, t->this.run());
//        }else {
//            bukkitTask = Bukkit.getScheduler().runTask(plugin, this);
//        }
//
//    }
//
//    //異步執行
//    public synchronized void runAsync(Plugin plugin){
//        if(isFolia){
//            foliaTask = Bukkit.getGlobalRegionScheduler().run(plugin, t->this.run());
//        }else {
//            bukkitTask = Bukkit.getScheduler().runTaskAsynchronously(plugin, this);
//        }
//
//    }
//
//    //延後執行
//    public synchronized void runLater(Plugin plugin, long delayTicks){
//        if(isFolia){
//            foliaTask = Bukkit.getGlobalRegionScheduler().runDelayed(plugin, t->this.run(), delayTicks);
//        }else {
//            bukkitTask = Bukkit.getScheduler().runTaskLater(plugin, this, delayTicks);
//        }
//    }
//
//    //延後執行 異步
//    public synchronized void runLaterAsync(Plugin plugin, long delayTicks) {
//        if(isFolia){
//            foliaTask = Bukkit.getGlobalRegionScheduler().runDelayed(plugin, t->this.run(), delayTicks);
//        }else {
//            this.bukkitTask = Bukkit.getScheduler().runTaskLaterAsynchronously(plugin, this, delayTicks);
//        }
//
//    }
//
//    //定時執行
//    public synchronized void runTimer(Plugin plugin, long delayTicks, long periodTicks){
//        if(isFolia){
//            foliaTask = Bukkit.getGlobalRegionScheduler().runAtFixedRate(plugin, t->this.run(), delayTicks < 1 ? 1 : delayTicks, periodTicks);
//        }else {
//            bukkitTask = Bukkit.getScheduler().runTaskTimer(plugin, this, delayTicks, periodTicks);
//        }
//
//    }
//
//    //定時異步執行
//    public synchronized void runTimerAsync(Plugin plugin, long delayTicks, long periodTicks){
//        if(isFolia){
//            foliaTask = Bukkit.getGlobalRegionScheduler().runAtFixedRate(plugin, t->this.run(), delayTicks < 1 ? 1 : delayTicks, periodTicks);
//        }else {
//            bukkitTask = Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, this, delayTicks, periodTicks);
//        }
//    }


    //======================================JAVA8=========================================//


    public synchronized int getTaskId() throws IllegalStateException {
        if(bukkitTask != null){
            return bukkitTask.getTaskId();
        }
        return -1;
    }

    //判斷是否還在執行
    public synchronized boolean isCancelled() throws IllegalStateException {
        if(bukkitTask != null){
            return bukkitTask.isCancelled();
        }
        return true;
    }

    //取消執行
    public synchronized void cancel(){
        if(bukkitTask != null){
            bukkitTask.cancel();
        }
    }

    //直接執行
    public synchronized void runTask(Plugin plugin){
        bukkitTask = Bukkit.getScheduler().runTaskAsynchronously(plugin, this);
    }

    //異步執行
    public synchronized void runAsync(Plugin plugin){
        bukkitTask = Bukkit.getScheduler().runTaskAsynchronously(plugin, this);
    }

    //延後執行
    public synchronized void runLater(Plugin plugin, long delayTicks){
        bukkitTask = Bukkit.getScheduler().runTaskLater(plugin, this, delayTicks);
    }

    //延後執行 異步
    public synchronized void runLaterAsync(Plugin plugin, long delayTicks) {
        this.bukkitTask = Bukkit.getScheduler().runTaskLaterAsynchronously(plugin, this, delayTicks);
    }

    //定時執行
    public synchronized void runTimer(Plugin plugin, long delayTicks, long periodTicks){
        bukkitTask = Bukkit.getScheduler().runTaskTimer(plugin, this, delayTicks, periodTicks);
    }

    //定時異步執行
    public synchronized void runTimerAsync(Plugin plugin, long delayTicks, long periodTicks){
        bukkitTask = Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, this, delayTicks, periodTicks);
    }

}
