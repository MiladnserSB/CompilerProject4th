package SymanticCheck;

import ast.SymbolTable.SymbolTable;

public class MissedConstructorAccessModifierErrorSymbolTable extends SymbolTable {
    public boolean check(String key){
        return this.getRow(key)!=null;

    }
}