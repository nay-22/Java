package MASTERCLASS.Section_8.CompositionChallengeSmartKitchen;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBlock;

    SmartKitchen(
            boolean brewMasterHasWorkToDo,
            boolean dishWasherHasWorkToDo,
            boolean iceBlockHasWorkToDo
    ) {
        brewMaster = new CoffeeMaker(brewMasterHasWorkToDo);
        dishWasher = new DishWasher(dishWasherHasWorkToDo);
        iceBlock = new Refrigerator(iceBlockHasWorkToDo);
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBlock.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo((true));
    }

    public void setKitchenState(
            boolean brewMasterHasWorkToDo,
            boolean dishWasherHasWorkToDo,
            boolean iceBlockHasWorkToDo
    ) {
        brewMaster.setHasWorkToDo(brewMasterHasWorkToDo);
        dishWasher.setHasWorkToDo(dishWasherHasWorkToDo);
        iceBlock.setHasWorkToDo(iceBlockHasWorkToDo);
    }

    public void doKitchenWork() {

    }
}
