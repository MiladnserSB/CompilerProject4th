package SymanticCheck;

public class MissedConstructorAccessModifierError extends RuntimeException{
    public final int lineNumber;
    public MissedConstructorAccessModifierErrorSymbolTable missedConstructorAccessModifierErrorSymbolTable;

    public MissedConstructorAccessModifierError(MissedConstructorAccessModifierErrorSymbolTable symbolTable, int lineNumber) {
        super("  Missed constructor Access modifier in line " + lineNumber);
        this.lineNumber = lineNumber;
        this.missedConstructorAccessModifierErrorSymbolTable = symbolTable;
    }

    public void throwException() {
        missedConstructorAccessModifierErrorSymbolTable.print();
        ErrorHandler.logError(this, lineNumber);
        throw this;
    }
}