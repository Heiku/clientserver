package com.ljh.clientdemo.console;

import com.ljh.clientdemo.console.impl.*;
import com.ljh.clientdemo.console.impl.chat.ChatGroupConsoleCommand;
import com.ljh.clientdemo.console.impl.chat.ChatRoleConsoleCommand;
import com.ljh.clientdemo.console.impl.creep.AttackCreepConsoleCommand;
import com.ljh.clientdemo.console.impl.creep.AttackCreepSpellConsoleCommand;
import com.ljh.clientdemo.console.impl.creep.SpellToSaveConsoleCommand;
import com.ljh.clientdemo.console.impl.creep.StopAttackCreepConsoleCommand;
import com.ljh.clientdemo.console.impl.duplicate.*;
import com.ljh.clientdemo.console.impl.email.EmailAllConsoleCommand;
import com.ljh.clientdemo.console.impl.email.EmailReceiveConsoleCommand;
import com.ljh.clientdemo.console.impl.equip.EquipAllConsoleCommand;
import com.ljh.clientdemo.console.impl.equip.EquipFixConsoleCommand;
import com.ljh.clientdemo.console.impl.equip.EquipPutConsoleCommand;
import com.ljh.clientdemo.console.impl.equip.EquipTakeOffConsoleCommand;
import com.ljh.clientdemo.console.impl.face.*;
import com.ljh.clientdemo.console.impl.group.ExitGroupConsoleCommand;
import com.ljh.clientdemo.console.impl.group.InviteGroupConsoleCommand;
import com.ljh.clientdemo.console.impl.group.JoinGroupConsoleCommand;
import com.ljh.clientdemo.console.impl.group.StateGroupConsoleCommand;
import com.ljh.clientdemo.console.impl.guild.*;
import com.ljh.clientdemo.console.impl.item.BagAllConsoleCommand;
import com.ljh.clientdemo.console.impl.item.UseItemConsoleCommand;
import com.ljh.clientdemo.console.impl.mall.BuyConsoleCommand;
import com.ljh.clientdemo.console.impl.mall.MallAllConsoleCommand;
import com.ljh.clientdemo.console.impl.others.DateConsoleCommand;
import com.ljh.clientdemo.console.impl.pk.AcceptPKConsoleCommand;
import com.ljh.clientdemo.console.impl.pk.EscapeConsoleCommand;
import com.ljh.clientdemo.console.impl.pk.PKConsoleCommand;
import com.ljh.clientdemo.console.impl.pk.SpellRoleConsoleCommand;
import com.ljh.clientdemo.console.impl.role.CreateRoleConsoleCommand;
import com.ljh.clientdemo.console.impl.role.RoleConsoleCommand;
import com.ljh.clientdemo.console.impl.role.RoleTypeConsoleCommand;
import com.ljh.clientdemo.console.impl.site.MoveConsoleCommand;
import com.ljh.clientdemo.console.impl.site.SiteConsoleCommand;
import com.ljh.clientdemo.console.impl.user.StateConsoleCommand;
import com.ljh.clientdemo.console.impl.others.TalkEntityConsoleCommand;
import com.ljh.clientdemo.console.impl.spell.LearnSpellConsoleCommand;
import com.ljh.clientdemo.console.impl.spell.SpellConsoleCommand;
import com.ljh.clientdemo.console.impl.user.AoiConsoleCommand;
import com.ljh.clientdemo.console.impl.user.ExitConsoleCommand;
import com.ljh.clientdemo.console.impl.user.LoginConsoleCommand;
import com.ljh.clientdemo.console.impl.user.RegisterConsoleCommand;
import io.netty.channel.Channel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 客户端命令控制台
 *
 */
public class ConsoleCommandManager implements ConsoleCommand {

    private Map<String, ConsoleCommand> consoleCommandMap;

    public ConsoleCommandManager(){
        consoleCommandMap = new HashMap<>();

        // common
        consoleCommandMap.put("help", new HelpConsoleCommand());
        consoleCommandMap.put("date", new DateConsoleCommand());

        // user
        consoleCommandMap.put("login", new LoginConsoleCommand());
        consoleCommandMap.put("register", new RegisterConsoleCommand());

        // role
        consoleCommandMap.put("role", new RoleConsoleCommand());
        consoleCommandMap.put("rt", new RoleTypeConsoleCommand());
        consoleCommandMap.put("create", new CreateRoleConsoleCommand());

        // site
        consoleCommandMap.put("site", new SiteConsoleCommand());
        consoleCommandMap.put("move", new MoveConsoleCommand());
        consoleCommandMap.put("state", new StateConsoleCommand());
        consoleCommandMap.put("aoi", new AoiConsoleCommand());

        // talk
        consoleCommandMap.put("talk", new TalkEntityConsoleCommand());

        // spell
        consoleCommandMap.put("spell", new SpellConsoleCommand());
        consoleCommandMap.put("sps", new SpellToSaveConsoleCommand());
        consoleCommandMap.put("learn", new LearnSpellConsoleCommand());

        // attack
        consoleCommandMap.put("attackc", new AttackCreepConsoleCommand());
        consoleCommandMap.put("spc", new AttackCreepSpellConsoleCommand());
        consoleCommandMap.put("stopc", new StopAttackCreepConsoleCommand());

        // bag
        consoleCommandMap.put("bag", new BagAllConsoleCommand());
        consoleCommandMap.put("use", new UseItemConsoleCommand());

        // equip
        consoleCommandMap.put("equip", new EquipAllConsoleCommand());
        consoleCommandMap.put("put", new EquipPutConsoleCommand());
        consoleCommandMap.put("takeoff", new EquipTakeOffConsoleCommand());
        consoleCommandMap.put("fix", new EquipFixConsoleCommand());

        // duplicate boss
        consoleCommandMap.put("duplicate", new DuplicateConsoleCommand());
        consoleCommandMap.put("enter", new EnterDuplicateConsoleCommand());
        consoleCommandMap.put("spb", new SpellToBossConsoleCommand());
        consoleCommandMap.put("stopb", new StopDuplicateConsoleCommand());
        consoleCommandMap.put("leave", new LeaveDuplicateConsoleCommand());

        // mall
        consoleCommandMap.put("mall", new MallAllConsoleCommand());
        consoleCommandMap.put("buy", new BuyConsoleCommand());

        // chat
        consoleCommandMap.put("chat", new ChatRoleConsoleCommand());
        consoleCommandMap.put("chatg", new ChatGroupConsoleCommand());

        // email
        consoleCommandMap.put("email", new EmailAllConsoleCommand());
        consoleCommandMap.put("receive", new EmailReceiveConsoleCommand());

        // pk
        consoleCommandMap.put("pk", new PKConsoleCommand());
        consoleCommandMap.put("ac", new AcceptPKConsoleCommand());
        consoleCommandMap.put("spr", new SpellRoleConsoleCommand());
        consoleCommandMap.put("escape", new EscapeConsoleCommand());

        // group
        consoleCommandMap.put("gs", new StateGroupConsoleCommand());
        consoleCommandMap.put("group", new InviteGroupConsoleCommand());
        consoleCommandMap.put("join", new JoinGroupConsoleCommand());
        consoleCommandMap.put("egroup", new ExitGroupConsoleCommand());

        // faceTrans
        consoleCommandMap.put("initiate", new InitiateTransConsoleCommand());
        consoleCommandMap.put("yes", new YesTransConsoleCommand());
        consoleCommandMap.put("no", new NoTransConsoleCommand());
        consoleCommandMap.put("ask", new AskTransConsoleCommand());
        consoleCommandMap.put("accept", new AcceptTransConsoleCommand());
        consoleCommandMap.put("refuse", new RefuseTransConsoleCommand());
        consoleCommandMap.put("lt", new LeaveTransConsoleCommand());

        // guild
        consoleCommandMap.put("guild", new GuildConsoleCommand());
        consoleCommandMap.put("guildAll", new GuildAllConsoleCcommand());
        consoleCommandMap.put("establish", new EstablishConsoleCommand());
        consoleCommandMap.put("applyGuild", new ApplyGuildConsoleCommand());
        consoleCommandMap.put("applyAll", new ApplyAllConsoleCommand());
        consoleCommandMap.put("approvalYes", new ApprovalYesConsoleCommand());
        consoleCommandMap.put("approvalNo", new ApprovalNoConsoleCommand());
        consoleCommandMap.put("modifyAnn", new ModifyANnConsoleCommand());
        consoleCommandMap.put("give", new GivePositionConsoleCommand());
        consoleCommandMap.put("donate", new DonateConsoleCommand());
        consoleCommandMap.put("kickOut", new KickOutConsoleCommand());
        consoleCommandMap.put("exitGuild", new ExitGuildConsoleCommand());

        consoleCommandMap.put("quit", new ExitConsoleCommand());

    }

    @Override
    public void exec(Scanner scanner, Channel channel) {
        // 获取指令
        String command = scanner.next();

        // 获取指令对应的执行
        ConsoleCommand consoleCommand = consoleCommandMap.get(command);
        if (consoleCommand != null){
            consoleCommand.exec(scanner, channel);
        }else {
            System.err.println("无法识别["  + command + "]指令，请重新输入!");
        }
    }
}
