package com.datadog.api;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GivenAction {
  private static GivenAction instance = null;

  public Map<String, List<Given>> steps;

  private GivenAction() {
    steps = new HashMap<>();
    steps.put("v1", loadGiven("v1"));
    steps.put("v2", loadGiven("v2"));
  }

  private static List<Given> loadGiven(String apiVersion) {
    try {
      File file =
          new File("src/test/resources/com/datadog/api/client/" + apiVersion + "/api/given.json");
      return Given.load(file);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static GivenAction GivenAction() {
    if (instance == null) {
      instance = new GivenAction();
    }
    return instance;
  }
}
