import java.util.Scanner;

public class Main {
    public static Scanner input=new Scanner(System.in);

    public static void main(String args[]) {
        BST bst = new BST();

        System.out.println("Escriba los nombres en orden afabetico y separados por espacios");
        String names = input.nextLine();
        String[] array =names.split(" ");


        bst.addRoot(array);
        System.out.println("La profundidad del arbol es: "+ bst.depth());
        bst.reverse();
    }

}
