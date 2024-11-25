public class Bus{
    final private int bus_no;
    private boolean ac;
    private int capacity; //get and set
    Bus(int bus_no,boolean ac,int capacity){
        this.bus_no=bus_no;
        this.ac=ac;
        this.capacity=capacity;
    }
    public int getBusNo(){
        return bus_no;
    }
    public int getCapacity(){ //accessor method
        return capacity;
    }
    public void setCapacity(int cap){ //mutated method
        capacity=cap;
    }
    public String getAc(){
        if(ac){
            return "AC";
        }
        return "NON-AC";
    }
    public void setAc(boolean new_ac){
        ac=new_ac;
    }
    public void displayInfo(){
        System.out.println("Bus No: "+bus_no+", AC: "+ ac +", Total Capacity: "+capacity);
    }
}