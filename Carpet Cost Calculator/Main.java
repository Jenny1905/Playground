class Floor 
{
  double width;
  double length;
Floor(double width, double length)
{
  if(width<0)
  {
    this.width=0;
  }
  else if(length<0)
  {
    this.length=0;
  }
  else
  {
    this.width=width;
    this.length=length;
  }
}
public double getArea()
{
  return width*length;
}
}
class Carpet 
{
  double cost;
  Carpet(double cost)
  {
    if(cost<0)
    {
      this.cost=0;
    }
    else
    {
      this.cost=cost;
    }
  }
  public double getCost()
  {
    return cost;
  }
}
class Calculator 
{
  Floor floor;
  Carpet carpet;
  Calculator(Floor floor,Carpet carpet)
  {
    this.floor=floor;
    this.carpet=carpet;
  }
  public double getTotalCost()
  {
    return floor.getArea()*carpet.getCost();
  }
}
public class Main{
  public static void main(String args[]){
    Carpet carpet = new Carpet(3.5);
    Floor floor = new Floor(2.75, 4.0);
    Calculator calculator = new Calculator(floor, carpet);
    System.out.println("Total = " + calculator.getTotalCost());
    carpet = new Carpet(1.5);
    floor = new Floor(5.4, 4.5);
    calculator = new Calculator(floor, carpet);
    System.out.println("Total = " + calculator.getTotalCost());
  }
}

