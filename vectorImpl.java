import java.util.Scanner;

class vector{
    public int Size, Capacity;
    int[] arr;
    // constructor -> initialize a vector
    vector(){
        Size = 0;
        Capacity = 1;
        arr = new int[Capacity];
    }

    public void push_back(int num){
        if(Size == Capacity){
            Capacity*=2;
            int[] arr2 = new int[Capacity];
            for(int i = 0; i<Size; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[Size++] = num;
    }

    public int pop_back(){
        if(Size<=0){
            System.out.println("No items to delete in vector!");
            return -1;
        }
        int deleted = arr[Size-1];
        Size--;
        return deleted;
    }

    public void print(){
        if(Size<=0){
            System.out.println("Vector is Empty!");
            return;
        }
        for(int i = 0; i<Size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public int get(int index){
        if(index>=Size || index<0){
            System.out.println("Please Enter a Valid Index!");
            System.out.printf("Valid Indices are between 0 to %d%n", Size-1);
            return -1;
        }
        return arr[index];
    }
}
public class vectorImpl {
    public static int takeInputFromUser(Scanner sc,String inp){
        int userinp;
        
        System.out.printf("Enter %s: %n", inp);
        userinp = sc.nextInt();
        return userinp;
        
    }
    public static void main(String[] args) {
        
        vector vec = new vector();
        Scanner sc = new Scanner(System.in);
        String inp = "";

        int option=5;

        do{
            
            // Menu Driven
            System.out.printf("""
                %n
                    Vector Operations
                        1. push_back -> Add Element to a vector
                        2. pop_back -> Remove element from end from a vector
                        3. print -> Prints all elements of a vector
                        4. get -> Gets elment from a vector at a particular index
                        5. To exit program
                    Enter your choice:
                %n
            """);
            
            option = sc.nextInt();

            switch(option){
                case 1:
                    inp = "number";
                    int num = takeInputFromUser(sc, inp);
                    vec.push_back(num);
                    System.out.printf("Successfully Added %d to Vector%n", num);
                    break;

                case 2:
                    int deleted = vec.pop_back();
                    if(deleted!=-1)
                    System.out.printf("Element %d Deleted!%n",deleted);
                    break;

                case 3:
                    System.out.println("Elements of Vector are: ");
                    
                    System.out.print("[ ");
                    vec.print();
                    System.out.print("]");
                    break;

                case 4:
                    inp = "index";
                    int ind = takeInputFromUser(sc, inp);
                    int element = vec.get(ind);
                    System.out.printf("Element at %d is %d%n", ind, element);
                    
                    break;

                default:
                    break;
            }
        }while(option!=5);

    }
}