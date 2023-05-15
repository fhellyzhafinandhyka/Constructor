package constructor;

public class Constructor {

    public static void main(String[] args) {
        user petani = new user("petanikode ", "kopi ");
        System.out.println("Petani username : " + petani.name);
        System.out.println("Petani password : " + petani.password);
    }

}
