import java.util.Scanner;

public class e326 {

    public static void main(String args[]) {
    
       Scanner reader = new Scanner(System.in);
       
       /** TODO:����Rect�����ractangle **/ 
       Rect ractangle=new Rect();
       System.out.println("������εĿ�");
       ractangle.width = reader.nextDouble();
       System.out.println("������εĸߣ�");
       ractangle.height = reader.nextDouble();
       double area=ractangle.getArea();
       System.out.println("���ε����:"+area);
    
       /** TODO:����Lader�����lader **/ 
       Lader lader =new Lader();
       System.out.println("�������ε��ϵף�");
       lader.above= reader.nextDouble();
       System.out.println("�������ε��µף�");
       lader.bottom= reader.nextDouble();
       System.out.println("�������εĸߣ�");
       lader.height= reader.nextDouble();
       area=lader.getArea();
       System.out.println("���ε����:"+area);
      }
}

class Rect {
    double width;  //���εĿ�
    double height; //���εĸ�

    double getArea() {
       /** TODO: �������� **/
       return width*height;
    }
}

class Lader {
    double above;   //���ε��ϵ�
    double bottom;  //���ε��µ�
    double height;  //���εĸ�

    double getArea() {
       /**TODO:  ��������� **/
       return (above+bottom)*height/2;
    }
}