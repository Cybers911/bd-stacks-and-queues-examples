package com.frank;

import java.util.Stack;

public class ExampleStack {

    private static Stack<String> pastCommands = new Stack<>();

    private static Stack<String> futureCommands = new Stack<>();

    private static void undo() {
        //Adding to the future Tasks
            // The last Task I did  from the past stack to the future stack
        if (!pastCommands.isEmpty()){// Si el stack de undo no esta vacio
            // Esto es para que cuando haga undo, vuelva a poner el ultimo comando
            // que hizo undo en el past stack
            // lo q saco que lo vuelva a poner al
            // principio del stack
        // Esto es para que cuando haga undo, vuelva a poner el ultimo comando
        futureCommands.push(pastCommands.pop());

    } //This will put the last command back into the past stack
    // Esto es para que cuando haga undo, vuelva a poner el ultimo comando
    // que hizo undo en el past stack
    } //This will put the last command back into the past stack

    public static void redo() {
        if (!futureCommands.isEmpty()){// Si el stack de redo no esta vacio
            // Esto es para que cuando haga redo, vuelva a poner el ultimo comando
            // que hizo undo en el past stack
            pastCommands.push(futureCommands.pop());
        }
        //Adding to the past Tasks
            // The last Task I did  from the future stack to the past stack
         // lo q saco que lo vuelva a poner al
            // principio del stack
        // Esto es para que cuando haga redo, vuelva a poner el ultimo comando
        // que hizo undo en el past stack
    }


    public static void main(String[] args) {
        pastCommands.push("Draw a box");
        pastCommands.push("Move a circle");
        pastCommands.push("Change the color");
        pastCommands.push("Fill the box");
        pastCommands.push("Draw a circle");
 /*       System.out.println(pastCommands); //[Draw a box, Move a circle, Change
        // the color, Fill the box, Draw a circle]
        System.out.println("very LAST thing done " + pastCommands.peek());
        //very first LAST doneDraw a circle
        undo();
        System.out.println("very LAST thing done " + pastCommands.peek());*/

       undo();

        System.out.println("Undo Stack" + pastCommands); //[Draw a box, Move a circle]

        System.out.println("Redo Stack" + futureCommands); //[Change the color, Fill the box, Draw a circle]

        redo();

        System.out.println("Undo Stack" + pastCommands); //[Draw a box, Move a circle, Change the color, Fill the box, Draw a circle]
        System.out.println("Redo Stack" + futureCommands); //[]

        redo();

        System.out.println("Undo Stack" + pastCommands);
        System.out.println("Redo Stack" + futureCommands);






    }
}

/*
5move a circle        Undo the last action 5 moved circles
4draw a circle                             4 draw circles
3change the color                          3 change colors
2fill the box                              2 fill the boxe
1 Draw a box                               1 Draw a boxe
*/


