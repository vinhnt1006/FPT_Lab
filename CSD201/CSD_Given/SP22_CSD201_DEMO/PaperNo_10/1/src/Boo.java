// =========== DO NOT EDIT THE GIVEN CONTENT OF THIS FILE ============
class Boo{
  String forest;
  int rate,sound;
  Boo() {
   }
  Boo(String xForest, int xRate, int xSound){
    forest=xForest;rate=xRate; sound=xSound;
   }
  public String toString(){
    return("(" +forest+","+rate + "," + sound + ")");
   }
    public int compareTo(Boo o) {
        int priceDif = this.rate - o.rate;
        if (priceDif < 0) return -1;
        if (priceDif > 0) return 1;
        return 0;
    }
 }
