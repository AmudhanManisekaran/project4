import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Stack;

public class CompileFile extends JMenuItem implements ActionListener {
    public CompileFile(String label) {
        super(label);
    }

    public CompileFile() {

    }

    Stack<Character> stack = new Stack<>();
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("compile");


    }
    public  void push(Character item){
        stack.push(item);
    }
}
