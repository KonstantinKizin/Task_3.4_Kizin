package by.jwd.task._3_4.kizin.list.impl;
import by.jwd.task._3_4.kizin.list.MyList;

import java.util.Arrays;



public class MyArrayList<E> implements MyList<E> {

    private int capacity = 0;
    private int size = 0;

    private Object[] arr = new Object[capacity];

    @Override
    public boolean add(E e) {
        arr = Arrays.copyOf(arr,arr.length + 1);
        arr[arr.length - 1] = e;
        size++;
        return true;
    }


    @Override
    public E get(int index) {
        if(index > this.size){
            return null;
        }else {
            return (E) arr[index];
        }
    }


    @Override
    public boolean remove(E t) {

        for(int i = 0; i < size; i++){
            if(arr[i].equals(t)){
                Object[] pref = new Object[size -1];
                System.arraycopy(arr,0,pref,0,i);
                arr[i] = null;
                System.arraycopy(arr,i + 1,pref,i,size -i - 1);
                arr = pref;
                pref = null;
                size--;
                return true;
            }

        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    public void setCapacity(int newCapacity){
        this.capacity = capacity;
    }


    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(Object tmp: arr){
            sb.append(tmp.toString()+",");
        }
        if(this.size == 0){
            return "{}";
        }else {
            sb.deleteCharAt(sb.length() - 1);
            sb.append("}");
            String toString = new String(sb);
            sb = null;
            return toString;
        }

    }
}
