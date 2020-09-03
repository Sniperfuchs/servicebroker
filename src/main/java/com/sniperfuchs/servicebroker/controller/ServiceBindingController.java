package com.sniperfuchs.servicebroker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceBindingController
{

    @GetMapping("/v2/service_instances/{instance_id}/service_bindings/{binding_id}/last_operation")
    public ResponseEntity getLastOperation(@PathVariable String instance_id,
                                           @PathVariable String binding_id,
                                           @RequestParam String service_id,
                                           @RequestParam String plan_id,
                                           @RequestParam String operation)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/v2/service_instances/{instance_id}/service_bindings/{binding_id}")
    public ResponseEntity putServiceBinding(@PathVariable String instance_id,
                                            @PathVariable String binding_id)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/v2/service_instances/{instance_id}/service_bindings/{binding_id}")
    public ResponseEntity getServiceBinding(@PathVariable String instance_id,
                                            @PathVariable String binding_id)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/v2/service_instances/{instance_id}/service_bindings/{binding_id}")
    public ResponseEntity deleteServiceBinding(@PathVariable String instance_id,
                                               @PathVariable String binding_id)
    {
        return new ResponseEntity(HttpStatus.OK);
    }
}