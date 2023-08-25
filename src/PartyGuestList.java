import java.util.HashSet;
import java.util.Set;

public class PartyGuestList {

    private Set<String> guestList;

    public PartyGuestList(){
        this.guestList = new HashSet<>();
    }


    public void addGuest(String guest){
        this.guestList.add(guest);
        System.out.println("Guest added successfully");
    }

    public void removeGuest (String guest){
        this.guestList.remove(guest);
        System.out.println("Guest removed successfully");
    }

    public boolean isGuestInList(String guest){
        return this.guestList.contains(guest);
    }

    public int totalGuest(){
        return this.guestList.size();
    }

    public boolean isEmptyList(){
        return this.guestList.isEmpty();
    }
}
