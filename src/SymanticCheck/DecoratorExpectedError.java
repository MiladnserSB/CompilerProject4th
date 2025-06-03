package SymanticCheck;

public class DecoratorExpectedError extends RuntimeException{
    public final int lineNumber;
    public  ClassDeclarationOrDecoratorExpectedErrorSymbolTable classDeclarationOrDecoratorExpectedErrorSymbolTable;

    public DecoratorExpectedError(ClassDeclarationOrDecoratorExpectedErrorSymbolTable symbolTable, int lineNumber) {
        super("Decorator expected" + " at line " + lineNumber);
        this.lineNumber = lineNumber;
        this.classDeclarationOrDecoratorExpectedErrorSymbolTable = symbolTable;
    }

    public void throwException() {
        classDeclarationOrDecoratorExpectedErrorSymbolTable.print();
        ErrorHandler.logError(this, lineNumber);
        classDeclarationOrDecoratorExpectedErrorSymbolTable.removeAllRows();
        throw this;
    }
}
