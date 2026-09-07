/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client;

import java.util.HashSet;

/** Representing a Server Variable for server URL template substitution. */
public class ServerVariable {
  public String description;
  public String defaultValue;
  public HashSet<String> enumValues = null;

  /**
   * @param description A description for the server variable.
   * @param defaultValue The default value to use for substitution.
   * @param enumValues An enumeration of string values to be used if the substitution options are
   *     from a limited set.
   */
  public ServerVariable(String description, String defaultValue, HashSet<String> enumValues) {
    this.description = description;
    this.defaultValue = defaultValue;
    this.enumValues = enumValues;
  }
}