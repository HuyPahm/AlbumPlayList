package ntu.proj.fixingthingsocop;
public class Task {
    public String ID, Huyen, TenSP, PhanLoai, TenChuSX, LoaiHinh, DiaChi, TenDD, SDT, SHS, NamCN;

    public Task() {
        // Default constructor required for calls to DataSnapshot.getValue(Task.class)
    }

    public Task(String ID, String Huyen, String TenSP, String PhanLoai, String TenChuSX, String LoaiHinh, String DiaChi, String TenDD, String SDT, String SHS, String NamCN) {
        this.ID = ID;
        this.Huyen = Huyen;
        this.TenSP = TenSP;
        this.PhanLoai = PhanLoai;
        this.TenChuSX = TenChuSX;
        this.LoaiHinh = LoaiHinh;
        this.DiaChi = DiaChi;
        this.TenDD = TenDD;
        this.SDT = SDT;
        this.SHS = SHS;
        this.NamCN = NamCN;
    }
}
