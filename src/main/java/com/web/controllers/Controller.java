package com.web.controllers;

import com.web.entities.Goal;

import java.util.List;

public interface Controller {

    void add(String task);

    Goal read(int id);

    void delete(Goal goal);

    void update(Goal goal);

    List<Goal> readAll();

}
