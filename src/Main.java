import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        ArrayList<Domino> dominoArrayList = new ArrayList<>();
        int numberOfCubes = rnd.nextInt(5)+5;
        for(int i = 0; i < numberOfCubes; i++){
            dominoArrayList.add(new Domino(rnd.nextInt(6),rnd.nextInt(6)));
        }
        int option, check;
        do{
            check = 0;
            System.out.println(dominoArrayList);
            System.out.println("vyberte si moznost \n 0 - exit \n 1 - prohodit \n 2 - smazat \n 3 - otocit");
            option = scn.nextInt();
            if(option == 0){
                break;
            }if(option == 1){
                System.out.println("prohozeni, index se pocita od 0!!!");
                Collections.swap(dominoArrayList,scn.nextInt(),scn.nextInt());
            }if(option == 2){
                System.out.println("odstraneni, index se pocita od 0!!!");
                dominoArrayList.remove(scn.nextInt());
            }if(option == 3){
                System.out.println("otoceni, index se pocita od 0!!!");
                dominoArrayList.get(scn.nextInt()).reverse();
            }
            for(int i = 0; i < dominoArrayList.size()-1;i++){
                if(dominoArrayList.get(i).getNumber2() == dominoArrayList.get(i+1).getNumber()){
                    check++;
                }else{
                    break;
                }
            }
        }while(check != dominoArrayList.size()-1);
        System.out.println("konec");
    }
}