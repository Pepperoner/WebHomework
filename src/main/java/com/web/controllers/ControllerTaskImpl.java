package com.web.controllers;

import com.web.dao.TaskDAO;
import com.web.dao.TaskDaoImpl;
import com.web.entities.Goal;

import java.util.List;

public class ControllerTaskImpl implements Controller {

    private TaskDAO dao = new TaskDaoImpl();

    @Override
    public void add(String task) {
        Goal goal = new Goal();
        goal.setTaskText(task);
        dao.add(goal);
    }

    @Override
    public Goal read(int id) {
        return dao.read(id);
    }

    @Override
    public void delete(Goal goal) {
        dao.delete(goal);
    }

    @Override
    public void update(Goal goal) {
        dao.update(goal);
    }

    @Override
    public List<Goal> readAll() {
        return dao.readAll();
    }
}
