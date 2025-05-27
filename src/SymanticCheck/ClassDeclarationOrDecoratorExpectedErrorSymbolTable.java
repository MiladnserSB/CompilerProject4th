package SymanticCheck;

import ast.SymbolTable.SymbolTable;

public class ClassDeclarationOrDecoratorExpectedErrorSymbolTable extends SymbolTable {
    public boolean check(String key){
        return this.getRow(key)!=null;

    }
}
