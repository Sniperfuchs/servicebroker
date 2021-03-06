package com.sniperfuchs.servicebroker.model.request;

import com.sniperfuchs.servicebroker.model.MaintenanceInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvisionRequest {
    private String service_id;
    private  String plan_id;
    private Map<String, String> context;
    private String organization_guid;
    private String space_guid;
    private Map<String, String> parameters;
    private MaintenanceInfo maintenance_info;
}
