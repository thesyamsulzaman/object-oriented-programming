public class NomorPunggung {

  public static class Human {
    public int pushUpDurationInMinute;
    public int plankDurationInMinute;
    public int runingRangeInKM;

    Human(
      int pushUpDurationInMinute, 
      int plankDurationInMinute,
      int runingRangeInKM
    ) {
      this.pushUpDurationInMinute = pushUpDurationInMinute;
      this.plankDurationInMinute = plankDurationInMinute;
      this.runingRangeInKM = runingRangeInKM;
    }
  }



  public static void main(String[] args) {
    Human asep = new Human(30, 1, 1);
    getWorkoutSummary(asep);
  }

  public static void getWorkoutSummary(Human human) {
    final double pushUpCaloriesLostInMinute = 6.666666666666667;
    final float plankCaloriesLostInMinute = 5;
    final float runningCaloriesLostInKM = 60;

    int pushUpDuration = human.pushUpDurationInMinute;
    int plankDuration = human.plankDurationInMinute;
    int runningRange = human.runingRangeInKM;


    System.out.println(
     "Pushup anda menghilangkan " + (float) (pushUpCaloriesLostInMinute * pushUpDuration) + " kalori"
    );

    System.out.println(
     "Plank anda menghilangkan " + (float) (plankCaloriesLostInMinute * plankDuration) + " kalori"
    );

    System.out.println(
     "Lari anda menghilangkan " + (float) (runningCaloriesLostInKM * runningRange) + " kalori"
    );



  }
}
