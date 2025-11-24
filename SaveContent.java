import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import javax.swing.text.html.HTMLEditorKit;

public class SaveContent {
    
    // Save all rtf file rich text file because txt do not allow to color or style.
    String formattedText;

    public void save(JTextPane text){
        if(text.getText().length() > 0){
            JFileChooser chooser = new JFileChooser();
            chooser.setMultiSelectionEnabled(false);
            // select multiply files if true only 1 when it is false
            FileNameExtensionFilter filter = new FileNameExtensionFilter("RICH TEXT FORMAT","rtf");
            chooser.setFileFilter(filter);

            int option = chooser.showSaveDialog(null);
            String filePath = chooser.getSelectedFile().getPath();

            if(!chooser.getSelectedFile().getPath().toLowerCase().endsWith(".rtf")){
                filePath = chooser.getSelectedFile().getPath() + ".rtf";
            }

            if(option == JFileChooser.APPROVE_OPTION){
                // java do not know how to convert file into rtf
                // we have to go give certain parameters to convert it
                // the styledDocument is one of them
                StyledDocument doc = (StyledDocument)text.getDocument();
                HTMLEditorKit kit = new HTMLEditorKit();
                BufferedOutputStream out;

                try{
                    out = new BufferedOutputStream(new FileOutputStream(filePath));
                    kit.write(out, doc, doc.getStartPosition().getOffset(), doc.getLength());
                }
                catch(FileNotFoundException e){

                }
                catch(IOException e){

                }
                catch(BadLocationException e){

                }
            }
                else{
                    System.out.println("Save Cancelled");
                }
            
        }
    }

}
