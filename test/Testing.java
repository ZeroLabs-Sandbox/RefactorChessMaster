import junit.framework.TestCase;
import org.junit.Test;
import org.main.Bishop;
import org.main.ChessGameBoard;
import org.main.ChessMain;
import org.main.ChessPanel;


public class Testing extends TestCase{
    private Bishop bishop;
    
    ChessGameBoard chessGB = new ChessGameBoard();
    
    public void escenario(){
        bishop = new Bishop(chessGB,4,5,1);
    }
    
    public void testcanMove(){
        escenario();
        assertEquals(false,bishop.canMove(chessGB, 0, 4));
    }
    
    public void testMove(){
        escenario();
        assertEquals(false,bishop.move(chessGB, 6, 6));
    }
      
    public void testColor(){
        escenario();
        assertEquals(1,bishop.getColorOfPiece());
    }
}