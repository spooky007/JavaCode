import java.util.Arrays;

public class MonsterThree {
	
	static char[][] battleBoard = new char[10][10];
	
	public static void buildBattleBoard() {
		for(char[] row : battleBoard) {
			Arrays.fill(row, '*');
			System.out.println();
		}
	}
	
	public static void main(String[] arguments) {
		buildBattleBoard();
	}
}