package SymanticCheck;

public class NotFoundReturnValueMethodError extends RuntimeException{
    public final int lineNumber;
    public  NotFoundReturnValueMethodErrorSymbolTable notFoundReturnValueMethodErrorSymbolTable;

    public NotFoundReturnValueMethodError(String methodNName, NotFoundReturnValueMethodErrorSymbolTable symbolTable, int lineNumber) {
        super("Not found return value error in method : " + methodNName + " at line " + lineNumber);
        this.lineNumber = lineNumber;
        this.notFoundReturnValueMethodErrorSymbolTable = symbolTable;
    }

    public void throwException() {
        notFoundReturnValueMethodErrorSymbolTable.print();
        ErrorHandler.logError(this, lineNumber);
        throw this;
    }
}
