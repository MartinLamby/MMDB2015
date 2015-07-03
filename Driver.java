package mmdb15;

public class Driver {
  int avenue;
  int street;
  int distance;

  public Driver (int avenue, int street, int distance){
    this.avenue = avenue;
    this.street = street;
    this.distance = distance;
  }

public int getAvenue(){
  return avenue;
}

public int getStreet(){
  return street;
}

public int getDistance(){
  return distance;
}

public void setDistance(int distance){
   this.distance = distance;
}

public void setStreet(int street){
   this.street = street;
}

public void setAvenue(int avenue){
   this.avenue = avenue;
}
}
