//package org.devoxx4kids.forge.mods;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import net.minecraft.command.ICommand;
//import net.minecraft.command.ICommandSender;
//import net.minecraft.util.BlockPos;
//
//public class FlamingPigs implements ICommand {
//	
//	private List aliases = new ArrayList();
//	private int numberOfPigs = 0;
//	
//	public FlamingPigs(){
//		aliases.add("flamingpigs");
//		aliases.add("fp");
//	}
//	
//	@Override
//	public String getName() {
//		return null;
//	}
//	
//	@Override
//	public int compareTo(Object o) {
//		return 0;
//	}
//
//	@Override
//	public String getCommandUsage(ICommandSender sender) {
//		return "/flamingpigs <number of pigs>";
//	}
//
//	@Override
//	public List getAliases() {
//		return aliases;
//	}
//
//	@Override
//	public void execute(ICommandSender sender, String[] args){
//		if(args.length != 1){
//			sendErrorMessage(sender, "Invalid number of arguments!");
//			return;
//		}
//		
//		try {
//			numberOfPigs = Integer.parseInt(args[0]);
//		} catch(NumberFormatException e){
//			sendErrorMessage(sender, "The argument \"" + args[0] + "\" is not a valid number!");
//			return;
//		}
//	}
////I STOPPED HERE
//	@Override
//	public boolean canCommandSenderUse(ICommandSender sender) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public List addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean isUsernameIndex(String[] args, int index) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//}
