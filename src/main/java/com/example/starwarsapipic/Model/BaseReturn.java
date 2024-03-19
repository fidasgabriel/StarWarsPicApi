package com.example.starwarsapipic.Model;

public class BaseReturn {
    String url;

    public BaseReturn(String url) {
        this.url = url;
    }

    public String getNome() {
        return url;
    }

    public void setNome(String url) {
        this.url = url;
    }
}
