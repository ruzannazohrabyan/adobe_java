package com.company.week6.classwork.task2;


public class BufferImpl<T> implements Buffer<T> {
    private T object;


    @Override
    public T get(){
        if (object == null) {
            throw new IllegalStateException("Object is empty");
        }
        T temp = object;
        object = null;
        return temp;
    }

    @Override
    public void put(T obj) {
        if (object != null){
            throw new IllegalStateException("Object is full");
        }
        object = obj;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof BufferImpl)) {
            return false;
        }
        final BufferImpl buffer = (BufferImpl) obj;
        return buffer.object.equals(this.object);
    }
}
