
public class AntrianLayanan22 {
    NodeMahasiswa22 head;
    NodeMahasiswa22 tail;
    int count = 0;
    int max;
    public AntrianLayanan22(int max) {
        this.max = max;
    }

    public boolean isEmpty() {
        return (head == null);
    }
    public boolean isFull() {
        return count >= max;
    }
    public void clear() {
        head = tail = null;
        count = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
    public void addLast(Mahasiswa22 input) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh. Tidak bisa menambahkan mahasiswa.");
            return;
        }
        NodeMahasiswa22 ndInput = new NodeMahasiswa22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        count++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }
    public Mahasiswa22 removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa22 data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        count--;
        return data;
    }
    public void tampilDepan() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            head.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void tampilAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void getAntrian() {
        System.out.println("Jumlah Mahasiswa yang masih mengantre : " + count + " orang");
    }
}
