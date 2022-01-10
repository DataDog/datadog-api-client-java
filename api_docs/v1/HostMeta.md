# HostMeta

Metadata associated with your host.

## Properties

| Name               | Type                                                  | Description                                 | Notes      |
| ------------------ | ----------------------------------------------------- | ------------------------------------------- | ---------- |
| **agentChecks**    | **List&lt;List&lt;Object&gt;&gt;**                    | A list of Agent checks running on the host. | [optional] |
| **agentVersion**   | **String**                                            | The Datadog Agent version.                  | [optional] |
| **cpuCores**       | **Long**                                              | The number of cores.                        | [optional] |
| **fbsdV**          | **List&lt;String&gt;**                                | An array of Mac versions.                   | [optional] |
| **gohai**          | **String**                                            | JSON string containing system information.  | [optional] |
| **installMethod**  | [**HostMetaInstallMethod**](HostMetaInstallMethod.md) |                                             | [optional] |
| **macV**           | **List&lt;String&gt;**                                | An array of Mac versions.                   | [optional] |
| **machine**        | **String**                                            | The machine architecture.                   | [optional] |
| **nixV**           | **List&lt;String&gt;**                                | Array of Unix versions.                     | [optional] |
| **platform**       | **String**                                            | The OS platform.                            | [optional] |
| **processor**      | **String**                                            | The processor.                              | [optional] |
| **pythonV**        | **String**                                            | The Python version.                         | [optional] |
| **socketFqdn**     | **String**                                            | The socket fqdn.                            | [optional] |
| **socketHostname** | **String**                                            | The socket hostname.                        | [optional] |
| **winV**           | **List&lt;String&gt;**                                | An array of Windows versions.               | [optional] |
