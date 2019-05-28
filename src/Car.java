public class Car {

    //ike power in kW, name of the manufacturer, name of model, current speed etc

    private int kW;
    private String manufacturer;
    private String nameOfModel;
    private int currentSpeed;

    public Car (int kW, String manufacturer, String nameOfModel, int currentSpeed ){

        this.kW = kW;
        this.manufacturer = manufacturer;
        this.nameOfModel = nameOfModel;
        this.currentSpeed = currentSpeed;

    }

    public void setkW ( int kW ){

        this.kW = kW;
    }

    public int getkW(){
        return  this.kW;
    }

    public void setManufacturer ( String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getManufacturer (){

        return this.manufacturer;
    }
    public void setNameOfModel( String NameOfModel){
        this.nameOfModel = NameOfModel;
    }
    public String getNameOfModel (){

        return this.manufacturer;
    }

    public void setCurrentSpeed(int CurrentSpeed){
        this.currentSpeed = CurrentSpeed;
    }

    public int getCurrentSpeed(){
        return this.currentSpeed;


    }


}
