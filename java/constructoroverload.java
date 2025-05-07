public  class constructoroverload{
    int metres;
    String talk;
    int distance;
  public  int run(int metres)
  {
      this.metres=metres;
  }  
  public int run(int metres,int distance)
  {
     this.metres=metres;
     this.distance=distance;
  }
}