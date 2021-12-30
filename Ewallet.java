
package ewallet;

public class Ewallet {

    float balance ;
    
    public Ewallet() {
        balance = 100;
        System.out.println("Currently E-Wallet: " + balance);
    }

    public void Topup(float amount) {
        balance += amount;
        System.out.println("Amount Topup: $" + amount);
    }

    public void Payment(float amount) {
        balance -= amount;
        System.out.println("Your Payment: $" + amount);
    }

    public void Display() {
        System.out.println("Your Available Balance is: $" + balance);
    }
    
    public void Enter(){
        System.out.println("---------------End---------------");
    }

    public static void main(String args[]) {
        // membuat suatu object didalam class
        Ewallet s = new Ewallet();
        // memanggil fungsi dari class yang telah dibuat
        s.Topup(10);
        s.Payment(5);
        System.out.println("Welcome back Mr.X here's your current E-Wallet");
        s.Display();
//        s.Enter();

    }
}
