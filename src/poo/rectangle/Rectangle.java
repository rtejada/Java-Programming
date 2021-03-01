package poo.rectangle;

public class Rectangle {

    private double length;
    private double wight;

    public Rectangle (double length, double wight){

        this.length = length;
        this.wight = wight;
    }

    public Rectangle (){

        this.length = 0;
        this.wight = 0;
    }

    public double getLength() {
        return length;
    }


    public void setLength(double length){
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight){
        this.wight = wight;
    }


    public double calculatePerimeter(){

        return (2 * length) + (2 * wight);
    }

    public double calculateArea(){

        return  length * wight;

    }


}
