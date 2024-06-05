package thi.KieuThaiTuan63135975.Dethi2;

public class Subject {
    int id;
    String MaMonHoc;
    String TenMon;

    public Subject(int id, String maMonHoc, String tenMon) {
        this.id = id;
        MaMonHoc = maMonHoc;
        TenMon = tenMon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        MaMonHoc = maMonHoc;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String tenMon) {
        TenMon = tenMon;
    }
}
