package librarycatalogue;

public class Book {

  //properties, fields, global variables
  String title;
  int pageCount;
  int ISBN;
  boolean isCheckoutOut;
  int dayCheckedOut = -1;

  // constructor
  public Book(String bookTitle, int bookPageCount, int bookISBN) {
    this.title = bookTitle;
    this.pageCount = bookPageCount;
    this.ISBN = bookISBN;
    this.isCheckoutOut = false;
  }

  //Getters
  public String getTitle() {
    return this.title;
  }

  public int getPageCount(){
    return this.pageCount;
  }
  
  public int getISBN(){
    return this.ISBN;
  }
  
  public Boolean getIsCheckedOut() {
    return this.isCheckoutOut;
  }
  
  public int getDayCheckedOut(){
    return this.dayCheckedOut;
  }

  //Setters
  public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
    this.isCheckoutOut = newIsCheckedOut;
    setDayCHeckedOut(currentDayCheckedOut);
  }

  private void setDayCHeckedOut(int day) {
    this.dayCheckedOut = day;
  }
} 