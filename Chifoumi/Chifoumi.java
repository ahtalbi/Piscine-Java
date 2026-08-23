public class Chifoumi {
	public static ChifoumiAction getActionBeatenBy(ChifoumiAction action) {
		switch (action) {
			case ChifoumiAction.ROCK:
				return ChifoumiAction.SCISSOR;
			case ChifoumiAction.PAPER:
				return ChifoumiAction.ROCK;
			default:
				return ChifoumiAction.PAPER;
		}
	}
}
