/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gologolo.transactions;

import gologolo.GoLogoLo;
import gologolo.data.LogoCircle;
import gologolo.data.LogoData;
import gologolo.data.LogoPrototype;
import gologolo.data.LogoRectangle;
import static gologolo.goLogoLoPropertyType.LOGO_CENTER_Y_SLIDER;
import javafx.scene.control.Slider;
import javafx.scene.paint.RadialGradient;
import jtps.jTPS_Transaction;

/**
 *
 * @author jasoncao
 */
public class CenterY_Transaction implements jTPS_Transaction{
    LogoData data;
    GoLogoLo app;
    LogoPrototype selected;
    double centerY;
    LogoRectangle selectedRectangle;
    RadialGradient newGradient;
    RadialGradient oldGradient;
    boolean isCircle=false;
    boolean isRectangle=false;
    LogoCircle selectedCircle;
    int index;
    Slider centerYSlider;
    double oldCenterY;
    
    public CenterY_Transaction(LogoData thisData,GoLogoLo appLogo,LogoPrototype component,double y,boolean isCircles,boolean isRectangles){
        data=thisData;
        centerYSlider=(Slider)data.getApp().getGUIModule().getGUINode(LOGO_CENTER_Y_SLIDER);
        app=appLogo;
        selected=component;
        centerY=y;
        index=data.getItemIndex(selected);
     
        isCircle=isCircles;
        isRectangle=isRectangles;

    }
    
    @Override
    public void doTransaction() {
      if(isRectangle){
          selectedRectangle=   (LogoRectangle) data.getEditComponents().get(index);
          oldCenterY=selectedRectangle.getCenterY();
          newGradient=new RadialGradient(selectedRectangle.getFocusAngle(),selectedRectangle.getFocusDistance(),selectedRectangle.getCenterX(),
          centerY,selectedRectangle.getRadius(),selectedRectangle.getProportion(),selectedRectangle.getCycleMethod(),selectedRectangle.getStop1(),selectedRectangle.getStop2());
          selectedRectangle.setCenterY(centerY);
          selectedRectangle.setFill(newGradient);
          centerYSlider.setValue(centerY);
         }
       else if(isCircle){
         
          selectedCircle=   (LogoCircle) data.getEditComponents().get(index);
          oldCenterY=selectedCircle.getGradientCenterY();
          newGradient=new RadialGradient(selectedCircle.getFocusAngle(),selectedCircle.getFocusDistance(),selectedCircle.getGradientCenterX(),
          centerY,selectedCircle.getGradientRadius(),selectedCircle.getProportion(),selectedCircle.getCycleMethod(),selectedCircle.getStop0(),selectedCircle.getStop1());
          selectedCircle.setGradientCenterY(centerY);
          selectedCircle.setFill(newGradient);
          
          centerYSlider.setValue(centerY);
         }
    }

    @Override
    public void undoTransaction() {
        if(isRectangle){
          selectedRectangle=   (LogoRectangle) data.getEditComponents().get(index);
         
          newGradient=new RadialGradient(selectedRectangle.getFocusAngle(),selectedRectangle.getFocusDistance(),selectedRectangle.getCenterX(),
          oldCenterY,selectedRectangle.getRadius(),selectedRectangle.getProportion(),selectedRectangle.getCycleMethod(),selectedRectangle.getStop1(),selectedRectangle.getStop2());
          selectedRectangle.setCenterY(oldCenterY);
          selectedRectangle.setFill(newGradient);
          centerYSlider.setValue(oldCenterY);
         }
        else  if(isCircle){
         
          selectedCircle=   (LogoCircle) data.getEditComponents().get(index);
          oldGradient=new RadialGradient(selectedCircle.getFocusAngle(),selectedCircle.getFocusDistance(),selectedCircle.getGradientCenterX(),
          oldCenterY,selectedCircle.getGradientRadius(),selectedCircle.getProportion(),selectedCircle.getCycleMethod(),selectedCircle.getStop0(),selectedCircle.getStop1());
          selectedCircle.setGradientCenterY(oldCenterY);
          selectedCircle.setFill(oldGradient);
          centerYSlider.setValue(oldCenterY);
         }
    }
    
}
