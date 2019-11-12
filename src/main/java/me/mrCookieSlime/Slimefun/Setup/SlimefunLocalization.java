package me.mrCookieSlime.Slimefun.Setup;

import io.github.thebusybiscuit.cscorelib2.config.Localization;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;

public class SlimefunLocalization extends Localization {

	public SlimefunLocalization(SlimefunPlugin plugin) {
		super(plugin);
		
		setPrefix("&aSlimefun 4 &7> ");

		setDefaultMessage("commands.help", "Вывести помощь");
		setDefaultMessage("commands.cheat", "Войти в режим выдачи предметов");
		setDefaultMessage("commands.give", "Выдать Slimefun предметы");
		setDefaultMessage("commands.research.desc", "Выдать исследование игроку");
		setDefaultMessage("commands.guide", "Получить руководство Slimefun");
		setDefaultMessage("commands.timings", "Информация о нагрузке");
		setDefaultMessage("commands.teleporter", "Просмотреть сохранённые точки других игроков");
		setDefaultMessage("commands.versions", "Вывести список установленных дополнений");
		setDefaultMessage("commands.search", "Поиск предметов по заданному термину");
		setDefaultMessage("commands.open_guide", "Открыть руководство Slimefun");
		setDefaultMessage("commands.stats", "Вывести статистику игрока");
		setDefaultMessage("commands.research.reset", "&cВы сбросили исследования для %player%");
		setDefaultMessage("commands.research.reset-target", "&cВаши исследования были сброшены");

		setDefaultMessage("guide.search.name", "&7Поиск");
		setDefaultMessages("guide.search.lore", "&bЧто бы Вы хотели найти?", "&7Введите часть или слово целиком в чат.");
		
		setDefaultMessage("search.message", "&bЧто бы Вы хотели найти?");
		setDefaultMessage("guide.cheat.no-multiblocks", "&4Вы не можете выдать себе постройку, она должна быть построена в мире!");

		setDefaultMessage("messages.not-researched", "&4Вам не хватает знаний, чтобы понять это.");
		setDefaultMessage("messages.not-enough-xp", "&4У Вас недостаточно опыта, чтобы разблокировать это.");
		setDefaultMessage("messages.unlocked", "&bВы разблокировали &7\"%research%\"&b.");
		setDefaultMessages("messages.fortune-cookie", "&7Помоги мне! Я попал в ловушку Фабрики Печенек Судьбы!", "&7Ты умрёшь завтра...      &7&oот любезного Крипера", "&7В какой-то момент Вашей жизни случится что-то плохое!!!", "&6На следующей неделе Вы заметите, что это не реальный мир, Вы находитесь в своём роде типа \"Матрицы\", или назовём это компьютерной игрой. Да, Вы в Компьютерной Игре.", "&7Это печенье вкусно пахнет :)", "&7Однажды Вы умрёте, а последнее слово, которое Вы услышите, будет: \"ИСТРЕБИТЬ!!!\"", "&7Что бы Вы не делали, не обнимайте Крипера... Я попробовал. Это очень приятно, но того не стоит.", "&7Herobrine следит за тобой!", "&7&oПоговаривают, что это секретное послание от инопланетян: &c&kLOLKEKLOL");
		setDefaultMessage("messages.only-players", "&4Эта команда предназначена только для игроков.");
		setDefaultMessage("messages.no-permission", "&4У Вас недостаточно прав, чтобы сделать это.");
		setDefaultMessage("messages.usage", "&4Использование: &c%usage%");
		setDefaultMessage("messages.not-online", "&4%player% &cсейчас не в игре!");
		setDefaultMessage("messages.not-valid-item", "&4%item% &cне является допустимым предметом!");
		setDefaultMessage("messages.not-valid-amount", "&4%amount% &cне является допустимым числом: количество должно быть больше нуля!");
		setDefaultMessage("messages.given-item", "&bВам выдали &a%amount% &7\"%item%&7\"&b.");
		setDefaultMessage("messages.give-item", "&bВы выдали игроку %player% &a%amount% &7\"%item%&7\"&b.");
		setDefaultMessage("messages.not-valid-research", "&4%research% &cне является допустимым исследованием!");
		setDefaultMessage("messages.give-research", "&bВы выдали игроку %player% исследование &7\"%research%&7\"&b.");
		setDefaultMessage("messages.battery.add", "&2+ &7%charge% Дж &8(%machine%)");
		setDefaultMessage("messages.battery.remove", "&4- &7%charge% Дж &8(%machine%)");
		setDefaultMessage("messages.hungry", "&cВы слишком голодны для этого!");
		setDefaultMessage("messages.mode-change", "&b%device% | Режим изменён на: &9%mode%");
		setDefaultMessage("messages.disabled-in-world", "&4&lДанный предмет отключен в этом мире.");
		setDefaultMessage("messages.talisman.anvil", "&a&oТалисман сохранил Ваш инструмент от поломки.");
		setDefaultMessage("messages.talisman.miner", "&a&oТалисман удвоил Ваш дроп.");
		setDefaultMessage("messages.talisman.hunter", "&a&oТалисман удвоил Ваш дроп.");
		setDefaultMessage("messages.talisman.lava", "&a&oТалисман спас Вас от сжигания до смерти.");
		setDefaultMessage("messages.talisman.water", "&a&oТалисман спас Вас от утопления.");
		setDefaultMessage("messages.talisman.angel", "&a&oТалисман спас Вас от падения.");
		setDefaultMessage("messages.talisman.fire", "&a&oТалисман спас Вас от горения до смерти.");
		setDefaultMessage("messages.talisman.magician", "&a&oТалисман прибавил Вам дополнительное зачарование.");
		setDefaultMessage("messages.talisman.traveller", "&a&oТалисман повысил Вашу скорость.");
		setDefaultMessage("messages.talisman.warrior", "&a&oТалисман повысил Вашу силу на некоторое время.");
		setDefaultMessage("messages.talisman.knight", "&a&oТалисман выдал Вам 5 секунд регенерации.");
		setDefaultMessage("messages.talisman.whirlwind", "&a&oВаш талисман отразил снаряд.");
		setDefaultMessage("messages.talisman.wizard", "&a&oТалисман повысил уровень зачарования «Удача», но мог также ухудшить другие зачарования.");
		setDefaultMessage("messages.soulbound-rune.fail", "&cВы можете привязать к себе только один предмет за раз.");
		setDefaultMessage("messages.soulbound-rune.success", "&aВы успешно привязали этот предмет к себе! Он останется при Вас после смерти.");
		setDefaultMessage("messages.broken-leg", "&c&oПохоже, что Вы сломали ногу, может шина сможет помочь?");
		setDefaultMessage("messages.fixed-leg", "&a&oШина помогла. Нога чувствует себя лучше.");
		setDefaultMessage("messages.start-bleeding", "&c&oВы начали кровоточить. Может быть, повязка сможет помочь?");
		setDefaultMessage("messages.stop-bleeding", "&a&oПовязка помогла. Кровотечение остановилось!");
		setDefaultMessage("messages.disabled-item", "&4&lЭтот предмет отключен! Где Вы вообще его взяли?");
		setDefaultMessage("messages.research.start", "&7Древние духи шепчут загадочные слова в Ваши уши!");
		setDefaultMessage("messages.research.progress", "&7Вы начинаете задаваться вопросом о &b%research% &e(%progress%)");
		setDefaultMessage("messages.fire-extinguish", "&7Вы погасили себя.");
		setDefaultMessage("messages.cannot-place" ,"&cВы не можете поставить этот блок здесь!");
		setDefaultMessage("messages.no-pvp" ,"&cВы не можете вступать в PvP здесь!");
		setDefaultMessage("messages.radiation" ,"&4Вы подвергались смертельной радиации! &cИзбавьтесь от всех радиоактивных предметов или наденьте костюм химзащиты!");
		setDefaultMessage("messages.opening-guide", "&bОткрытие руководства, это может занять несколько секунд…");
		setDefaultMessage("messages.opening-backpack", "&bОткрытие рюкзака, это может занять несколько секунд…");

		setDefaultMessage("machines.pattern-not-found", "&eК сожалению, не удалось распознать эту последовательность. Пожалуйста, разложите предметы в верной последовательности в раздатчик.");
		setDefaultMessage("machines.unknown-material", "&eНе удалось распознать предмет в Раздатчике. Пожалуйста, перепроверьте все предметы.");
		setDefaultMessage("machines.wrong-item", "&eК сожалению, не удалось распознать предмет, которым Вы кликнули. Проверьте рецепт и посмотрите, какие предметы Вы можете использовать.");
		setDefaultMessage("machines.full-inventory", "&eК сожалению, в машине закончилось место!");
		setDefaultMessage("machines.in-use", "&cЭтот инвентарь уже открыт другим игроком.");
		setDefaultMessage("machines.ignition-chamber-no-flint", "&cАвтоматическая камера зажигания не смогла зажечь блок из-за отстутствия огнива.");
		setDefaultMessage("anvil.not-working", "&4Вы не можете использовать Slimefun предметы на обычной наковальне.");
		setDefaultMessage("backpack.already-open", "&cЭтот рюкзак уже открыт в другом месте! 0_o");
		setDefaultMessage("backpack.no-stack", "&cВы не можете стаковать рюкзаки.");
		setDefaultMessage("miner.no-ores", "&eК сожалению, не удалось найти какию-либо руду поблизости!");
		setDefaultMessage("workbench.not-enhanced", "&4Вы не можете использовать Slimefun предметы на обычном Верстаке.");

		setDefaultMessage("machines.ANCIENT_ALTAR.not-enough-pedestals", "&4Алтарь не окружён необходимым количеством пьедесталов &c(%pedestals% / 8)");
		setDefaultMessage("machines.ANCIENT_ALTAR.unknown-catalyst", "&4Неизвестный катализатор! &cИспользуйте правильный рецепт!");
		setDefaultMessage("machines.ANCIENT_ALTAR.unknown-recipe", "Неизвестный рецепт! &cИспользуйте правильный рецепт!");
		setDefaultMessage("machines.ANCIENT_PEDESTAL.obstructed", "&4Что-то мешает! &cУбедитесь, что над пьедесталом ничего нет!");
		setDefaultMessage("machines.HOLOGRAM_PROJECTOR.enter-text", "&7Пожалуйста, введите нужный текст для голограммы в чат. &r(можно использовать цветовые коды!)");
		setDefaultMessage("machines.ELEVATOR.no-destinations", "&4Не найдено ни одного направления.");
		setDefaultMessage("machines.CARGO_NODES.must-be-placed", "&4Должен быть размещён на сундуке или машине.");

		setDefaultMessage("gps.waypoint.new", "&eПожалуйста, введите название новой контрольной точки в чат. &7(можно использовать цветовые коды!)");
		setDefaultMessage("gps.waypoint.added", "&aКонтрольная точка успешно добавлена.");
		setDefaultMessage("gps.waypoint.max", "&4Вы достигли максимального количества контрольных точек.");
		setDefaultMessages("gps.insufficient-complexity", "&4Недостаточная общая сила сигнала сети: &c%complexity%", "&4Убедитесь, что Ваша сеть подключена и имеет достаточный уровень сигнала.");
		setDefaultMessage("gps.geo.scan-required", "&4Требуется сканирование! &cПроанализируйте чанк при помощи GPS-геосканера для начала!");
		
		setDefaultMessage("robot.started", "&7Ваш Андроид возобновил работу своего скрипта.");
		setDefaultMessage("robot.stopped", "&7Ваш Андроид остановил выполнение скрипта.");
		setDefaultMessage("inventory.no-access", "&4У Вас нет доступа к этому блоку.");

		setDefaultMessage("android.scripts.already-uploaded", "&4Этот скрипт уже был загружен.");
		setDefaultMessages("android.scripts.enter-name", "", "&eПожалуйста, введите название для Вашего скрипта.", "");
		setDefaultMessages("android.scripts.uploaded", "&bЗагрузка…", "&aВаш скрипт успешно загружен!");
		setDefaultMessage("android.scripts.rating.own", "&4Вы не можете оценить свой собственный скрипт!");
		setDefaultMessage("android.scripts.rating.already", "&4Вы уже оценили этот скрипт!");
		
		save();
	}
	
	@Override
	public String setDefaultMessage(String key, String message) {
		Object value = getConfig().getValue(key);
		
		if (value == null) {
			return super.setDefaultMessage(key, message);
		}
		else if (!(value instanceof String)) {
			String msg = getMessages(key).get(0);
			getConfig().setValue(key, msg);
			return msg;
		}
		else {
			return (String) value;
		}
	}

}
