package Shoping;

import java.util.*;

public class ShopIpohs {
    List<Products> listproducts;
    public ShopIpohs(List<Products> listproducts) {
        this.listproducts = listproducts;
    }

    public void addProducts(Products products)
    {
        if (!listproducts.contains(products.getId()))
        {
            this.listproducts.add(products);
        }
    }
    public List<Products> getAllListOfProducts()
    {
        return listproducts;
    }
    public void removeProduct(int id)
    {
        Iterator<Products> iter=listproducts.iterator();
        while(iter.hasNext()){
            if(iter.next().getId()==id){
                iter.remove();
            }
        }
    }
    public void editProducts(Products products)
    {
        products.setName("Фонарик");
        products.setPrice(120);
    }

    public static void main(String[] args) {
        List<Products> list=new ArrayList<>();
        List<Products> list1=list;
        ShopIpohs Myshop=new ShopIpohs(list);
        Products products1=new Products(1,"Вентилятор",512);
        Products products2=new Products(2,"Ночник",232);
        Products products3=new Products(3,"Кисточка",156);
        Products products4=new Products(4,"Кабель",216);
        Products products5=new Products(5,"Замок",58);
        Myshop.addProducts(products1);
        Myshop.addProducts(products2);
        Myshop.addProducts(products3);
        Myshop.addProducts(products4);
        Myshop.addProducts(products5);
        Products []array=new Products[5];
        list.toArray(array);
        boolean sorted =false;
        while(!sorted) {
            sorted=true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getPrice() > array[i + 1].getPrice()) {
                    Products y = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = y;
                    sorted=false;
                }
            }
        }
        list1= Arrays.asList(array);
        System.out.println(list1);//список отсортирован по возрастанию цены
        Myshop.removeProduct(2);
        System.out.println(Myshop.getAllListOfProducts());//список после удаленния элемента
        Collections.reverse(list);
        System.out.println(Myshop.getAllListOfProducts());
        Myshop.editProducts(products1);
        System.out.println(Myshop.getAllListOfProducts());}
}
