package Main4;

public class Book {
    private String title;
    private boolean isLent;

    public Book(String title, boolean isLent){
        this.title = title;
        this.isLent = false;
    }
    public String getter(){
        return this.title;
    }
    public boolean isLent(){
        return this.isLent;
    }
    protected void setLent(boolean lent){
        this.isLent = lent;
    }
}
