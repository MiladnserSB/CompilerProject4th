package SymanticCheck;

import ast.SymbolTable.SymbolTable;

public class IncorrectlyOnInitImplementErrorSymbolTable extends SymbolTable {
    public boolean check (String key){
        return this.getRow(key)!=null && this.getRow("implements").getValue().contains("OnInit");
    }
}
