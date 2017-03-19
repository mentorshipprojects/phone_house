package service.product;

import java.util.HashMap;
import java.util.Map;

public class BrandList {

    Map<Integer, String> brands = new HashMap<Integer, String>();

    public BrandList(){
        brands.put(1, "Apple");
        brands.put(2, "Asus");
        brands.put(3, "HTC");
        brands.put(4, "Huawei");
        brands.put(5, "Sony");
        brands.put(6, "Lenovo");
        brands.put(7, "Samsung");
        brands.put(8, "Prestigio");
        brands.put(9, "LG");
        brands.put(10, "Nokia");
        brands.put(11, "Meizu");
    }

    public void display(){
        System.out.println("============================");
        for (Map.Entry<Integer, String> list : brands.entrySet()){
            System.out.println(list.getKey() + " - " + list.getValue());
        }
        System.out.println("============================");
    }
}
