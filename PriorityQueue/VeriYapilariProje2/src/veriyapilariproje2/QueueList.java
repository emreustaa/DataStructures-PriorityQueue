/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriyapilariproje2;

/*
 * @file veriyapilari_2 QueueList.java
 * @description Bu sınıfta yer alan 4 adet metot, Node sınıfından üretilen front ve rear node'ları ve iki adet int tanımlaması yapılmıştır.
   enqueue metodu txt'den gelen verileri önceliklerine göre kıyaslayarak kuyruğa eklemektedir.
   dequeue metodu kuyruğun önündeki elemanı kuyruktan çıkartarak, kuyruktan çıkan elemanı geri döndürmektedir.
   printlist metodu kuyruktaki verileri yazdırmaktadır. Proje yazılırken listedeki elemanları yazdırarak kontrolü sağlanmıştır.
   isEmpty metodu front node'unun dolu boş kontrolünü yapmaktadır.
 * @assignment Proje 2  
 * @date  20/12/2019 - 21/12/2019 - 22/12/2019
 * @author Emre USTA   emreustaa34@gmail.com
 */
public class QueueList {

    Node front, rear;
    int zaman = 0, fatura = 0;

    void enqueue(String adSoyad, String faturaTipi, double faturaMiktari, int oncelik, int zaman) {
        Node newNode = new Node(adSoyad, faturaTipi, faturaMiktari, oncelik, zaman);

        if (isEmpty()) {
            front = rear = newNode;

        } else if (front.next == null) {
            if (newNode.oncelik < front.oncelik) {
                newNode.next = front;
                front = newNode;

            } else if (newNode.oncelik >= front.oncelik) {
                front.next = newNode;

            }

        } else if (newNode.oncelik < front.oncelik) {
            newNode.next = front;
            front = newNode;

        } else if (newNode.oncelik >= front.oncelik) {
            Node temp = front;
            while (temp != null) {
                if (newNode.oncelik < temp.next.oncelik && newNode.oncelik >= temp.oncelik) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;

                } else {
                    temp = temp.next;
                }
                if (temp.next == null) {
                    temp.next = newNode;
                    break;

                }

            }

        }

    }

    String dequeue() {

        if (isEmpty()) {
            System.out.println("Kuyruk Bos");
            return null;
        } else {
            String temp = front.getAdSoyad() + "#" + front.getFaturaTipi() + "#" + front.getFaturaMiktari() + "#" + front.getOncelik() + "#" + front.getZaman();
            front = front.next;
            fatura++;
            if (isEmpty()) {
                rear = null;
            }

            return temp;

        }
    }

    void printList() {

        if (front != null) {
            Node temp = front;
            while (temp != null) {

                System.out.print(temp.adSoyad + "->" + temp.faturaTipi + "->" + temp.faturaMiktari + "->" + temp.oncelik + "->" + temp.zaman);
                temp = temp.next;
                System.out.println("");

            }

        }

    }

    boolean isEmpty() {
        return (front == null);
    }

}
