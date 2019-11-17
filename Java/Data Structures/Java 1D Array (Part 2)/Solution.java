// github.com/RodneyShag

public static boolean canWin(int leap, int[] game) {
	if (game == null) {
		return false;
	}
    return isSolvable(leap, game, 0);
}

private static boolean isSolvable(int leap, int[] game, int i) {
    // Base Cases
    if (i >= game.length) {
        return true;
    } else if (i < 0 || game[i] == 1) {
        return false;
    }
    
    game[i] = 1; // marks as visited

    // Recursive Cases (Tries +m first to try to finish game quickly)
    return isSolvable(leap, game, i + leap)
        || isSolvable(leap, game, i + 1)
        || isSolvable(leap, game, i - 1);
}

// Discuss on HackerRank: https://www.hackerrank.com/challenges/java-1d-array/forum/comments/253767
