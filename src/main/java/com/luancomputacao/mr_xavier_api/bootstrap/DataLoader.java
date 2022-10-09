package com.luancomputacao.mr_xavier_api.bootstrap;

import com.luancomputacao.mr_xavier_api.models.User;
import com.luancomputacao.mr_xavier_api.services.UserService;
import com.luancomputacao.mr_xavier_api.services.map.UserServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    public final UserService userService;


    public DataLoader() {
        userService = new UserServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading data...");

        // Create root user
        User root = new User();
        root.setId(1L);
        root.setCpf("00000000000");
        root.setName("root");
        root.setPhone("00000000000");
        root.setEmail("root@mrxavier.com");
        root.setUser("root");
        root.setPassword("root");
        User savedUser = userService.save(root);

        System.out.println("Loaded users: " + userService.findAll());

        System.out.println("Loaded root user...");

    }
}
