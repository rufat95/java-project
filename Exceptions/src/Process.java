public class Process {
    public void process(int a) throws Zero {
        if(a==0){
            throw new Zero("Somerhing went rong");
        }

        System.out.println("Size hediyye verildi");
    }
}
