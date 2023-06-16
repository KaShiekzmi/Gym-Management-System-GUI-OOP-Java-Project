package project_oop;
import java.io.Serializable;
class Trainer extends Person implements Serializable{
	private String specialization;
	private double hourlyRate;
	private double weeklyWorkingHours;
	private String experienceLevel;
        private static final long serialVersionUID = 2286502415981060413L;
	public Trainer(){
		super();
		specialization = null;
		hourlyRate = 0.0;
		weeklyWorkingHours = 0.0;
		experienceLevel = null;
	} 
	public Trainer(int regId, String name, String gmail, String phoneNum, String address, Date joinDate, Date dateOfBirth,int age,
	 String gender, String specialization, double hourlyRate, double weeklyWorkingHours, String experienceLevel){
		super(regId, name, gmail, phoneNum, address,  joinDate, dateOfBirth, age, gender);
		this.specialization = specialization;
		this.hourlyRate = hourlyRate;
		this.weeklyWorkingHours = weeklyWorkingHours;
		this.experienceLevel = experienceLevel;
	}
	public void setSpecialization(String specialization){
		this.specialization = specialization;
	}
	public String getSpecialization(){
		return specialization;
	}
	public void setHourlyRate(double hourlyRate){
		this.hourlyRate = hourlyRate;
	}
	public double getHourlyRate(){
		return hourlyRate;
	}
	public void setWeeklyWorkingHours(double weeklyWorkingHours){
		this.weeklyWorkingHours = weeklyWorkingHours;
	}
	public double getWeeklyWorkingHours(){
		return weeklyWorkingHours;
	}
	public void setExperienceLevel(String experienceLevel){
		this.experienceLevel = experienceLevel;
	}
	public String getExperienceLevel(){
		return experienceLevel;
	}
	public double calculSalary(){
		return weeklyWorkingHours * hourlyRate;
	}
        @Override
        public String getFinancialReport(){
            return "Name: " + name + "\nReg id: " + regId + "\nWeekly Salary:\n" + calculSalary();
        }
	public boolean validateWeeklyWorkingHours(String hours){
            if(!checkNumberIsdouble(hours)){
                return false;
            }
            double number = Double.parseDouble(hours);
            if (number < 0.0 || number > 168.0){
                return false;
            }
            return true;
        }
        public boolean validateHourlyRate(String rate){
            if(!checkNumberIsdouble(rate)){
                return false;
            }
            double rate1 = Double.parseDouble(rate);
            if(rate1 < 0.0){
                return false;	
		}
            return true;
	}
        
        public boolean checkNumberIsdouble(String number){
            try {
                double number1 = Double.parseDouble(number);
            }catch (NumberFormatException ex) {
                return false;
            }
            return true;
        }
	@Override
	public String toString(){
		return "\n\t\tTrainer Details : " + super.toString() + "\n\n> Specialization : " + specialization + "\n\n> Hourly Rate : " + hourlyRate
		 + "\n\n> Weekly Working Hours : " + weeklyWorkingHours + "\n\n> Salary : " + calculSalary() + " $" + "\n\n> Experience Level : " + experienceLevel
		  + "\n---------------------------------------------------------------\n" ;
	}
}