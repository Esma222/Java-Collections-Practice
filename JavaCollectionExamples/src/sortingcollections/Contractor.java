package sortingcollections;

public class Contractor /*implements Comparable<Contractor>*/ {

    private String name= "";
    private String location ="";
    private  String owner ="";

    public Contractor() {
    }

    public Contractor(String name, String location, String owner) {
        this.name = name;
        this.location = location;
        this.owner = owner;
    }
    public  boolean equals(Object object){

        if(this == object)
            return  true;
        if(!(object instanceof Contractor))
            return false;
        Contractor other = (Contractor) object;
        if (location==null){
            if (other.location!= null){
                return false;
            }
        }else if(!(location.equals(other.location)))
            return false;
        if(name==null){
            if (other.name!=null)
                return  false;
        }else if(!(name.equals(other.name)))
            return false;
        return  true;

    }

    public int hashCode(){
        String hashKey = name+ location;
        return hashKey.hashCode();
    }


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOwner() {
        return owner;
    }

   /* @Override
    public int compareTo(Contractor c) {
        String str1 = name+location;
        String str2 =c.name+c.location;
        return str1.compareTo(str2);
    }*/
}
