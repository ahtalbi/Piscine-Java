public class Chifoumi {
	public static ChifoumiAction getActionBeatenBy(ChifoumiAction action) {
		switch (action) {
			case ROCK:
				return ChifoumiAction.SCISSOR;
			case PAPER:
				return ChifoumiAction.ROCK;
			default:
				return ChifoumiAction.PAPER;
		}
	}
}
