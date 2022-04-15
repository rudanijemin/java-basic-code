abstract class vehikal
{
    abstract void start();
}

class car extends vehikal
{
    void start()
    {
        System.out.println("car start with key");
    }
}

class Scooter extends vehikal
{
    void start()
    {
        System.out.println("Scooter start with kick");
    }
}

class abstract1 {
    public static void main(String[] args) {

        car c = new car();
        c.start();

        Scooter s = new Scooter();
        s.start();
        
    }
    
}
