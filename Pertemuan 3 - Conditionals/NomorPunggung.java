public class NomorPunggung {

  public static class Human {
    public int pushUpDurationInMinute;
    public int plankDurationInMinute;
    public int runningDurationInMinute;

    Human(
      int pushUpDurationInMinute, 
      int plankDurationInMinute,
      int runningDurationInMinute
    ) {
      this.pushUpDurationInMinute = pushUpDurationInMinute;
      this.plankDurationInMinute = plankDurationInMinute;
      this.runningDurationInMinute = runningDurationInMinute;
    }
  }



  public static void main(String[] args) {
    Human asep = new Human(60, 5, 5);
    getWorkoutSummary(asep);
  }

  public static void getWorkoutSummary(Human human) {
    final double pushUpCaloriesLostPerMinute = 6.666666666666667;
    final float plankCaloriesLostPerMinute = 5;
    final float runningCaloriesLostPerMinute = 60;

    int pushUpDuration = human.pushUpDurationInMinute;
    int plankDuration = human.plankDurationInMinute;
    int runningDuration = human.runningDurationInMinute;


    System.out.println(
     "Pushup anda menghilangkan " + (float) (pushUpCaloriesLostPerMinute * pushUpDuration) + " kalori"
    );

    System.out.println(
     "Plank anda menghilangkan " + (float) (plankCaloriesLostPerMinute * plankDuration) + " kalori"
    );

    System.out.println(
     "Lari anda menghilangkan " + (float) (runningCaloriesLostPerMinute * runningDuration) + " kalori"
    );



  }
}
