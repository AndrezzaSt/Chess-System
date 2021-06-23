/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

/**
 *
 * @author andrezzas
 */
public abstract class ChessPiece extends Piece{
      private Color color; 
      private int moveCount; 
    public ChessPiece(Board board, Color color ) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    public int getmoveCount(){
        return moveCount; 
    }
    
    public void increaseMoveCount(){
        moveCount++;
    }
    
     public void decreaseMoveCount(){
        moveCount--;
    }
    
    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position); 
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color; 
    }
}
