package cat.wars.collections;

import java.io.Serializable;
import java.util.AbstractList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wars
 * \* Date: 18-8-11
 * \* Time: 下午8:52
 * \* Description:
 * \
 */

public class MyArrayList<E> extends AbstractList<E>
        implements Serializable {
    private static final long serialVersionUID = 8803149472323107740L;
    private static final int DEFAULT_CAPACITY = 8;
    private int size;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    transient Object[] elementData;

    public MyArrayList() {
        elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

//    E elementdata(int index){
//
//    }

    @Override
    public int size() {
        return 0;
    }
}
