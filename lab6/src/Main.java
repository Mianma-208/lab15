import java.util.Scanner;

void main() {
    boolean bool=true;
    Scanner scanner=new Scanner(System.in);
    do{
        System.out.print("Введите номер задания (0-Выход): ");
        int p=scanner.nextInt();
        switch (p){
            case 0: {
                bool=false;
                break;
            }
            case 1:{
                Rectangle[] mas=new Rectangle[]{
                        new Rectangle(20.5 , 10),
                        new Rectangle(10,40),
                        new Rectangle(12.8 , 13.5)
                };
                for(Rectangle item : mas){
                    System.out.println(item);
                    System.out.println("Площадь: "+item.area());
                    System.out.println("Периметр: "+item.perimeter()+"\n");
                }
                break;
            }
        }
    }while (bool);
}
