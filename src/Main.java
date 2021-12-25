import java.util.*;

public class Main {
    public static void main(String[] args) {
        Phone galaxy = new Phone(94582, "- Galaxy_A");
        Phone iphoneXs = new Phone(45790, "- iPhone_XS");
        Phone iphoneXr = new Phone(32478, "- iPhone_XR");
        Phone galaxyNote = new Phone(36701, "- Galaxy_Note_4");
        Phone iphoneXrDp = new Phone(32478, "- iPhone_XR_duplicate");

        List<Phone> arrayList = new ArrayList<>();
        arrayList.add(galaxy);
        arrayList.add(iphoneXs);
        arrayList.add(iphoneXr);
        arrayList.add(galaxyNote);
        arrayList.add(iphoneXrDp);

        for (Phone tel : arrayList) {
            System.out.println(tel);
        }
        Collections.sort(arrayList);
        System.out.println();

        for (Phone tel : arrayList) {
            System.out.println(tel);
        }

        if (iphoneXr.id == iphoneXrDp.id) {
            arrayList.remove(3);
        }

        System.out.println();
        for (Phone tel : arrayList) {
            System.out.println(tel);
        }
    }
}
