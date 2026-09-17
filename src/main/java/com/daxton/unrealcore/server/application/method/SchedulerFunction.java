package com.daxton.unrealcore.server.application.method;

//import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

public class SchedulerFunction {

    public static final boolean isFolia = Bukkit.getVersion().contains("Folia");

    public static boolean isFolia(){
        return isFolia;
    }

    //======================================JAVA17=========================================//

//    public static void run(Plugin plugin, Runnable runnable){
//
//        if(isFolia){
//            Bukkit.getGlobalRegionScheduler().execute(plugin, runnable);
//            return;
//        }
//        Bukkit.getScheduler().runTask(plugin, runnable);
//    }
//
//    public static void runAsyncThenSync(Plugin plugin, Runnable asyncTask, Runnable afterSyncTask) {
//        if(isFolia){
//            Bukkit.getGlobalRegionScheduler().execute(plugin, () -> {
//                asyncTask.run();
//                Bukkit.getScheduler().runTask(plugin, afterSyncTask); // 回主執行緒
//            });
//            return;
//        }
//        Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
//            asyncTask.run();
//            Bukkit.getScheduler().runTask(plugin, afterSyncTask); // 回主執行緒
//        });
//    }
//
//    public static void runAsync(Plugin plugin, Runnable runnable){
//        if(isFolia){
//            Bukkit.getGlobalRegionScheduler().execute(plugin, runnable);
//            return;
//        }
//        Bukkit.getScheduler().runTaskAsynchronously(plugin, runnable);
//    }
//
//    public static RunTask runLater(Plugin plugin, Runnable runnable, long delayTicks){
//        if(isFolia){
//            return  new RunTask(Bukkit.getGlobalRegionScheduler()
//                    .runDelayed(plugin, t->runnable.run(), delayTicks));
//        }
//        return new RunTask(Bukkit.getScheduler().runTaskLater(plugin, runnable, delayTicks)) ;
//    }
//
//    public synchronized RunTask runLaterAsync(Plugin plugin, Runnable runnable, long delayTicks) {
//        if(isFolia){
//            return  new RunTask(Bukkit.getGlobalRegionScheduler()
//                    .runDelayed(plugin, t->runnable.run(), delayTicks));
//        }
//        return new RunTask(Bukkit.getScheduler().runTaskLaterAsynchronously(plugin, runnable, delayTicks));
//    }
//
//    public static RunTask runTimer(Plugin plugin, Runnable runnable, long delayTicks, long periodTicks){
//        if(isFolia){
//            return  new RunTask(Bukkit.getGlobalRegionScheduler()
//                    .runAtFixedRate(plugin, t->runnable.run(), delayTicks < 1 ? 1 : delayTicks, periodTicks));
//
//        }
//        return new RunTask(Bukkit.getScheduler().runTaskTimer(plugin, runnable, delayTicks, periodTicks)) ;
//    }
//
//    public static RunTask runTimerAsync(Plugin plugin, Runnable runnable, long delayTicks, long periodTicks){
//        if(isFolia){
//            return  new RunTask(Bukkit.getGlobalRegionScheduler()
//                    .runAtFixedRate(plugin, t->runnable.run(), delayTicks < 1 ? 1 : delayTicks, periodTicks));
//
//        }
//        return new RunTask(Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, runnable, delayTicks, periodTicks)) ;
//    }
//
//    public static class RunTask {
//        private Object foliaTask;
//        private BukkitTask bukkitTask;
//
//        RunTask(Object foliaTask){
//            this.foliaTask = foliaTask;
//        }
//
//        RunTask(BukkitTask bukkitTask){
//            this.bukkitTask = bukkitTask;
//        }
//
//        public void cancel(){
//            if (isFolia && foliaTask instanceof ScheduledTask) {
//                ((ScheduledTask) foliaTask).cancel();
//            }
//            if (bukkitTask != null) {
//                bukkitTask.cancel();
//            }
//        }
//
//    }

    //JAVA8===============================================================================


    public static void run(Plugin plugin, Runnable runnable){
        Bukkit.getScheduler().runTask(plugin, runnable);
    }

    public static void runAsyncThenSync(Plugin plugin, Runnable asyncTask, Runnable afterSyncTask) {
        Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
            asyncTask.run();
            Bukkit.getScheduler().runTask(plugin, afterSyncTask); // 回主執行緒
        });
    }

    public static void runAsync(Plugin plugin, Runnable runnable){
        Bukkit.getScheduler().runTaskAsynchronously(plugin, runnable);
    }

    public static RunTask runLater(Plugin plugin, Runnable runnable, long delayTicks){
        return new RunTask(Bukkit.getScheduler().runTaskLater(plugin, runnable, delayTicks)) ;
    }

    public static RunTask runLaterAsync(Plugin plugin, Runnable runnable, long delayTicks) {
        return new RunTask(Bukkit.getScheduler().runTaskLaterAsynchronously(plugin, runnable, delayTicks));
    }

    public static RunTask runTimer(Plugin plugin, Runnable runnable, long delayTicks, long periodTicks){
        return new RunTask(Bukkit.getScheduler().runTaskTimer(plugin, runnable, delayTicks, periodTicks)) ;
    }

    public static RunTask runTimerAsync(Plugin plugin, Runnable runnable, long delayTicks, long periodTicks){
        return new RunTask(Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, runnable, delayTicks, periodTicks)) ;
    }

    public static class RunTask {
        private BukkitTask bukkitTask;

        RunTask(BukkitTask bukkitTask){
            this.bukkitTask = bukkitTask;
        }

        public void cancel(){
            if (bukkitTask != null) {
                bukkitTask.cancel();
            }
        }
    }

}
