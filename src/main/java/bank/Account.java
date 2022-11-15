package bank;

public class Account {

  private int id;
  private String type;
  private double bal;

  public Account(int id, String type, double bal){
    setId(id);
    setType(type);
    setBal(bal);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBal() {
    return this.bal;
  }

  public void setBal(double bal) {
    this.bal = bal;
  }

}  
