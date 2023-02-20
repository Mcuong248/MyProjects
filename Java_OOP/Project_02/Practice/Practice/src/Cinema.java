public class Cinema {
    private String id;
    private String name;
    private String category;
    private int length;
    private String producer;
    private int releaseYear;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Cinema(String id, String name, String category, int length, String producer, int releaseYear) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.length = length;
        this.producer = producer;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return id + " - "
                + name + " - "
                +category + " - "
                +length + " - "
                +producer + " - "
                +releaseYear;
    }
}
