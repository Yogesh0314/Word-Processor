import java.awt.Font;

public class FontManagement {
    
    Font font;

    public void selectfont(String selection,int size){

        if(selection.equals("Sans Serif")){
            font = new Font("SANS_SERIF",Font.PLAIN,size);
        }
        if(selection.equals("Serif")){
            font = new Font("SERIF",Font.PLAIN,size);
        }
        if(selection.equals("Monospaced")){
            font = new Font("Monospaced",Font.PLAIN,size);
        }
    }

    public Font getFont(){
        return font;
    }
}
