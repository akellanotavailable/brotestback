package org.akellataken.simplerest.controller;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class TasksController {
  List<Map<Object, Object>> taskList = List.of(
      Map.of("id", 1, "name", "checkstyle"),
      Map.of("id", 2, "name", "primitives"),
      Map.of("id", 3, "name", "boxing"),
      Map.of("id", 4, "name", "valueref"),
      Map.of("id", 5, "name", "equals/hashcode"),
      Map.of("id", 6, "name", "patform"),
      Map.of("id", 7, "name", "bytecode"),
      Map.of("id", 8, "name", "gc"),
      Map.of("id", 9, "name", "exceptions"),
      Map.of("id", 10, "name", "classpath"),
      Map.of("id", 11, "name", "inner/classes"),
      Map.of("id", 12, "name", "inner/classes"),
      Map.of("id", 13, "name", "override/overload"),
      Map.of("id", 14, "name", "strings"),
      Map.of("id", 15, "name", "gamelife")
  );

  @GetMapping
  public List<Map<Object, Object>> list(){
    return taskList;
  }
}
