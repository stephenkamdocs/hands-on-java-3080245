package bank;

public class Customer {

  private int id;
  private string name;
  private string username;
  private string password;
  private int accountId;

  public Customer(int id, string name, string username, string password, int accountId) {
    setId(id);
    setName(name);
    setUsername(username);
    setPassword(password);
    setAccountId(accountId);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public string getName() {
    return this.name;
  }

  public void setName(string name) {
    this.name = name;
  }

  public string getUsername() {
    return this.username;
  }

  public void setUsername(string username) {
    this.username = username;
  }

  public string getPassword() {
    return this.password;
  }

  public void setPassword(string password) {
    this.password = password;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

}
