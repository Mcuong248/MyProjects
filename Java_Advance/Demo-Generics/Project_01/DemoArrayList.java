import java.util.ArrayList;

public class DemoArrayList <T>{
    ArrayList<T> arrayList = new ArrayList<T>();

    public DemoArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    //Thêm phần tử
    public void add(T value){
        arrayList.add(value);
    }

    //Sửa phần tử
    public void edit(int index, T eLement){
        arrayList.set(index, eLement);
    }

    //Xóa phần tử
    public void delete(T eLement){
        arrayList.remove(eLement);
    }

    //In danh sách
    public void print(ArrayList<T> list){
        for (T t : list){
            System.out.println(t);
        }
    }
}
