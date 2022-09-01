package ua.portal.api.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class StudentDTO {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    @NotNull
    private String name;

    @JsonProperty("address_line1")
    @NotNull
    private String addressLine1;

    @JsonProperty("address_line2")
    @NotNull
    private String addressLine2;

    @JsonProperty("acq_id")
    private String acqId;

    @JsonProperty("iso_profiles")
    @NotNull
    private String isoProfiles;

    @JsonProperty("flavour")
    private String flavour;

    @JsonProperty("created")
    private Date created;

    @JsonProperty("updated")
    private Date updated;

    @JsonProperty("disabled")
    private boolean disabled;

    @JsonProperty("deleted")
    private boolean deleted;

    @JsonProperty("unique_mid_flg")
    private boolean uniqueMidFlg;

    @JsonProperty("unique_tid_flg")
    private boolean uniqueTidFlg;

    @JsonProperty("is_fixed_uuid")
    private boolean isFixedUuid;

    @JsonProperty("uuid_prefix")
    private String uuidPrefix;

    @JsonProperty("custom_domain")
    private String customDomain;

    @JsonProperty("cut_off_time")
    private String cutOffTime;
}
