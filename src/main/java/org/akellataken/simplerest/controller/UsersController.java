package org.akellataken.simplerest.controller;

import java.util.List;
import org.akellataken.simplerest.entity.TaskStatus;
import org.akellataken.simplerest.entity.User;
import org.akellataken.simplerest.entity.UserTaskStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UsersController {

  List<User> users = List.of(
      new User("akella", "", List.of(
          new UserTaskStatus(1, TaskStatus.DONE),
          new UserTaskStatus(2, TaskStatus.DONE),
          new UserTaskStatus(3, TaskStatus.DONE),
          new UserTaskStatus(4, TaskStatus.DONE),
          new UserTaskStatus(5, TaskStatus.DONE),
          new UserTaskStatus(6, TaskStatus.DONE),
          new UserTaskStatus(7, TaskStatus.READY_FOR_REVIEW),
          new UserTaskStatus(8, TaskStatus.READY_FOR_REVIEW),
          new UserTaskStatus(9, TaskStatus.READY_FOR_REVIEW),
          new UserTaskStatus(10, TaskStatus.READY_FOR_REVIEW),
          new UserTaskStatus(11, TaskStatus.CHANGES_REQUESTED),
          new UserTaskStatus(12, TaskStatus.CHANGES_REQUESTED),
          new UserTaskStatus(13, TaskStatus.CHANGES_REQUESTED),
          new UserTaskStatus(14, TaskStatus.PULL),
          new UserTaskStatus(15, TaskStatus.NONE)
      )),
      new User("loshped", "", List.of(
          new UserTaskStatus(1, TaskStatus.DONE),
          new UserTaskStatus(2, TaskStatus.DONE),
          new UserTaskStatus(3, TaskStatus.DONE),
          new UserTaskStatus(4, TaskStatus.READY_FOR_REVIEW),
          new UserTaskStatus(5, TaskStatus.READY_FOR_REVIEW),
          new UserTaskStatus(6, TaskStatus.READY_FOR_REVIEW),
          new UserTaskStatus(7, TaskStatus.READY_FOR_REVIEW),
          new UserTaskStatus(8, TaskStatus.READY_FOR_REVIEW),
          new UserTaskStatus(9, TaskStatus.CHANGES_REQUESTED),
          new UserTaskStatus(10, TaskStatus.CHANGES_REQUESTED),
          new UserTaskStatus(11, TaskStatus.CHANGES_REQUESTED),
          new UserTaskStatus(12, TaskStatus.PULL),
          new UserTaskStatus(13, TaskStatus.PULL),
          new UserTaskStatus(14, TaskStatus.NONE),
          new UserTaskStatus(15, TaskStatus.NONE)
      ))
  );

  @GetMapping
  public List<User> list() {
    return users;
  }

}
