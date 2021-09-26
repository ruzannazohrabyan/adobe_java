package com.company.week12.homework.bookProxy.model;

import javax.management.InstanceAlreadyExistsException;

public class BookProxy extends Book{

    public BookProxy(String title, String author) {
        super(title, author);
    }

    private boolean flag = false;

    public boolean isLoaded() {
        return flag;
    }

    public void setLoaded(boolean loaded) {
        flag = loaded;
    }

    public void load() throws InstanceAlreadyExistsException {
        if(isLoaded()) {
            throw new InstanceAlreadyExistsException("Book already Loaded");
        }
        setLoaded(true);
    }

    @Override
    public String getTitle() throws InstanceAlreadyExistsException {
        if(!isLoaded()){
            throw new InstanceAlreadyExistsException("Book already Loaded");
        }
        return super.getTitle();
    }

    @Override
    public String getAuthor() throws InstanceAlreadyExistsException{
        if(!isLoaded()){
            throw new InstanceAlreadyExistsException("Book already Loaded");
        }
        return super.getAuthor();
    }
}
