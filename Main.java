public class Main {
    public static void main(String[] args){
        Bank Abank = new Bank(12122018);

        System.out.printf(Abank.deposit(100));
        System.out.printf(Abank.withdraw(20));
    }
}
