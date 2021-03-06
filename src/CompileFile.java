import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class CompileFile extends JMenuItem implements ActionListener {
    public CompileFile(String label) {
        super(label);
    }

    public CompileFile() {

    }

    static Map<Shapes,Integer> trackShapes = new HashMap<>();
    static Map<Character,Integer> charMap = new HashMap<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("compile");

        compileCanvas();

    }
    public  void push(Character item,int count){
        if(charMap.containsKey(item)){
            charMap.put(item,charMap.get(item)+1);
        }else{
            charMap.put(item,count);
            System.out.println("Key not present in HashMap");
        }
    }

    /*
    *
    * Sample Stub
    *
    * */
    public void compileCanvas(){

        if(null==charMap|| charMap.isEmpty())
            infoBox("No Shapes On Canvas","Failed Case");


        //This will be further updated, is just a stub.
        if(trackShapes.size()!=0) { //When there is an unconnected shape left on canvas
            //check for unprocessed shapes
            Iterator<Shapes> iterator = trackShapes.keySet().iterator();
            while(iterator.hasNext()){
                Shapes shp = iterator.next();
                if(trackShapes.containsKey(shp)){
                    if(trackShapes.get(shp)==1){
                        infoBox("Unconnected shapes !!!", "Failed Case");
                        break;
                    }
                }
            }
            //infoBox("Unconnected shapes !!!", "Failed Case");
            if ((charMap.containsKey('(') && charMap.containsKey(')') && !(charMap.get('(') == charMap.get(')')))) {
                infoBox("Un-balanced Params, Compilation Failed!!!", "Failed Case");
            }if(charMap.containsKey('<') && charMap.containsKey('>') && !(charMap.get('<') == charMap.get('>'))){
                infoBox("Un-balanced Params, Compilation Failed!!!", "Failed Case");
            }
//            if(charMap.get('(') > charMap.get(')') || charMap.get(')') > charMap.get('(')){
//                infoBox("Un-balanced Params, Compilation Failed!!!", "Failed Case");
//            }
//            if(charMap.get('<') > charMap.get('>') || charMap.get('>') > charMap.get('<')){
//                infoBox("Un-balanced Params, Compilation Failed!!!", "Failed Case");
//            }
            else{
                infoBox("Compilation successful", "Done");
            }
        } else {
            if ((charMap.containsKey('(') && charMap.containsKey(')') && !(charMap.get('(') == charMap.get(')')))) {
                infoBox("Un-balanced Params, Compilation Failed!!!", "Failed Case");
            }if(charMap.containsKey('<') && charMap.containsKey('>') && !(charMap.get('<') == charMap.get('>'))){
                infoBox("Un-balanced Params, Compilation Failed!!!", "Failed Case");
            }
//            if(charMap.get('(') > charMap.get(')') || charMap.get(')') > charMap.get('(')){
//                infoBox("Un-balanced Params, Compilation Failed!!!", "Failed Case");
//            }
//            if(charMap.get('<') > charMap.get('>') || charMap.get('>') > charMap.get('<')){
//                infoBox("Un-balanced Params, Compilation Failed!!!", "Failed Case");
//            }
            else{
                infoBox("Compilation successful", "Done");
            }

        }

    }
    public void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void setTrackShapes(List<Shapes> shapes, Integer count){
        Iterator<Shapes> shapeIterator = RightPanel.getRightPanelShapes().iterator();

        while(shapeIterator.hasNext()){
            Shapes s = shapeIterator.next();
            if(!trackShapes.containsKey(s))
                trackShapes.put(s,1); //every shape will have a unique obj Id.
        }

    }
    public static void removeConnectedShapesFromMap(Shapes s){

        trackShapes.put(s,0);
//        Iterator<Shapes> iterator = trackShapes.keySet().iterator();
//        while(iterator.hasNext()){
//            //String certification = iterator.next();
//            Shapes shp = iterator.next();
//            if(shp.equals(s)){
//
//            }
//        }

        //Read more: https://www.java67.com/2017/06/how-to-remove-entry-keyvalue-from-HashMap-in-java.html#ixzz6GoVAKt77

//        try{
//            trackShapes.remove(s);
//            System.out.println(s + " removed!!");
//        }catch (Exception e){
//            System.out.println(e.getStackTrace());
//        }
    }
}
