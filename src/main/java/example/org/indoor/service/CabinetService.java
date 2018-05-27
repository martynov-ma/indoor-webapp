package example.org.indoor.service;

import example.org.indoor.entity.Cabinet;

import java.util.List;

public interface CabinetService {
    Integer create(Cabinet role);
    Cabinet find(Integer id);
    void update(Cabinet role);
    void delete(Integer id);
    List<Cabinet> readAll();
}
