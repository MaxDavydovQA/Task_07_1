class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("Добавлено " + amount + " порций еды в миску");
    }

    public int getFood() {
        return food;
    }
}

