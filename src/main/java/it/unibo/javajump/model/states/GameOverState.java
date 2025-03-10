package it.unibo.javajump.model.states;

import it.unibo.javajump.controller.GameAction;
import it.unibo.javajump.model.GameModelImpl;

import java.util.Objects;

public class GameOverState implements GameStateHandler {

	private final GameState gameState = GameState.GAME_OVER;

	@Override
	public void handleAction(GameModelImpl model, GameAction action) {

		if (Objects.requireNonNull(action) == GameAction.CONFIRM_SELECTION) {
			model.setState(new MenuState());
		}
	}

	@Override
	public void update(GameModelImpl model, float deltaTime) {


	}

	@Override
	public GameState getGameState() {
		return gameState;
	}

	@Override
	public int getState() {
		return 0;
	}
}
