# HostMuteResponse

Response with the list of muted host for your organization.

## Properties

| Name         | Type       | Description                                          | Notes      |
| ------------ | ---------- | ---------------------------------------------------- | ---------- |
| **action**   | **String** | Action applied to the hosts.                         | [optional] |
| **end**      | **Long**   | POSIX timestamp in seconds when the host is unmuted. | [optional] |
| **hostname** | **String** | The host name.                                       | [optional] |
| **message**  | **String** | Message associated with the mute.                    | [optional] |
