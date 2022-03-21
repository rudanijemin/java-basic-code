/*write a program to create circle class with area function to find area of circle*/

class prog {
    double r;
    prog(double x){  // constructor
        r=x;
    }
    void area(){
        System.out.println("area of circle "+(3.14*r*r));
    }
}

class circle{
    public static void main(String args[]) {

        prog c1 = new prog(5);
        c1.area();
    }
}

