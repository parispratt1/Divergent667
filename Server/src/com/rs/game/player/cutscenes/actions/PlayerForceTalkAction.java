package com.rs.game.player.cutscenes.actions;

import com.rs.game.player.Player;
import com.rs.game.world.ForceTalk;

public class PlayerForceTalkAction extends CutsceneAction {

	private final String text;

	public PlayerForceTalkAction(String text, int actionDelay) {
		super(-1, actionDelay);
		this.text = text;
	}

	@Override
	public void process(Player player, Object[] cache) {
		player.setNextForceTalk(new ForceTalk(text));
	}

}
