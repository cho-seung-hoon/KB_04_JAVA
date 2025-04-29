package ch13.sec02.exam01;

public class Product<K, M> {
    public K kind;
    public M model;

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }
}
