/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriyapilariproje2;

/*
 * @file veriyapilari_2 Node.java
 * @description bu sınıfta kuyruk yapısına ait node sınıfı bulunmaktadır. İçeriğinde müşteri bilgilerinin tanımlaması yapılmıştır.
   Node sınıfına ait bir yapıcı metot tanımlanmıştır ve müşteri bilgileri metoda parametre olarak verilmiştir.
   Müşterilere ait her özelliğin getter ve setter metodları yazılmıştır.
 * @assignment Proje 2  
 * @date  20/12/2019 - 21/12/2019 - 22/12/2019
 * @author Emre USTA  emreustaa34@gmail.com
 */
 
public class Node {

    String adSoyad;
    String faturaTipi;
    double faturaMiktari;
    int oncelik;
    int zaman;
    Node next;

    public Node(String adSoyad, String faturaTipi, double faturaMiktari, int oncelik, int zaman) {
        this.adSoyad = adSoyad;
        this.faturaTipi = faturaTipi;
        this.faturaMiktari = faturaMiktari;
        this.oncelik = oncelik;
        this.zaman = zaman;
        this.next = null;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getFaturaTipi() {
        return faturaTipi;
    }

    public void setFaturaTipi(String faturaTipi) {
        this.faturaTipi = faturaTipi;
    }

    public double getFaturaMiktari() {
        return faturaMiktari;
    }

    public void setFaturaMiktari(double faturaMiktari) {
        this.faturaMiktari = faturaMiktari;
    }

    public int getOncelik() {
        return oncelik;
    }

    public void setOncelik(int oncelik) {
        this.oncelik = oncelik;
    }

    public int getZaman() {
        return zaman;
    }

    public void setZaman(int zaman) {
        this.zaman = zaman;
    }

}
