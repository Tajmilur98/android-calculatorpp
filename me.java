public class KUET{
    String Location;
    int number_of_students;


    KUET(String s, int n){
        Location = s;
        number_of_studentss = n;
    }

    public int getNumber_of_students(){
        return number_of_studentss;
    }
    public int getLocation(){
        return Location;
    }

    public void setStudent_number(int nstud){
        number_of_students = nstud;
    }

    public void setLoc(String n){
        Location = n;
    }

}

