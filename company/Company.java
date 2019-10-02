import java.util.Scanner;
class Costcalc
{
    private float paperCost;
    private int paperCount;
    private float penCost;
    private int penCount;
    private float inflation;
    private float total;

    Costcalc(int penCount, int paperCount,float penCost, float paperCost, float inflation) {
        this.paperCost = paperCost;  
        this.paperCount = paperCount;  
        this.penCost = penCost;  
        this.penCount = penCount;  
        this.inflation = inflation;  
    }

    public float cost() {
        this.total += this.paperCount * this.paperCost;
        this.total += this.penCount * this.penCost;
        this.total = this.total + this.total * (this.inflation / 100);
        return this.total;
    }
}

public class Company {
    public static void main(String args[]){
        float result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the pen cost : ");
        float penCost = input.nextFloat();

        System.out.print("Enter the paper cost : ");
        float paperCost = input.nextFloat();

        System.out.print("Enter the inflation : ");
        float inflation = input.nextFloat();

        Costcalc obj = new Costcalc(200,50,penCost,paperCost,inflation);
        result = obj.cost();
        System.out.println("your total cost is : " + result);
    }
}