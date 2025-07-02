package spring_pratice;

public class get_set_04 {
    private String brand;
    private int speed;

    public void setSpeed(int speed){
        if (speed <= 200){
          this.speed = speed;
        }
        else{
            System.out.println("Speed is Dangerous");
        }
    }

    public int getSpeed(){
        return speed;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public static void main(String[] args) {
        get_set_04 car = new get_set_04();
        car.setSpeed(180);
        car.setBrand("Volvo");
        System.out.println("The Brand of the car is : " + car.getBrand());
        System.out.println("The " + car.getBrand() + " Car speed is : " + car.getSpeed()+ " km/hr");

    }
}
