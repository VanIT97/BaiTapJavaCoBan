package EmpMagJavaP2.P001.entity.a.main;

import EmpMagJavaP2.P001.entity.a.entity.book;

public class test {
    public static void main(String[] args){
        book[] books = new book[30];
        books[0] = new book("Toan",1,"DinhVan","GiaoDuc");
        for(int i=0; i<1; i++){
            books[i].getBookInfo();
        }
    }
}
