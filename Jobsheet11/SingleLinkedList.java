public class SingleLinkedList {
  NodeMahasiswa22 head;
  NodeMahasiswa22 tail;

  boolean isEmpty() {
    return head == null;
  }

  public void print() {
    if (!isEmpty()) {
      NodeMahasiswa22 temp = head;
      while (temp != null) {
        temp.data.tampilInformasi();
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("Linked List Kosong");
    }
  }
  void addFirst(Mahasiswa22 input) {
    NodeMahasiswa22 ndInput = new NodeMahasiswa22(input, null);
    if (isEmpty()) {
      tail = ndInput;
      tail = ndInput;
    } else {
      ndInput.next = head;
      head = ndInput;
    }
  }

  void addLast(Mahasiswa22 input) {
    NodeMahasiswa22 ndInput = new NodeMahasiswa22(input, null);
    if (isEmpty()) {
      head = ndInput;
      tail = ndInput;
    } else {
      tail.next = ndInput;
      tail = ndInput;
    }
  }

  public void insertAfter(String key, Mahasiswa22 input) {
    NodeMahasiswa22 ndInput = new NodeMahasiswa22(input, null);
    NodeMahasiswa22 temp = head;
    do {
      if (temp.data.nama.equalsIgnoreCase(key)) {
        ndInput.next = temp.next;
        temp.next = ndInput;
        if (ndInput.next == null) {
          tail = ndInput;
        }
        break;
      }
      temp = temp.next;
    } while (temp != null);
  }

  public void insertAt(int index, Mahasiswa22 input) {
    if (index < 0) {
      System.out.println("Index tidak valid");
    } else if (index == 0) {
      addFirst(input);
    } else {
      NodeMahasiswa22 temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      temp.next = new NodeMahasiswa22(input, temp.next);
      if (temp.next.next == null) {
        tail = temp.next;
      }
    }
  }


  
}
