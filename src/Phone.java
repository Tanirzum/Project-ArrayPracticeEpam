public class Phone implements Comparable<Phone> {
    public int id;
    public String name;

    public Phone(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + name;
    }

    @Override
    public int compareTo(Phone o) {
        return this.name.compareTo(o.name);
    }
}
