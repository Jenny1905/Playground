import java.util.Scanner;
abstract class Movie{
  String title;
  abstract void setTitle(String s);
  String getTitle(){
    return title;
  }
}
class Mymovie extends Movie{
  void setTitle(String s){
    super.title=s;
  }
  String getTitle(){
    return super.title;
  }
}
class Main{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    String title=obj.nextLine();
    Mymovie m=new Mymovie();
    m.setTitle(title);
    System.out.println("The title is: "+m.getTitle());
  }
}
  