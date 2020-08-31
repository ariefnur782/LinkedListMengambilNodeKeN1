/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mengambilnodeken;

/**
 *
 * @author USER
 */
public class MengambilNodekeN {
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    private void melihatItem(MengambilNodekeN l){
        l.head = new Node(10);
        Node nodDua = new Node(23);
        Node nodTiga = new Node(35);
        Node nodEmpat = new Node(46);
        Node nodLima = new Node(57);
        Node nodEnam = new Node(68);
        
        l.head.next = nodDua;
        l.head.next.next = nodTiga;
        l.head.next.next.next = nodEmpat;
        l.head.next.next.next.next = nodLima;
        l.head.next.next.next.next.next = nodEnam;
    }
    private void mencetak(String ini){
        System.out.println(ini);
        Node listNode =head;
        while (listNode != null){
            System.out.print(listNode.data+ " ");
            listNode = listNode.next;
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
     MengambilNodekeN l = new MengambilNodekeN();
     l.melihatItem(l);
     l.mencetak("inisial item");
     System.out.println("nilai node data ="+l.ngambil(0));
    }
    private int ngambil(int i){
        Node temp = head;
        int hitung = 0;
        while(temp != null){
            if(hitung == i)
                return temp.data;
            hitung++;
            temp = temp.next;
        }
        return -1;
    }
    
}
