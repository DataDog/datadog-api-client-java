/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Error code that can be returned by a Synthetic test. */
@JsonSerialize(
    using = SyntheticsBrowserTestFailureCode.SyntheticsBrowserTestFailureCodeSerializer.class)
public class SyntheticsBrowserTestFailureCode {

  public static final SyntheticsBrowserTestFailureCode API_REQUEST_FAILURE =
      new SyntheticsBrowserTestFailureCode("API_REQUEST_FAILURE");
  public static final SyntheticsBrowserTestFailureCode ASSERTION_FAILURE =
      new SyntheticsBrowserTestFailureCode("ASSERTION_FAILURE");
  public static final SyntheticsBrowserTestFailureCode DOWNLOAD_FILE_TOO_LARGE =
      new SyntheticsBrowserTestFailureCode("DOWNLOAD_FILE_TOO_LARGE");
  public static final SyntheticsBrowserTestFailureCode ELEMENT_NOT_INTERACTABLE =
      new SyntheticsBrowserTestFailureCode("ELEMENT_NOT_INTERACTABLE");
  public static final SyntheticsBrowserTestFailureCode EMAIL_VARIABLE_NOT_DEFINED =
      new SyntheticsBrowserTestFailureCode("EMAIL_VARIABLE_NOT_DEFINED");
  public static final SyntheticsBrowserTestFailureCode EVALUATE_JAVASCRIPT =
      new SyntheticsBrowserTestFailureCode("EVALUATE_JAVASCRIPT");
  public static final SyntheticsBrowserTestFailureCode EVALUATE_JAVASCRIPT_CONTEXT =
      new SyntheticsBrowserTestFailureCode("EVALUATE_JAVASCRIPT_CONTEXT");
  public static final SyntheticsBrowserTestFailureCode EXTRACT_VARIABLE =
      new SyntheticsBrowserTestFailureCode("EXTRACT_VARIABLE");
  public static final SyntheticsBrowserTestFailureCode FORBIDDEN_URL =
      new SyntheticsBrowserTestFailureCode("FORBIDDEN_URL");
  public static final SyntheticsBrowserTestFailureCode FRAME_DETACHED =
      new SyntheticsBrowserTestFailureCode("FRAME_DETACHED");
  public static final SyntheticsBrowserTestFailureCode INCONSISTENCIES =
      new SyntheticsBrowserTestFailureCode("INCONSISTENCIES");
  public static final SyntheticsBrowserTestFailureCode INTERNAL_ERROR =
      new SyntheticsBrowserTestFailureCode("INTERNAL_ERROR");
  public static final SyntheticsBrowserTestFailureCode INVALID_TYPE_TEXT_DELAY =
      new SyntheticsBrowserTestFailureCode("INVALID_TYPE_TEXT_DELAY");
  public static final SyntheticsBrowserTestFailureCode INVALID_URL =
      new SyntheticsBrowserTestFailureCode("INVALID_URL");
  public static final SyntheticsBrowserTestFailureCode INVALID_VARIABLE_PATTERN =
      new SyntheticsBrowserTestFailureCode("INVALID_VARIABLE_PATTERN");
  public static final SyntheticsBrowserTestFailureCode INVISIBLE_ELEMENT =
      new SyntheticsBrowserTestFailureCode("INVISIBLE_ELEMENT");
  public static final SyntheticsBrowserTestFailureCode LOCATE_ELEMENT =
      new SyntheticsBrowserTestFailureCode("LOCATE_ELEMENT");
  public static final SyntheticsBrowserTestFailureCode NAVIGATE_TO_LINK =
      new SyntheticsBrowserTestFailureCode("NAVIGATE_TO_LINK");
  public static final SyntheticsBrowserTestFailureCode OPEN_URL =
      new SyntheticsBrowserTestFailureCode("OPEN_URL");
  public static final SyntheticsBrowserTestFailureCode PRESS_KEY =
      new SyntheticsBrowserTestFailureCode("PRESS_KEY");
  public static final SyntheticsBrowserTestFailureCode SERVER_CERTIFICATE =
      new SyntheticsBrowserTestFailureCode("SERVER_CERTIFICATE");
  public static final SyntheticsBrowserTestFailureCode SELECT_OPTION =
      new SyntheticsBrowserTestFailureCode("SELECT_OPTION");
  public static final SyntheticsBrowserTestFailureCode STEP_TIMEOUT =
      new SyntheticsBrowserTestFailureCode("STEP_TIMEOUT");
  public static final SyntheticsBrowserTestFailureCode SUB_TEST_NOT_PASSED =
      new SyntheticsBrowserTestFailureCode("SUB_TEST_NOT_PASSED");
  public static final SyntheticsBrowserTestFailureCode TEST_TIMEOUT =
      new SyntheticsBrowserTestFailureCode("TEST_TIMEOUT");
  public static final SyntheticsBrowserTestFailureCode TOO_MANY_HTTP_REQUESTS =
      new SyntheticsBrowserTestFailureCode("TOO_MANY_HTTP_REQUESTS");
  public static final SyntheticsBrowserTestFailureCode UNAVAILABLE_BROWSER =
      new SyntheticsBrowserTestFailureCode("UNAVAILABLE_BROWSER");
  public static final SyntheticsBrowserTestFailureCode UNKNOWN =
      new SyntheticsBrowserTestFailureCode("UNKNOWN");
  public static final SyntheticsBrowserTestFailureCode UNSUPPORTED_AUTH_SCHEMA =
      new SyntheticsBrowserTestFailureCode("UNSUPPORTED_AUTH_SCHEMA");
  public static final SyntheticsBrowserTestFailureCode UPLOAD_FILES_ELEMENT_TYPE =
      new SyntheticsBrowserTestFailureCode("UPLOAD_FILES_ELEMENT_TYPE");
  public static final SyntheticsBrowserTestFailureCode UPLOAD_FILES_DIALOG =
      new SyntheticsBrowserTestFailureCode("UPLOAD_FILES_DIALOG");
  public static final SyntheticsBrowserTestFailureCode UPLOAD_FILES_DYNAMIC_ELEMENT =
      new SyntheticsBrowserTestFailureCode("UPLOAD_FILES_DYNAMIC_ELEMENT");
  public static final SyntheticsBrowserTestFailureCode UPLOAD_FILES_NAME =
      new SyntheticsBrowserTestFailureCode("UPLOAD_FILES_NAME");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "API_REQUEST_FAILURE",
              "ASSERTION_FAILURE",
              "DOWNLOAD_FILE_TOO_LARGE",
              "ELEMENT_NOT_INTERACTABLE",
              "EMAIL_VARIABLE_NOT_DEFINED",
              "EVALUATE_JAVASCRIPT",
              "EVALUATE_JAVASCRIPT_CONTEXT",
              "EXTRACT_VARIABLE",
              "FORBIDDEN_URL",
              "FRAME_DETACHED",
              "INCONSISTENCIES",
              "INTERNAL_ERROR",
              "INVALID_TYPE_TEXT_DELAY",
              "INVALID_URL",
              "INVALID_VARIABLE_PATTERN",
              "INVISIBLE_ELEMENT",
              "LOCATE_ELEMENT",
              "NAVIGATE_TO_LINK",
              "OPEN_URL",
              "PRESS_KEY",
              "SERVER_CERTIFICATE",
              "SELECT_OPTION",
              "STEP_TIMEOUT",
              "SUB_TEST_NOT_PASSED",
              "TEST_TIMEOUT",
              "TOO_MANY_HTTP_REQUESTS",
              "UNAVAILABLE_BROWSER",
              "UNKNOWN",
              "UNSUPPORTED_AUTH_SCHEMA",
              "UPLOAD_FILES_ELEMENT_TYPE",
              "UPLOAD_FILES_DIALOG",
              "UPLOAD_FILES_DYNAMIC_ELEMENT",
              "UPLOAD_FILES_NAME"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsBrowserTestFailureCode(String value) {
    this.value = value;
  }

  public static class SyntheticsBrowserTestFailureCodeSerializer
      extends StdSerializer<SyntheticsBrowserTestFailureCode> {
    public SyntheticsBrowserTestFailureCodeSerializer(Class<SyntheticsBrowserTestFailureCode> t) {
      super(t);
    }

    public SyntheticsBrowserTestFailureCodeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBrowserTestFailureCode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SyntheticsBrowserTestFailureCode object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsBrowserTestFailureCode) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntheticsBrowserTestFailureCode fromValue(String value) {
    return new SyntheticsBrowserTestFailureCode(value);
  }
}
