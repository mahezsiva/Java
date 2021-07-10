package com.day17;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;


public class TreeDemo extends JFrame
{
    private JTree tree;
    public TreeDemo()
    {
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("vehicles");
      
        DefaultMutableTreeNode Node1 = new DefaultMutableTreeNode("Bikes");
        DefaultMutableTreeNode Node2 = new DefaultMutableTreeNode("cars");
       
        root.add(Node1);
        root.add(Node2);
       
        
      
        tree = new JTree(root);
        add(tree);
        
         
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TreeDemo();
            }
        });
    }       
}
