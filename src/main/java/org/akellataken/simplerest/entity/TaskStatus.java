package org.akellataken.simplerest.entity;

public enum TaskStatus {
  PULL("pull"),
  READY_FOR_REVIEW("ready"),
  CHANGES_REQUESTED("changes"),
  DONE("done"),
  NONE("none");

  private final String status;

  TaskStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
}
