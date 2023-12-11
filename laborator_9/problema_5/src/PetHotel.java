import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetHotel {
    private Map<Integer, List<Dog>> rooms;

    public PetHotel() {
        this.rooms = new HashMap<>();
    }

    public void checkIn(int roomNumber, Dog dog) {
        rooms.computeIfAbsent(roomNumber, k -> new ArrayList<>()).add(dog);
        System.out.println(dog.getName() + " a fost cazat în camera " + roomNumber);
    }

    public void checkOut(int roomNumber, Dog dog) {
        rooms.getOrDefault(roomNumber, new ArrayList<>()).remove(dog);
        System.out.println(dog.getName() + " a fost eliberat din camera " + roomNumber);
    }

    public void afisareOaspeti() {
        System.out.println("Starea curentă a hotelului:");
        for (Map.Entry<Integer, List<Dog>> entry : rooms.entrySet()) {
            int roomNumber = entry.getKey();
            List<Dog> dogsInRoom = entry.getValue();

            System.out.println("Camera " + roomNumber + ": " + dogsInRoom);
        }
    }
}
