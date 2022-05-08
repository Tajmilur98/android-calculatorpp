public class KUET{
    String Location;
    int number_of_depts;

    KUET(String s, int n){
        Location = s;
        number_of_depts = n;
    }

    public int getNumber_of_depts(){
        return number_of_depts;
    }
    public int getLocation(){
        return Location;
    }
    public void setRoll(int ndept){
        number_of_depts = ndept;
    }

    public void setName(String n){
        Location = n;
    }

}

