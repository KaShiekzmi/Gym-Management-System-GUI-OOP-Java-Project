package project_oop;
import java.time.LocalDate;
import java.util.*;
class Report{
	private Gym gymDetails;

	Report(){
		gymDetails = new Gym();
	}
	public void setGymDetails(Gym gymDetails){
		this.gymDetails = gymDetails;
	}
	public Gym getGymDetails(){
		return gymDetails;
	}
	public String generateFullReport(){
		LocalDate currentDate = LocalDate.now();
		String lines = "--------------------------------";
		String reportDetails ="\n Date : " + currentDate + "\n";
		reportDetails += generateTrainerReport() + lines + generateMemberReport() + lines
		 + generateMachineReport() + lines + generateBookingReport() + lines + generateReportOfOutStandingBalance() + lines
		 + generateReportOfZeroOutStandingBalance() + lines;
		 return reportDetails;
	}
	public String generateTrainerReport(){
		String reportDetails = "";
		reportDetails += "\n >>> Trainers list\n\n";
		ArrayList<Trainer> trainers = gymDetails.getTrainers();
		for(Trainer t : trainers){
			reportDetails += " " + t.name + " (" + t.regId + ")\n";
		}
		return reportDetails;
	}
	public String generateMemberReport(){
		String reportDetails = "";
		reportDetails += "\n >>> Members list\n\n";
		ArrayList<Member> members = gymDetails.getMembers();
		for(Member m : members){
			reportDetails += " " + m.name + " (" + m.regId + ")\n";
		}
		return reportDetails;
	}
	public String generateMachineReport(){
		String reportDetails = "";
		reportDetails += "\n >>> Machines list\n\n";
		ArrayList<Machine> machines = gymDetails.getMachines();
		for(Machine m : machines){
			reportDetails += " " + m.getName() + " (" + m.getRegId() + ")\n";
		}
		return reportDetails;
	}
	public String generateBookingReport(){
		String reportDetails = "";
		reportDetails += "\n >>> Bookings list\n\n";
		reportDetails += gymDetails.viewAllMachineBookings();
		return reportDetails;
	}
	public String generateReportOfOutStandingBalance(){
		String reportDetails = "";
		reportDetails += "\n >>> Members with OutStanding Balance\n\n";
		ArrayList<Member> members = gymDetails.getMembers();
		for(Member m : members){
			if(m.getPayment().checkStatus().equals("UnPaid")){
				reportDetails += " " + m.name + " (" + m.regId + ") $" + m.getPayment().getOutstandingBalance() + "\n";
			}
		}
		return reportDetails;
	}
	public String generateReportOfZeroOutStandingBalance(){
		String reportDetails = "";
		reportDetails += "\n >>> Members with Zero OutStanding Balance\n\n";
		ArrayList<Member> members = gymDetails.getMembers();
		for(Member m : members){
			if(m.getPayment().checkStatus().equals("Paid")){
				reportDetails += " " + m.name + " (" + m.regId + ") $" + m.getPayment().getOutstandingBalance() + "\n";
			}
		}
		return reportDetails;
	}
}