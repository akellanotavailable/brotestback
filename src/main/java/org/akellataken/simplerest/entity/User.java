package org.akellataken.simplerest.entity;

import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {

  private final String loginGithub;
  private final String loginSlack;
  private final List<UserTaskStatus> taskStatuses;

}
