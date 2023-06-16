package project_oop;
import java.io.*;
interface GymMachine{
	public String bookMachine(Member m);
	public String cancelBooking(int regId);
	public String getAllBookings();
        
}

class Machine implements Serializable, GymMachine{
	private int regId;
	private String name;
	private String brand;
	private String model;
	private double maxWeightCapacity;
	private double machineWeight;
	private String type;
        private static final long serialVersionUID = -7664452136969625334L;
	private Member[] bookings = new Member[8];		//Because we allow only 8 bookings per machine in one day
	public Machine(){
		regId = 0;
		name = null;
		brand = null;
		model = null;
		maxWeightCapacity = 0.0;
		machineWeight = 0.0;
		type = null;
		for(int i = 0; i < bookings.length; i++){
			bookings[i] = null;
		}
	}
	public Machine(int regId, String name, String brand, String model, double maxWeightCapacity, double machineWeight,
		String type){
		this.regId = regId;
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.maxWeightCapacity = maxWeightCapacity;
		this.machineWeight = machineWeight;
		this.type = type;
		for(int i = 0; i < bookings.length; i++){
			bookings[i] = null;
		}
	}
	public void setRegId(int regId){
		this.regId = regId;
	}
	public int getRegId(){
		return regId;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	public void setMaxWeightCapacity(double maxWeightCapacity){
		this.maxWeightCapacity = maxWeightCapacity;
	}
	public double getMaxWeightCapacity(){
		return maxWeightCapacity;
	}
	public void setMachineWeight(double machineWeight){
		this.machineWeight = machineWeight;
	}
	public double getMachineWeight(){
		return machineWeight;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
	public void setBookings(Member[] bookings){
		this.bookings = bookings;
	}
	public Member[] getBookings(){
		return bookings;
	}

        @Override
    public String bookMachine(Member member) {
	if(member.getPayment().getOutstandingBalance() != 0.0){
            return "Sadly Can't book this machine because you havce out standing balance";
        }
    	for (int i = 0; i < bookings.length; i++) {
    		if (bookings[i] == member){
    			return "You already book this machine";
    		}
    	}
        for(int i = 0; i < bookings.length; i++){
        	if (bookings[i] == null){
        		bookings[i] = member;                        
        		return "booked";
        	}
        }
        return "The machine is completely booked.";
    }

        @Override
    public String cancelBooking(int regId) {
    	for(int i = 0; i < bookings.length; i++){
            if(bookings[i] != null){
        	if (bookings[i].regId == regId){
        		bookings[i] = null;
                        return "Your Booking canceled";
        	}
            }
        }
        return "No booking found against the given member reg id" + regId;
    }

        @Override
    public String getAllBookings(){
    	String getAllBookingsString = "";
    	for(int i = 0; i < bookings.length; i++){
        	if (!(bookings[i] == null)){
        		getAllBookingsString += "> " + name + "\t\t" + bookings[i].name + " ( " + bookings[i].regId + " )\n";
        		
        	}
        }
        return getAllBookingsString;
    }
        @Override
	public String toString(){
		return "\n\t\tMachine Details : " + "\n---------------------------------------------------------------\n"
		 + "\n\n> Registration Id : " + regId + "\n\n> Name : " + name + "\n\n> Brand : " + brand + "\n\n> Model : " + model
		 + "\n\n> Maximum Weight Capacity : " + maxWeightCapacity + " Kg\n\n> Machine Weight : " + machineWeight + " Kg\n\n> Machine Type : "
		  + type + "\n---------------------------------------------------------------\n" ;
	}
}