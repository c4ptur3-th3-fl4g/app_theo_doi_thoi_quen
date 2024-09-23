package src.resource;
public class user {
    private String name;
    private int id;
    private String email;
    private String matkhau;
    private String list_thoi_quen;

    public user(){}
    public user(int id, String name, String email, String matkhau, String list_thoi_quen) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.matkhau = matkhau;
        this.list_thoi_quen = list_thoi_quen;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getmatkhau() {
        return matkhau;
    }

    public void setPass(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getList_thoi_quen() {
        return list_thoi_quen;
    }

    public void setList_thoi_quen(String list_thoi_quen) {
        this.list_thoi_quen = list_thoi_quen;
    }


}
