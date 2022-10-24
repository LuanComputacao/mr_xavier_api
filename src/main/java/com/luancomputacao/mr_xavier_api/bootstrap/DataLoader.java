package com.luancomputacao.mr_xavier_api.bootstrap;

import com.luancomputacao.mr_xavier_api.models.User;
import com.luancomputacao.mr_xavier_api.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    public final UserService userService;


    public DataLoader(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

        int userCount = userService.findAll().size();

        if (userCount == 0) {
            loadStartingData();
        }
    }

    private void loadStartingData() {
        System.out.println("Loading data...");

        // Create root user
        User root = new User();
        root.setCpf("00000000000");
        root.setName("root");
        root.setPhone("00000000000");
        root.setEmail("root@mrxavier.com");
        root.setUser("root");
        root.setPassword("root");
        User savedRoot = userService.save(root);

        User admin = new User();
        admin.setCpf("00000000000");
        admin.setName("admin");
        admin.setPhone("00000000000");
        admin.setEmail("admin@mrxavier.com");
        admin.setUser("admin");
        admin.setPassword("admin");

        User savedAdmin = userService.save(admin);

        System.out.println("Loaded users: " + userService.findAll());

        System.out.println("Loaded root user...");
    }
}
