

public class DataDosen22 {
    Dosen22 [] listDosen = new Dosen22[10];
    int idx;
    void tambah (Dosen22 m) {
        if (idx<listDosen.length) {
            listDosen[idx]=m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil() {
        for (int i = 0; i < idx; i++) {
            Dosen22 m = listDosen[i];
            m.tampilkanInformasi();
            System.out.println("-----------------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<idx-1; i++){
            for (int j=1; j<idx-i; j++){
                if (listDosen[j-1].usia>listDosen[j].usia) {
                    Dosen22 tmp = listDosen[j];
                    listDosen[j]=listDosen[j-1];
                    listDosen[j-1]=tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i=0; i<idx-1; i++) {
            int idxMax=i;
            for (int j=i+1; j<idx; j++) {
                if(listDosen[j].usia>listDosen[idxMax].usia) {
                    idxMax=j;
                }
            }
            Dosen22 tmp = listDosen[idxMax];
            listDosen[idxMax]=listDosen[i];
            listDosen[i]=tmp;
        }
    }
    void insertionSort(){
        for (int i=1; i<idx; i++) {
            Dosen22 temp = listDosen[i];
            int j=i;
            while (j>0 && listDosen[j-1].usia<temp.usia) {
                listDosen[j]=listDosen[j-1];
                j--;
            }
            listDosen[j]=temp;
        }
    }
}
