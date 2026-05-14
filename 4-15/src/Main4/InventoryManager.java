package Main4;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InventoryManager {
    private Map<String, Product> inventory = new HashMap<>();
    
    public void addProduct(String name, int stock) {
        Product newProduct = new Product(name, stock);
        this.inventory.put(name, newProduct);
        System.out.println("[" + name + "]を入荷しました");
    }
    
    private Optional<Product> findProduct(String name) {
        Product product = this.inventory.get(name);
        return Optional.ofNullable(product);
    }

    public void sellProduct(String name) {

        Optional<Product> productOpt = findProduct(name);
        
        if (productOpt.isPresent()) {
            Product product = productOpt.get();
            product.decreaseStock();
            System.out.println(name + "の販売: 在庫から1個減少");
        } else {
            System.out.println("商品が見つかりません");
        }
    }
}
