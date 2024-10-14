import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        
boolean b = (6 <7 || 7>6 && 5!=5);

if (b){
    if (5==5){

        System.out.println("Tacan nested if");
    }

    else {

        System.out.println(" Nije Tacan nested if");

    }

    System.out.println("Tacan prvi");

}else if (5 != 5) {

    System.out.println("Tacan drugi");
} else if (6!=6){

    System.out.println("Tacan treci");
}

else {

    System.out.println("Nista od navedenog");
}


}

    }
    

