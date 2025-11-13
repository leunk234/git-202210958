
public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer{
protected  String model;
protected  int printedCount;
protected  int availableCount;
public Printer(String model, int availableCount){
    this.model=model;
    this.availableCount=availableCount;
    printedCount=0;
}
public abstract boolean print();
}

class InkjetPrinter extends Printer{
public InkjetPrinter(String model,int availableCount){
    super(model, availableCount);
}
@Override
public boolean print(){
    if(availableCount==0){
        System.out.printf("%s: %d매째 인쇄실패 - 잉크부족. \n",model,printedCount+1);
        return false;
    }
    else {
        printedCount++;
        availableCount--;
        return true;
    }
}
}

class LaserPrinter extends Printer{
    public LaserPrinter(String model,int availableCount){
        super(model, availableCount);
    }
    @Override
    public boolean print(){
        if(availableCount==0){
            System.out.printf("%s: %d매째 인쇄실패 - 토너부족. \n",model,printedCount+1);
            return false;
        }
        else {
            printedCount++;
            availableCount--;
            return true;
        }
    }
}
