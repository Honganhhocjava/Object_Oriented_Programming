package hus.oop.lab4;
// 2.3 The Author and Book Classes - Your Turn
public class Author23 {
    private  String name;
    private  String email;

    public Author23(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[name = " + this.name + ", email = " + this.email + "]";
    }
}

