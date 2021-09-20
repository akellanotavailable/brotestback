package org.akellataken.simplerest.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserTaskStatus {

  private final Integer taskId;
  private final TaskStatus status;

}
