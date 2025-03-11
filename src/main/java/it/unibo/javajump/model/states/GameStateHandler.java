package it.unibo.javajump.model.states;

import it.unibo.javajump.controller.input.GameAction;
import it.unibo.javajump.model.GameModel;

/**
 * The interface Game state handler.
 */
public interface GameStateHandler {
    /**
     * On enter.
     *
     * @param model the model
     */
    default void onEnter(GameModel model) {
    }


    /**
     * On exit.
     *
     * @param model the model
     */
    default void onExit(GameModel model) {
    }


    /**
     * Handle action.
     *
     * @param model  the model
     * @param action the action
     */
    void handleAction(GameModel model, GameAction action);


    /**
     * Update.
     *
     * @param model     the model
     * @param deltaTime the delta time
     */
    void update(GameModel model, float deltaTime);

    /**
     * Gets game state.
     *
     * @return the game state
     */
    GameState getGameState();

    /**
     * Gets delta time.
     *
     * @return the delta time
     */
    float getDeltaTime();
}
