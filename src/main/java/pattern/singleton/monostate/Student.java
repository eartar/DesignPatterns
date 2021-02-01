package pattern.singleton.monostate;

class Student {
    private static String name;
    private static int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Student.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Student.id = id;
    }

    @Override
    public String toString() {
        return ""+id+" "+name;
    }
}
