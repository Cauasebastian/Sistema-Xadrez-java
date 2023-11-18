package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    // Getter para 'rows'
    public int getRows() {
        return rows;
    }

    // Setter para 'rows'
    public void setRows(int rows) {
        this.rows = rows;
    }

    // Getter para 'columns'
    public int getColumns() {
        return columns;
    }

    // Setter para 'columns'
    public void setColumns(int columns) {
        this.columns = columns;
    }
    public Piece piece(int row, int column){
        return pieces[row][column];
    }
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColum()];
    }
}
