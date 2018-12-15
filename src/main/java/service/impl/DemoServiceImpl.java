package service.impl;

import dao.IDemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IDemoService;

@Service
public class DemoServiceImpl implements IDemoService {
    @Autowired
    private IDemoDao demoDao;
}
