package com.ShingWong08.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class LightningCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            if (args.length == 0) {
                if (p.hasPermission("Lightning.Lightning")) {
                    p.getWorld().strikeLightningEffect(p.getLocation());
                    p.damage(1);
                    p.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                } else {
                    p.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
                }
            } else if (args.length == 1) {
                if (p.hasPermission("Lightning.Lightning")) {
                    if (args[0].equalsIgnoreCase("1")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(1);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("2")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(2);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("3")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(3);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("4")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(4);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("5")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(5);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("6")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(6);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("7")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(7);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("8")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(8);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("9")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(9);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("10")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(10);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("11")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(11);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("12")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(12);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("13")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(13);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("14")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(14);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("15")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(15);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("16")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(16);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("17")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(17);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("18")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(18);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("19")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(19);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("20")) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(20);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else if (args[0].equalsIgnoreCase("Infinity") || (args[0].equalsIgnoreCase("Inf"))) {
                        p.getWorld().strikeLightningEffect(p.getLocation());
                        p.damage(1000000);
                        sender.sendMessage(ChatColor.GREEN + "Successfully Lightened Yourself.");
                    } else {
                        p.sendMessage(ChatColor.RED + "Please Provide A Correct Number.");
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
                }
            } else if (args.length == 2) {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (p.hasPermission("Lightning.LightningOtherPlayer")) {
                    if (target != null) {
                        if (args[1].equalsIgnoreCase("1")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(1);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("2")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(2);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("3")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(3);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("4")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(4);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("5")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(5);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("6")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(6);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("7")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(7);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("8")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(8);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("9")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(9);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("10")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(10);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("11")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(11);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("12")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(12);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("13")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(13);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("14")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(14);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("15")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(15);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("16")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(16);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("17")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(17);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("18")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(18);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("19")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(19);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("20")) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(20);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else if (args[1].equalsIgnoreCase("Infinity") || (args[1].equalsIgnoreCase("Inf"))) {
                            target.getWorld().strikeLightningEffect(target.getLocation());
                            target.damage(1000000);
                            p.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                        } else {
                            p.sendMessage(ChatColor.RED + "Please Provide A Correct Number.");
                        }
                    } else {
                        p.sendMessage(ChatColor.RED + "That Player Is Not Online!");
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
                }
            } else if (p.hasPermission("Lightning.LightningOtherPlayer")) {
                    p.sendMessage(ChatColor.RED + "Please Provide Only 1 Player!");
                } else {
                    p.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
                }
            } else if (sender instanceof ConsoleCommandSender) {
            ConsoleCommandSender Console = Bukkit.getConsoleSender();
            if (args.length == 0) {
                Console.sendMessage(ChatColor.RED + "Please Provide A Level And A Player.");
            } else if (args.length == 1) {
                Console.sendMessage(ChatColor.RED + "Please Provide A Player.");
            } else if (args.length == 2) {
                Player target = Bukkit.getPlayer(args[1]);
                if (target != null) {
                    if (args[1].equalsIgnoreCase("1")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(1);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("2")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(2);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("3")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(3);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("4")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(4);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("5")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(5);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("6")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(6);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("7")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(7);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("8")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(8);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("9")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(9);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("10")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(10);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("11")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(11);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("12")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(12);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("13")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(13);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("14")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(14);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("15")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(15);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("16")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(16);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("17")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(17);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("18")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(18);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("19")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(19);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("20")) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(20);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else if (args[1].equalsIgnoreCase("Infinity") || (args[1].equalsIgnoreCase("Inf"))) {
                        target.getWorld().strikeLightningEffect(target.getLocation());
                        target.damage(1000000);
                        Console.sendMessage(ChatColor.GREEN + "Successfully Lightened " + target.getDisplayName());
                    } else {
                        Console.sendMessage(ChatColor.RED + "Please Provide A Correct Number.");
                    }
                } else {
                    Console.sendMessage(ChatColor.RED + "That Player Is Not Online!");
                }
            }
        }
        return true;
    }
}