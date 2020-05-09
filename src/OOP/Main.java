package OOP;

public class Main {

    //Method overload and Overriding

    public static void main(String[] args) {
        // write your code here
//        Computer macBookPro = new Computer("Apple", "Intel", 2,160, 2.5);
//        Notebook Lenovo = new Notebook("Dellgate","AMD",2,160,1.8,15.0,7.5);
//        Notebook Lenovo2 = new Notebook("Intel", 2,160,1.8,14,6.5);
//        System.out.println("My Computer is: " + macBookPro.toString());
//        System.out.println(macBookPro);
//        System.out.println(Lenovo2);
//        System.out.println("My Notebook is: " + Lenovo.toString());


        Computer labComputer[] =  new Computer[3];
        labComputer[0] = new Computer("Dellgate","AMD",2,160,1.8);
        labComputer[1] = new Notebook("Dellgate","AMD",2,160,1.8,15.0,7.5);
        labComputer[2] = labComputer[1];

        for (int i = 0; i<labComputer.length; i++){
            System.out.println("My Computer is: " + labComputer[i].toString());

        }



    }
}
