package it.unibo.javajump.model.physics;

import static it.unibo.javajump.utility.Constants.*;

public class PhysicsUtilsImpl implements PhysicsUtils {

	public static float accelerateToRight(float vx, float deltaTime, float acceleration, float maxSpeed) {
		vx += acceleration * deltaTime;
		return Math.min(vx, maxSpeed);
	}

	
	public static float accelerateToLeft(float vx, float deltaTime, float acceleration, float maxSpeed) {
		vx -= acceleration * deltaTime;
		return Math.max(vx, -maxSpeed);
	}

	
	public static float decelerate(float vx, float deltaTime, float deceleration) {
		if (vx > ZERO) {
			vx -= deceleration * deltaTime;
			if (vx < ZERO) {
				vx = ZERO;
			}
		} else if (vx < ZERO) {
			vx += deceleration * deltaTime;
			if (vx > ZERO) {
				vx = ZERO;
			}
		}
		return vx;
	}
}
