package SymanticCheck;

public class ClassDeclarationExpectedError extends RuntimeException {

    public final int lineNumber;
    public  ClassDeclarationOrDecoratorExpectedErrorSymbolTable classDeclarationOrDecoratorExpectedErrorSymbolTable;

    public ClassDeclarationExpectedError(ClassDeclarationOrDecoratorExpectedErrorSymbolTable symbolTable, int lineNumber) {
        super("Class Declaration expected"+ " at line " + lineNumber);
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
