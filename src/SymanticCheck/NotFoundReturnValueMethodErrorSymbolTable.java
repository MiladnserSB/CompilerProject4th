package SymanticCheck;

import ast.SymbolTable.SymbolTable;

public class NotFoundReturnValueMethodErrorSymbolTable extends SymbolTable {
    public boolean check(String key){
        return this.getRow(key)!=null;
    }
}
