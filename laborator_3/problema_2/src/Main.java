import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int virsta=18, sex=0, inaltime=175;
        short info_impachetata;
        info_impachetata = (short)((((virsta << 1) | sex) << 8) | inaltime);
        inaltime = info_impachetata & 0xff;
        sex = (info_impachetata >>> 8) & 1;
        virsta = (info_impachetata >>> 9) & 0x7f;
    }
}