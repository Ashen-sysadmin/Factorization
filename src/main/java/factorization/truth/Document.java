package factorization.truth;

import java.util.ArrayList;

import factorization.truth.api.AbstractPage;

public class Document {

    String name;
    ArrayList<AbstractPage> pages;

    public Document(String name, ArrayList<AbstractPage> pages) {
        this.name = name;
        this.pages = pages;
    }
}
