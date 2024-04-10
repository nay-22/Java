package MASTERCLASS.Section_8.CompositionChallengeSmartKitchen;

public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        System.out.println("DishWasher is doing dishes...");
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean ahsWorkToDo) {
        this.hasWorkToDo = ahsWorkToDo;
    }
}
