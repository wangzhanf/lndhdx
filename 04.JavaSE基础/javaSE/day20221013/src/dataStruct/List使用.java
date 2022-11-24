package dataStruct;

import java.util.LinkedList;
import java.util.List;

public class List使用 {
    public static void main(String[] args) {
        //人工整理书架，创建书架
        List<Book> books = new LinkedList();
        books.add(new Book("CSS基础",123,23.45));
        books.add(new Book("javascript从入门到入土",1365,123.45));
        //在加入书的时候应该按照学习顺序
        books.add(0,new Book("HTML入门",365,83.45));
        //取出学习的第二门课程
        System.out.println(books.get(1));//Book  CSS
        //请打印整个书架
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

    }



}

class Book{
    private String name;
    private int page;
    private double price;

    public Book(String name, int page, double price) {
        this.name = name;
        this.page = page;
        this.price = price;
    }
    //覆写Book的toString，方便展示

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", page=" + page +
                ", price=" + price +
                '}';
    }
}
