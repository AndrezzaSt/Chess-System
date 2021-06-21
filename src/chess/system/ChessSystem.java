/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.system;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.Chessmatch;
import java.util.Scanner;

/**
 *
 * @author andrezzas
 */
public class ChessSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Chessmatch chessMatch = new Chessmatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target); 
        }
    }
}
