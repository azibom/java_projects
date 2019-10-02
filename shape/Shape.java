import java.util.Scanner;
interface ShapeInterface {
    void draw();
    void area();
}

class Cross implements ShapeInterface {
    private int height;
    private int width;

    Cross(int height, int width) {
        this.height = height;  
        this.width = width;  
    }

    public void draw() {
        int num = 2 * this.height - 1;
        if (num % 2 != 0)  {
            for(int i = 0; i < num; i++) {
                   for(int j = 0; j < num; j++) {
                       if((i == num / 2) || (j == num / 2)) 
                           System.out.print("*");
                       else 
                           System.out.print(" ");
                   }
                   System.out.println();
               }
           }
    }

    public void area() {
        int area = this.height + this.width;
        System.out.println("Area : " + area);
    }
}

class Triangle implements ShapeInterface {
    private int height;
    private int width;

    Triangle(int height, int width) {
        this.height = height;  
        this.width = width;  
    }

    public void draw() {
        for (int row = 1; row <= height; row++)
        {
            for (int padding = height - row; padding > 0; padding--)
            {
                System.out.print(" ");
            }
    
            for (int numberOfAsterisks = (row * 2) - 1; numberOfAsterisks > 0; numberOfAsterisks--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void area() {
        System.out.println("Area : " + (this.height * this.width) / 2);
    }
}

class Diamond implements ShapeInterface {
    private int height;
    private int width;

    Diamond(int height, int width) {
        this.height = height;  
        this.width = width;  
    }

    public void draw() {
        for (int row = 1; row <= height; row++)
        {
            for (int padding = height - row; padding > 0; padding--)
            {
                System.out.print(" ");
            }
    
            for (int numberOfAsterisks = (row * 2) - 1; numberOfAsterisks > 0; numberOfAsterisks--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int row = height - 1; row > 0; row--)
        {
            for (int padding = row; padding < height; padding++)
            {
                System.out.print(" ");
            }
    
            for (int numberOfAsterisks = (row * 2) - 1; numberOfAsterisks > 0; numberOfAsterisks--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void area() {
        System.out.println("Area : " + (this.height * this.width) / (float) 2);
    }
}

public class Shape {
    public static void help() {
        System.out.println();
        System.out.println("Enter 0 for Cross");
        System.out.println("Enter 1 for Triangle");
        System.out.println("Enter 2 for Diamond");
        System.out.println();
    }

    public static void main(String args[]){
        boolean done = true;
        String userInput;
        String help = "help";
        int height = 0;
        int width = 0;
        int shapeNumber = 0;

        Scanner input = new Scanner(System.in);

        while(done) {
            System.out.print("Enter the height : ");
            userInput = input.nextLine();

            if (userInput.equals(help)) {
                Shape.help();
                continue;
            } else {
                height = Integer.parseInt(userInput);	
            }

            System.out.print("Enter the width : ");
            userInput = input.nextLine();

            if (userInput.equals(help)) {
                Shape.help();
                continue;
            } else {
                width = Integer.parseInt(userInput);	
            }

            System.out.print("Enter the shape number : ");
            userInput = input.nextLine();

            if (userInput.equals(help)) {
                Shape.help();
                continue;
            } else {
                shapeNumber = Integer.parseInt(userInput);	
            }

            done = false;
        }

        if(shapeNumber == 0) {
            Cross obj = new Cross(height, width);
            obj.area();
            obj.draw();
        } else if (shapeNumber == 1) {
            Triangle obj = new Triangle(height, width);
            obj.area();
            obj.draw();
        } else if (shapeNumber == 2) {
            Diamond obj = new Diamond(height, width);  
            obj.area();
            obj.draw();      
        } else {
            System.out.println("That is invalid shape number !!!");
        }        
    }
}