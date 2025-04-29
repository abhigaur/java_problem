package builderDesignPattern;

public class House {

    private int windows;
    private int doors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

private House(HouseBuild bb)
{
this.windows=bb.windows;
this.doors=bb.doors;
this.hasGarden=bb.hasGarden;
this.hasSwimmingPool=bb.hasSwimmingPool;
this.hasGarage=bb.hasGarage;
}

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }


  public   static class  HouseBuild{

        private int windows;
        private int doors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;


        public HouseBuild setWindows(int windows)
        {
            this.windows=windows;
            return this;
        }

        public int getWindows()
        {

            return windows;
        }

        public HouseBuild setDoors(int doors)
        {
            this.doors=doors;
            return this;
        }

        public int getDoors()
        {

            return doors;
        }

        public HouseBuild setSwimmingPool(boolean swimmingPool)
        {
            this.hasSwimmingPool=swimmingPool;
            return this;
        }

        public boolean getSwimmingPool()
        {

            return hasSwimmingPool;
        }

        public HouseBuild sethasGarden(boolean hasGarden)
        {
            this.hasGarden=hasGarden;
            return this;
        }

        public boolean gethasGarden()
        {

            return hasGarden;
        }


      public House build()
      {
          return new House(this);
      }



  }


}
