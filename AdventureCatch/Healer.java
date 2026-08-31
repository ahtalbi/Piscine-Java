public interface Healer {
	public void heal(Character c) throws DeadCharacterException;
	public int getHealCapacity();
}
