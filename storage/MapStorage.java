package java_oop.lesson9_10.storage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class MapStorage <T extends Entity<ID>, ID> implements Storage<T, ID> {

    private final Map<ID, T> productMap = new HashMap<>();

    public MapStorage() {
    }

    @Override
    public Optional<T> findById(ID id) {
       return productMap.containsKey(id) ? Optional.of(productMap.get(id)) : Optional.empty();
    }

    @Override
    public void save(T entity) {
        productMap.put(entity.getId(), entity);
    }

    @Override
    public void deleteById(ID id) {
        for(Iterator<Map.Entry<ID, T>> pair = productMap.entrySet().iterator(); pair.hasNext(); ){
           Map.Entry<ID, T> entry = pair.next();
           if(entry.getKey().equals(id)){
               pair.remove();
           }
        }
    }

    @Override
    public String toString() {
        return "MapStorage{" +
                "productMap=" + productMap +
                '}';
    }
}
