package skadistats.clarity.match;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.rits.cloning.Cloner;

public class GenericCollection<T> implements Iterable<T>, Cloneable {
    
    private static final Cloner CLONER = new Cloner();
    
    private final List<T> values = new ArrayList<T>();

    public void add(T value) {
        values.add(value);
    }
    
    public void clear() {
        values.clear();
    }
    
    public List<T> getAll() {
        return Collections.unmodifiableList(values);
    }
    
    @Override
    public Object clone() {
       return CLONER.deepClone(this);
    }

    @Override
    public Iterator<T> iterator() {
        return values.iterator();
    }
    
}
