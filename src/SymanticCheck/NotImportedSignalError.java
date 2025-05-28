package SymanticCheck;

public class NotImportedSignalError extends RuntimeException{
    public final int lineNumber;
    public  UndefinedImportsErrorSymbolTable undefinedImportsErrorSymbolTable;

    public NotImportedSignalError(UndefinedImportsErrorSymbolTable symbolTable, int lineNumber) {
        super("Cannot find name signal in line "+lineNumber);
        this.lineNumber = lineNumber;
        this.undefinedImportsErrorSymbolTable = symbolTable;
    }

    public void throwException() {
        undefinedImportsErrorSymbolTable.print();
        ErrorHandler.logError(this, lineNumber);
        throw this;
    }
}
