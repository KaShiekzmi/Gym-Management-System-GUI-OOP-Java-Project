package project_oop;
import java.io.*;
class Member extends Person implements Serializable{
	private double height;
	private double weight;
	private double bmi;			//Body Mass index
	private Payment memberPayment;
	private String fitnessGoal;
	public Member(){
		super();
		height = 0.0;
		weight = 0.0;
		bmi = 0.0;
		fitnessGoal = null;
	}
	public Member(int regId, String name, String gmail, String phoneNum, String address, Date joinDate,
	 Date dateOfBirth,int age, String gender, double height, double weight,Payment memberPayment,
	 String fitnessGoal){
		super(regId, name, gmail, phoneNum, address, joinDate, dateOfBirth, age, gender);
		this.height = height;
		this.weight = weight;
		this.bmi = (weight / (height * height));
		this.memberPayment = memberPayment;
		this.fitnessGoal = fitnessGoal;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	public double getBmi(){
		return (weight / (height * height));
	}
	public void setPayment(Payment memberPayment){
		this.memberPayment = memberPayment;
	}
	public Payment getPayment(){
		return memberPayment;
	}
	public void setFitnessGoal(String fitnessGoal){
		this.fitnessGoal = fitnessGoal;
	}
	public String getFitnessGoal(){
		return fitnessGoal;
	}
        @Override
        public String getFinancialReport(){
            return "Name: " + name + "\nReg id: " + regId + "\nAccount details:\n" + memberPayment.getOutstandingBalance();
        }

	public boolean validateHeight(String height){
            if(!checkNumberIsdouble(height)){
                return false;
            }
            double height1 = Double.parseDouble(height);
            if (height1 > 0 && height1 < 10){
                return true;                 
                }
            return false;
        }
    

	
	public boolean validateWeight(String weight){
            if(!checkNumberIsdouble(weight)){
                return false;
            }
        double weight1 = Double.parseDouble(weight);
            if (weight1 > 0 && weight1 < 300){
                return true;
            }
            return false;
	}

        public boolean checkNumberIsdouble(String number){
            try {
                double number1 = Double.parseDouble(number);
            }catch (NumberFormatException ex) {
                return false;
            }
            return true;
        }
	/*@Override
	public boolean modifyData(){
            return true;
	}*/
	@Override
	public String toString(){
            return "\n\t\tMember Details : " + super.toString() +
				"\n\n> Height : " + height + " feet\n\n> Weight : " + weight
				+ " Kg\n\n> BMI (Body Mass Index) : " + getBmi() + 
				"\n\n> Payment Status : "  + memberPayment.checkStatus() +
				"\n\n> Outstanding Balance : " + memberPayment.getOutstandingBalance()
				+ "\n\n> Fitness Goal : " + fitnessGoal +
				"\n---------------------------------------------------------------\n" ;
        }			
}