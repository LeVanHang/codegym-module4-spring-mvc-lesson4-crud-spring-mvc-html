package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Hang", "https://thethaovanhoa.mediacdn.vn/Upload/BLtvcXjb72tSqs1jiHr8g/files/2018/12/Jungkook13.jpg", 10000.0));
        products.add(new Product(2, "Sang", "https://img.meta.com.vn/Data/image/2022/02/17/anh-jungkook-1.jpg", 10000.0));
        products.add(new Product(3, "Son", "https://i.pinimg.com/originals/06/91/15/069115aea5fc95a5548b4562da55c680.jpg", 10000.0));
        products.add(new Product(4, "Phong", "https://i.pinimg.com/originals/af/87/5c/af875cab80721bb5ee5e5143bc46a998.png", 10000.0));
        products.add(new Product(5, "Luan", "https://kenh14cdn.com/thumb_w/620/2017/4-1504724081649.jpg", 20000.0));
    }

    public void add(Product product) {
        products.add(product);
    }

    public void delete(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }

    public void edit(int id, Product product) {
        if(id != -1) {
            products.set(id,product);
        }
    }

    public int findByid(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
