import java.awt.Color;

public class ColorManagement {
    
    // void method to select color;
    Color color;

    public void selectColor(String selection){

        if(selection.equals("Red")){
            color = Color.RED;
        }
        if(selection.equals("Blue")){
            color = Color.BLUE;
        }
        if(selection.equals("Green")){
            color = Color.GREEN;
        }
        if(selection.equals("Orange")){
            color = Color.ORANGE;
        }
        if(selection.equals("Black")){
            color = Color.BLACK;
        }
        if(selection.equals("Pink")){
            color = Color.PINK;
        }

    }
    // We are returning the which color is selected
    public Color getColor(){
        return color;
    }
}
