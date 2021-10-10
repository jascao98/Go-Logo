/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gologolo.workspace;

import djf.AppPropertyType;
import static djf.AppPropertyType.RESET_BUTTON;
import static djf.AppPropertyType.RESIZE_BUTTON;
import static djf.AppPropertyType.ZOOM_IN_BUTTON;
import static djf.AppPropertyType.ZOOM_OUT_BUTTON;
import djf.AppTemplate;
import djf.components.AppWorkspaceComponent;
import djf.modules.AppFoolproofModule;
import djf.modules.AppGUIModule;


import static djf.modules.AppGUIModule.DISABLED;
import static djf.modules.AppGUIModule.ENABLED;
import static djf.modules.AppGUIModule.FOCUS_TRAVERSABLE;
import static djf.modules.AppGUIModule.HAS_KEY_HANDLER;
import djf.ui.AppNodesBuilder;
import gologolo.GoLogoLo;
import gologolo.data.LogoCircle;
import gologolo.data.LogoData;
import gologolo.data.LogoPrototype;
import gologolo.data.LogoRectangle;
import static gologolo.goLogoLoPropertyType.ADD_CIRCLE_BUTTON;
import static gologolo.goLogoLoPropertyType.ADD_IMAGE_BUTTON;
import static gologolo.goLogoLoPropertyType.ADD_RECTANGLE_BUTTON;
import static gologolo.goLogoLoPropertyType.ADD_TEXT_BUTTON;
import static gologolo.goLogoLoPropertyType.ADD_TRIANGLE_BUTTON;
import static gologolo.goLogoLoPropertyType.BOLD_BUTTON;
import static gologolo.goLogoLoPropertyType.BORDER_COLOR_OPTIONS;
import static gologolo.goLogoLoPropertyType.COLOR_PICKER;
import static gologolo.goLogoLoPropertyType.CYCLE_METHOD_OPTIONS;
import static gologolo.goLogoLoPropertyType.LOGO_BORDER_COLOR_COMBO_BOX;
import static gologolo.goLogoLoPropertyType.LOGO_BORDER_CONTROL_PANE;
import static gologolo.goLogoLoPropertyType.LOGO_BORDER_RAIDIUS_SLIDER;
import static gologolo.goLogoLoPropertyType.LOGO_BORDER_THICKNESS_SLIDER;

import static gologolo.goLogoLoPropertyType.LOGO_CHART_PANE;
import static gologolo.goLogoLoPropertyType.LOGO_COMPONENTS_BUTTONS_PANE;
import static gologolo.goLogoLoPropertyType.DECREASE_TEXT_BUTTON;
import static gologolo.goLogoLoPropertyType.DEFAULT_BORDER_COLOR;
import static gologolo.goLogoLoPropertyType.DEFAULT_CYCLE_METHOD;
import static gologolo.goLogoLoPropertyType.DEFAULT_FONT;
import static gologolo.goLogoLoPropertyType.DEFAULT_FONT_SIZE;
import static gologolo.goLogoLoPropertyType.DELETE_BUTTON;
import static gologolo.goLogoLoPropertyType.FONT_COLOR_PICKER_BUTTON;

import static gologolo.goLogoLoPropertyType.FONT_OPTIONS;
import static gologolo.goLogoLoPropertyType.FONT_SIZE_OPTIONS;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_BORDER_COLOR_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_BORDER_RADIUS_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_BORDER_THICKNESS_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_CENTER_X_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_CENTER_Y_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_COLOR_GRADIENT_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_CYCLE_METHOD_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_FOCUS_ANGLE_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_FOCUS_DISTANCE_LABEL;
import static gologolo.goLogoLoPropertyType.RENAME_BUTTON;
import static gologolo.goLogoLoPropertyType.LOGO_EDIT_PANE;
import static gologolo.goLogoLoPropertyType.LOGO_FONT_BUTTONS_PANE;
import static gologolo.goLogoLoPropertyType.LOGO_FONT_COMBO_BOX;
import static gologolo.goLogoLoPropertyType.LOGO_FONT_SIZE_COMBO_BOX;
import static gologolo.goLogoLoPropertyType.INCREASE_TEXT_BUTTON;
import static gologolo.goLogoLoPropertyType.ITALICIZE_BUTTON;
import static gologolo.goLogoLoPropertyType.MOVE_DOWN_BUTTON;
import static gologolo.goLogoLoPropertyType.MOVE_UP_BUTTON;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_NAME_COLUMN;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_ORDER_COLUMN;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_RADIUS_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_STOP_0_COLOR_LABEL;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_STOP_1_COLOR_LABEL;
import static gologolo.goLogoLoPropertyType.LOGO_PANE;
import static gologolo.goLogoLoPropertyType.LOGO_RIGHT_PANE;
import static gologolo.goLogoLoPropertyType.LOGO_TABLE_BUTTONS_PANE;
import static gologolo.goLogoLoPropertyType.LOGO_TABLE_VIEW;
import static gologolo.goLogoLoPropertyType.GOLOGOLO_TYPE_COLUMN;
import static gologolo.goLogoLoPropertyType.LOGO_CENTER_X_SLIDER;
import static gologolo.goLogoLoPropertyType.LOGO_CENTER_Y_SLIDER;
import static gologolo.goLogoLoPropertyType.LOGO_CYCLE_METHOD_COMBO_BOX;
import static gologolo.goLogoLoPropertyType.LOGO_FOCUS_ANGLE_SLIDER;
import static gologolo.goLogoLoPropertyType.LOGO_FOCUS_DISTANCE_SLIDER;
import static gologolo.goLogoLoPropertyType.LOGO_FOOLPROOF_SETTINGS;
import static gologolo.goLogoLoPropertyType.LOGO_GRADIENT_PANE;
import static gologolo.goLogoLoPropertyType.LOGO_ONE_COLOR;
import static gologolo.goLogoLoPropertyType.LOGO_PARENT_EDIT;
import static gologolo.goLogoLoPropertyType.LOGO_RADIUS_SLIDER;
import static gologolo.goLogoLoPropertyType.LOGO_ZERO_COLOR;
import static gologolo.goLogoLoPropertyType.UNDERLINE_BUTTON;
import gologolo.workspace.controller.LogoController;
import gologolo.workspace.foolproof.LogoFoolproofDesign;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_BOX;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_COLUMN;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_DIALOG_TEXT_FIELD;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_EDIT_BOX;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_ICON;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_ICON_PANE;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_LEFT_BOX;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_REGULAR_LABEL;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_RIGHT_BOX;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_RIGHT_ICON_PANE;

import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_TABLE;
import static gologolo.workspace.style.LogoStyle.CLASS_LOGO_TITLE_LABEL;
import static gologolo.workspace.style.LogoStyle.LOGO_COMBO_BOX;
import static gologolo.workspace.style.LogoStyle.LOGO_LONG_COMBO_BOX;
import static gologolo.workspace.style.LogoStyle.LOGO_SHORT_COMBO_BOX;
import static gologolo.workspace.style.LogoStyle.LOGO_SLIDER;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Paint;
import javafx.scene.paint.RadialGradient;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import properties_manager.PropertiesManager;

/**
 *
 * @author Jason Cao
 */
public class goLogoLoWorkspace extends AppWorkspaceComponent{

    public goLogoLoWorkspace(GoLogoLo app) {
        super(app);
    

        // LAYOUT THE APP
        initLayout();
        
         
        initFoolproofDesign();
    }
        
    
    
    
    // THIS HELPER METHOD INITIALIZES ALL THE CONTROLS IN THE WORKSPACE
    private void initLayout() {
        // FIRST LOAD THE FONT FAMILIES FOR THE COMBO BOX
        PropertiesManager props = PropertiesManager.getPropertiesManager();
        
        // THIS WILL BUILD ALL OF OUR JavaFX COMPONENTS FOR US
        AppNodesBuilder goLogoLoBuilder = app.getGUIModule().getNodesBuilder();
        
        
        //THE PANE IN THE FIRST BACKGROUND (PURPLE)
        BorderPane goLogoLoPane= goLogoLoBuilder.buildBorderPane(LOGO_PANE,     null,   null,   CLASS_LOGO_BOX,     HAS_KEY_HANDLER,        FOCUS_TRAVERSABLE,      ENABLED);
        
   
        //THE LEFT PANE WITH TABLE AND MOVEMENT ICONS  
        VBox goLogoLoLeftPane= goLogoLoBuilder.buildVBox(LOGO_CHART_PANE,                 null,       null,   CLASS_LOGO_LEFT_BOX, HAS_KEY_HANDLER,     FOCUS_TRAVERSABLE,  ENABLED);
       //table
        TableView<LogoPrototype> logoTable  = goLogoLoBuilder.buildTableView(LOGO_TABLE_VIEW,       goLogoLoLeftPane,          null,   CLASS_LOGO_LEFT_BOX, HAS_KEY_HANDLER,    FOCUS_TRAVERSABLE,  true);
        TableColumn orderColumn      = goLogoLoBuilder.buildTableColumn(  GOLOGOLO_ORDER_COLUMN,        logoTable,                   CLASS_LOGO_COLUMN);
        TableColumn nameColumn      = goLogoLoBuilder.buildTableColumn(  GOLOGOLO_NAME_COLUMN,          logoTable,                   CLASS_LOGO_COLUMN);
        TableColumn typeColumn      = goLogoLoBuilder.buildTableColumn(  GOLOGOLO_TYPE_COLUMN,          logoTable,                   CLASS_LOGO_COLUMN);
        orderColumn.setCellValueFactory(     new PropertyValueFactory<String,    String>("order"));
        nameColumn.setCellValueFactory(     new PropertyValueFactory<String,    String>("name"));
        typeColumn.setCellValueFactory(     new PropertyValueFactory<String,    String>("type"));
        


        //the logo under the table
        HBox tableButtonsPane        = goLogoLoBuilder.buildHBox(LOGO_TABLE_BUTTONS_PANE,          goLogoLoLeftPane,         null,   CLASS_LOGO_ICON_PANE, HAS_KEY_HANDLER,     FOCUS_TRAVERSABLE,  ENABLED);
        Button moveUpButton          = goLogoLoBuilder.buildIconButton(MOVE_UP_BUTTON,        tableButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE,  DISABLED);
        Button moveDownButton        = goLogoLoBuilder.buildIconButton(MOVE_DOWN_BUTTON,        tableButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE, DISABLED);
        Button editButton            = goLogoLoBuilder.buildIconButton(RENAME_BUTTON,        tableButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE,  DISABLED);
        
        
        //THE PANE IN THE MIDDLE(WHITE ONE) FOR EDITING LOGOS (PLAIN WHITE PANE)
        StackPane parentEditPane=new StackPane();
        Pane goLogoLoEditPane= goLogoLoBuilder.buildPane(LOGO_EDIT_PANE,    null,   null,   CLASS_LOGO_EDIT_BOX,     HAS_KEY_HANDLER,        FOCUS_TRAVERSABLE,      ENABLED);
        parentEditPane.getChildren().add(goLogoLoEditPane);
        
        
        //boundary for dragging from online
        goLogoLoEditPane.layoutBoundsProperty().addListener((ObservableValue<? extends Bounds> observable, Bounds oldBounds, Bounds bounds) -> {
            goLogoLoEditPane.setClip(new Rectangle(bounds.getMinX(), bounds.getMinY(), bounds.getWidth(), bounds.getHeight()));
        });
        //boundary for zoom in from online
        parentEditPane.layoutBoundsProperty().addListener((ObservableValue<? extends Bounds> observable, Bounds oldBounds, Bounds bounds) -> {
            parentEditPane.setClip(new Rectangle(bounds.getMinX(), bounds.getMinY(), bounds.getWidth(), bounds.getHeight()));
        });
        
        
        //THE RIGHT PANE
        VBox goLogoLoRightPane= goLogoLoBuilder.buildVBox(LOGO_RIGHT_PANE,     null,   null,   CLASS_LOGO_RIGHT_BOX,     HAS_KEY_HANDLER,        FOCUS_TRAVERSABLE,      ENABLED);
        goLogoLoRightPane.setSpacing(5);
        
        //TOP ICON BAR ON RIGHT PANE
        HBox componentButtonsPane         = goLogoLoBuilder.buildHBox(LOGO_COMPONENTS_BUTTONS_PANE,           goLogoLoRightPane,            null,   CLASS_LOGO_RIGHT_ICON_PANE, HAS_KEY_HANDLER,     FOCUS_TRAVERSABLE,  ENABLED);
        Button addTextButton              = goLogoLoBuilder.buildIconButton(ADD_TEXT_BUTTON,             componentButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE,  ENABLED);
        Button addImageButton             = goLogoLoBuilder.buildIconButton(ADD_IMAGE_BUTTON,            componentButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE,  ENABLED);
        Button addRectangleButton         = goLogoLoBuilder.buildIconButton(ADD_RECTANGLE_BUTTON,        componentButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE,  ENABLED);
        Button addCircleButton            = goLogoLoBuilder.buildIconButton(ADD_CIRCLE_BUTTON,           componentButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE,  ENABLED);
        Button addTriangleButton          = goLogoLoBuilder.buildIconButton(ADD_TRIANGLE_BUTTON,         componentButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE,  ENABLED);
        Button deleteButton               = goLogoLoBuilder.buildIconButton(DELETE_BUTTON,     componentButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE,  DISABLED);

        
   
        //FONT BAR PANE
        FlowPane fontButtonsPane               =goLogoLoBuilder.buildFlowPane(LOGO_FONT_BUTTONS_PANE,           goLogoLoRightPane,            null,   CLASS_LOGO_RIGHT_ICON_PANE, HAS_KEY_HANDLER,     FOCUS_TRAVERSABLE,  ENABLED); 
        fontButtonsPane.setPrefWrapLength(20);   
        //font and size slider bars  
        ArrayList <String> fontNames=new ArrayList<>();
        String defaultFont="Times New Roman";
        fontNames.add(defaultFont);
        ComboBox fontComboBox           =goLogoLoBuilder.buildComboBox(LOGO_FONT_COMBO_BOX,           FONT_OPTIONS,                    DEFAULT_FONT,            fontButtonsPane,            null,           LOGO_COMBO_BOX,          HAS_KEY_HANDLER,            FOCUS_TRAVERSABLE,          ENABLED);
        
         
         ArrayList<String> fontSizes=new ArrayList<>();
         String defaultSize="72";
         fontNames.add(defaultFont);
         ComboBox fontSizeComboBox           =goLogoLoBuilder.buildComboBox(LOGO_FONT_SIZE_COMBO_BOX,          FONT_SIZE_OPTIONS,                    DEFAULT_FONT_SIZE,            fontButtonsPane,            null,           LOGO_SHORT_COMBO_BOX,          HAS_KEY_HANDLER,            FOCUS_TRAVERSABLE,          ENABLED);
         fontButtonsPane.rowValignmentProperty();
        //font buttons
        Button boldButton                = goLogoLoBuilder.buildIconButton(BOLD_BUTTON,                  fontButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE, DISABLED);
        Button italicizeButton           = goLogoLoBuilder.buildIconButton(ITALICIZE_BUTTON,             fontButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE, DISABLED);
        Button increaseTextButton       = goLogoLoBuilder.buildIconButton(INCREASE_TEXT_BUTTON,         fontButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE,  DISABLED);
        Button decreaseTextButton        = goLogoLoBuilder.buildIconButton(DECREASE_TEXT_BUTTON,         fontButtonsPane,         null,    CLASS_LOGO_ICON, HAS_KEY_HANDLER,   FOCUS_TRAVERSABLE, DISABLED);
       
      
        ColorPicker fontColor=goLogoLoBuilder.buildColorPicker(FONT_COLOR_PICKER_BUTTON,  fontButtonsPane, null, CLASS_LOGO_ICON, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);    
     
              
        
        //border pane (boder sliders)
        VBox borderControlPane            = goLogoLoBuilder.buildVBox(LOGO_BORDER_CONTROL_PANE,           goLogoLoRightPane,            null,   CLASS_LOGO_RIGHT_ICON_PANE, HAS_KEY_HANDLER,     FOCUS_TRAVERSABLE,  ENABLED);
        
        //border thickness 
        Label borderThicknessTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_BORDER_THICKNESS_LABEL, borderControlPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        Slider borderThickness                  =goLogoLoBuilder.buildSlider(LOGO_BORDER_THICKNESS_SLIDER,    borderControlPane,              null,   LOGO_SLIDER,    1,           20,      HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, DISABLED);
        borderThicknessTextfield.setTextFill(Color.WHITE);
        //border color
        Label borderColorTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_BORDER_COLOR_LABEL, borderControlPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        borderColorTextfield.setTextFill(Color.WHITE);
        ColorPicker pickColorBorder=goLogoLoBuilder.buildColorPicker(COLOR_PICKER, borderControlPane, null, LOGO_LONG_COMBO_BOX, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, DISABLED);
        //border raidus 
        Label borderRadiusTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_BORDER_RADIUS_LABEL, borderControlPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        borderRadiusTextfield.setTextFill(Color.WHITE);
        Slider borderRaidus                    =goLogoLoBuilder.buildSlider(LOGO_BORDER_RAIDIUS_SLIDER,        borderControlPane,              null,   LOGO_SLIDER,    0,           100,      HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, DISABLED);
        
        
        //gradient pane
         VBox gradientPane            = goLogoLoBuilder.buildVBox(LOGO_GRADIENT_PANE,           goLogoLoRightPane,            null,   CLASS_LOGO_RIGHT_ICON_PANE, HAS_KEY_HANDLER,     FOCUS_TRAVERSABLE,  ENABLED);
         Label gradientTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_COLOR_GRADIENT_LABEL, gradientPane,     null,   CLASS_LOGO_TITLE_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
         gradientTextfield.setTextFill(Color.WHITE);
        
        Label focusAngleTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_FOCUS_ANGLE_LABEL, gradientPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        focusAngleTextfield.setTextFill(Color.WHITE);
        Slider focusAngle                    =goLogoLoBuilder.buildSlider(LOGO_FOCUS_ANGLE_SLIDER,        gradientPane,              null,   LOGO_SLIDER,    0,           5,      HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, DISABLED);
        
        Label focusDistanceTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_FOCUS_DISTANCE_LABEL, gradientPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        focusDistanceTextfield.setTextFill(Color.WHITE);
        Slider focusDistance                    =goLogoLoBuilder.buildSlider(LOGO_FOCUS_DISTANCE_SLIDER,        gradientPane,              null,   LOGO_SLIDER,    0,           5,      HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, DISABLED);
        
        Label centerXTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_CENTER_X_LABEL, gradientPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        centerXTextfield.setTextFill(Color.WHITE);
        Slider centerX                    =goLogoLoBuilder.buildSlider(LOGO_CENTER_X_SLIDER,        gradientPane,              null,   LOGO_SLIDER,    0,           5,      HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, DISABLED);
        
        Label centerYTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_CENTER_Y_LABEL, gradientPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        centerYTextfield.setTextFill(Color.WHITE);
        Slider centerY                    =goLogoLoBuilder.buildSlider(LOGO_CENTER_Y_SLIDER,        gradientPane,              null,   LOGO_SLIDER,    0,           5,      HAS_KEY_HANDLER, FOCUS_TRAVERSABLE,DISABLED);
        
        Label radiusTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_RADIUS_LABEL, gradientPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        radiusTextfield.setTextFill(Color.WHITE);
        Slider radius                   =goLogoLoBuilder.buildSlider(LOGO_RADIUS_SLIDER,        gradientPane,              null,   LOGO_SLIDER,    0,           5,      HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, DISABLED);
        
        //combo box for cycle method
        Label cycleMethodTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_CYCLE_METHOD_LABEL, gradientPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        cycleMethodTextfield.setTextFill(Color.WHITE);
              
        ComboBox cycleMethodComboBox           =goLogoLoBuilder.buildComboBox(LOGO_CYCLE_METHOD_COMBO_BOX,           CYCLE_METHOD_OPTIONS,                    DEFAULT_CYCLE_METHOD,            gradientPane,            null,           LOGO_LONG_COMBO_BOX,          HAS_KEY_HANDLER,            FOCUS_TRAVERSABLE,       DISABLED);
        
        Label stopZeroColorTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_STOP_0_COLOR_LABEL, gradientPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        stopZeroColorTextfield.setTextFill(Color.WHITE);
        ColorPicker zeroColor=goLogoLoBuilder.buildColorPicker(LOGO_ZERO_COLOR, gradientPane, null, LOGO_LONG_COMBO_BOX, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, DISABLED);
        
        Label stopOneColorTextfield      =goLogoLoBuilder.buildLabel(GOLOGOLO_STOP_1_COLOR_LABEL, gradientPane,     null,   CLASS_LOGO_REGULAR_LABEL, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, ENABLED);
        stopOneColorTextfield.setTextFill(Color.WHITE);
        ColorPicker oneColor=goLogoLoBuilder.buildColorPicker(LOGO_ONE_COLOR, gradientPane, null, LOGO_LONG_COMBO_BOX, HAS_KEY_HANDLER, FOCUS_TRAVERSABLE, DISABLED);
     
    
         
        goLogoLoPane.setLeft(goLogoLoLeftPane);
        goLogoLoPane.setCenter(parentEditPane);
        goLogoLoPane.setRight(goLogoLoRightPane);
        workspace = new BorderPane();
	((BorderPane)workspace).setCenter(goLogoLoPane);
      
        
        //event handlers
       
        LogoController eventController=new LogoController((GoLogoLo)app);
        addRectangleButton.setOnAction(e->{
            eventController.processAddRectangle();
        });
        
        addCircleButton.setOnAction(e->{
            eventController.processAddCircle();
        });
        
        addTextButton.setOnAction(e->{
            eventController.processAddText();
        });
        
         deleteButton.setOnAction(e->{
            eventController.processDeleteComponent();
        });
        
         editButton.setOnAction(e->{
            eventController.processRenameComponent();
        });
         
            boldButton.setOnAction(e->{
            eventController.processBoldText();
           
        });
         
            
               italicizeButton.setOnAction(e->{
            eventController.processItalicizeText();
        });
         
          fontSizeComboBox.setOnAction(e->{
            eventController.processChangeFontSize((String)fontSizeComboBox.getValue());  
        });
         
         
         
          fontComboBox.setOnAction(e->{
            eventController.processChangeFont((String)fontComboBox.getValue());  
        });
          
//          goLogoLoEditPane.setOnMouseClicked(e -> {
//                      LogoData data = (LogoData)app.getDataComponent();
//                      data.c
//          });
//          
          addImageButton.setOnAction(e->{
             File file= djf.ui.dialogs.AppDialogsFacade.showOpenDialog(null,null);
             String filePath=file.getAbsolutePath();
            try {
                eventController.processAddImage(file,filePath);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(goLogoLoWorkspace.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         
         fontColor.setOnAction(e->{
           eventController.processChangeFontColor((Color)fontColor.getValue());
          });
        increaseTextButton.setOnAction(e->{
            eventController.processIncreaseText();
        });
         
        decreaseTextButton.setOnAction(e->{
            eventController.processDecreaseText();
        });
        
        moveUpButton.setOnAction(e->{
            eventController.processMoveUp();
        });
        
       
          moveDownButton.setOnAction(e->{
            eventController.processMoveDown();
        });
        
       
            focusAngle.valueProperty().addListener(e->{
                 LogoData data = (LogoData)app.getDataComponent();
                   LogoPrototype selected=data.getSelectedItem();

                   focusAngle.setOnMouseDragged(y->{
                     if(selected.getType().equalsIgnoreCase("Rectangle")){
                         LogoRectangle rectangle=(LogoRectangle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(focusAngle.valueProperty().doubleValue(),
                                                                      rectangle.getFocusDistance(),
                                                                      rectangle.getCenterX(),
                                                                      rectangle.getCenterY(),
                                                                      rectangle.getRadius(),
                                                                      rectangle.getProportion(),
                                                                      rectangle.getCycleMethod(),   
                                                                      rectangle.getStop1(),
                                                                       rectangle.getStop2()) ;  
                         rectangle.setFill(gradient);
                 }
                    else if(selected.getType().equalsIgnoreCase("Circle")){
                        LogoCircle circle=(LogoCircle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(focusAngle.valueProperty().doubleValue(),
                                                                     circle.getFocusDistance(),
                                                                      circle.getGradientCenterX(),
                                                                      circle.getGradientCenterY(),
                                                                      circle.getGradientRadius(),
                                                                      circle.getProportion(),
                                                                      circle.getCycleMethod(),
                                                                      circle.getStop0(),
                                                                     circle.getStop1());
                         circle.setFill(gradient);
                    }
                   });
                
                
            focusAngle.setOnMouseReleased((x->{
            eventController.processFocusAngle((focusAngle.valueProperty().doubleValue()));
         }));
      });
                
       
            
        focusDistance.valueProperty().addListener(e->{
            LogoData data = (LogoData)app.getDataComponent();
                   LogoPrototype selected=data.getSelectedItem();

                   focusDistance.setOnMouseDragged(y->{
                     if(selected.getType().equalsIgnoreCase("Rectangle")){
                         LogoRectangle rectangle=(LogoRectangle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(rectangle.getFocusAngle(),
                                                                      focusDistance.valueProperty().doubleValue(),
                                                                      rectangle.getCenterX(),
                                                                      rectangle.getCenterY(),
                                                                      rectangle.getRadius(),
                                                                      rectangle.getProportion(),
                                                                      rectangle.getCycleMethod(),   
                                                                      rectangle.getStop1(),
                                                                       rectangle.getStop2()) ;  
                         rectangle.setFill(gradient);
                 }
              
                     else if(selected.getType().equalsIgnoreCase("Circle")){
                        LogoCircle circle=(LogoCircle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(circle.getFocusAngle(),
                                                                     focusDistance.valueProperty().doubleValue(),
                                                                      circle.getGradientCenterX(),
                                                                      circle.getGradientCenterY(),
                                                                      circle.getGradientRadius(),
                                                                      circle.getProportion(),
                                                                      circle.getCycleMethod(),
                                                                      circle.getStop0(),
                                                                     circle.getStop1());
                         circle.setFill(gradient);
                    }
            
               });
                   
              focusDistance.setOnMouseReleased((x->{
            eventController.processFocusDistance((focusDistance.valueProperty().doubleValue()));
        }));
        });
          
        
        
        centerX.valueProperty().addListener(e->{
              LogoData data = (LogoData)app.getDataComponent();
                   LogoPrototype selected=data.getSelectedItem();

                   centerX.setOnMouseDragged(y->{
                     if(selected.getType().equalsIgnoreCase("Rectangle")){
                         LogoRectangle rectangle=(LogoRectangle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(rectangle.getFocusAngle(),
                                                                      rectangle.getFocusDistance(),
                                                                      centerX.valueProperty().doubleValue(),
                                                                      rectangle.getCenterY(),
                                                                      rectangle.getRadius(),
                                                                      rectangle.getProportion(),
                                                                      rectangle.getCycleMethod(),   
                                                                      rectangle.getStop1(),
                                                                      rectangle.getStop2()) ;  
                         rectangle.setFill(gradient);
                 }
              
                     else if(selected.getType().equalsIgnoreCase("Circle")){
                        LogoCircle circle=(LogoCircle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(circle.getFocusAngle(),
                                                                     circle.getFocusDistance(),
                                                                      centerX.valueProperty().doubleValue(),
                                                                      circle.getGradientCenterY(),
                                                                      circle.getGradientRadius(),
                                                                      circle.getProportion(),
                                                                      circle.getCycleMethod(),
                                                                      circle.getStop0(),
                                                                     circle.getStop1());
                         circle.setFill(gradient);
                    }
            
               });
                           
            centerX.setOnMouseReleased((x->{
                
            eventController.processCenterX((centerX.valueProperty().doubleValue()));
            }));
            
        });
        
        
        
        
        centerY.valueProperty().addListener(e->{
            LogoData data = (LogoData)app.getDataComponent();
                   LogoPrototype selected=data.getSelectedItem();

                   centerY.setOnMouseDragged(y->{
                     if(selected.getType().equalsIgnoreCase("Rectangle")){
                         LogoRectangle rectangle=(LogoRectangle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(rectangle.getFocusAngle(),
                                                                      rectangle.getFocusDistance(),
                                                                      rectangle.getCenterX(),
                                                                      centerY.valueProperty().doubleValue(),
                                                                      rectangle.getRadius(),
                                                                      rectangle.getProportion(),
                                                                      rectangle.getCycleMethod(),   
                                                                      rectangle.getStop1(),
                                                                      rectangle.getStop2()) ;  
                         rectangle.setFill(gradient);
                 }
              
                     else if(selected.getType().equalsIgnoreCase("Circle")){
                        LogoCircle circle=(LogoCircle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(circle.getFocusAngle(),
                                                                     circle.getFocusDistance(),
                                                                      circle.getGradientCenterX(),
                                                                      centerY.valueProperty().doubleValue(),
                                                                      circle.getGradientRadius(),
                                                                      circle.getProportion(),
                                                                      circle.getCycleMethod(),
                                                                      circle.getStop0(),
                                                                     circle.getStop1());
                         circle.setFill(gradient);
                    }
            
               });      
             centerY.setOnMouseReleased((x->{
            eventController.processCenterY((centerY.valueProperty().doubleValue()));
        }));
     
        });
        
        
        
        
        
         radius.valueProperty().addListener(e->{
             
              LogoData data = (LogoData)app.getDataComponent();
                   LogoPrototype selected=data.getSelectedItem();

                   radius.setOnMouseDragged(y->{
                     if(selected.getType().equalsIgnoreCase("Rectangle")){
                         LogoRectangle rectangle=(LogoRectangle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(rectangle.getFocusAngle(),
                                                                      rectangle.getFocusDistance(),
                                                                      rectangle.getCenterX(),
                                                                      rectangle.getCenterY(),
                                                                      radius.valueProperty().doubleValue(),
                                                                      rectangle.getProportion(),
                                                                      rectangle.getCycleMethod(),   
                                                                      rectangle.getStop1(),
                                                                      rectangle.getStop2()) ;  
                         rectangle.setFill(gradient);
                 }
              
                     else if(selected.getType().equalsIgnoreCase("Circle")){
                        LogoCircle circle=(LogoCircle) data.getEditComponents().get(data.getItemIndex(selected));
                         RadialGradient gradient=new RadialGradient(circle.getFocusAngle(),
                                                                     circle.getFocusDistance(),
                                                                      circle.getGradientCenterX(),
                                                                      circle.getGradientCenterY(),
                                                                      radius.valueProperty().doubleValue(),
                                                                      circle.getProportion(),
                                                                      circle.getCycleMethod(),
                                                                      circle.getStop0(),
                                                                     circle.getStop1());
                         circle.setFill(gradient);
                    }
            
               });    
             
             
               radius.setOnMouseReleased((x->{
               eventController.processRadius((radius.valueProperty().doubleValue()));
        }));
         });
         

         
         
             borderThickness.valueProperty().addListener(e->{
                   LogoData data = (LogoData)app.getDataComponent();
                   LogoPrototype selected=data.getSelectedItem();
                   
                   
                   
                   borderThickness.setOnMouseDragged(y->{
                     
                     if(selected.getType().equalsIgnoreCase("Rectangle")||selected.getType().equalsIgnoreCase("Circle")){
                     Shape logoShape=data.getShapeAt(data.getItemIndex(selected));   
                     logoShape.setStrokeWidth(borderThickness.valueProperty().doubleValue());
                 }
                 });
           
            borderThickness.setOnMouseReleased((x->{
            eventController.processBorderThickness((borderThickness.valueProperty().doubleValue()));
        }));
         });
             
             
             pickColorBorder.setOnAction(e -> {
             LogoData data = (LogoData)app.getDataComponent();
              LogoPrototype selected=data.getSelectedItem();
                   
            if (selected.getType().equalsIgnoreCase("Rectangle")||selected.getType().equalsIgnoreCase("Circle")) {
                
                eventController.processBorderColor(selected, (Color)pickColorBorder.getValue());
            }    
            
        });
             
        
      
             borderRaidus.valueProperty().addListener(e->{
                   LogoData data = (LogoData)app.getDataComponent();
                   LogoPrototype selected=data.getSelectedItem();   
                
                   borderRaidus.setOnMouseDragged(y->{
                     
                     if(selected.getType().equalsIgnoreCase("Rectangle")){
                     int index=data.getItemIndex(selected);
                     LogoRectangle logoShape=(LogoRectangle)data.getEditComponents().get(index);
                     logoShape.setArcHeight(borderRaidus.valueProperty().doubleValue());
                     logoShape.setArcWidth(borderRaidus.valueProperty().doubleValue());
                 }
                  
            });
            borderRaidus.setOnMouseReleased((x->{
            eventController.processBorderRadius((borderRaidus.valueProperty().doubleValue()));
       
         }));
        });
             
             
         cycleMethodComboBox.setOnAction(e->{        
            eventController.processCycleMethod(cycleMethodComboBox.getValue().toString());
    
        });
              zeroColor.setOnAction(e->{
            eventController.processZeroColor(zeroColor.getValue());  
        });
              
               oneColor.setOnAction(e->{
            eventController.processOneColor(oneColor.getValue());  
        });
            
         Button zoomInButton=(Button) app.getGUIModule().getGUINode(ZOOM_IN_BUTTON);
          zoomInButton.setOnAction(e->{
            double xScale=goLogoLoEditPane.getScaleX();
              goLogoLoEditPane.setScaleX(xScale*1.5);
              double yScale=goLogoLoEditPane.getScaleY();
              goLogoLoEditPane.setScaleY(yScale*1.5);   
            
          });
          
          
         Button zoomOutButton=(Button) app.getGUIModule().getGUINode(ZOOM_OUT_BUTTON);
         zoomOutButton.setOnAction(e->{
              double xScale=goLogoLoEditPane.getScaleX();
              goLogoLoEditPane.setScaleX(xScale*.5);
              double yScale=goLogoLoEditPane.getScaleY();
               goLogoLoEditPane.setScaleY(yScale*.5);   
          });
         
          Button resetViewButton=(Button) app.getGUIModule().getGUINode(RESET_BUTTON);
          resetViewButton.setOnAction(e->{
            
              goLogoLoEditPane.setScaleX(1);        
              goLogoLoEditPane.setScaleY(1);   
           });
         
         
             goLogoLoEditPane.setOnScroll(e -> {
            double eDelta = e.getDeltaY();
            double scaleZoom = 1.1;
           
            if (eDelta < 0){
                scaleZoom = 2.0 - scaleZoom;
            }
            goLogoLoEditPane.setScaleY( scaleZoom* goLogoLoEditPane.getScaleY() );
            goLogoLoEditPane.setScaleX( scaleZoom*goLogoLoEditPane.getScaleX() );
             
          
            });
          
             
             
         Button resizeButton=(Button) app.getGUIModule().getGUINode(RESIZE_BUTTON);
         resizeButton.setOnAction(e->{
               eventController.processResizePane();
             
              
         });
          
          
          
         //edit double click on table
         logoTable.setOnMouseClicked(e -> {
             LogoData data = (LogoData)app.getDataComponent();
            eventController.processSelectNode();
            if (e.getClickCount() == 2&& data.getSelectedItem().getType().equalsIgnoreCase("Text")) {
                
                eventController.processEditText();
            }    
            
        });
      

    }
    
  public void initFoolproofDesign() {
        AppGUIModule gui = app.getGUIModule();
        AppFoolproofModule foolproofSettings = app.getFoolproofModule();
        foolproofSettings.registerModeSettings(LOGO_FOOLPROOF_SETTINGS,
        new LogoFoolproofDesign((GoLogoLo)app));
    }
    
    @Override
    public void processWorkspaceKeyEvent(KeyEvent ke) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showNewDialog() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
