/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Predefined library mappings for common log formats.</p>
 */
@JsonSerialize(using = ObservabilityPipelineOcsfMappingLibrary.ObservabilityPipelineOcsfMappingLibrarySerializer.class)
public class ObservabilityPipelineOcsfMappingLibrary extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("CloudTrail Account Change", "GCP Cloud Audit CreateBucket", "GCP Cloud Audit CreateSink", "GCP Cloud Audit SetIamPolicy", "GCP Cloud Audit UpdateSink", "Github Audit Log API Activity", "Google Workspace Admin Audit addPrivilege", "Microsoft 365 Defender Incident", "Microsoft 365 Defender UserLoggedIn", "Okta System Log Authentication", "Palo Alto Networks Firewall Traffic"));

  public static final ObservabilityPipelineOcsfMappingLibrary CLOUDTRAIL_ACCOUNT_CHANGE = new ObservabilityPipelineOcsfMappingLibrary("CloudTrail Account Change");
  public static final ObservabilityPipelineOcsfMappingLibrary GCP_CLOUD_AUDIT_CREATEBUCKET = new ObservabilityPipelineOcsfMappingLibrary("GCP Cloud Audit CreateBucket");
  public static final ObservabilityPipelineOcsfMappingLibrary GCP_CLOUD_AUDIT_CREATESINK = new ObservabilityPipelineOcsfMappingLibrary("GCP Cloud Audit CreateSink");
  public static final ObservabilityPipelineOcsfMappingLibrary GCP_CLOUD_AUDIT_SETIAMPOLICY = new ObservabilityPipelineOcsfMappingLibrary("GCP Cloud Audit SetIamPolicy");
  public static final ObservabilityPipelineOcsfMappingLibrary GCP_CLOUD_AUDIT_UPDATESINK = new ObservabilityPipelineOcsfMappingLibrary("GCP Cloud Audit UpdateSink");
  public static final ObservabilityPipelineOcsfMappingLibrary GITHUB_AUDIT_LOG_API_ACTIVITY = new ObservabilityPipelineOcsfMappingLibrary("Github Audit Log API Activity");
  public static final ObservabilityPipelineOcsfMappingLibrary GOOGLE_WORKSPACE_ADMIN_AUDIT_ADDPRIVILEGE = new ObservabilityPipelineOcsfMappingLibrary("Google Workspace Admin Audit addPrivilege");
  public static final ObservabilityPipelineOcsfMappingLibrary MICROSOFT_365_DEFENDER_INCIDENT = new ObservabilityPipelineOcsfMappingLibrary("Microsoft 365 Defender Incident");
  public static final ObservabilityPipelineOcsfMappingLibrary MICROSOFT_365_DEFENDER_USERLOGGEDIN = new ObservabilityPipelineOcsfMappingLibrary("Microsoft 365 Defender UserLoggedIn");
  public static final ObservabilityPipelineOcsfMappingLibrary OKTA_SYSTEM_LOG_AUTHENTICATION = new ObservabilityPipelineOcsfMappingLibrary("Okta System Log Authentication");
  public static final ObservabilityPipelineOcsfMappingLibrary PALO_ALTO_NETWORKS_FIREWALL_TRAFFIC = new ObservabilityPipelineOcsfMappingLibrary("Palo Alto Networks Firewall Traffic");


  ObservabilityPipelineOcsfMappingLibrary(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineOcsfMappingLibrarySerializer extends StdSerializer<ObservabilityPipelineOcsfMappingLibrary> {
      public ObservabilityPipelineOcsfMappingLibrarySerializer(Class<ObservabilityPipelineOcsfMappingLibrary> t) {
          super(t);
      }

      public ObservabilityPipelineOcsfMappingLibrarySerializer() {
          this(null);
      }

      @Override
      public void serialize(ObservabilityPipelineOcsfMappingLibrary value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static ObservabilityPipelineOcsfMappingLibrary fromValue(String value) {
    return new ObservabilityPipelineOcsfMappingLibrary(value);
  }
}
