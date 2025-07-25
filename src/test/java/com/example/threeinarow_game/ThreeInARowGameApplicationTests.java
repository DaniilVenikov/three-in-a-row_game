package com.example.threeinarow_game;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ThreeInARowGameApplicationTests {



    @Test
    public void testInitialBoardNoCombinations() {
        GameBoard board = new GameBoard(8, 8, ElementType.values());
        CombinationChecker checker = new CombinationCheckerImpl();
        List<Combination> combinations = checker.findCombinations(board);

        assertTrue(combinations.isEmpty());
    }

    @Test
    public void testSwapAndFindCombination() {
        GameBoard board = new GameBoard(8, 8, ElementType.values());
        board.setField(0,0, ElementType.A);
        board.setField(0,1, ElementType.A);
        board.setField(0,2, ElementType.B);
        board.setField(0,3, ElementType.A);

        board.swapFields(0,2,0,3);

        List<Combination> combs = checker.findCombinations(board);
        assertFalse(combs.isEmpty());
    }

    @Test
    public void testAddScoreAndHistory() {
        PlayerInfo player = new PlayerInfoImpl("Test");
        int prevScore = player.getScore();
        MoveInfo move = new MoveInfoImpl(0, 0, 0, 1, 30, null);

        player.addMove(move);
        player.addScore(move.getPoints());

        assertEquals(prevScore + 30, player.getScore());
        assertEquals(1, player.getMoveHistory().size());
    }

    @Test
    public void testBonusActivation() {
        GameBoard board = new GameBoard(8, 8, ElementType.values());
        Bonus bonus = new RowBonus();
        Field field = board.getField(2,3);
        field.setBonus(bonus);

        bonus.activate(board, 2, 3);

        for (int col = 0; col < board.getWidth(); col++) {
            assertTrue(board.getField(2, col).isEmpty());
        }
    }

}
