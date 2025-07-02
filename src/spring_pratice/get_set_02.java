package spring_pratice;

public class get_set_02 {
    private int Length;
    private int Breadth;

    public int getLength(){
        return Length;
    }

    public int getBreadth(){
        return Breadth;
    }

    public void setLength(int Length){
        this.Length = Length;
    }

    public void setBreadth(int Breadth){
        this.Breadth = Breadth;  

    }

    public int getArea(){
        return Length * Breadth;
    }

    public static void main(String[] args) {
        get_set_02 rectangle = new get_set_02();
        rectangle.setLength(10);
        rectangle.setBreadth(10);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Breadth: " + rectangle.getBreadth());
        System.out.println("Area: " + rectangle.getArea());
    }
}
