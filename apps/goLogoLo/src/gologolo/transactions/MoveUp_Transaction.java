/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gologolo.transactions;

import gologolo.GoLogoLo;
import gologolo.data.LogoData;
import gologolo.data.LogoPrototype;
import jtps.jTPS_Transaction;

/**
 *
 * @author jasoncao
 */
public class MoveUp_Transaction implements jTPS_Transaction {
    LogoPrototype selectedComponent;
    GoLogoLo app;
    LogoData data;
    int indexToMoveUp;
    int indexToMoveDown;
    public MoveUp_Transaction(LogoPrototype selected,GoLogoLo initApp){
        selectedComponent=selected;
        app=initApp;
        data=(LogoData)app.getDataComponent();   
        indexToMoveUp=data.getItemIndex(selectedComponent);
        indexToMoveDown=indexToMoveUp-1;
    }
    
    @Override
    public void doTransaction() {
       data.swapComponentAndNodes(indexToMoveUp, indexToMoveDown);
    }

    @Override
    public void undoTransaction() {
        data.swapComponentAndNodes(indexToMoveDown,indexToMoveUp );
    }
    
}
