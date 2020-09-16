package dransoft;


public abstract class Quadrilateral {

    private int id;
    private int a;
    private int b;
    private int c;
    private int d;

    public int getId(){
        return id;
    }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getD(){
        return d;
    }


    public int getCircumference (){
        return a+b+c+d;
    }

    public abstract String getName();
    public abstract float getArea();

    public String getInfo(){
        return getId() +", "+getName()+", "+getCircumference()+", "+getArea();
    }

    public Quadrilateral(int ID, int aside, int bside, int cside, int dside){
        id = ID;
        a = aside;
        b = bside;
        c = cside;
        d = dside;
    }
}
