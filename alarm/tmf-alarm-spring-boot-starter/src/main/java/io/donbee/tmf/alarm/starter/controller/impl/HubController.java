package io.donbee.tmf.alarm.starter.controller.impl;

import io.donbee.tmf.alarm.starter.controller.HubApi;
import io.donbee.tmf.alarm.starter.service.HubService;
import io.donbee.tmf.alarm.common.model.Hub;
import io.donbee.tmf.alarm.common.model.HubFVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HubController implements HubApi {

    private final HubService service;

    @Override
    public ResponseEntity<Hub> createHub(HubFVO hubFVO) {
        return service.createHub(hubFVO);
    }

    @Override
    public ResponseEntity<Void> hubDelete(String id) {
        return service.deleteHub(id);
    }

    @Override
    public ResponseEntity<Hub> hubGet(String id) {
        return service.getHub(id);
    }
}
