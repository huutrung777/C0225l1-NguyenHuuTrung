package bai_tap.bai11.MyArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size=0;
    private int Defaut_capacity=10;
    Object elemment[];

    public MyArrayList() {
        elemment=new Object[Defaut_capacity];

    }

    public MyArrayList(int capacity) {
        if(capacity>=0){
            elemment=new Object[capacity];
        }else {
            throw new IllegalArgumentException("Capacity"+capacity);
        }

        elemment=new Object[capacity];

    }
    public int Size(){
        return this.size;
    }
    public void clear(){
        size=0;
        for(int i=0;i<elemment.length;i++){
            elemment[i]=null;
        }
    }
    public boolean add(E element){
        if(elemment.length==size){
            this.ensureCapacity(5);
        }
        elemment[size]=element;
        size++;
        return true;
    }
    public void add(int index,E element){
        if(index>elemment.length){
            throw new IllegalArgumentException("Index"+index);

        }else if(elemment.length==size){
            this.ensureCapacity(5);
        }
        if(elemment[index]==null){
            elemment[index]=element;
            size++;
        }else {
            for(int i=size+1;i>=i;i++){
                elemment[i]=elemment[i-1];
            }
            elemment[index]=element;
            size++;
        }


    }

    public void ensureCapacity(int minCapacity){
            if(minCapacity>=0){
                int newSize=this.elemment.length+minCapacity;
                elemment= Arrays.copyOf(elemment,newSize);

            }else {
                throw new IllegalArgumentException("Mincapacity"+minCapacity);
            }


    }


}
