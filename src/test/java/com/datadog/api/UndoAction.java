package com.datadog.api;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class UndoAction {
  private static UndoAction instance = null;

  private Map<String, Map<String, Undo>> actions;

  private UndoAction() {
    actions = new HashMap<String, Map<String, Undo>>();
    actions.put("v1", loadUndo("v1"));
    actions.put("v2", loadUndo("v2"));
  }

  private static Map<String, Undo> loadUndo(String apiVersion) {
    try {
      File file =
          new File("src/test/resources/com/datadog/api/client/" + apiVersion + "/api/undo.json");
      return Undo.loadRequestsUndo(file);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static UndoAction UndoAction() {
    if (instance == null) {
      instance = new UndoAction();
    }
    return instance;
  }

  public Undo getUndo(String apiVersion, String action) {
    Undo undoSettings = actions.get(apiVersion).get(action);
    if (!undoSettings.undo.type.equals("unsafe")) {
      return null;
    }
    return undoSettings;
  }
}
