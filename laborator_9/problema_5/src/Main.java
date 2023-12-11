import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        PetHotel petHotel = new PetHotel();

        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");
        Dog dog3 = new Dog("Max");
        petHotel.checkIn(101, dog1);
        petHotel.checkIn(102, dog2);
        petHotel.checkIn(101, dog3); // Se adaugă în aceeași cameră cu Rex
        petHotel.afisareOaspeti();
        petHotel.checkOut(101, dog1);
        petHotel.afisareOaspeti();
    }
}

