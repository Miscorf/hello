
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入使用几个小时：");
        int h = reader.nextInt();
        
        // 创建对象，并初始化电池电量100
        Battery nanfu = new Battery(10);
        System.out.println("南孚电池的储电量是:"+nanfu.electricityAmount);
        
        // 声明对象，创建对象
        Radio radio = new Radio();
        System.out.println("收音机开始使用南孚电池");
        /** TODO：调用openRadio方法
        引用类型参数的传值（初始化有参构造方法（电池对象nanfu，使用几个小时h））**/ 
        radio.openRadio(nanfu, h);
        System.out.println("目前南孚电池的储电量是:"+nanfu.electricityAmount);
     }
  }
  /*
  * 定义一个电池类和收音机类，
  * 电池类有电量这个成员，
  * 收音机类有耗电这个方法，
  * 当播放收音机就会耗电，
  * 现在模拟收音机电池使用情况，
  * 有一个满格的电池（电量100），让收音机使用，
  * 使用10个小时就会用完电池（每小时消耗10电量），
  * 输入一个整数，要使用几个小时，
  * 输出电池使用后的电量。
  */
  class Battery {
  
      int electricityAmount;
      
      Battery(int amount){
          /** TODO：初始化电量 **/
          electricityAmount =amount;
      }
  }
  
  class Radio {
      
      // 引用类型参数的传值Battery battery
      void openRadio(Battery battery,int h){
          
          if(h>=0 && h<=10){
              /** TODO：计算电池用量 **/
              battery.electricityAmount=battery.electricityAmount-h;
          }else{
              System.out.println("时间输入格式有误");
          }
      }
  }