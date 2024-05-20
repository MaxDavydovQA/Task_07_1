class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected static int count;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не сумел пробежать такое расстояние");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " не сумел проплыть такое расстояние");
        }
    }

    public static int getCount() {
        return count;
    }
}

