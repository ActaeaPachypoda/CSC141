import java.util.Scanner;

//********************************************************************************//
//       NAME: Sarah Shaw                                                         //
//      CLASS: CSC141-21                                                          //
// ASSIGNMENT: Assignment 4                                                       //
//   FILENAME: Methods.java                                                       //
//       DATE: June 30, 2017                                                      //
//DESCRIPTION: This program takes an integer and a character from the user and    //
//             outputs a square and a rectangle of the integer size using the     //
//             character input by the user.                                       //
//********************************************************************************//



public class Methods
{
    public static void main(String[] args)
    {
        //give the program instructions
        giveInstructions();

        //create the Scanner object for inputs
        Scanner kbd = new Scanner(System.in);

        //Get the inputs
        int size = getSize();   //size of the figures
        char ch = getChar();   //character to make figures out of

        //Draw the figures
        drawSquare(size, ch);
        newLine(1);
        drawRect(size, 2*size, ch);

    }

    /** The giveInstructions method outputs 
     *  the description of the program
     */
    public static void  giveInstructions()
    {
        String prompt = "Enter an integer and a character" 
        + " and get two figures drawn.";
        System.out.println(prompt);
    }

    /**
     * The getSize method returns an integer that is input by the user.  
     * This integer must be the greater than the declared min value.  
     * Any integers greater then the declared max value will return 
     * the declared default value.
     *
     * @return - user generated integer
     */
    public static int getSize()
    {
        Scanner kbd = new Scanner(System.in);

        //Integers
        int size = getInt();

        //Constants
        final int defaultSize = 10;
        final int min = 1;
        final int max = 10;
        int sizeOut = 0;
        while (size<min)
            size=getSize();

        if (size>=min && size<=max)
            sizeOut=size;
        else if (size>max)
                sizeOut= defaultSize;

        //Return the Size
        return sizeOut;
    }

    /**
     * The getChar method returns an character that is input by the user.  
     * This character cannot be a whitespace character. A whitespace 
     * character will return with the declared default.
     *
     * @return a user generated character is returned
     */
    public static char getChar()
    {
        char defaultCh = '*';
        String prompt = "Enter the character: ";
        Scanner kbd = new Scanner(System.in);
        System.out.print(prompt);
        char ch= kbd.nextLine().charAt(0);
        if (isWhiteSpace(ch))
            return defaultCh;
        else
            return ch;
    }

    /**The drawSquare method outputs a square of a
     * declared size using a declared character.
     *
     * @param size - this is an int value that is declared in the Main method
     * @param ch - this is a character value that is declared in the Main method
     */
    public static void drawSquare(int size, char ch)
    {
        int i;
        for (i=1; i<=(size*2);i++)
            if (i<=1|| i==size)
                drawSolidLine(size,ch);
            else if (i>=1 && i<=size)
                drawHollowLine(size,ch);
    }

    /**The method newLine takes an integer value and returns that many 
     * blank lines in the output
     *
     * @param x - this is an integer that determines how many println 
     *             should be output
     */
    public static void newLine(int x)
    {
        int i;
        for(i=0; i<=x; i++)
            System.out.println();
    }

    /** The drawRect method outputs a rectangle of a declared
     * width and height using a declared character.
     *
     * @param width an integer value that will determine the number of
     *              characters across that will be output
     * @param height an integer value that will determine the number of
     *               character line that will be output
     * @param ch a character value that will be used to represent 
     *           the shape output
     */
    public static void drawRect(int width, int height, char ch)
    {
        int i;
        for (i=1; i<=height;i++)
            if (i<=1|| i==height)
                drawSolidLine(width,ch);
            else if (i>=1 && i<=height)
                drawHollowLine(width,ch);
    }

    /**The isWhiteSpace method returns a boolean value that
     * examines the character value that has been entered
     *
     * @param ch this is a character value
     * @return returns a boolean value
     */
    public static boolean isWhiteSpace(char ch)
    {
        if (ch==' ')
            return true;
        else
            return false;
    }

    /**The drawHollowLine method returns a line of the length declared
     * by the size integer that is bookended with the declared character
     *
     * @param size this is an integer value
     * @param ch this is a character value
     */
    public static void drawHollowLine(int size, char ch)
    {
        int i;
        System.out.print(ch);
        for (i=1; i<=(size-2); i++)
            System.out.print(" ");
        System.out.println(ch);
    }

    /**The drawSolidLine method returns a line of the length declared by the
     * size integer with the character defined by the ch value.
     *
     * @param size this is an integer value
     * @param ch this is a character value
     */
    public static void drawSolidLine(int size, char ch)
    {
        int i;
        for (i=1; i<= size; i++)
            System.out.print(ch);
        System.out.println();
    }

    /**The getInt method both prints a prompt to enter an integer
     * then takes and returns a user input value
     *
     * @return this returns an integer value
     */
    public static int getInt()
    {
        Scanner kbd = new Scanner(System.in);
        String prompt = "Enter the size(>0): ";
        System.out.print(prompt);
        int i = kbd.nextInt();
        return i;
    }

}
