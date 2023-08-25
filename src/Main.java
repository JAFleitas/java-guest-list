public class Main {
    public static void main(String[] args) {
        PartyGuestList partyGuestList = new PartyGuestList();

        System.out.println("is empty list ? " + partyGuestList.isEmptyList() );
        partyGuestList.addGuest("Gonzalo");
        partyGuestList.addGuest("Damian");
        partyGuestList.addGuest("Fleitas");

        System.out.println("Is Gonzalo on the list? " + partyGuestList.isGuestInList("Gonzalo"));

        partyGuestList.removeGuest("Gonzalo");
        System.out.println("Is Gonzalo on the list? " + partyGuestList.isGuestInList("Gonzalo"));

    }


}