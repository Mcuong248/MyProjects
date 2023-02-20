import java.util.Scanner;

public class SchoolBook extends Library{
    private int pageNumber;
    private String tinhTrang;
    private int quantityMuon;

    public SchoolBook(String id, String name, String author, int year, int quantity, int pageNumber, String tinhTrang, int quantityMuon) {
        super(id, name, author, year, quantity);
        this.pageNumber = pageNumber;
        this.tinhTrang = tinhTrang;
        this.quantityMuon = quantityMuon;
    }


    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getQuantityMuon() {
        return quantityMuon;
    }

    public void setQuantityMuon(int quantityMuon) {
        this.quantityMuon = quantityMuon;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + pageNumber + " - " + tinhTrang + " - " + quantityMuon;
    }
}
