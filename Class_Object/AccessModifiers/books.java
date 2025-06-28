package AccessModifiers;


public class books {
    
   static class Book{
        String bname; 
        String aName; 
        int price; 

        Book(String bname,String aName,int price){
            this.bname=bname;
            this.aName=aName;
            this.price=price;
        }
        void print(){
            System.out.println(bname);
            System.out.println(aName);
            System.out.println(price);
        }

    }
    public static void main(String[] args) {
        Book b = new Book("xyz","abc",500);
        b.print();


    }
    
}
