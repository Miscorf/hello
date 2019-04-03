import java.util.Scanner;

public class e326 {

    public static void main(String args[]) {
    
       Scanner reader = new Scanner(System.in);
       
       /** TODO:创建Rect类对象ractangle **/ 
       Rect ractangle=new Rect();
       System.out.println("输入矩形的宽：");
       ractangle.width = reader.nextDouble();
       System.out.println("输入矩形的高：");
       ractangle.height = reader.nextDouble();
       double area=ractangle.getArea();
       System.out.println("矩形的面积:"+area);
    
       /** TODO:创建Lader类对象lader **/ 
       Lader lader =new Lader();
       System.out.println("输入梯形的上底：");
       lader.above= reader.nextDouble();
       System.out.println("输入梯形的下底：");
       lader.bottom= reader.nextDouble();
       System.out.println("输入梯形的高：");
       lader.height= reader.nextDouble();
       area=lader.getArea();
       System.out.println("梯形的面积:"+area);
      }
}

class Rect {
    double width;  //矩形的宽
    double height; //矩形的高

    double getArea() {
       /** TODO: 求矩形面积 **/
       return width*height;
    }
}

class Lader {
    double above;   //梯形的上底
    double bottom;  //梯形的下底
    double height;  //梯形的高

    double getArea() {
       /**TODO:  求梯形面积 **/
       return (above+bottom)*height/2;
    }
}