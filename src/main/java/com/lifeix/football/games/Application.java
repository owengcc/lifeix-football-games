package com.lifeix.football.games;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lifeix.football.common.ApplicationUtil;

/**
 * games system
 * 
 * @author gcc
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationUtil.run(Application.class, args);
    }

}
