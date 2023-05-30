package AlfonsoPortfolioInheritance;

import javax.swing.JFrame;

// Base class Frame extending JFrame and implementing Displayable interface 
// The derived class will inherit the characteristics of the Base class
class Frame extends JFrame implements Displayable {  // this returns to the user to display the object so it will be visible
	
    protected int width;   // Width of the frame
    protected int height;  // Height of the frame

    public Frame(int width, int height) {
        this.width = width;
        this.height = height;
        setSize(width, height);                          // Set the size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set the default close operation
    }

    @Override
    public void display() {
        setVisible(true);  // Make the frame visible
    }
}







