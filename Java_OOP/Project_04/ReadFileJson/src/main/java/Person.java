import com.google.gson.annotations.SerializedName;

public class Person {
    @SerializedName("id")
    private int id;

    @SerializedName("full_name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("mobie")
    private String mobie;


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobie='" + mobie + '\'' +
                '}';
    }
}
