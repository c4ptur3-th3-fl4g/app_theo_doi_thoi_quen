package src.resource;
public class phan_thuong {
    private String id;
    private  String name;
    private String mota;
    private  double diem;

    public phan_thuong() {
    }

    public phan_thuong(String id, String name, String mota, double diem) {
        this.id = id;
        this.name = name;
        this.mota = mota;
        this.diem = diem;
    }

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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

}