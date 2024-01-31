package com.sociale.module.userinfo.controller.impl;

import com.sociale.module.userinfo.controller.ApplicationUserController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ApplicationUserControllerImpl implements ApplicationUserController {

    @GetMapping("/private/test-public")
    public String testPublic() {
        return "Test";
    }

    @GetMapping("/private/test-private")
    public String testPrivate() {
        return "Test";
    }

    // http://localhost:8080/gateway/sociale-user-info/athele/private/test
}
