package chessParts;

public class Entity {

	private int x, y;

	public Entity() {
		this.x = 0;
		this.y = 0;
	}

	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private int getX() {
		return x;
	}

	private int getY() {
		return y;
	}

	private void setX(int x) {
		this.x = x;
	}

	private void setY(int y) {
		this.y = y;
	}

}
