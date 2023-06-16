package project_oop;
import java.time.*;
import java.io.Serializable;
abstract class Person implements Serializable{
	protected int regId;
	protected String name;
	protected String gmail;
	protected String phoneNum;
	protected String address;
	protected Date joinDate;
	protected Date dateOfBirth;
        protected int age;
	protected String gender;
	public Person(){
		regId = 0;
		name = null;
		gmail = null;
		phoneNum = null;
		address = null;
                age = 0;
		gender = null;
	}
	public Person(int regId, String name, String gmail, String phoneNum, String address, Date joinDate,
	 Date dateOfBirth,int age, String gender){
		this.regId = regId;
		this.name = name;
		this.gmail = gmail;
		this.phoneNum = phoneNum;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
                this.joinDate = joinDate;
                this.age = age;
		this.gender = gender;
	}
    abstract String getFinancialReport();    
    @Override
    public String toString(){
    	return "\n---------------------------------------------------------------\n" +
    			"\n> Registration Id = " + regId +
                "\n\n> Name = " + name +
                "\n\n> Gmail = " + gmail +
                "\n\n> Age = " + age +
                " years\n\n> Phone num = " + phoneNum +
                "\n\n> Address = " + address +
                "\n\n> Joining Date = " + joinDate.toString() +
                "\n\n> Date of Birth = " + dateOfBirth.toString() +
                "\n\n> Gender = " + gender;
    }
    public int caluAge(int yearOfBirth){
        return (Year.now().getValue() - yearOfBirth);
    }
    
    //..........................................Method to Validate Name....................................................
    public boolean validateName(String name){
        int count;

        if(name.length() > 30){
            return false;
        }
        count = 0;
        for(int i =0; i < name.length(); i++)	{
            if (!(Character.isLetter(name.charAt(i)) || name.charAt(i) == '.'  || name.charAt(i) == ' ')){
                count++;
                    break;
                }
            }
        if (count != 0){
            return false;
        }
        return true;
    }
        //........................................Method to Validate Phone Number..............................................
    public boolean validatePhone(String contactNumber){
        int count;
        //Validation of Correct format of phone Number.........
        if (!((contactNumber.length() == 12 && contactNumber.charAt(4) == '-' && contactNumber.charAt(0) == '0'
            && contactNumber.charAt(1) == '3')&&(contactNumber.charAt(2) == '0' || contactNumber.charAt(2) == '2' ||
            contactNumber.charAt(2) == '1' || contactNumber.charAt(2) == '4' || contactNumber.charAt(2) == '3'))){
            return false;
        }
        else{
            count = 0;
            for(int i =0; i < contactNumber.length(); i++)	{
                if (!(Character.isDigit(contactNumber.charAt(i)))){	
                    if (i != 4)	{
                        count++;
                        break;
                    }
                }
            }
            if (count != 0){
                return false;
            }
        }
        return true;
    }
//..........................................Method to Validate Gmail....................................................
    public boolean validateGmail(String gmail){
        if(!gmail.endsWith("@gmail.com")){
            return false;
        }
        return true;
    }
}