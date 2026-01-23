/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client;

import com.datadog.api.client.auth.ApiKeyAuth;
import com.datadog.api.client.auth.Authentication;
import com.datadog.api.client.auth.HttpBasicAuth;
import com.datadog.api.client.auth.HttpBearerAuth;
import com.datadog.api.client.auth.OAuth;
import jakarta.ws.rs.client.AsyncInvoker;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.InvocationCallback;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.Variant;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.glassfish.jersey.client.filter.EncodingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.media.multipart.Boundary;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.message.DeflateEncoder;
import org.glassfish.jersey.message.GZipEncoder;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApiClient {
  protected Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  protected Map<String, String> defaultCookieMap = new HashMap<String, String>();
  protected String basePath = "https://api.datadoghq.com";
  protected String userAgent;
  private DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

  protected List<ServerConfiguration> servers =
      new ArrayList<ServerConfiguration>(
          Arrays.asList(
              new ServerConfiguration(
                  "https://{subdomain}.{site}",
                  "No description provided",
                  new HashMap<String, ServerVariable>() {
                    {
                      put(
                          "site",
                          new ServerVariable(
                              "The regional site for Datadog customers.",
                              "datadoghq.com",
                              new HashSet<String>(
                                  Arrays.asList(
                                      "datadoghq.com",
                                      "us3.datadoghq.com",
                                      "us5.datadoghq.com",
                                      "ap1.datadoghq.com",
                                      "ap2.datadoghq.com",
                                      "datadoghq.eu",
                                      "ddog-gov.com"))));
                      put(
                          "subdomain",
                          new ServerVariable(
                              "The subdomain where the API is deployed.",
                              "api",
                              new HashSet<String>()));
                    }
                  }),
              new ServerConfiguration(
                  "{protocol}://{name}",
                  "No description provided",
                  new HashMap<String, ServerVariable>() {
                    {
                      put(
                          "name",
                          new ServerVariable(
                              "Full site DNS name.", "api.datadoghq.com", new HashSet<String>()));
                      put(
                          "protocol",
                          new ServerVariable(
                              "The protocol for accessing the API.",
                              "https",
                              new HashSet<String>()));
                    }
                  }),
              new ServerConfiguration(
                  "https://{subdomain}.{site}",
                  "No description provided",
                  new HashMap<String, ServerVariable>() {
                    {
                      put(
                          "site",
                          new ServerVariable(
                              "Any Datadog deployment.", "datadoghq.com", new HashSet<String>()));
                      put(
                          "subdomain",
                          new ServerVariable(
                              "The subdomain where the API is deployed.",
                              "api",
                              new HashSet<String>()));
                    }
                  })));
  protected Integer serverIndex = 0;
  protected Map<String, String> serverVariables = null;
  protected Map<String, List<ServerConfiguration>> operationServers =
      new HashMap<String, List<ServerConfiguration>>() {
        {
          put(
              "v1.IpRangesApi.getIPRanges",
              new ArrayList<ServerConfiguration>(
                  Arrays.asList(
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "The regional site for Datadog customers.",
                                      "datadoghq.com",
                                      new HashSet<String>(
                                          Arrays.asList(
                                              "datadoghq.com",
                                              "us3.datadoghq.com",
                                              "us5.datadoghq.com",
                                              "ap1.datadoghq.com",
                                              "ap2.datadoghq.com",
                                              "datadoghq.eu",
                                              "ddog-gov.com"))));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "ip-ranges",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "{protocol}://{name}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "name",
                                  new ServerVariable(
                                      "Full site DNS name.",
                                      "ip-ranges.datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "protocol",
                                  new ServerVariable(
                                      "The protocol for accessing the API.",
                                      "https",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "https://{subdomain}.datadoghq.com",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "ip-ranges",
                                      new HashSet<String>()));
                            }
                          }))));
          put(
              "v1.LogsApi.submitLog",
              new ArrayList<ServerConfiguration>(
                  Arrays.asList(
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "The regional site for Datadog customers.",
                                      "datadoghq.com",
                                      new HashSet<String>(
                                          Arrays.asList(
                                              "datadoghq.com",
                                              "us3.datadoghq.com",
                                              "us5.datadoghq.com",
                                              "ap1.datadoghq.com",
                                              "ap2.datadoghq.com",
                                              "datadoghq.eu",
                                              "ddog-gov.com"))));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "http-intake.logs",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "{protocol}://{name}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "name",
                                  new ServerVariable(
                                      "Full site DNS name.",
                                      "http-intake.logs.datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "protocol",
                                  new ServerVariable(
                                      "The protocol for accessing the API.",
                                      "https",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "Any Datadog deployment.",
                                      "datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "http-intake.logs",
                                      new HashSet<String>()));
                            }
                          }))));
          put(
              "v2.EventsApi.createEvent",
              new ArrayList<ServerConfiguration>(
                  Arrays.asList(
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "The regional site for customers.",
                                      "datadoghq.com",
                                      new HashSet<String>(
                                          Arrays.asList(
                                              "datadoghq.com",
                                              "us3.datadoghq.com",
                                              "us5.datadoghq.com",
                                              "ap1.datadoghq.com",
                                              "ap2.datadoghq.com",
                                              "datadoghq.eu",
                                              "ddog-gov.com"))));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "event-management-intake",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "{protocol}://{name}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "name",
                                  new ServerVariable(
                                      "Full site DNS name.",
                                      "event-management-intake.datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "protocol",
                                  new ServerVariable(
                                      "The protocol for accessing the API.",
                                      "https",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "Any Datadog deployment.",
                                      "datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "event-management-intake",
                                      new HashSet<String>()));
                            }
                          }))));
          put(
              "v2.LogsApi.submitLog",
              new ArrayList<ServerConfiguration>(
                  Arrays.asList(
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "The regional site for customers.",
                                      "datadoghq.com",
                                      new HashSet<String>(
                                          Arrays.asList(
                                              "datadoghq.com",
                                              "us3.datadoghq.com",
                                              "us5.datadoghq.com",
                                              "ap1.datadoghq.com",
                                              "ap2.datadoghq.com",
                                              "datadoghq.eu",
                                              "ddog-gov.com"))));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "http-intake.logs",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "{protocol}://{name}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "name",
                                  new ServerVariable(
                                      "Full site DNS name.",
                                      "http-intake.logs.datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "protocol",
                                  new ServerVariable(
                                      "The protocol for accessing the API.",
                                      "https",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "Any Datadog deployment.",
                                      "datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "http-intake.logs",
                                      new HashSet<String>()));
                            }
                          }))));
          put(
              "v2.OnCallPagingApi.createOnCallPage",
              new ArrayList<ServerConfiguration>(
                  Arrays.asList(
                      new ServerConfiguration(
                          "https://{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "The globally available endpoint for On-Call.",
                                      "navy.oncall.datadoghq.com",
                                      new HashSet<String>(
                                          Arrays.asList(
                                              "lava.oncall.datadoghq.com",
                                              "saffron.oncall.datadoghq.com",
                                              "navy.oncall.datadoghq.com",
                                              "coral.oncall.datadoghq.com",
                                              "teal.oncall.datadoghq.com",
                                              "beige.oncall.datadoghq.eu"))));
                            }
                          }),
                      new ServerConfiguration(
                          "{protocol}://{name}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "name",
                                  new ServerVariable(
                                      "Full site DNS name.",
                                      "api.datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "protocol",
                                  new ServerVariable(
                                      "The protocol for accessing the API.",
                                      "https",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "Any Datadog deployment.",
                                      "datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "api",
                                      new HashSet<String>()));
                            }
                          }))));
          put(
              "v2.OnCallPagingApi.acknowledgeOnCallPage",
              new ArrayList<ServerConfiguration>(
                  Arrays.asList(
                      new ServerConfiguration(
                          "https://{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "The globally available endpoint for On-Call.",
                                      "navy.oncall.datadoghq.com",
                                      new HashSet<String>(
                                          Arrays.asList(
                                              "lava.oncall.datadoghq.com",
                                              "saffron.oncall.datadoghq.com",
                                              "navy.oncall.datadoghq.com",
                                              "coral.oncall.datadoghq.com",
                                              "teal.oncall.datadoghq.com",
                                              "beige.oncall.datadoghq.eu"))));
                            }
                          }),
                      new ServerConfiguration(
                          "{protocol}://{name}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "name",
                                  new ServerVariable(
                                      "Full site DNS name.",
                                      "api.datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "protocol",
                                  new ServerVariable(
                                      "The protocol for accessing the API.",
                                      "https",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "Any Datadog deployment.",
                                      "datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "api",
                                      new HashSet<String>()));
                            }
                          }))));
          put(
              "v2.OnCallPagingApi.escalateOnCallPage",
              new ArrayList<ServerConfiguration>(
                  Arrays.asList(
                      new ServerConfiguration(
                          "https://{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "The globally available endpoint for On-Call.",
                                      "navy.oncall.datadoghq.com",
                                      new HashSet<String>(
                                          Arrays.asList(
                                              "lava.oncall.datadoghq.com",
                                              "saffron.oncall.datadoghq.com",
                                              "navy.oncall.datadoghq.com",
                                              "coral.oncall.datadoghq.com",
                                              "teal.oncall.datadoghq.com",
                                              "beige.oncall.datadoghq.eu"))));
                            }
                          }),
                      new ServerConfiguration(
                          "{protocol}://{name}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "name",
                                  new ServerVariable(
                                      "Full site DNS name.",
                                      "api.datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "protocol",
                                  new ServerVariable(
                                      "The protocol for accessing the API.",
                                      "https",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "Any Datadog deployment.",
                                      "datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "api",
                                      new HashSet<String>()));
                            }
                          }))));
          put(
              "v2.OnCallPagingApi.resolveOnCallPage",
              new ArrayList<ServerConfiguration>(
                  Arrays.asList(
                      new ServerConfiguration(
                          "https://{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "The globally available endpoint for On-Call.",
                                      "navy.oncall.datadoghq.com",
                                      new HashSet<String>(
                                          Arrays.asList(
                                              "lava.oncall.datadoghq.com",
                                              "saffron.oncall.datadoghq.com",
                                              "navy.oncall.datadoghq.com",
                                              "coral.oncall.datadoghq.com",
                                              "teal.oncall.datadoghq.com",
                                              "beige.oncall.datadoghq.eu"))));
                            }
                          }),
                      new ServerConfiguration(
                          "{protocol}://{name}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "name",
                                  new ServerVariable(
                                      "Full site DNS name.",
                                      "api.datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "protocol",
                                  new ServerVariable(
                                      "The protocol for accessing the API.",
                                      "https",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "Any Datadog deployment.",
                                      "datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "api",
                                      new HashSet<String>()));
                            }
                          }))));
          put(
              "v2.ProductAnalyticsApi.submitProductAnalyticsEvent",
              new ArrayList<ServerConfiguration>(
                  Arrays.asList(
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "The regional site for customers.",
                                      "datadoghq.com",
                                      new HashSet<String>(
                                          Arrays.asList(
                                              "datadoghq.com",
                                              "us3.datadoghq.com",
                                              "us5.datadoghq.com",
                                              "ap1.datadoghq.com",
                                              "ap2.datadoghq.com",
                                              "datadoghq.eu"))));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "browser-intake",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "{protocol}://{name}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "name",
                                  new ServerVariable(
                                      "Full site DNS name.",
                                      "browser-intake-datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "protocol",
                                  new ServerVariable(
                                      "The protocol for accessing the API.",
                                      "https",
                                      new HashSet<String>()));
                            }
                          }),
                      new ServerConfiguration(
                          "https://{subdomain}.{site}",
                          "No description provided",
                          new HashMap<String, ServerVariable>() {
                            {
                              put(
                                  "site",
                                  new ServerVariable(
                                      "Any Datadog deployment.",
                                      "datadoghq.com",
                                      new HashSet<String>()));
                              put(
                                  "subdomain",
                                  new ServerVariable(
                                      "The subdomain where the API is deployed.",
                                      "browser-intake",
                                      new HashSet<String>()));
                            }
                          }))));
        }
      };
  protected Map<String, Integer> operationServerIndex = new HashMap<String, Integer>();
  protected Map<String, Map<String, String>> operationServerVariables =
      new HashMap<String, Map<String, String>>();
  protected boolean debugging = false;
  protected RetryConfig retry = new RetryConfig(false, 2, 2, 3);
  protected boolean compress = true;
  protected ClientConfig clientConfig;
  protected int connectionTimeout = 0;
  private int readTimeout = 0;

  protected Client httpClient;
  protected JSON json;
  protected String tempFolderPath = null;

  protected Map<String, Authentication> authentications;

  protected DateFormat dateFormat;
  protected final Map<String, Boolean> unstableOperations =
      new HashMap<String, Boolean>() {
        {
          put("v2.cancelFleetDeployment", false);
          put("v2.createFleetDeploymentConfigure", false);
          put("v2.createFleetDeploymentUpgrade", false);
          put("v2.createFleetSchedule", false);
          put("v2.deleteFleetSchedule", false);
          put("v2.getFleetAgentInfo", false);
          put("v2.getFleetDeployment", false);
          put("v2.getFleetSchedule", false);
          put("v2.listFleetAgents", false);
          put("v2.listFleetAgentVersions", false);
          put("v2.listFleetDeployments", false);
          put("v2.listFleetSchedules", false);
          put("v2.triggerFleetSchedule", false);
          put("v2.updateFleetSchedule", false);
          put("v2.createOpenAPI", false);
          put("v2.deleteOpenAPI", false);
          put("v2.getOpenAPI", false);
          put("v2.listAPIs", false);
          put("v2.updateOpenAPI", false);
          put("v2.cancelThreatHuntingJob", false);
          put("v2.convertJobResultToSignal", false);
          put("v2.deleteThreatHuntingJob", false);
          put("v2.getFinding", false);
          put("v2.getRuleVersionHistory", false);
          put("v2.getSecretsRules", false);
          put("v2.getSecurityMonitoringHistsignal", false);
          put("v2.getSecurityMonitoringHistsignalsByJobId", false);
          put("v2.getThreatHuntingJob", false);
          put("v2.listFindings", false);
          put("v2.listMultipleRulesets", false);
          put("v2.listScannedAssetsMetadata", false);
          put("v2.listSecurityMonitoringHistsignals", false);
          put("v2.listThreatHuntingJobs", false);
          put("v2.listVulnerabilities", false);
          put("v2.listVulnerableAssets", false);
          put("v2.muteFindings", false);
          put("v2.runThreatHuntingJob", false);
          put("v2.searchSecurityMonitoringHistsignals", false);
          put("v2.createDataset", false);
          put("v2.deleteDataset", false);
          put("v2.getAllDatasets", false);
          put("v2.getDataset", false);
          put("v2.updateDataset", false);
          put("v2.cancelDataDeletionRequest", false);
          put("v2.createDataDeletionRequest", false);
          put("v2.getDataDeletionRequests", false);
          put("v2.createDeploymentGate", false);
          put("v2.createDeploymentRule", false);
          put("v2.deleteDeploymentGate", false);
          put("v2.deleteDeploymentRule", false);
          put("v2.getDeploymentGate", false);
          put("v2.getDeploymentGateRules", false);
          put("v2.getDeploymentRule", false);
          put("v2.updateDeploymentGate", false);
          put("v2.updateDeploymentRule", false);
          put("v2.createHamrOrgConnection", false);
          put("v2.getHamrOrgConnection", false);
          put("v2.createGlobalIncidentHandle", false);
          put("v2.createIncident", false);
          put("v2.createIncidentAttachment", false);
          put("v2.createIncidentIntegration", false);
          put("v2.createIncidentNotificationRule", false);
          put("v2.createIncidentNotificationTemplate", false);
          put("v2.createIncidentPostmortemAttachment", false);
          put("v2.createIncidentTodo", false);
          put("v2.createIncidentType", false);
          put("v2.deleteGlobalIncidentHandle", false);
          put("v2.deleteIncident", false);
          put("v2.deleteIncidentAttachment", false);
          put("v2.deleteIncidentIntegration", false);
          put("v2.deleteIncidentNotificationRule", false);
          put("v2.deleteIncidentNotificationTemplate", false);
          put("v2.deleteIncidentTodo", false);
          put("v2.deleteIncidentType", false);
          put("v2.getGlobalIncidentSettings", false);
          put("v2.getIncident", false);
          put("v2.getIncidentIntegration", false);
          put("v2.getIncidentNotificationRule", false);
          put("v2.getIncidentNotificationTemplate", false);
          put("v2.getIncidentTodo", false);
          put("v2.getIncidentType", false);
          put("v2.listGlobalIncidentHandles", false);
          put("v2.listIncidentAttachments", false);
          put("v2.listIncidentIntegrations", false);
          put("v2.listIncidentNotificationRules", false);
          put("v2.listIncidentNotificationTemplates", false);
          put("v2.listIncidents", false);
          put("v2.listIncidentTodos", false);
          put("v2.listIncidentTypes", false);
          put("v2.searchIncidents", false);
          put("v2.updateGlobalIncidentHandle", false);
          put("v2.updateGlobalIncidentSettings", false);
          put("v2.updateIncident", false);
          put("v2.updateIncidentAttachment", false);
          put("v2.updateIncidentIntegration", false);
          put("v2.updateIncidentNotificationRule", false);
          put("v2.updateIncidentNotificationTemplate", false);
          put("v2.updateIncidentTodo", false);
          put("v2.updateIncidentType", false);
          put("v2.createJiraIssueTemplate", false);
          put("v2.deleteJiraAccount", false);
          put("v2.deleteJiraIssueTemplate", false);
          put("v2.getJiraIssueTemplate", false);
          put("v2.listJiraAccounts", false);
          put("v2.listJiraIssueTemplates", false);
          put("v2.updateJiraIssueTemplate", false);
          put("v2.addRoleToRestrictionQuery", false);
          put("v2.createRestrictionQuery", false);
          put("v2.deleteRestrictionQuery", false);
          put("v2.getRestrictionQuery", false);
          put("v2.getRoleRestrictionQuery", false);
          put("v2.listRestrictionQueries", false);
          put("v2.listRestrictionQueryRoles", false);
          put("v2.listUserRestrictionQueries", false);
          put("v2.removeRoleFromRestrictionQuery", false);
          put("v2.replaceRestrictionQuery", false);
          put("v2.updateRestrictionQuery", false);
          put("v2.createMonitorUserTemplate", false);
          put("v2.deleteMonitorUserTemplate", false);
          put("v2.getMonitorUserTemplate", false);
          put("v2.listMonitorUserTemplates", false);
          put("v2.updateMonitorUserTemplate", false);
          put("v2.validateExistingMonitorUserTemplate", false);
          put("v2.validateMonitorUserTemplate", false);
          put("v2.createPipeline", false);
          put("v2.deletePipeline", false);
          put("v2.getPipeline", false);
          put("v2.listPipelines", false);
          put("v2.updatePipeline", false);
          put("v2.validatePipeline", false);
          put("v2.listRoleTemplates", false);
          put("v2.createConnection", false);
          put("v2.deleteConnection", false);
          put("v2.getAccountFacetInfo", false);
          put("v2.getMapping", false);
          put("v2.getUserFacetInfo", false);
          put("v2.listConnections", false);
          put("v2.queryAccounts", false);
          put("v2.queryEventFilteredUsers", false);
          put("v2.queryUsers", false);
          put("v2.updateConnection", false);
          put("v2.createScorecardOutcomesBatch", false);
          put("v2.createScorecardRule", false);
          put("v2.deleteScorecardRule", false);
          put("v2.listScorecardOutcomes", false);
          put("v2.listScorecardRules", false);
          put("v2.updateScorecardOutcomesAsync", false);
          put("v2.updateScorecardRule", false);
          put("v2.listEntityRiskScores", false);
          put("v2.createIncidentService", false);
          put("v2.deleteIncidentService", false);
          put("v2.getIncidentService", false);
          put("v2.listIncidentServices", false);
          put("v2.updateIncidentService", false);
          put("v2.createSLOReportJob", false);
          put("v2.getSLOReport", false);
          put("v2.getSLOReportJobStatus", false);
          put("v2.getSPARecommendations", false);
          put("v2.getSPARecommendationsWithShard", false);
          put("v2.createCustomRule", false);
          put("v2.createCustomRuleRevision", false);
          put("v2.createSCAResolveVulnerableSymbols", false);
          put("v2.createSCAResult", false);
          put("v2.deleteCustomRule", false);
          put("v2.deleteCustomRuleset", false);
          put("v2.getCustomRule", false);
          put("v2.getCustomRuleRevision", false);
          put("v2.getCustomRuleset", false);
          put("v2.listCustomRuleRevisions", false);
          put("v2.revertCustomRuleRevision", false);
          put("v2.updateCustomRuleset", false);
          put("v2.addMemberTeam", false);
          put("v2.listMemberTeams", false);
          put("v2.removeMemberTeam", false);
          put("v2.createIncidentTeam", false);
          put("v2.deleteIncidentTeam", false);
          put("v2.getIncidentTeam", false);
          put("v2.listIncidentTeams", false);
          put("v2.updateIncidentTeam", false);
          put("v2.searchFlakyTests", false);
          put("v2.updateFlakyTests", false);
        }
      };
  protected static final java.util.logging.Logger logger =
      java.util.logging.Logger.getLogger(ApiClient.class.getName());

  private static ApiClient defaultApiClient;

  /**
   * Get the default API client, which would be used when creating API instances without providing
   * an API client.
   *
   * @return Default API client
   */
  public static ApiClient getDefaultApiClient() {
    if (defaultApiClient != null) {
      return defaultApiClient;
    }
    defaultApiClient = new ApiClient();

    // Configure the Datadog site to send API calls to
    String site = System.getenv("DD_SITE");
    if (site != null) {
      HashMap<String, String> serverVariables = new HashMap<String, String>();
      serverVariables.put("site", site);
      defaultApiClient.setServerVariables(serverVariables);
    }
    // Configure API key authorization
    HashMap<String, String> secrets = new HashMap<String, String>();
    String apiKeyAuth = System.getenv("DD_API_KEY");
    if (apiKeyAuth != null) {
      secrets.put("apiKeyAuth", apiKeyAuth);
    }
    String appKeyAuth = System.getenv("DD_APP_KEY");
    if (appKeyAuth != null) {
      secrets.put("appKeyAuth", appKeyAuth);
    }
    defaultApiClient.configureApiKeys(secrets);

    return defaultApiClient;
  }

  /**
   * Set the default API client, which would be used when creating API instances without providing
   * an API client.
   *
   * @param apiClient API client
   */
  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient = apiClient;
  }

  /** Constructs a new ApiClient with default parameters. */
  public ApiClient() {
    this(null);
  }

  /**
   * Constructs a new ApiClient with the specified authentication parameters.
   *
   * @param authMap A hash map containing authentication parameters.
   */
  public ApiClient(Map<String, Authentication> authMap) {
    json = new JSON();
    httpClient = buildHttpClient();

    this.dateFormat = new RFC3339DateFormat();

    // Set default User-Agent.
    setUserAgent();

    // Setup authentications (key: authentication name, value: authentication).
    authentications = new HashMap<String, Authentication>();
    Authentication auth = null;
    if (authMap != null) {
      auth = authMap.get("AuthZ");
    }
    if (auth instanceof OAuth) {
      authentications.put("AuthZ", auth);
    } else {
      authentications.put("AuthZ", new OAuth(basePath, "/oauth2/v1/token"));
    }
    if (authMap != null) {
      auth = authMap.get("apiKeyAuth");
    }
    if (auth instanceof ApiKeyAuth) {
      authentications.put("apiKeyAuth", auth);
    } else {
      authentications.put("apiKeyAuth", new ApiKeyAuth("header", "DD-API-KEY"));
    }
    if (authMap != null) {
      auth = authMap.get("appKeyAuth");
    }
    if (auth instanceof ApiKeyAuth) {
      authentications.put("appKeyAuth", auth);
    } else {
      authentications.put("appKeyAuth", new ApiKeyAuth("header", "DD-APPLICATION-KEY"));
    }
    // Prevent the authentications from being modified.
    authentications = Collections.unmodifiableMap(authentications);
  }

  /**
   * Get the date format used to parse/format {@code OffsetDateTime} parameters.
   *
   * @return DateTimeFormatter
   */
  public DateTimeFormatter getOffsetDateTimeFormatter() {
    return offsetDateTimeFormatter;
  }

  /**
   * Add custom retry object in the client
   *
   * @param retry retry object
   */
  public void setRetry(RetryConfig retry) {
    this.retry = retry;
  }

  /**
   * Return the retryConfig object
   *
   * @return retryConfig
   */
  public RetryConfig getRetry() {
    return retry;
  }

  /**
   * Enable retry directly on the client instead of creating a new retry object
   *
   * @param enableRetry bool, enable retry or not
   */
  public void enableRetry(boolean enableRetry) {
    this.retry.setEnableRetry(enableRetry);
  }

  /**
   * Set the date format used to parse/format {@code OffsetDateTime} parameters.
   *
   * @param offsetDateTimeFormatter {@code DateTimeFormatter}
   */
  public void setOffsetDateTimeFormatter(DateTimeFormatter offsetDateTimeFormatter) {
    this.offsetDateTimeFormatter = offsetDateTimeFormatter;
  }

  /**
   * Format the given {@code OffsetDateTime} object into string.
   *
   * @param offsetDateTime {@code OffsetDateTime}
   * @return {@code OffsetDateTime} in string format
   */
  public String formatOffsetDateTime(OffsetDateTime offsetDateTime) {
    return offsetDateTimeFormatter.format(offsetDateTime);
  }

  /**
   * Gets the JSON instance to do JSON serialization and deserialization.
   *
   * @return JSON
   */
  public JSON getJSON() {
    return json;
  }

  public Client getHttpClient() {
    return httpClient;
  }

  public ApiClient setHttpClient(Client httpClient) {
    this.httpClient = httpClient;
    return this;
  }

  /**
   * Returns the base URL to the location where the OpenAPI document is being served.
   *
   * @return The base URL to the target host.
   */
  public String getBasePath() {
    return basePath;
  }

  /**
   * Sets the base URL to the location where the OpenAPI document is being served.
   *
   * @param basePath The base URL to the target host.
   * @return API client
   */
  public ApiClient setBasePath(String basePath) {
    this.basePath = basePath;
    setOauthBasePath(basePath);
    return this;
  }

  public List<ServerConfiguration> getServers() {
    return servers;
  }

  public ApiClient setServers(List<ServerConfiguration> servers) {
    this.servers = servers;
    updateBasePath();
    return this;
  }

  public Integer getServerIndex() {
    return serverIndex;
  }

  public ApiClient setServerIndex(Integer serverIndex) {
    this.serverIndex = serverIndex;
    updateBasePath();
    return this;
  }

  public Map<String, String> getServerVariables() {
    return serverVariables;
  }

  public ApiClient setServerVariables(Map<String, String> serverVariables) {
    this.serverVariables = serverVariables;
    updateBasePath();
    return this;
  }

  private void updateBasePath() {
    if (serverIndex != null) {
      setBasePath(servers.get(serverIndex).URL(serverVariables));
    }
  }

  private void setOauthBasePath(String basePath) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).setBasePath(basePath);
      }
    }
  }

  /**
   * Get authentications (key: authentication name, value: authentication).
   *
   * @return Map of authentication object
   */
  public Map<String, Authentication> getAuthentications() {
    return authentications;
  }

  /**
   * Get authentication for the given name.
   *
   * @param authName The authentication name
   * @return The authentication, null if not found
   */
  public Authentication getAuthentication(String authName) {
    return authentications.get(authName);
  }

  /**
   * Helper method to set username for the first HTTP basic authentication.
   *
   * @param username Username
   * @return API client
   */
  public ApiClient setUsername(String username) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setUsername(username);
        return this;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set password for the first HTTP basic authentication.
   *
   * @param password Password
   * @return API client
   */
  public ApiClient setPassword(String password) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setPassword(password);
        return this;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set API key value for the first API key authentication.
   *
   * @param apiKey API key
   * @return API client
   */
  public ApiClient setApiKey(String apiKey) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKey(apiKey);
        return this;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to configure authentications which respects aliases of API keys.
   *
   * @param secrets Hash map from authentication name to its secret.
   * @return API client
   */
  public ApiClient configureApiKeys(Map<String, String> secrets) {
    for (Map.Entry<String, Authentication> authEntry : authentications.entrySet()) {
      Authentication auth = authEntry.getValue();
      if (auth instanceof ApiKeyAuth) {
        String name = authEntry.getKey();
        if (secrets.containsKey(name)) {
          ((ApiKeyAuth) auth).setApiKey(secrets.get(name));
        }
      }
    }
    return this;
  }

  /**
   * Helper method to set API key prefix for the first API key authentication.
   *
   * @param apiKeyPrefix API key prefix
   * @return API client
   */
  public ApiClient setApiKeyPrefix(String apiKeyPrefix) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
        return this;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set bearer token for the first Bearer authentication.
   *
   * @param bearerToken Bearer token
   * @return API client
   */
  public ApiClient setBearerToken(String bearerToken) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBearerAuth) {
        ((HttpBearerAuth) auth).setBearerToken(bearerToken);
        return this;
      }
    }
    throw new RuntimeException("No Bearer authentication configured!");
  }

  /**
   * Helper method to set access token for the first OAuth2 authentication.
   *
   * @param accessToken Access token
   * @return API client
   */
  public ApiClient setAccessToken(String accessToken) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).setAccessToken(accessToken);
        return this;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  /**
   * Helper method to set the credentials for the first OAuth2 authentication.
   *
   * @param clientId the client ID
   * @param clientSecret the client secret
   * @return API client
   */
  public ApiClient setOauthCredentials(String clientId, String clientSecret) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).setCredentials(clientId, clientSecret, isDebugging());
        return this;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  /**
   * Helper method to set the password flow for the first OAuth2 authentication.
   *
   * @param username the user name
   * @param password the user password
   * @return API client
   */
  public ApiClient setOauthPasswordFlow(String username, String password) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).usePasswordFlow(username, password);
        return this;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  /**
   * Helper method to set the authorization code flow for the first OAuth2 authentication.
   *
   * @param code the authorization code
   * @return API client
   */
  public ApiClient setOauthAuthorizationCodeFlow(String code) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).useAuthorizationCodeFlow(code);
        return this;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  /**
   * Helper method to set the scopes for the first OAuth2 authentication.
   *
   * @param scope the oauth scope
   * @return API client
   */
  public ApiClient setOauthScope(String scope) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).setScope(scope);
        return this;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  /**
   * Set the User-Agent header's value (by adding to the default header map).
   *
   * @param userAgent Http user agent
   * @return API client
   */
  public ApiClient setUserAgent(String userAgent) {
    addDefaultHeader("User-Agent", userAgent);
    return this;
  }

  /**
   * Get the User-Agent header's value.
   *
   * @return User-Agent string
   */
  public String getUserAgent() {
    return userAgent;
  }

  /**
   * Set the default User-Agent header's value with telemetry information (by adding to the default
   * header map).
   *
   * @return API client
   */
  public ApiClient setUserAgent() {
    final Properties properties = new Properties();
    try {
      properties.load(
          getClass().getClassLoader().getResourceAsStream("com/datadog/api/project.properties"));
    } catch (IOException e) {
      logger.severe("Could not load client version: " + e.toString());
    }

    String userAgent =
        "datadog-api-client-java/"
            + properties.getProperty("version")
            + " ("
            + "java "
            + System.getProperty("java.version")
            + "; "
            + "java_vendor "
            + System.getProperty("java.vendor")
            + "; "
            + "os "
            + System.getProperty("os.name")
            + "; "
            + "os_version "
            + System.getProperty("os.version")
            + "; "
            + "arch "
            + System.getProperty("os.arch")
            + ")";
    addDefaultHeader("User-Agent", userAgent);
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Add a default header.
   *
   * @param key The header's key
   * @param value The header's value
   * @return API client
   */
  public ApiClient addDefaultHeader(String key, String value) {
    defaultHeaderMap.put(key, value);
    return this;
  }

  /**
   * Add a default cookie.
   *
   * @param key The cookie's key
   * @param value The cookie's value
   * @return API client
   */
  public ApiClient addDefaultCookie(String key, String value) {
    defaultCookieMap.put(key, value);
    return this;
  }

  /**
   * Gets the client config.
   *
   * @return Client config
   */
  public ClientConfig getClientConfig() {
    return clientConfig;
  }

  /**
   * Set the client config.
   *
   * @param clientConfig Set the client config
   * @return API client
   */
  public ApiClient setClientConfig(ClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    // Rebuild HTTP Client according to the new "clientConfig" value.
    this.httpClient = buildHttpClient();
    return this;
  }

  /**
   * Check that whether debugging is enabled for this API client.
   *
   * @return True if debugging is switched on
   */
  public boolean isDebugging() {
    return debugging;
  }

  /**
   * Enable/disable debugging for this API client.
   *
   * @param debugging To enable (true) or disable (false) debugging
   * @return API client
   */
  public ApiClient setDebugging(boolean debugging) {
    this.debugging = debugging;
    // Rebuild HTTP Client according to the new "debugging" value.
    this.setClientConfig(null);
    return this;
  }

  /**
   * Check that whether compress is enabled for this API client.
   *
   * @return True if compress is switched on
   */
  public boolean isCompress() {
    return compress;
  }

  /**
   * Enable/disable compress for this API client.
   *
   * @param compress To enable (true) or disable (false) compress
   * @return API client
   */
  public ApiClient setCompress(boolean compress) {
    this.compress = compress;
    // Rebuild HTTP Client according to the new "compress" value.
    this.setClientConfig(null);
    return this;
  }

  /**
   * The path of temporary folder used to store downloaded files from endpoints with file response.
   * The default value is <code>null</code>, i.e. using the system's default temporary folder.
   *
   * @return Temp folder path
   */
  public String getTempFolderPath() {
    return tempFolderPath;
  }

  /**
   * Set temp folder path
   *
   * @param tempFolderPath Temp folder path
   * @return API client
   */
  public ApiClient setTempFolderPath(String tempFolderPath) {
    this.tempFolderPath = tempFolderPath;
    return this;
  }

  /**
   * Connect timeout (in milliseconds).
   *
   * @return Connection timeout
   */
  public int getConnectTimeout() {
    return connectionTimeout;
  }

  /**
   * Set the connect timeout (in milliseconds). A value of 0 means no timeout, otherwise values must
   * be between 1 and {@link Integer#MAX_VALUE}.
   *
   * @param connectionTimeout Connection timeout in milliseconds
   * @return API client
   */
  public ApiClient setConnectTimeout(int connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    httpClient.property(ClientProperties.CONNECT_TIMEOUT, connectionTimeout);
    return this;
  }

  /**
   * read timeout (in milliseconds).
   *
   * @return Read timeout
   */
  public int getReadTimeout() {
    return readTimeout;
  }

  /**
   * Set the read timeout (in milliseconds). A value of 0 means no timeout, otherwise values must be
   * between 1 and {@link Integer#MAX_VALUE}.
   *
   * @param readTimeout Read timeout in milliseconds
   * @return API client
   */
  public ApiClient setReadTimeout(int readTimeout) {
    this.readTimeout = readTimeout;
    httpClient.property(ClientProperties.READ_TIMEOUT, readTimeout);
    return this;
  }

  /**
   * Get the date format used to parse/format date parameters.
   *
   * @return Date format
   */
  public DateFormat getDateFormat() {
    return dateFormat;
  }

  /**
   * Set the date format used to parse/format date parameters.
   *
   * @param dateFormat Date format
   * @return API client
   */
  public ApiClient setDateFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
    // also set the date format for model (de)serialization with Date properties
    this.json.setDateFormat((DateFormat) dateFormat.clone());
    return this;
  }

  /**
   * Get list of all unstable operations
   *
   * @return set of all unstable operations Ids
   */
  public Set<String> getUnstableOperations() {
    return unstableOperations.keySet();
  }

  /**
   * Mark an unstable operation as enabled/disabled.
   *
   * @param operation operation Id - this is the name of the method on the API class, e.g.
   *     "createFoo"
   * @param enabled whether to mark the operation as enabled (true) or disabled (false)
   * @return true if the operation is marked as unstable and thus was enabled/disabled, false
   *     otherwise
   */
  public boolean setUnstableOperationEnabled(String operation, boolean enabled) {
    if (unstableOperations.containsKey(operation)) {
      unstableOperations.put(operation, enabled);
      return true;
    }
    logger.warning(
        String.format("'%s' is not an unstable operation, can't enable/disable", operation));
    return false;
  }

  /**
   * Determine whether an operation is an unstable operation.
   *
   * @param operation operation Id - this is the name of the method on the API class, e.g.
   *     "createFoo"
   * @return true if the operation is an unstable operation, false otherwise
   */
  public boolean isUnstableOperation(String operation) {
    return unstableOperations.containsKey(operation);
  }

  /**
   * Determine whether an unstable operation is enabled.
   *
   * @param operation operation Id - this is the name of the method on the API class, e.g.
   *     "createFoo"
   * @return true if the operation is unstable and it is enabled, false otherwise
   */
  public boolean isUnstableOperationEnabled(String operation) {
    if (unstableOperations.containsKey(operation)) {
      return unstableOperations.get(operation);
    } else {
      logger.warning(
          String.format("'%s' is not an unstable operation, is always enabled", operation));
      return true;
    }
  }

  /**
   * Get the ApiClient logger
   *
   * @return ApiClient logger
   */
  public java.util.logging.Logger getLogger() {
    return logger;
  }

  /**
   * Format the given Date object into string.
   *
   * @param date Date
   * @return Date in string format
   */
  public String formatDate(Date date) {
    return dateFormat.format(date);
  }

  /**
   * Format the given parameter object into string.
   *
   * @param param Object
   * @return Object in string format
   */
  public String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof Date) {
      return formatDate((Date) param);
    } else if (param instanceof OffsetDateTime) {
      return formatOffsetDateTime((OffsetDateTime) param);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for (Object o : (Collection) param) {
        if (b.length() > 0) {
          b.append(',');
        }
        b.append(String.valueOf(o));
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }

  /*
   * Format to {@code Pair} objects.
   * @param collectionFormat Collection format
   * @param name Name
   * @param value Value
   * @return List of pairs
   */
  public List<Pair> parameterToPairs(String collectionFormat, String name, Object value) {
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null) {
      return params;
    }

    Collection<?> valueCollection;
    if (value instanceof Collection) {
      valueCollection = (Collection) value;
    } else {
      params.add(new Pair(name, parameterToString(value)));
      return params;
    }

    if (valueCollection.isEmpty()) {
      return params;
    }

    // get the collection format (default: csv)
    String format =
        (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat);

    // create the params based on the collection format
    if ("multi".equals(format)) {
      for (Object item : valueCollection) {
        params.add(new Pair(name, parameterToString(item)));
      }

      return params;
    }

    String delimiter = ",";

    if ("csv".equals(format)) {
      delimiter = ",";
    } else if ("ssv".equals(format)) {
      delimiter = " ";
    } else if ("tsv".equals(format)) {
      delimiter = "\t";
    } else if ("pipes".equals(format)) {
      delimiter = "|";
    }

    StringBuilder sb = new StringBuilder();
    for (Object item : valueCollection) {
      sb.append(delimiter);
      sb.append(parameterToString(item));
    }

    params.add(new Pair(name, sb.substring(1)));

    return params;
  }

  /**
   * Check if the given MIME is a JSON MIME. JSON MIME examples: application/json application/json;
   * charset=UTF8 APPLICATION/JSON application/vnd.company+json "* / *" is also default to JSON
   *
   * @param mime MIME
   * @return True if the MIME type is JSON
   */
  public boolean isJsonMime(String mime) {
    String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
    return mime != null && (mime.matches(jsonMime) || "*/*".equals(mime));
  }

  /**
   * Select the Accept header's value from the given accepts array: if JSON exists in the given
   * array, use it; otherwise use all of them (joining into a string)
   *
   * @param accepts The accepts array to select from
   * @return The Accept header to use. If the given array is empty, null will be returned (not to
   *     set the Accept header explicitly).
   */
  public String selectHeaderAccept(String[] accepts) {
    if (accepts.length == 0) {
      return null;
    }
    for (String accept : accepts) {
      if (isJsonMime(accept)) {
        return accept;
      }
    }
    return StringUtil.join(accepts, ",");
  }

  /**
   * Select the Content-Type header's value from the given array: if JSON exists in the given array,
   * use it; otherwise use the first one of the array.
   *
   * @param contentTypes The Content-Type array to select from
   * @return The Content-Type header to use. If the given array is empty, JSON will be used.
   */
  public String selectHeaderContentType(String[] contentTypes) {
    if (contentTypes.length == 0) {
      return "application/json";
    }
    for (String contentType : contentTypes) {
      if (isJsonMime(contentType)) {
        return contentType;
      }
    }
    return contentTypes[0];
  }

  /**
   * Escape the given string to be used as URL query value.
   *
   * @param str String
   * @return Escaped string
   */
  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  /**
   * Serialize the given Java object into string entity according the given Content-Type (only JSON
   * is supported for now).
   *
   * @param obj Object
   * @param formParams Form parameters
   * @param contentType Content type header
   * @param contentEncoding Content encoding header
   * @param isBodyNullable Whether the body can be null or not
   * @return Entity
   */
  public Entity<?> serialize(
      Object obj,
      Map<String, Object> formParams,
      String contentType,
      String contentEncoding,
      boolean isBodyNullable) {
    Entity<?> entity;
    Variant variant = new Variant(MediaType.valueOf(contentType), "", contentEncoding);
    if (contentType.startsWith("multipart/form-data")) {
      MultiPart multiPart = new MultiPart();
      for (Entry<String, Object> param : formParams.entrySet()) {
        if (param.getValue() instanceof File) {
          File file = (File) param.getValue();
          FormDataContentDisposition contentDisp =
              FormDataContentDisposition.name(param.getKey())
                  .fileName(file.getName())
                  .size(file.length())
                  .build();
          multiPart.bodyPart(
              new FormDataBodyPart(contentDisp, file, MediaType.APPLICATION_OCTET_STREAM_TYPE));
        } else {
          FormDataContentDisposition contentDisp =
              FormDataContentDisposition.name(param.getKey()).build();
          multiPart.bodyPart(
              new FormDataBodyPart(contentDisp, parameterToString(param.getValue())));
        }
      }
      MediaType mediaDataType = MediaType.MULTIPART_FORM_DATA_TYPE;
      mediaDataType = Boundary.addBoundary(mediaDataType);
      entity = Entity.entity(multiPart, mediaDataType);
    } else if (contentType.startsWith("application/x-www-form-urlencoded")) {
      Form form = new Form();
      for (Entry<String, Object> param : formParams.entrySet()) {
        form.param(param.getKey(), parameterToString(param.getValue()));
      }
      entity = Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE);
    } else {
      // We let jersey handle the serialization
      if (isBodyNullable) { // payload is nullable
        if (obj instanceof String) {
          entity =
              Entity.entity(
                  obj == null
                      ? "null"
                      : "\""
                          + ((String) obj).replaceAll("\"", Matcher.quoteReplacement("\\\""))
                          + "\"",
                  variant);
        } else {
          entity = Entity.entity(obj == null ? "null" : obj, variant);
        }
      } else {
        if (obj instanceof String) {
          entity =
              Entity.entity(
                  obj == null
                      ? ""
                      : "\""
                          + ((String) obj).replaceAll("\"", Matcher.quoteReplacement("\\\""))
                          + "\"",
                  variant);
        } else {
          entity = Entity.entity(obj == null ? "" : obj, variant);
        }
      }
    }
    return entity;
  }

  /**
   * Deserialize response body to Java object according to the Content-Type.
   *
   * @param <T> Type
   * @param response Response
   * @param returnType Return type
   * @return Deserialize object
   */
  @SuppressWarnings("unchecked")
  public <T> T deserialize(Response response, GenericType<T> returnType) {
    if (response == null || returnType == null) {
      return null;
    }

    if ("byte[]".equals(returnType.toString())) {
      // Handle binary response (byte array).
      return (T) response.readEntity(byte[].class);
    }

    // read the entity stream multiple times
    response.bufferEntity();

    return response.readEntity(returnType);
  }

  /**
   * Create builder to invoke the API.
   *
   * @param operation The qualified name of the operation
   * @param path The sub-path of the HTTP URL
   * @param queryParams The query parameters
   * @param headerParams The header parameters
   * @param cookieParams The cookie parameters
   * @param accepts The list of possible request's Accept header
   * @param authNames The authentications to apply
   * @return The invocation builder
   * @throws ApiException API exception
   */
  public Invocation.Builder createBuilder(
      String operation,
      String path,
      List<Pair> queryParams,
      Map<String, String> headerParams,
      Map<String, String> cookieParams,
      String[] accepts,
      String[] authNames)
      throws ApiException {

    // Not using `.target(targetURL).path(path)` below,
    // to support (constant) query string in `path`, e.g. "/posts?draft=1"
    String targetURL;
    if (serverIndex != null && operationServers.containsKey(operation)) {
      Integer index =
          operationServerIndex.containsKey(operation)
              ? operationServerIndex.get(operation)
              : serverIndex;
      Map<String, String> variables =
          operationServerVariables.containsKey(operation)
              ? operationServerVariables.get(operation)
              : serverVariables;
      List<ServerConfiguration> serverConfigurations = operationServers.get(operation);
      if (index < 0 || index >= serverConfigurations.size()) {
        throw new ArrayIndexOutOfBoundsException(
            String.format(
                "Invalid index %d when selecting the host settings. Must be less than %d",
                index, serverConfigurations.size()));
      }
      targetURL = serverConfigurations.get(index).URL(variables) + path;
    } else {
      targetURL = this.basePath + path;
    }

    URI parsedURI;
    try {
      parsedURI = new URI(targetURL);
    } catch (URISyntaxException e) {
      throw new ApiException(e);
    }

    WebTarget target = httpClient.target(parsedURI);

    for (Pair queryParam : queryParams) {
      if (queryParam.getValue() != null) {
        target = target.queryParam(queryParam.getName(), escapeString(queryParam.getValue()));
      }
    }

    Invocation.Builder invocationBuilder = target.request().accept(selectHeaderAccept(accepts));

    for (Entry<String, String> entry : cookieParams.entrySet()) {
      String value = entry.getValue();
      if (value != null) {
        invocationBuilder = invocationBuilder.cookie(entry.getKey(), value);
      }
    }

    for (Entry<String, String> entry : defaultCookieMap.entrySet()) {
      String value = entry.getValue();
      if (value != null) {
        invocationBuilder = invocationBuilder.cookie(entry.getKey(), value);
      }
    }

    // put all headers in one place
    Map<String, String> allHeaderParams = new HashMap<>(defaultHeaderMap);
    allHeaderParams.putAll(headerParams);

    // update different parameters (e.g. headers) for authentication
    updateParamsForAuth(authNames, queryParams, allHeaderParams, cookieParams, target.getUri());

    for (Entry<String, String> entry : allHeaderParams.entrySet()) {
      String value = entry.getValue();
      if (value != null) {
        invocationBuilder = invocationBuilder.header(entry.getKey(), value);
      }
    }

    return invocationBuilder;
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param <T> Type
   * @param invocationBuilder HTTP requests builder
   * @param method The request method, one of "GET", "POST", "PUT", "HEAD" and "DELETE"
   * @param body The request body object
   * @param headerParams The header parameters
   * @param formParams The form parameters
   * @param contentTypes The list of request Content-Type headers
   * @param returnType The return type into which to deserialize the response
   * @param isBodyNullable True if the body is nullable
   * @return The response body in type of string
   * @throws ApiException API exception
   */
  public <T> ApiResponse<T> invokeAPI(
      String method,
      Invocation.Builder invocationBuilder,
      Map<String, String> headerParams,
      String[] contentTypes,
      Object body,
      Map<String, Object> formParams,
      Boolean isBodyNullable,
      GenericType<T> returnType)
      throws ApiException {

    String contentEncoding = headerParams.get(HttpHeaders.CONTENT_ENCODING);
    Entity<?> entity =
        serialize(
            body,
            formParams,
            selectHeaderContentType(contentTypes),
            contentEncoding,
            isBodyNullable);

    Response response = null;

    try {
      int currentRetry = 0;
      while (true) {
        response = sendRequest(method, invocationBuilder, entity);
        int statusCode = response.getStatusInfo().getStatusCode();
        Map<String, List<String>> responseHeaders = buildResponseHeaders(response);
        if (response.getStatusInfo() == Status.NO_CONTENT) {
          return new ApiResponse<T>(statusCode, responseHeaders);
        } else if (response.getStatusInfo().getFamily() == Status.Family.SUCCESSFUL) {
          if (returnType == null) {
            return new ApiResponse<T>(statusCode, responseHeaders);
          } else {
            return new ApiResponse<T>(
                statusCode, responseHeaders, deserialize(response, returnType));
          }
        } else if (shouldRetry(currentRetry, statusCode, retry)) {
          // Close the response before retry to avoid leaks
          try {
            response.close();
          } catch (Exception e) {
            // it's not critical, since the response object is local in method invokeAPI; that's
            // fine,
            // just continue
          }
          retry.sleepInterval(calculateRetryInterval(responseHeaders, retry, currentRetry));
          currentRetry++;
        } else {
          String message = "error";
          String respBody = null;
          if (response.hasEntity()) {
            try {
              respBody = String.valueOf(response.readEntity(String.class));
              message = respBody;
            } catch (RuntimeException e) {
              // e.printStackTrace();
            }
          }
          throw new ApiException(
              response.getStatus(), message, buildResponseHeaders(response), respBody);
        }
      }
    } finally {
      try {
        response.close();
      } catch (Exception e) {
        // it's not critical, since the response object is local in method invokeAPI; that's fine,
        // just continue
      }
    }
  }

  private boolean shouldRetry(int retryCount, int statusCode, RetryConfig retryConfig) {
    boolean statusToRetry = false;
    if (statusCode == 429 || statusCode >= 500) {
      statusToRetry = true;
    }
    return (retryConfig.maxRetries > retryCount && statusToRetry && retryConfig.isEnableRetry());
  }

  private int calculateRetryInterval(
      Map<String, List<String>> responseHeaders, RetryConfig retryConfig, int retryCount) {
    if (responseHeaders.get("x-ratelimit-reset") != null) {
      List<String> rateLimitHeader = responseHeaders.get("x-ratelimit-reset");
      return Integer.parseInt(rateLimitHeader.get(0));
    } else {
      int retryInterval =
          (int) Math.pow(retry.backOffMultiplier, retryCount) * retryConfig.backOffBase;
      if (getConnectTimeout() > 0) {
        retryInterval = Math.min(retryInterval, getConnectTimeout());
      }
      return retryInterval;
    }
  }

  private Response sendRequest(
      String method, Invocation.Builder invocationBuilder, Entity<?> entity) {
    Response response;
    if ("POST".equals(method)) {
      response = invocationBuilder.post(entity);
    } else if ("PUT".equals(method)) {
      response = invocationBuilder.put(entity);
    } else if ("DELETE".equals(method)) {
      response = invocationBuilder.method("DELETE", entity);
    } else if ("PATCH".equals(method)) {
      response = invocationBuilder.method("PATCH", entity);
    } else {
      response = invocationBuilder.method(method);
    }
    return response;
  }

  /**
   * Invoke API by sending HTTP request with the given options, asynchronously.
   *
   * @param <T> Type
   * @param invocationBuilder HTTP requests builder
   * @param method The request method, one of "GET", "POST", "PUT", "HEAD" and "DELETE"
   * @param body The request body object
   * @param headerParams The header parameters
   * @param formParams The form parameters
   * @param contentTypes The list of request Content-Type headers
   * @param returnType The return type into which to deserialize the response
   * @param isBodyNullable True if the body is nullable
   * @return The future which be fired with the response
   */
  public <T> CompletableFuture<ApiResponse<T>> invokeAPIAsync(
      String method,
      Invocation.Builder invocationBuilder,
      Map<String, String> headerParams,
      String[] contentTypes,
      Object body,
      Map<String, Object> formParams,
      Boolean isBodyNullable,
      GenericType<T> returnType) {

    String contentEncoding = headerParams.get(HttpHeaders.CONTENT_ENCODING);

    Entity<?> entity =
        serialize(
            body,
            formParams,
            selectHeaderContentType(contentTypes),
            contentEncoding,
            isBodyNullable);

    CompletableFuture<ApiResponse<T>> result = new CompletableFuture<>();

    InvocationCallback<Response> callback =
        new InvocationCallback<Response>() {
          @Override
          public void completed(Response response) {
            int statusCode = response.getStatusInfo().getStatusCode();
            Map<String, List<String>> responseHeaders = buildResponseHeaders(response);

            if (response.getStatusInfo() == Status.NO_CONTENT) {
              result.complete(new ApiResponse<T>(statusCode, responseHeaders));
            } else if (response.getStatusInfo().getFamily() == Status.Family.SUCCESSFUL) {
              if (returnType == null) {
                result.complete(new ApiResponse<T>(statusCode, responseHeaders));
              } else {
                result.complete(
                    new ApiResponse<T>(
                        statusCode, responseHeaders, deserialize(response, returnType)));
              }
            } else {
              String message = "error";
              String respBody = null;
              if (response.hasEntity()) {
                try {
                  respBody = String.valueOf(response.readEntity(String.class));
                  message = respBody;
                } catch (RuntimeException e) {
                }
              }
              result.completeExceptionally(
                  new ApiException(
                      response.getStatus(), message, buildResponseHeaders(response), respBody));
            }
          }

          @Override
          public void failed(Throwable throwable) {
            result.completeExceptionally(throwable);
          }
        };

    // XXX Handle 401 for OAuth
    sendRequestAsync(method, invocationBuilder, entity, callback);
    return result;
  }

  private Future<Response> sendRequestAsync(
      String method,
      Invocation.Builder invocationBuilder,
      Entity<?> entity,
      InvocationCallback<Response> callback) {
    Future<Response> response;
    AsyncInvoker invoker = invocationBuilder.async();
    if ("POST".equals(method)) {
      response = invoker.post(entity, callback);
    } else if ("PUT".equals(method)) {
      response = invoker.put(entity, callback);
    } else if ("DELETE".equals(method)) {
      response = invoker.method("DELETE", entity, callback);
    } else if ("PATCH".equals(method)) {
      response = invoker.method("PATCH", entity, callback);
    } else {
      response = invoker.method(method, callback);
    }
    return response;
  }

  /**
   * Build the Client used to make HTTP requests.
   *
   * @return Client
   */
  protected Client buildHttpClient() {
    // use the default client config if not yet initialized
    if (clientConfig == null) {
      clientConfig = getDefaultClientConfig();
    }

    if (compress) {
      clientConfig.register(EncodingFilter.class);
    }
    clientConfig.register(GZipEncoder.class);
    clientConfig.register(DeflateEncoder.class);
    clientConfig.register(ZstdEncoder.class);
    ClientBuilder clientBuilder = ClientBuilder.newBuilder();
    customizeClientBuilder(clientBuilder);
    clientBuilder = clientBuilder.withConfig(clientConfig);
    return clientBuilder.build();
  }

  /**
   * Get the default client config.
   *
   * @return Client config
   */
  public ClientConfig getDefaultClientConfig() {
    ClientConfig clientConfig = new ClientConfig();
    clientConfig.register(MultiPartFeature.class);
    clientConfig.register(json);
    clientConfig.register(JacksonFeature.class);
    clientConfig.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true);
    // turn off compliance validation to be able to send payloads with DELETE calls
    clientConfig.property(ClientProperties.SUPPRESS_HTTP_COMPLIANCE_VALIDATION, true);
    if (debugging) {
      clientConfig.register(
          new LoggingFeature(
              java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME),
              java.util.logging.Level.INFO,
              LoggingFeature.Verbosity.PAYLOAD_ANY,
              1024 * 50 /* Log payloads up to 50K */));
      clientConfig.property(
          LoggingFeature.LOGGING_FEATURE_VERBOSITY, LoggingFeature.Verbosity.PAYLOAD_ANY);
      // Set logger to ALL
      java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME)
          .setLevel(java.util.logging.Level.ALL);
    } else {
      // suppress warnings for payloads with DELETE calls:
      java.util.logging.Logger.getLogger("org.glassfish.jersey.client")
          .setLevel(java.util.logging.Level.SEVERE);
    }

    return clientConfig;
  }

  /**
   * Customize the client builder.
   *
   * <p>This method can be overridden to customize the API client. For example, this can be used to:
   * 1. Set the hostname verifier to be used by the client to verify the endpoint's hostname against
   * its identification information. 2. Set the client-side key store. 3. Set the SSL context that
   * will be used when creating secured transport connections to server endpoints from web targets
   * created by the client instance that is using this SSL context. 4. Set the client-side trust
   * store.
   *
   * <p>To completely disable certificate validation (at your own risk), you can override this
   * method and invoke disableCertificateValidation(clientBuilder).
   *
   * @param clientBuilder: HTTP client builder
   */
  protected void customizeClientBuilder(ClientBuilder clientBuilder) {
    // No-op extension point
  }

  /**
   * Disable X.509 certificate validation in TLS connections.
   *
   * <p>Please note that trusting all certificates is extremely risky. This may be useful in a
   * development environment with self-signed certificates.
   *
   * @param clientBuilder: HTTP client builder
   * @throws KeyManagementException When the SSL context can't be initialized
   * @throws NoSuchAlgorithmException If the environment doesn't support the required algorithm
   */
  protected void disableCertificateValidation(ClientBuilder clientBuilder)
      throws KeyManagementException, NoSuchAlgorithmException {
    TrustManager[] trustAllCerts =
        new X509TrustManager[] {
          new X509TrustManager() {
            @Override
            public X509Certificate[] getAcceptedIssuers() {
              return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {}

            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {}
          }
        };
    SSLContext sslContext = SSLContext.getInstance("TLS");
    sslContext.init(null, trustAllCerts, new SecureRandom());
    clientBuilder.sslContext(sslContext);
  }

  protected Map<String, List<String>> buildResponseHeaders(Response response) {
    Map<String, List<String>> responseHeaders = new HashMap<String, List<String>>();
    for (Entry<String, List<Object>> entry : response.getHeaders().entrySet()) {
      List<Object> values = entry.getValue();
      List<String> headers = new ArrayList<String>();
      for (Object o : values) {
        headers.add(String.valueOf(o));
      }
      responseHeaders.put(entry.getKey(), headers);
    }
    return responseHeaders;
  }

  /**
   * Update query and header parameters based on authentication settings.
   *
   * @param authNames The authentications to apply
   * @param queryParams List of query parameters
   * @param headerParams Map of header parameters
   * @param cookieParams Map of cookie parameters
   * @param uri HTTP URI
   * @throws ApiException If one of the authentication schemes failed to be applied
   */
  protected void updateParamsForAuth(
      String[] authNames,
      List<Pair> queryParams,
      Map<String, String> headerParams,
      Map<String, String> cookieParams,
      URI uri)
      throws ApiException {
    for (String authName : authNames) {
      Authentication auth = authentications.get(authName);
      if (auth == null) {
        continue;
      }
      auth.applyToParams(queryParams, headerParams, cookieParams, "", "", uri);
    }
  }
}
