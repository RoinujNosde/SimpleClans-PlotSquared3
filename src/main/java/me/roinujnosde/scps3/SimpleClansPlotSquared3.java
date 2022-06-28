package me.roinujnosde.scps3;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class SimpleClansPlotSquared3 extends JavaPlugin {

    @Override
    public void onEnable() {
        new PlotSquared3Provider().register();
    }
}
