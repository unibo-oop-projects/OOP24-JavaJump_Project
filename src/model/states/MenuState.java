package model.states;

import controller.GameAction;
import model.GameModel;

public class MenuState implements GameStateHandler
{
	private final GameState gameState= GameState.MENU;
	@Override
	public void onEnter(GameModel model)
	{



	}

	@Override
	public void handleAction(GameModel model, GameAction action)
	{
		switch(action)
		{
			case CONFIRM_SELECTION:

				model.startGame();
				model.setState(new InGameState());
				break;
			case MOVE_MENU_UP:

				break;
			case MOVE_MENU_DOWN:

				break;
			default:

				break;
		}
	}

	@Override
	public void update(GameModel model, float deltaTime) {

	}

	@Override
	public GameState getGameState() {
		return gameState;
	}
}