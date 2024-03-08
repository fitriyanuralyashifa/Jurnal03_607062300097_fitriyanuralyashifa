import java.util.Scanner;
class Node {
    Buku data;
    Node next;

    public Node(Buku data) {
        this.data = data;
        this.next = null;
    }

    public Buku getData() {
        return data;
    }
}
class SinglyLinkedList<E> {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void addNode(Buku data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Buku berhasil ditambahkan");
    }

    public void deleteNode() {
        if (head == null) {
            System.out.println();
        } else if (head.next == null) {
            System.out.println();
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            System.out.println("Buku berhasil dihapus");
        }

    }

    public void printList() {
        if (head == null) {
            System.out.println("tidak ada buku");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;

            }
        }
    }
}
class Buku {
    private String judul;
    private String penulis;
    private int tahunterbit;

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunterbit = tahun;
    }

    @Override
    public String toString() {
        return "Buku [nip=" + judul + ", nama=" + penulis + ", divisi=" + tahunterbit + "]";
    }
}
public class Jurnal03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SinglyLinkedList<Buku> daftar = new SinglyLinkedList<>();
        while (true) {
            System.out.println("\nPilih menu :\n1. Tambah Buku\n2. Hapus Buku\n3. Cetak Daftar Buku\n4. Keluar");
            System.out.print("Masukkan pilihan :");
            int pilihan = s.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = s.next();
                    System.out.print("Masukkan nama penulis: ");
                    String penulis = s.next();
                    System.out.print("Masukkan tahun terbit: ");
                    int tahunterbit = s.nextInt();
                    daftar.addNode(new Buku(judul, penulis, tahunterbit));
                    break;
                case 2:
                    daftar.deleteNode();
                    break;
                case 3:
                    daftar.printList();
                    break;
                case 4:
                    s.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
