class Cat extends Animal {
    private boolean fullness;
    private static int catCount;

    public Cat(String name) {
        super(name, 200, 0);
        fullness = false;
        catCount++;
    }

    public void eat(int foodAmount) {
        if (foodAmount > 0) {
            fullness = true;
            System.out.println(name + " насытился");
        } else {
            System.out.println("Миска пустая, " + name + " не смог поесть");
        }
    }

    public boolean isFull() {
        return fullness;
    }

    public static int getCatCount() {
        return catCount;
    }
}