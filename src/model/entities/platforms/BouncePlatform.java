package model.entities.platforms;

import model.entities.GameObject;

public class BouncePlatform extends Platform {
	private final float bounceFactor;

	public BouncePlatform(float x, float y, float width, float height, float bounceFactor) {
		super(x, y, width, height);
		this.bounceFactor = bounceFactor;
	}

	public float getBounceFactor() {
		return bounceFactor;
	}

	@Override
	public void onCollision(GameObject other) {
		super.onCollision(other);
	}

	@Override
	public void update(float deltaTime) {

		super.update(deltaTime);
	}
}
