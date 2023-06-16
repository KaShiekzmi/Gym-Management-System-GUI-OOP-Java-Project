package project_oop;
import java.util.ArrayList;
import java.io.*;
class Gym implements Serializable{
    private ArrayList<Member> members = new ArrayList<Member>();
    private ArrayList<Trainer> trainers = new ArrayList<Trainer>();
    private ArrayList<Machine> machines = new ArrayList<Machine>();
    private Admin admin;
    Gym() {
        admin = null;
        try{
            loadMemberFile();
            loadTrainerFile();
            loadMachineFile();
        }catch(IOException e){
            
        }
    }

    Gym(ArrayList<Member> members, ArrayList<Trainer> trainers, ArrayList<Machine> machines, Admin admin) {
        this.members = members;
        this.trainers = trainers;
        this.machines = machines;
        this.admin = admin;
        try{
            loadMemberFile();
            loadTrainerFile();
            loadMachineFile();
        }catch(IOException e){
            
        }
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
    public ArrayList<Member> getMembers() {
        return members;
    }
    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }
    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }
    public void setMachines(ArrayList<Machine> machines) {
        this.machines = machines;
    }
    public ArrayList<Machine> getMachines() {
        return machines;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public Admin getAdmin() {
        return admin;
    }
    public boolean checkNumberIsInt(String number){
        int size = number.length();
        for(int i = 0; i<size; i++){
            if (!(number.matches("[0-9]+"))){
                return false;
            }
        }
        return true;
    }
    public boolean checkNumberIsDouble(String number){
        try {
            double number1 = Double.parseDouble(number);

        }catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    //Adding member
    public void addMember(Member m){
    	members.add(m);
        saveMemberFile();
    }

    //Search Member
    public String searchMember(int regId){
    	for(Member member: members){
    		if(member.regId == regId){
                    return member.toString();
                } 
    	}
    	return "Member with reg id " + regId + " was not found in gym, please enter correct reg id";
    }

    //View all Members
    public String viewAllMembers(){
        String allMembers = "";
        for(Member m: members){
    		allMembers += "Name : " + m.name + "  >>>  Reg Id : " + m.regId + "\n";
    	}
        return allMembers;
    }

    //Delete member
    public String deleteMember(int regId){
    	for(Member member: members){
    		if(regId == member.regId){
                    int index = members.indexOf(member);
                    members.remove(index);
                    saveMemberFile();
                    return "Member Data Removed";
    		}
    	}
        return "Member with reg id " + regId + " was not found in gym.";
    }
    public boolean memberExist(int regId){
    	for(Member member: members){
    		if(member.regId == regId){
                    return true;
                } 
    	}
    	return false;
    }
    public Member memberData(int regId){
        Member m = new Member();
    	for(Member member: members){
    		if(member.regId == regId){
                    m = member;
                } 
    	}
        return m;
    }
    public void modifyMember(Member m, int regId){
    	for(Member member: members){
    		if(member.regId == m.regId){
                    member = m;
                } 
    	}
        saveMemberFile();
    }
    

    private void loadMemberFile() throws IOException{
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("MemberFile"));
            while (true) {
                Member member = (Member) objectInputStream.readObject();
                members.add(member);
            }
        } catch (EOFException ex) {
                 System.out.println("End of file reached.");
             } catch (ClassNotFoundException | IOException ex) {
             }
         }

     public void saveMemberFile() {
         try {
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("MemberFile"));
             for (Member m : members) {
                 objectOutputStream.writeObject(m);
             }
             objectOutputStream.close(); // Close the stream after writing the objects
         } catch (FileNotFoundException ex) {
             
         } catch (IOException ex) {
         }
     }


    //Adding Trainer
    public void addTrainer(Trainer t){
    	trainers.add(t);
        saveTrainerFile();
    }

    //Search Trainer
    public String searchTrainer(int regId){
    	for(Trainer trainer: trainers){
    		if(trainer.regId == regId){
                    return trainer.toString();
                } 
    	}
    	return "Trainer with reg id " + regId + " was not found in gym, please enter correct reg id";
    }

    //View all Trainers
    public String viewAllTrainers(){
        String allTrainer = "";
        for(Trainer t: trainers){
    		allTrainer += "Name : " + t.name + "  >>>  Reg Id : " + t.regId + "\n";
    	}
        return allTrainer;
    }

    //Delete Trainer
    public String deleteTrainer(int regId){
    	for(Trainer trainer: trainers){
    		if(regId == trainer.regId){
                    int index = trainers.indexOf(trainer);
                    trainers.remove(index);
                    saveTrainerFile();
                    return "Trainer Data Removed";
    		}
    	}
        return "Trainer with reg id " + regId + " was not found in gym.";
    }
    public boolean trainerExist(int regId){
    	for(Trainer trainer: trainers){
    		if(trainer.regId == regId){
                    return true;
                } 
    	}
    	return false;
    }
    public Trainer trainerData(int regId){
        Trainer t = new Trainer();
    	for(Trainer trainer: trainers){
    		if(trainer.regId == regId){
                    t = trainer;
                } 
    	}
        return t;
    }
    public void modifyTrainer(Trainer t, int regId){    
    	for(Trainer trainer: trainers){
    		if(trainer.regId == regId){
                    trainer = t;
                } 
    	}
        saveTrainerFile();
    }
    
    private void loadTrainerFile() throws IOException{
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("TrainerFile"));
            while (true) {
                Trainer trainer = (Trainer) objectInputStream.readObject();
                trainers.add(trainer);
            }
        } catch (EOFException ex) {
                 System.out.println("End of file reached.");
             } catch (ClassNotFoundException | IOException ex) {
             }
    }

     public void saveTrainerFile() {
         try {
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("TrainerFile"));
             for (Trainer t : trainers) {
                 objectOutputStream.writeObject(t);
             }
             objectOutputStream.close(); // Close the stream after writing the objects
         } catch (FileNotFoundException ex) {
             
         } catch (IOException ex) {
         }
     }


    //Adding Machine
    public void addMachine(Machine m){
    	machines.add(m);
        saveMachineFile();
    }

    //Search Machine
     public String searchMachine(int regId){
    	for(Machine machine: machines){
    		if(machine.getRegId() == regId){
                    return machine.toString();
                } 
    	}
    	return "Machine with reg id " + regId + " was not found in gym, please enter correct reg id";
    }

    //View all Machines
    public String viewAllMachines(){
        String allMachine = "";
        for(Machine machine: machines){
    		allMachine += "Name : " + machine.getName() + "  >>>  Reg Id : " + machine.getRegId() + "\n";
    	}
        return allMachine;
    }
    //Delete Trainer
    public String deleteMachine(int regId){
    	for(Machine machine: machines){
    		if(regId == machine.getRegId()){
                    int index = machines.indexOf(machine);
                    machines.remove(index);
                    saveMachineFile();
                    return "Machine Data Removed";
    		}
    	}
        return "Machine with reg id " + regId + " was not found in gym.";
    }
    

    private void loadMachineFile() throws IOException{
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("MachineFile"));
            while (true) {
                Machine machine = (Machine) objectInputStream.readObject();
                machines.add(machine);
            }
        } catch (EOFException ex) {
            System.out.println("End of file reached.");
        } catch (ClassNotFoundException | IOException ex) {
        }
    }

     public void saveMachineFile() {
         try {
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("MachineFile"));
             for (Machine m : machines) {
                 objectOutputStream.writeObject(m);
             }
             objectOutputStream.close(); // Close the stream after writing the objects
         } catch (FileNotFoundException ex) {
         } catch (IOException ex) {
         }
     }

    public String viewAllMachineBookings(){
        String allBookingsString = "";
        for(Machine m : machines){
            allBookingsString += m.getAllBookings();
        }
        return allBookingsString;
    }



    public int generateAutoRedIdForMember(){
        while(true){
            int autoRegId = (int)(1000 + Math.random() * 1100);
            for (Member m : members){
                if(m.regId == autoRegId){
                    continue;
                }
            }
        return autoRegId;
        }
    }
    public int generateAutoRedIdForTrainer(){
        while(true){
            int autoRegId = (int)(1000 + Math.random() * 1100);
            for (Trainer t : trainers){
                if(t.regId == autoRegId){
                    continue;
                }
            }
        return autoRegId;
        }
    }
    public int generateAutoRegIdForMachine(){
        while(true){
            int autoRegId = (int)(1000 + Math.random() * 1100);
            for (Machine m : machines){
                if(m.getRegId() == autoRegId){
                    continue;
                }
            }
        return autoRegId;
        }
    }
    public static void main(String[] args) {
        JFrameAdmin admin = new JFrameAdmin();
        admin.setVisible(true);
    }
}

