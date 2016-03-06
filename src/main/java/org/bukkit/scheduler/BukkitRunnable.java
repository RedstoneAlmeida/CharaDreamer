package org.bukkit.scheduler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import com.mrpowergamerbr.charadreamer.CharaDreamer;

import cn.nukkit.scheduler.TaskHandler;

/**
 * This class is provided as an easy way to handle scheduling tasks.
 */
public abstract class BukkitRunnable implements Runnable {
    private int taskId = -1;

    /**
     * Attempts to cancel this task.
     *
     * @throws IllegalStateException if task was not scheduled yet
     */
    public synchronized void cancel() throws IllegalStateException {
        Bukkit.getScheduler().cancelTask(getTaskId());
    }

    /**
     * Schedules this in the Bukkit scheduler to run on next tick.
     *
     * @param cn.nukkit.plugin.Plugin the reference to the cn.nukkit.plugin.Plugin scheduling task
     * @return a BukkitTask that contains the id number
     * @throws IllegalArgumentException if cn.nukkit.plugin.Plugin is null
     * @throws IllegalStateException if this was already scheduled
     * @see BukkitScheduler#runTask(Plugin, Runnable)
     */
    public synchronized TaskHandler runTask(cn.nukkit.plugin.Plugin plugin) throws IllegalArgumentException, IllegalStateException {
        checkState();
        return setupId(CharaDreamer.nukkit.getScheduler().scheduleTask((Runnable) this));
    }

    /**
     * <b>Asynchronous tasks should never access any API in Bukkit. Great care
     * should be taken to assure the thread-safety of asynchronous tasks.</b>
     * <p>
     * Schedules this in the Bukkit scheduler to run asynchronously.
     *
     * @param cn.nukkit.plugin.Plugin the reference to the cn.nukkit.plugin.Plugin scheduling task
     * @return a BukkitTask that contains the id number
     * @throws IllegalArgumentException if cn.nukkit.plugin.Plugin is null
     * @throws IllegalStateException if this was already scheduled
     * @see BukkitScheduler#runTaskAsynchronously(Plugin, Runnable)
     */
    public synchronized TaskHandler runTaskAsynchronously(cn.nukkit.plugin.Plugin plugin) throws IllegalArgumentException, IllegalStateException  {
        checkState();
        return setupId(CharaDreamer.nukkit.getScheduler().scheduleTask((Runnable) this, true));
    }

    /**
     * Schedules this to run after the specified number of server ticks.
     *
     * @param cn.nukkit.plugin.Plugin the reference to the cn.nukkit.plugin.Plugin scheduling task
     * @param delay the ticks to wait before running the task
     * @return a BukkitTask that contains the id number
     * @throws IllegalArgumentException if cn.nukkit.plugin.Plugin is null
     * @throws IllegalStateException if this was already scheduled
     * @see BukkitScheduler#runTaskLater(Plugin, Runnable, long)
     */
    public synchronized TaskHandler runTaskLater(cn.nukkit.plugin.Plugin plugin, long delay) throws IllegalArgumentException, IllegalStateException  {
        checkState();
        return setupId(CharaDreamer.nukkit.getScheduler().scheduleDelayedTask((Runnable) this, (int) delay));
    }

    /**
     * <b>Asynchronous tasks should never access any API in Bukkit. Great care
     * should be taken to assure the thread-safety of asynchronous tasks.</b>
     * <p>
     * Schedules this to run asynchronously after the specified number of
     * server ticks.
     *
     * @param cn.nukkit.plugin.Plugin the reference to the cn.nukkit.plugin.Plugin scheduling task
     * @param delay the ticks to wait before running the task
     * @return a BukkitTask that contains the id number
     * @throws IllegalArgumentException if cn.nukkit.plugin.Plugin is null
     * @throws IllegalStateException if this was already scheduled
     * @see BukkitScheduler#runTaskLaterAsynchronously(Plugin, Runnable, long)
     */
    public synchronized TaskHandler runTaskLaterAsynchronously(cn.nukkit.plugin.Plugin plugin, long delay) throws IllegalArgumentException, IllegalStateException  {
        checkState();
        return setupId(CharaDreamer.nukkit.getScheduler().scheduleDelayedTask((Runnable) this, (int) delay, true));
    }

    /**
     * Schedules this to repeatedly run until cancelled, starting after the
     * specified number of server ticks.
     *
     * @param cn.nukkit.plugin.Plugin the reference to the cn.nukkit.plugin.Plugin scheduling task
     * @param delay the ticks to wait before running the task
     * @param period the ticks to wait between runs
     * @return a BukkitTask that contains the id number
     * @throws IllegalArgumentException if cn.nukkit.plugin.Plugin is null
     * @throws IllegalStateException if this was already scheduled
     * @see BukkitScheduler#runTaskTimer(Plugin, Runnable, long, long)
     */
    public synchronized TaskHandler runTaskTimer(cn.nukkit.plugin.Plugin plugin, long delay, long period) throws IllegalArgumentException, IllegalStateException  {
        checkState();
        return setupId(CharaDreamer.nukkit.getScheduler().scheduleDelayedRepeatingTask((Runnable) this, (int) delay, (int) period));
    }

    /**
     * <b>Asynchronous tasks should never access any API in Bukkit. Great care
     * should be taken to assure the thread-safety of asynchronous tasks.</b>
     * <p>
     * Schedules this to repeatedly run asynchronously until cancelled,
     * starting after the specified number of server ticks.
     *
     * @param cn.nukkit.plugin.Plugin the reference to the cn.nukkit.plugin.Plugin scheduling task
     * @param delay the ticks to wait before running the task for the first
     *     time
     * @param period the ticks to wait between runs
     * @return a BukkitTask that contains the id number
     * @throws IllegalArgumentException if cn.nukkit.plugin.Plugin is null
     * @throws IllegalStateException if this was already scheduled
     * @see BukkitScheduler#runTaskTimerAsynchronously(Plugin, Runnable, long,
     *     long)
     */
    public synchronized TaskHandler runTaskTimerAsynchronously(cn.nukkit.plugin.Plugin plugin, long delay, long period) throws IllegalArgumentException, IllegalStateException  {
        checkState();
        return setupId(CharaDreamer.nukkit.getScheduler().scheduleDelayedRepeatingTask((Runnable) this, (int) delay, (int) period, true));
    }

    /**
     * Gets the task id for this runnable.
     *
     * @return the task id that this runnable was scheduled as
     * @throws IllegalStateException if task was not scheduled yet
     */
    public synchronized int getTaskId() throws IllegalStateException {
        final int id = taskId;
        if (id == -1) {
            throw new IllegalStateException("Not scheduled yet");
        }
        return id;
    }

    private void checkState() {
        if (taskId != -1) {
            throw new IllegalStateException("Already scheduled as " + taskId);
        }
    }

    private TaskHandler setupId(final TaskHandler taskHandler) {
        this.taskId = taskHandler.getTaskId();
        return taskHandler;
    }
}
