package SymanticCheck;

public class IncorrectlyOnInitImplementError extends RuntimeException{
    public final int lineNumber;
    public  IncorrectlyOnInitImplementErrorSymbolTable incorrectlyOnInitImplementErrorSymbolTable;

    public IncorrectlyOnInitImplementError(IncorrectlyOnInitImplementErrorSymbolTable symbolTable, int lineNumber) {
        super("Incorrectly OnInit implement");
        this.lineNumber = lineNumber;
        this.incorrectlyOnInitImplementErrorSymbolTable = symbolTable;
    }

    public void throwException() {
        incorrectlyOnInitImplementErrorSymbolTable.print();
        ErrorHandler.logError(this, lineNumber);
        throw this;
    }

}
