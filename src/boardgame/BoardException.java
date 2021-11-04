package boardgame;

public class BoardException extends RuntimeException{
    private static final long serialVersionID = 1L;

    public BoardException(String msg){
        super(msg);
    }
}
