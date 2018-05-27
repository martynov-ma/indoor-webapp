package example.org.indoor.service.impl;

import example.org.indoor.dao.CabinetDAO;
import example.org.indoor.entity.Cabinet;
import example.org.indoor.service.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CabinetServiceImpl implements CabinetService {

    private final CabinetDAO cabinetDAO;

    @Autowired
    public CabinetServiceImpl(CabinetDAO cabinetDAO) {
        this.cabinetDAO = cabinetDAO;
    }

    @Transactional
    public Integer create(Cabinet cabinet) {
        return cabinetDAO.create(cabinet);
    }

    @Transactional
    public Cabinet find(Integer id) {
        return cabinetDAO.find(id);
    }

    @Override
    public Cabinet findByName(String name) {
        return cabinetDAO.findByName(name);
    }

    @Transactional
    public void update(Cabinet cabinet) {
        cabinetDAO.update(cabinet);
    }

    @Transactional
    public void delete(Integer id) {
        cabinetDAO.delete(id);
    }

    @Transactional
    public List<Cabinet> readAll() {
        return cabinetDAO.readAll();
    }
}
