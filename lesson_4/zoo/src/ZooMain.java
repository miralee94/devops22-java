public class ZooMain {
    public static void main(String[] args){
        Lemur lemur = new Lemur();
        lemur.speak();

        Enclosure enclosure = new Enclosure();
        enclosure.openDoor();
        enclosure.cleanEnclosure();
        enclosure.closeDoor();

        Staff staff = new Staff();
        staff.feedAnimal(lemur);
    }
}
