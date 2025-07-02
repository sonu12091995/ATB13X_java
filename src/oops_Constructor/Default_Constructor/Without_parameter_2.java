package oops_Constructor.Default_Constructor;


class  webAuto{

    webAuto(){       //constructor


        System.out.println(" Print the CSV file");
        System.out.println(" Print the JSON file");
        System.out.println(" Print the XLSX file");


    }
}

public class Without_parameter_2 {
    public static void main(String[] args) {
        webAuto we = new webAuto();/* outPut --Print the CSV file
                                            Print the JSON file
                                            sqPrint the XLSX file*/
    }
}
