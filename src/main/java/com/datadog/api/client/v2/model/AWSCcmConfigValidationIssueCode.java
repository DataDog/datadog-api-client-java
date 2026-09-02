/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Identifies the specific reason a Cost and Usage Report (CUR) 2.0 configuration failed validation.
 */
@JsonSerialize(
    using = AWSCcmConfigValidationIssueCode.AWSCcmConfigValidationIssueCodeSerializer.class)
public class AWSCcmConfigValidationIssueCode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "ISSUE_CODE_UNSPECIFIED",
              "CREDENTIAL_ERROR",
              "BUCKET_NAME_INVALID_GOVCLOUD",
              "S3_LIST_PERMISSION_MISSING",
              "S3_GET_PERMISSION_MISSING",
              "S3_BUCKET_REGION_MISMATCH",
              "S3_BUCKET_NOT_ACCESSIBLE",
              "EXPORT_LIST_PERMISSION_MISSING",
              "EXPORT_GET_PERMISSION_MISSING",
              "EXPORT_NOT_FOUND",
              "EXPORT_STATUS_UNHEALTHY",
              "TIME_GRANULARITY_INVALID",
              "FILE_FORMAT_INVALID",
              "INCLUDE_RESOURCES_DISABLED",
              "REFRESH_CADENCE_INVALID",
              "OVERWRITE_MODE_INVALID",
              "QUERY_STATEMENT_INVALID"));

  public static final AWSCcmConfigValidationIssueCode ISSUE_CODE_UNSPECIFIED =
      new AWSCcmConfigValidationIssueCode("ISSUE_CODE_UNSPECIFIED");
  public static final AWSCcmConfigValidationIssueCode CREDENTIAL_ERROR =
      new AWSCcmConfigValidationIssueCode("CREDENTIAL_ERROR");
  public static final AWSCcmConfigValidationIssueCode BUCKET_NAME_INVALID_GOVCLOUD =
      new AWSCcmConfigValidationIssueCode("BUCKET_NAME_INVALID_GOVCLOUD");
  public static final AWSCcmConfigValidationIssueCode S3_LIST_PERMISSION_MISSING =
      new AWSCcmConfigValidationIssueCode("S3_LIST_PERMISSION_MISSING");
  public static final AWSCcmConfigValidationIssueCode S3_GET_PERMISSION_MISSING =
      new AWSCcmConfigValidationIssueCode("S3_GET_PERMISSION_MISSING");
  public static final AWSCcmConfigValidationIssueCode S3_BUCKET_REGION_MISMATCH =
      new AWSCcmConfigValidationIssueCode("S3_BUCKET_REGION_MISMATCH");
  public static final AWSCcmConfigValidationIssueCode S3_BUCKET_NOT_ACCESSIBLE =
      new AWSCcmConfigValidationIssueCode("S3_BUCKET_NOT_ACCESSIBLE");
  public static final AWSCcmConfigValidationIssueCode EXPORT_LIST_PERMISSION_MISSING =
      new AWSCcmConfigValidationIssueCode("EXPORT_LIST_PERMISSION_MISSING");
  public static final AWSCcmConfigValidationIssueCode EXPORT_GET_PERMISSION_MISSING =
      new AWSCcmConfigValidationIssueCode("EXPORT_GET_PERMISSION_MISSING");
  public static final AWSCcmConfigValidationIssueCode EXPORT_NOT_FOUND =
      new AWSCcmConfigValidationIssueCode("EXPORT_NOT_FOUND");
  public static final AWSCcmConfigValidationIssueCode EXPORT_STATUS_UNHEALTHY =
      new AWSCcmConfigValidationIssueCode("EXPORT_STATUS_UNHEALTHY");
  public static final AWSCcmConfigValidationIssueCode TIME_GRANULARITY_INVALID =
      new AWSCcmConfigValidationIssueCode("TIME_GRANULARITY_INVALID");
  public static final AWSCcmConfigValidationIssueCode FILE_FORMAT_INVALID =
      new AWSCcmConfigValidationIssueCode("FILE_FORMAT_INVALID");
  public static final AWSCcmConfigValidationIssueCode INCLUDE_RESOURCES_DISABLED =
      new AWSCcmConfigValidationIssueCode("INCLUDE_RESOURCES_DISABLED");
  public static final AWSCcmConfigValidationIssueCode REFRESH_CADENCE_INVALID =
      new AWSCcmConfigValidationIssueCode("REFRESH_CADENCE_INVALID");
  public static final AWSCcmConfigValidationIssueCode OVERWRITE_MODE_INVALID =
      new AWSCcmConfigValidationIssueCode("OVERWRITE_MODE_INVALID");
  public static final AWSCcmConfigValidationIssueCode QUERY_STATEMENT_INVALID =
      new AWSCcmConfigValidationIssueCode("QUERY_STATEMENT_INVALID");

  AWSCcmConfigValidationIssueCode(String value) {
    super(value, allowedValues);
  }

  public static class AWSCcmConfigValidationIssueCodeSerializer
      extends StdSerializer<AWSCcmConfigValidationIssueCode> {
    public AWSCcmConfigValidationIssueCodeSerializer(Class<AWSCcmConfigValidationIssueCode> t) {
      super(t);
    }

    public AWSCcmConfigValidationIssueCodeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AWSCcmConfigValidationIssueCode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AWSCcmConfigValidationIssueCode fromValue(String value) {
    return new AWSCcmConfigValidationIssueCode(value);
  }
}
