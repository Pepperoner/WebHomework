package com.web.dao;

import com.web.entities.Goal;

import java.util.List;

public interface TaskDAO {

    void add(Goal goal);

    Goal read(int id);

    void delete(Goal goal);

    void update(Goal goal);

    List<Goal> readAll();
}
