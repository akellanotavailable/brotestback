package org.akellataken.simplerest.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Task {

  private final Integer id;
  private final String name;

}
