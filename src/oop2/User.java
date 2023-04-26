package oop2;

public class User {
    private String name;
    private String birthplace;
    private String birthday;

    public User(String n, String p, String d) {
        this.name = n;
        this.birthplace = p;
        this.birthday = d;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User other = (User) obj;
            return this.name.equals(other.name)
                    && this.birthplace.equals(other.birthplace)
                    && this.birthday.equals(other.birthday);
        }
        return false;
    }

    @Override
    public String toString() {
        return "名前：" + this.name + ", 出身地：" + this.birthplace + ", 生年月日：" + this.birthday;
    }

    public static void main(String[] args){
        User user1 = new User("ミヤギ","西原","2002/06/15");
        User user2 = new User("ナカホド", "西原", "2002/07/19");

        System.out.println(user1.equals(user1));
        System.out.println(user2.equals(user1));


        System.out.println(user1);
        System.out.println(user2);

    }
}
