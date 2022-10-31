package demo.service;

import java.io.IOException;

public interface IProductService {
    void add() throws IOException, ClassNotFoundException;

    void find() throws IOException, ClassNotFoundException;

    void delete() throws IOException, ClassNotFoundException;

    void edit() throws IOException, ClassNotFoundException;

    void display() throws IOException, ClassNotFoundException;
}
