package com.ShingWong08.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class LightningTapCompletion implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            List<String> PlayerNames = new ArrayList<>();
            Player[] p = new Player[Bukkit.getOnlinePlayers().size()];
            Bukkit.getOnlinePlayers().toArray(p);
            for (int i = 0; i < p.length; i++) {
                PlayerNames.add(p[i].getName());
            }
            return PlayerNames;
        } else if (args.length == 2) {
            List<String> Args = new ArrayList<>();
            Args.add("1");
            Args.add("2");
            Args.add("3");
            Args.add("4");
            Args.add("5");
            Args.add("6");
            Args.add("7");
            Args.add("8");
            Args.add("9");
            Args.add("10");
            Args.add("11");
            Args.add("12");
            Args.add("13");
            Args.add("14");
            Args.add("15");
            Args.add("16");
            Args.add("17");
            Args.add("18");
            Args.add("19");
            Args.add("20");
            Args.add("Inf");
            return Args;
        }
        return null;
    }
}